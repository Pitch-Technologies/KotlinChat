import fedpro.FederateAmbassador
import fedpro.RtiAmbassador
import fedpro.RtiException
import fedpro.type.AttributeHandle
import fedpro.type.InteractionClassHandle
import fedpro.type.ObjectInstanceHandle
import fedpro.type.ParameterHandle
import omt.HlaUnicodeString
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.nio.BufferUnderflowException
import java.util.concurrent.CompletableFuture

class Chat : FederateAmbassador {
   private lateinit var _userName: String
   private lateinit var _rtiAmbassador: RtiAmbassador
   private lateinit var _communicationClassHandle: InteractionClassHandle
   private lateinit var _messageParameterHandle: ParameterHandle
   private lateinit var _senderParameterHandle: ParameterHandle
   private lateinit var _userInstanceHandle: ObjectInstanceHandle
   private lateinit var _nameAttributeHandle: AttributeHandle
   private lateinit var _reservationResult: CompletableFuture<Boolean>
   private val _userNames: MutableMap<ObjectInstanceHandle, String> = HashMap()

   private fun run(args: Array<String>) {
      var fedProHost = "localhost"
      var crcHost = "localhost"
      val reader = BufferedReader(InputStreamReader(System.`in`))
      if (args.size > 1) {
         fedProHost = args[0]
         crcHost = args[1]
      } else if (args.isNotEmpty()) {
         crcHost = args[0]
      } else {
         println("Enter the CRC address")
         print("[localhost]: ")
         val line = reader.readLine()
         if (line.isNotEmpty()) {
            crcHost = line
         }
      }
      _rtiAmbassador = RtiAmbassador(fedProHost, true)
      _rtiAmbassador.connect(this, crcHost)

      // Clean up old federation
      _rtiAmbassador.destroyFederationExecution(FEDERATION_NAME)
      _rtiAmbassador.createFederationExecution(FEDERATION_NAME, File("Chat-evolved.xml"))
      _rtiAmbassador.joinFederationExecution("Chat", FEDERATION_NAME)

      // Subscribe and publish interactions
      _communicationClassHandle = _rtiAmbassador.getInteractionClassHandle("Communication")
      _messageParameterHandle = _rtiAmbassador.getParameterHandle(_communicationClassHandle, "Message")
      _senderParameterHandle = _rtiAmbassador.getParameterHandle(_communicationClassHandle, "Sender")
      _rtiAmbassador.subscribeInteractionClass(_communicationClassHandle)
      _rtiAmbassador.publishInteractionClass(_communicationClassHandle)

      // Subscribe and publish objects
      val participantClassHandle = _rtiAmbassador.getObjectClassHandle("Participant")
      _nameAttributeHandle = _rtiAmbassador.getAttributeHandle(participantClassHandle, "Name")
      val attributeSet = setOf(_nameAttributeHandle)
      _rtiAmbassador.subscribeObjectClassAttributes(participantClassHandle, attributeSet)
      _rtiAmbassador.publishObjectClassAttributes(participantClassHandle, attributeSet)

      // Reserve object instance name and register object instance
      do {
         print("Enter your name: ")
         _userName = reader.readLine()
         _reservationResult = CompletableFuture()
         if (!_rtiAmbassador.reserveObjectInstanceName(_userName)) {
            println("Illegal name. Try again.")
            continue
         }
         if (!_reservationResult.get()) {
            println("Name already taken, try again.")
         }
      } while (!_reservationResult.get())

      _userInstanceHandle = _rtiAmbassador.registerObjectInstance(participantClassHandle, _userName)
      _rtiAmbassador.updateAttributeValues(
         _userInstanceHandle,
         mapOf(_nameAttributeHandle to HlaUnicodeString.encode(_userName))
      )

      println("Type messages you want to send. To exit, type . <ENTER>")
      while (true) {
         print("> ")
         val message = reader.readLine()
         if (message == ".") {
            break
         }

         _rtiAmbassador.sendInteraction(
            _communicationClassHandle, mapOf(
               _messageParameterHandle to HlaUnicodeString.encode(message),
               _senderParameterHandle to HlaUnicodeString.encode(_userName)
            )
         )
      }

      _rtiAmbassador.resignFederationExecution()
      _rtiAmbassador.destroyFederationExecution(FEDERATION_NAME)
      _rtiAmbassador.disconnect()
   }

   override fun receiveInteraction(
      interactionHandle: InteractionClassHandle,
      parameters: Map<ParameterHandle, ByteArray>
   ) {
      if (interactionHandle == _communicationClassHandle &&
         parameters.containsKey(_messageParameterHandle) &&
         parameters.containsKey(_senderParameterHandle)
      ) {
         try {
            val message = HlaUnicodeString.decode(parameters[_messageParameterHandle]!!)
            val sender = HlaUnicodeString.decode(parameters[_senderParameterHandle]!!)
            println("$sender: $message")
            print("> ")
         } catch (e: BufferUnderflowException) {
            println("Failed to decode incoming interaction")
         }
      }
   }

   override fun objectInstanceNameReservationSucceeded(instanceName: String) {
      _reservationResult.complete(true)
   }

   override fun objectInstanceNameReservationFailed(instanceName: String) {
      _reservationResult.complete(false)
   }

   override fun removeObjectInstance(instanceHandle: ObjectInstanceHandle) {
      val name = _userNames.remove(instanceHandle)
      if (name != null) {
         println("[$name has left]")
      }
   }

   override fun reflectAttributeValues(
      instanceHandle: ObjectInstanceHandle,
      attributes: Map<AttributeHandle, ByteArray>
   ) {
      if (!_userNames.containsKey(instanceHandle) && attributes.containsKey(_nameAttributeHandle)) {
         try {
            val memberName = HlaUnicodeString.decode(attributes[_nameAttributeHandle]!!)
            println("[$memberName has joined]")
            print("> ")
            _userNames[instanceHandle] = memberName
         } catch (e: BufferUnderflowException) {
            println("Failed to decode incoming attribute")
         }
      }
   }

   override fun provideAttributeValueUpdate(
      instanceHandle: ObjectInstanceHandle,
      attributes: Set<AttributeHandle>
   ) {
      if (instanceHandle == _userInstanceHandle && attributes.contains(_nameAttributeHandle)) {
         try {
            _rtiAmbassador.updateAttributeValues(
               _userInstanceHandle, mapOf(
                  _nameAttributeHandle to HlaUnicodeString.encode(_userName)
               )
            )
         } catch (ignored: RtiException) {
         }
      }
   }

   companion object {
      private const val FEDERATION_NAME = "ChatRoom"

      @JvmStatic
      fun main(args: Array<String>) {
         Chat().run(args)
      }

   }
}
