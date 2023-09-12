package fedpro

import fedpro.callback.CallbackRequest
import fedpro.callback.CallbackResponse
import fedpro.callback.CallbackSucceeded
import fedpro.type.AttributeHandle
import fedpro.type.AttributeHandleValue
import fedpro.type.ParameterHandle
import fedpro.type.ParameterHandleValue
import java.io.IOException
import java.nio.ByteBuffer
import java.util.function.Consumer
import java.util.function.Function
import java.util.stream.Collectors

class HlaServiceCallbacks(
   private val _sendHlaCallbackResponse: Consumer<ByteArray>,
   private val _federateReference: FederateAmbassador
) {
   fun dispatchHlaCallback(sequenceNumber: Int, hlaCallback: ByteArray) {
      val callbackRequest = decodeCallbackRequest(hlaCallback)
      if (callbackRequest.objectInstanceNameReservationSucceeded != null) {
         _federateReference.objectInstanceNameReservationSucceeded(
            callbackRequest.objectInstanceNameReservationSucceeded.objectName
         )
      } else if (callbackRequest.objectInstanceNameReservationFailed != null) {
         _federateReference.objectInstanceNameReservationFailed(
            callbackRequest.objectInstanceNameReservationFailed.objectName
         )
      } else if (callbackRequest.reflectAttributeValues != null) {
         _federateReference.reflectAttributeValues(
            callbackRequest.reflectAttributeValues.theObject!!,
            convertA(callbackRequest.reflectAttributeValues.theAttributes!!.attributeHandleValue)
         )
      } else if (callbackRequest.receiveInteraction != null) {
         _federateReference.receiveInteraction(
            callbackRequest.receiveInteraction.interactionClass!!,
            convertP(callbackRequest.receiveInteraction.theParameters!!.parameterHandleValue)
         )
      } else if (callbackRequest.removeObjectInstance != null) {
         _federateReference.removeObjectInstance(
            callbackRequest.removeObjectInstance.theObject!!
         )
      } else if (callbackRequest.provideAttributeValueUpdate != null) {
         _federateReference.provideAttributeValueUpdate(
            callbackRequest.provideAttributeValueUpdate.theObject!!,
            convert(callbackRequest.provideAttributeValueUpdate.theAttributes!!.attributeHandle)
         )
      } else {
         //ignore
         //println("CallbackRequest not handled: $callbackRequest")
      }
      val response = CallbackResponse(CallbackSucceeded()).encode()
      val hlaCallbackResponseMessage = ByteBuffer.allocate(4 + response.size).putInt(sequenceNumber).put(response).array()

      _sendHlaCallbackResponse.accept(hlaCallbackResponseMessage)
   }

   companion object {
      private fun convertA(attributes: List<AttributeHandleValue>): Map<AttributeHandle, ByteArray> {
         return asMap(
            attributes,
            { item: AttributeHandleValue -> item.attributeHandle!! }) { item: AttributeHandleValue -> item.value_.toByteArray() }
      }

      private fun convertP(parameters: List<ParameterHandleValue>): Map<ParameterHandle, ByteArray> {
         return asMap(
            parameters,
            { item: ParameterHandleValue -> item.parameterHandle!! }) { item: ParameterHandleValue -> item.value_.toByteArray() }
      }

      private fun <T> convert(elements: List<T>): Set<T> {
         return java.util.Set.copyOf(elements)
      }

      private fun <R, K, V> asMap(list: List<R>, keyMapper: Function<R, K>, valueMapper: Function<R, V>): Map<K, V> {
         return list.stream().collect(Collectors.toMap(keyMapper, valueMapper))
      }

      private fun decodeCallbackRequest(hlaCallback: ByteArray): CallbackRequest {
         return try {
            CallbackRequest.ADAPTER.decode(hlaCallback)
         } catch (e: IOException) {
            throw RuntimeException(e)
         }
      }
   }
}
