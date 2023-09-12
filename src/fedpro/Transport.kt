package fedpro

import java.io.IOException
import java.net.Socket

class Transport {
   private lateinit var _socket: Socket

   fun connect(host: String, port: Int) {
      _socket = try {
         Socket(host, port)
      } catch (e: IOException) {
         throw RtiException("Failed to connect FedPro Server at '$host:$port'", e)
      }
   }

   fun writeMessage(message: Message) {
      with(_socket.getOutputStream()) {
         write(message.encode())
         flush()
      }
   }

   fun readMessage(): Message {
      return Message.decode(_socket.getInputStream())
   }
}
