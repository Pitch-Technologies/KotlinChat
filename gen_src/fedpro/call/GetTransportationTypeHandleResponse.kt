// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.GetTransportationTypeHandleResponse in RtiAmbassador.proto
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
import fedpro.type.TransportationTypeHandle
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

public class GetTransportationTypeHandleResponse(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.TransportationTypeHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val result: TransportationTypeHandle? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<GetTransportationTypeHandleResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is GetTransportationTypeHandleResponse) return false
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
    return result_.joinToString(prefix = "GetTransportationTypeHandleResponse{", separator = ", ",
        postfix = "}")
  }

  public fun copy(result: TransportationTypeHandle? = this.result, unknownFields: ByteString =
      this.unknownFields): GetTransportationTypeHandleResponse =
      GetTransportationTypeHandleResponse(result, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<GetTransportationTypeHandleResponse> = object :
        ProtoAdapter<GetTransportationTypeHandleResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      GetTransportationTypeHandleResponse::class, 
      "type.googleapis.com/fedpro.GetTransportationTypeHandleResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: GetTransportationTypeHandleResponse): Int {
        var size = value.unknownFields.size
        if (value.result != null) size += TransportationTypeHandle.ADAPTER.encodedSizeWithTag(1,
            value.result)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: GetTransportationTypeHandleResponse) {
        if (value.result != null) TransportationTypeHandle.ADAPTER.encodeWithTag(writer, 1,
            value.result)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: GetTransportationTypeHandleResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.result != null) TransportationTypeHandle.ADAPTER.encodeWithTag(writer, 1,
            value.result)
      }

      override fun decode(reader: ProtoReader): GetTransportationTypeHandleResponse {
        var result: TransportationTypeHandle? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> result = TransportationTypeHandle.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return GetTransportationTypeHandleResponse(
          result = result,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: GetTransportationTypeHandleResponse):
          GetTransportationTypeHandleResponse = value.copy(
        result = value.result?.let(TransportationTypeHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
