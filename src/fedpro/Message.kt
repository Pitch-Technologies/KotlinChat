package fedpro

import java.io.IOException
import java.io.InputStream
import java.nio.ByteBuffer

class Message private constructor(
   private val packetSize: Int,
   val sequenceNumber: Int,
   val sessionId: Long,
   private val lastReceivedSequenceNumber: Int,
   val type: Type,
   val payload: ByteArray
) {
   enum class Type(private val _encodedValue: Int) {
      CTRL_NEW_SESSION(1),
      CTRL_NEW_SESSION_STATUS(2),
      CTRL_HEARTBEAT(3),
      CTRL_HEARTBEAT_RESPONSE(4),
      CTRL_TERMINATE_SESSION(5),
      CTRL_SESSION_TERMINATED(6),
      CTRL_RESUME_REQUEST(10),
      CTRL_RESUME_STATUS(11),
      HLA_CALL_REQUEST(20),
      HLA_CALL_RESPONSE(21),
      HLA_CALLBACK_REQUEST(22),
      HLA_CALLBACK_RESPONSE(23);

      fun asInt(): Int {
         return _encodedValue
      }

      companion object {
         fun fromInt(encodedValue: Int): Type? {
            for (value in entries) {
               if (value._encodedValue == encodedValue) {
                  return value
               }
            }
            return null
         }
      }
   }

   fun encode(): ByteArray {
      return ByteBuffer.allocate(packetSize)
         .putInt(packetSize)
         .putInt(sequenceNumber)
         .putLong(sessionId)
         .putInt(lastReceivedSequenceNumber)
         .putInt(type.asInt())
         .put(payload)
         .array()
   }

   companion object {
      private const val HEADER_SIZE = 24
      const val NO_SESSION_ID = 0L
      fun with(sequenceNumber: Int, sessionId: Long, messageType: Type, payload: ByteArray): Message {
         return Message(HEADER_SIZE + payload.size, sequenceNumber, sessionId, 0, messageType, payload)
      }

      fun decode(inputStream: InputStream): Message {
         val buffer = ByteBuffer.wrap(inputStream.readNBytes(HEADER_SIZE))
         val packetSize = buffer.getInt()
         if (packetSize < HEADER_SIZE) {
            throw IOException("Invalid PacketSize $packetSize")
         }
         val sequenceNumber = buffer.getInt()
         val sessionId = buffer.getLong()
         val lastReceivedSequenceNumber = buffer.getInt()
         val messageTypeInt = buffer.getInt()
         val payload = inputStream.readNBytes(packetSize - HEADER_SIZE)

         val messageType = Type.fromInt(messageTypeInt) ?: throw IOException("Unknown MessageType $messageTypeInt")
         return Message(packetSize, sequenceNumber, sessionId, lastReceivedSequenceNumber, messageType, payload)
      }
   }
}
