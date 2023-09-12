package omt

import java.nio.BufferUnderflowException
import java.nio.ByteBuffer

object HlaUnicodeString {
   fun decode(encodedString: ByteArray): String {
      val buffer = ByteBuffer.wrap(encodedString)
      val length = buffer.getInt()
      if (buffer.remaining() < length * 2) {
         throw BufferUnderflowException()
      }
      val chars = CharArray(length)
      for (i in 0 until length) {
         val hi = buffer.get().toInt()
         val lo = buffer.get().toInt()
         chars[i] = ((hi shl 8) + lo).toChar()
      }
      return String(chars)
   }

   fun encode(str: String): ByteArray {
      val buffer = ByteBuffer.allocate(4 + 2 * str.length)
      val length = str.length
      buffer.putInt(length)
      for (i in 0 until length) {
         val ch = str[i].code
         buffer.put(((ch ushr 8) and 0xFF).toByte())
         buffer.put((ch and 0xFF).toByte())
      }
      return buffer.array()
   }
}
