// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.GetInteractionClassHandleResponse in RtiAmbassador.proto
package fedpro.call

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import fedpro.type.InteractionClassHandle
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import okio.ByteString

public class GetInteractionClassHandleResponse(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.InteractionClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val result: InteractionClassHandle? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<GetInteractionClassHandleResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is GetInteractionClassHandleResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (result != other.result) return false
    return true
  }

  override fun hashCode(): Int {
    var result_ = super.hashCode
    if (result_ == 0) {
      result_ = unknownFields.hashCode()
      result_ = result_ * 37 + (result?.hashCode() ?: 0)
      super.hashCode = result_
    }
    return result_
  }

  override fun toString(): String {
    val result_ = mutableListOf<String>()
    if (result != null) result_ += """result=$result"""
    return result_.joinToString(prefix = "GetInteractionClassHandleResponse{", separator = ", ",
        postfix = "}")
  }

  public fun copy(result: InteractionClassHandle? = this.result, unknownFields: ByteString =
      this.unknownFields): GetInteractionClassHandleResponse =
      GetInteractionClassHandleResponse(result, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<GetInteractionClassHandleResponse> = object :
        ProtoAdapter<GetInteractionClassHandleResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      GetInteractionClassHandleResponse::class, 
      "type.googleapis.com/fedpro.GetInteractionClassHandleResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: GetInteractionClassHandleResponse): Int {
        var size = value.unknownFields.size
        if (value.result != null) size += InteractionClassHandle.ADAPTER.encodedSizeWithTag(1,
            value.result)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: GetInteractionClassHandleResponse) {
        if (value.result != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.result)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: GetInteractionClassHandleResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.result != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.result)
      }

      override fun decode(reader: ProtoReader): GetInteractionClassHandleResponse {
        var result: InteractionClassHandle? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> result = InteractionClassHandle.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return GetInteractionClassHandleResponse(
          result = result,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: GetInteractionClassHandleResponse):
          GetInteractionClassHandleResponse = value.copy(
        result = value.result?.let(InteractionClassHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}