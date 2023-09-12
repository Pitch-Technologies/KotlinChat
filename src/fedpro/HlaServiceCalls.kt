package fedpro

import fedpro.call.*
import fedpro.type.*
import okio.ByteString
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.util.concurrent.CompletableFuture
import java.util.function.Function
import java.util.stream.Collectors

class HlaServiceCalls(private val _sendHlaCallRequest: Function<ByteArray, CompletableFuture<ByteArray>>) {
   fun connect(crcHost: String) {
      val callRequest = CallRequest(
         connectWithConfigurationRequest =
         ConnectWithConfigurationRequest(
            RtiConfiguration(rtiAddress = crcHost)
         )
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      assert(response.connectWithConfigurationResponse != null)
   }

   fun disconnect() {
      val callRequest = CallRequest(
         disconnectRequest =
         DisconnectRequest()
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      assert(response.disconnectResponse != null)
   }

   fun createFederationExecution(federationExecutionName: String, fomModule: File): Boolean {
      val fileContent: ByteString = try {
         ByteString.of(*Files.readAllBytes(fomModule.toPath()))
      } catch (e: IOException) {
         throw RtiException("Failed to read FOM module", e)
      }
      val fom = FomModule(
         FileFomModule(fomModule.getName(), fileContent)
      )
      val callRequest = CallRequest(
         createFederationExecutionRequest =
         CreateFederationExecutionRequest(federationExecutionName, fom)
      )
      val response = doHlaCall(callRequest).join()
      if (hasException(response, "FederationExecutionAlreadyExists")) {
         return false
      }
      throwOnException(response)
      assert(response.createFederationExecutionResponse != null)
      return true
   }

   fun destroyFederationExecution(federationExecutionName: String): Boolean {
      val callRequest = CallRequest(
         destroyFederationExecutionRequest =
         DestroyFederationExecutionRequest(federationExecutionName)
      )
      val response = doHlaCall(callRequest).join()
      if (hasException(response, "FederatesCurrentlyJoined", "FederationExecutionDoesNotExist")) {
         return false
      }
      throwOnException(response)
      assert(response.destroyFederationExecutionResponse != null)
      return true
   }

   fun joinFederationExecution(federateName: String, federationExecutionName: String) {
      val callRequest = CallRequest(
         joinFederationExecutionRequest =
         JoinFederationExecutionRequest(federateName, federationExecutionName)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      assert(response.joinFederationExecutionResponse != null)
   }

   fun resignFederationExecution(action: ResignAction) {
      val callRequest = CallRequest(
         resignFederationExecutionRequest =
         ResignFederationExecutionRequest(action)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      assert(response.resignFederationExecutionResponse != null)
   }

   fun publishObjectClassAttributes(objectClassHandle: ObjectClassHandle, attributes: Set<AttributeHandle>) {
      val callRequest = CallRequest(
         publishObjectClassAttributesRequest =
         PublishObjectClassAttributesRequest(
            objectClassHandle,
            AttributeHandleSet(java.util.List.copyOf(attributes))
         )
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      assert(response.publishObjectClassAttributesResponse != null)
   }

   fun publishInteractionClass(interactionHandle: InteractionClassHandle) {
      val callRequest = CallRequest(
         publishInteractionClassRequest =
         PublishInteractionClassRequest(interactionHandle)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      assert(response.publishInteractionClassResponse != null)
   }

   fun subscribeObjectClassAttributes(objectClassHandle: ObjectClassHandle, attributes: Set<AttributeHandle>) {
      val callRequest = CallRequest(
         subscribeObjectClassAttributesRequest =
         SubscribeObjectClassAttributesRequest(
            objectClassHandle,
            AttributeHandleSet(java.util.List.copyOf(attributes))
         )
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      assert(response.subscribeObjectClassAttributesResponse != null)
   }

   fun subscribeInteractionClass(interactionHandle: InteractionClassHandle) {
      val callRequest = CallRequest(
         subscribeInteractionClassRequest =
         SubscribeInteractionClassRequest(interactionHandle)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      assert(response.subscribeInteractionClassResponse != null)
   }

   fun reserveObjectInstanceName(instanceName: String): Boolean {
      val callRequest = CallRequest(
         reserveObjectInstanceNameRequest =
         ReserveObjectInstanceNameRequest(instanceName)
      )
      val response = doHlaCall(callRequest).join()
      assert(response.reserveObjectInstanceNameResponse != null)
      if (hasException(response, "IllegalName")) {
         return false
      }
      throwOnException(response)
      return true
   }

   fun registerObjectInstance(objectClassHandle: ObjectClassHandle, instanceName: String): ObjectInstanceHandle {
      val callRequest = CallRequest(
         registerObjectInstanceWithNameRequest =
         RegisterObjectInstanceWithNameRequest(objectClassHandle, instanceName)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      return response.registerObjectInstanceWithNameResponse!!.result!!
   }

   fun updateAttributeValues(
      instanceHandle: ObjectInstanceHandle,
      attributes: Map<AttributeHandle, ByteArray>,
      ignoreExceptions: Boolean
   ) {
      val callRequest = CallRequest(
         updateAttributeValuesRequest =
         UpdateAttributeValuesRequest(instanceHandle, convertA(attributes), ByteString.EMPTY)
      )
      val response = doHlaCall(callRequest)
      if (!ignoreExceptions) {
         val result = response.join()
         throwOnException(result)
         assert(result.updateAttributeValuesResponse != null)
      }
   }

   fun sendInteraction(
      interactionHandle: InteractionClassHandle,
      parameters: Map<ParameterHandle, ByteArray>,
      ignoreExceptions: Boolean
   ) {
      val callRequest = CallRequest(
         sendInteractionRequest =
         SendInteractionRequest(interactionHandle, convertP(parameters), ByteString.EMPTY)
      )
      val response = doHlaCall(callRequest)
      if (!ignoreExceptions) {
         val result = response.join()
         throwOnException(result)
         assert(result.sendInteractionResponse != null)
      }
   }

   fun getObjectClassHandle(name: String): ObjectClassHandle {
      val callRequest = CallRequest(
         getObjectClassHandleRequest =
         GetObjectClassHandleRequest(name)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      return response.getObjectClassHandleResponse!!.result!!
   }

   fun getAttributeHandle(objectClassHandle: ObjectClassHandle, name: String): AttributeHandle {
      val callRequest = CallRequest(
         getAttributeHandleRequest =
         GetAttributeHandleRequest(objectClassHandle, name)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      return response.getAttributeHandleResponse!!.result!!
   }

   fun getInteractionClassHandle(name: String): InteractionClassHandle {
      val callRequest = CallRequest(
         getInteractionClassHandleRequest =
         GetInteractionClassHandleRequest(name)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      return response.getInteractionClassHandleResponse!!.result!!
   }

   fun getParameterHandle(interactionHandle: InteractionClassHandle, name: String): ParameterHandle {
      val callRequest = CallRequest(
         getParameterHandleRequest =
         GetParameterHandleRequest(interactionHandle, name)
      )
      val response = doHlaCall(callRequest).join()
      throwOnException(response)
      return response.getParameterHandleResponse!!.result!!
   }

   private fun doHlaCall(callRequest: CallRequest): CompletableFuture<CallResponse> {
      val call = _sendHlaCallRequest.apply(callRequest.encode())
      return call.thenApply { bytes: ByteArray -> decodeCallResponse(bytes) }
   }

   companion object {
      private fun convertA(attributes: Map<AttributeHandle, ByteArray>): AttributeHandleValueMap {
         return AttributeHandleValueMap(asList(attributes) { (key, value): Map.Entry<AttributeHandle, ByteArray> ->
            AttributeHandleValue(
               key, ByteString.of(*value)
            )
         })
      }

      private fun convertP(parameters: Map<ParameterHandle, ByteArray>): ParameterHandleValueMap {
         return ParameterHandleValueMap(asList(parameters) { (key, value): Map.Entry<ParameterHandle, ByteArray> ->
            ParameterHandleValue(
               key, ByteString.of(*value)
            )
         })
      }

      private fun <R, K, V> asList(map: Map<K, V>, mapper: Function<Map.Entry<K, V>, R>): List<R> {
         return map.entries.stream().map(mapper).collect(Collectors.toList())
      }

      private fun throwOnException(callResponse: CallResponse) {
         if (callResponse.exceptionData != null) {
            throw RtiException(
               "${callResponse.exceptionData.exceptionName}: ${callResponse.exceptionData.details}"
            )
         }
      }

      private fun hasException(callResponse: CallResponse, vararg exceptionNames: String): Boolean {
         return if (callResponse.exceptionData != null) {
            java.util.Set.copyOf(listOf(*exceptionNames))
               .contains(callResponse.exceptionData.exceptionName)
         } else false
      }

      private fun decodeCallResponse(bytes: ByteArray): CallResponse {
         return try {
            CallResponse.ADAPTER.decode(bytes)
         } catch (e: IOException) {
            throw RuntimeException(e)
         }
      }
   }
}
