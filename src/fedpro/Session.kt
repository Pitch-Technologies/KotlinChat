package fedpro

import java.nio.ByteBuffer
import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit

class Session(private val _transport: Transport, private val _fedProHost: String) {
   private val _hlaCallsInProgress: MutableMap<Int, CompletableFuture<ByteArray>> = ConcurrentHashMap()
   private lateinit var _callbackRequestListener: HlaCallbackRequestListener
   private var _sessionId: Long = 0
   private var _sequenceNumber = 1
   private lateinit var _heartbeatTimer: Timer

   fun start(callbackRequestListener: HlaCallbackRequestListener) {
      _callbackRequestListener = callbackRequestListener
      _transport.connect(_fedProHost, 15164)
      _transport.writeMessage(
         Message.with(
            _sequenceNumber++, Message.NO_SESSION_ID, Message.Type.CTRL_NEW_SESSION,
            createNewSessionPayload(1)
         )
      )
      _sessionId = handleNewSessionStatus(_transport.readMessage())

      //start heartbeat thread
      val intervalMs = TimeUnit.MINUTES.toMillis(1)
      _heartbeatTimer = Timer("Heartbeat Timer", true)
      _heartbeatTimer.scheduleAtFixedRate(object : TimerTask() {
         override fun run() {
            sendHeartbeat()
         }
      }, intervalMs, intervalMs)

      //start reader thread
      val thread = Thread({ runMessageReaderLoop() }, "Reader Thread.")
      thread.isDaemon = true
      thread.start()
   }

   private fun runMessageReaderLoop() {
      while (true) {
         val message = _transport.readMessage()
         assert(message.sessionId == _sessionId)
         when (message.type) {
            Message.Type.HLA_CALL_RESPONSE -> handleHlaCallResponse(message)
            Message.Type.HLA_CALLBACK_REQUEST -> handleHlaCallbackRequest(message)
            Message.Type.CTRL_HEARTBEAT_RESPONSE ->
               // nothing to do
            {
            }

            Message.Type.CTRL_SESSION_TERMINATED ->
               // done
               return

            else -> assert(false)
         }
      }
   }

   private fun handleHlaCallbackRequest(message: Message) {
      _callbackRequestListener.onHlaCallbackRequest(message.sequenceNumber, message.payload)
   }

   private fun handleHlaCallResponse(message: Message) {
      val buffer = ByteBuffer.wrap(message.payload)
      val responseToSequenceNumber = buffer.getInt()
      val returnValueOrException = ByteArray(message.payload.size - 4)
      buffer.get(returnValueOrException)
      val future = _hlaCallsInProgress.remove(responseToSequenceNumber)!!
      future.complete(returnValueOrException)
   }

   private fun handleNewSessionStatus(message: Message): Long {
      assert(message.type == Message.Type.CTRL_NEW_SESSION_STATUS)
      val reason = ByteBuffer.wrap(message.payload).getInt()
      assert(reason == 0)
      return message.sessionId
   }

   private fun createNewSessionPayload(protocolVersion: Int): ByteArray {
      return ByteBuffer.allocate(4).putInt(protocolVersion).array()
   }

   fun stop() {
      _heartbeatTimer.cancel()
      sendTerminateSession()
   }

   @Synchronized
   fun sendHlaCallRequest(hlaCallRequest: ByteArray): CompletableFuture<ByteArray> {
      val sequenceNumber = _sequenceNumber++
      _transport.writeMessage(
         Message.with(sequenceNumber, _sessionId, Message.Type.HLA_CALL_REQUEST, hlaCallRequest)
      )
      val future = CompletableFuture<ByteArray>()
      _hlaCallsInProgress[sequenceNumber] = future
      return future
   }

   @Synchronized
   fun sendHlaCallbackResponse(hlaCallbackResponse: ByteArray) {
      _transport.writeMessage(
         Message.with(_sequenceNumber++, _sessionId, Message.Type.HLA_CALLBACK_RESPONSE, hlaCallbackResponse)
      )
   }

   @Synchronized
   private fun sendHeartbeat() {
      _transport.writeMessage(
         Message.with(_sequenceNumber++, _sessionId, Message.Type.CTRL_HEARTBEAT, NO_PAYLOAD)
      )
   }

   @Synchronized
   private fun sendTerminateSession() {
      _transport.writeMessage(
         Message.with(_sequenceNumber++, _sessionId, Message.Type.CTRL_TERMINATE_SESSION, NO_PAYLOAD)
      )
   }

   interface HlaCallbackRequestListener {
      fun onHlaCallbackRequest(sequenceNumber: Int, hlaCallbackRequest: ByteArray)
   }

   companion object {
      private val NO_PAYLOAD = ByteArray(0)
   }
}
