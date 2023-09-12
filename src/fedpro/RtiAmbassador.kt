package fedpro

import fedpro.Session.HlaCallbackRequestListener
import fedpro.type.*
import java.io.File

class RtiAmbassador(fedProHost: String, ignoreExceptionsForUpdatesAndInteractions: Boolean) {
   private val _session: Session
   private lateinit var _hlaServiceCalls: HlaServiceCalls
   private lateinit var _hlaServiceCallbacks: HlaServiceCallbacks
   private var _ignoreExceptionsForUpdatesAndInteractions: Boolean

   init {
      val transport = Transport()
      _session = Session(transport, fedProHost)
      _ignoreExceptionsForUpdatesAndInteractions = ignoreExceptionsForUpdatesAndInteractions
   }

   fun connect(federateReference: FederateAmbassador, crcHost: String) {
      _hlaServiceCalls = HlaServiceCalls { hlaCallRequest: ByteArray -> _session.sendHlaCallRequest(hlaCallRequest) }
      _hlaServiceCallbacks = HlaServiceCallbacks({ hlaCallbackResponse: ByteArray ->
         _session.sendHlaCallbackResponse(hlaCallbackResponse)
      }, federateReference)

      _session.start(object : HlaCallbackRequestListener {
         override fun onHlaCallbackRequest(sequenceNumber: Int, hlaCallbackRequest: ByteArray) {
            _hlaServiceCallbacks.dispatchHlaCallback(sequenceNumber, hlaCallbackRequest)
         }
      })
      _hlaServiceCalls.connect(crcHost)
   }

   fun disconnect() {
      _hlaServiceCalls.disconnect()
      _session.stop()
   }

   fun createFederationExecution(federationExecutionName: String, fomModule: File): Boolean {
      return _hlaServiceCalls.createFederationExecution(federationExecutionName, fomModule)
   }

   fun destroyFederationExecution(federationExecutionName: String): Boolean {
      return _hlaServiceCalls.destroyFederationExecution(federationExecutionName)
   }

   fun joinFederationExecution(federateName: String, federationExecutionName: String) {
      _hlaServiceCalls.joinFederationExecution(federateName, federationExecutionName)
   }

   fun resignFederationExecution() {
      _hlaServiceCalls.resignFederationExecution(ResignAction.CANCEL_THEN_DELETE_THEN_DIVEST)
   }

   fun publishObjectClassAttributes(objectClassHandle: ObjectClassHandle, attributes: Set<AttributeHandle>) {
      _hlaServiceCalls.publishObjectClassAttributes(objectClassHandle, attributes)
   }

   fun publishInteractionClass(interactionHandle: InteractionClassHandle) {
      _hlaServiceCalls.publishInteractionClass(interactionHandle)
   }

   fun subscribeObjectClassAttributes(objectClassHandle: ObjectClassHandle, attributes: Set<AttributeHandle>) {
      _hlaServiceCalls.subscribeObjectClassAttributes(objectClassHandle, attributes)
   }

   fun subscribeInteractionClass(interactionHandle: InteractionClassHandle) {
      _hlaServiceCalls.subscribeInteractionClass(interactionHandle)
   }

   fun reserveObjectInstanceName(instanceName: String): Boolean {
      return _hlaServiceCalls.reserveObjectInstanceName(instanceName)
   }

   fun registerObjectInstance(objectClassHandle: ObjectClassHandle, instanceName: String): ObjectInstanceHandle {
      return _hlaServiceCalls.registerObjectInstance(objectClassHandle, instanceName)
   }

   fun updateAttributeValues(instanceHandle: ObjectInstanceHandle, attributes: Map<AttributeHandle, ByteArray>) {
      _hlaServiceCalls.updateAttributeValues(instanceHandle, attributes, _ignoreExceptionsForUpdatesAndInteractions)
   }

   fun sendInteraction(interactionHandle: InteractionClassHandle, parameters: Map<ParameterHandle, ByteArray>) {
      _hlaServiceCalls.sendInteraction(interactionHandle, parameters, _ignoreExceptionsForUpdatesAndInteractions)
   }

   fun getObjectClassHandle(name: String): ObjectClassHandle {
      return _hlaServiceCalls.getObjectClassHandle(name)
   }

   fun getAttributeHandle(objectClassHandle: ObjectClassHandle, name: String): AttributeHandle {
      return _hlaServiceCalls.getAttributeHandle(objectClassHandle, name)
   }

   fun getInteractionClassHandle(name: String): InteractionClassHandle {
      return _hlaServiceCalls.getInteractionClassHandle(name)
   }

   fun getParameterHandle(interactionHandle: InteractionClassHandle, name: String): ParameterHandle {
      return _hlaServiceCalls.getParameterHandle(interactionHandle, name)
   }
}
