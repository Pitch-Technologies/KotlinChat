// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.GetOrderTypeResponse in RtiAmbassador.proto
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
import fedpro.type.OrderType
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

public class GetOrderTypeResponse(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.OrderType#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val result: OrderType = OrderType.RECEIVE,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<GetOrderTypeResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is GetOrderTypeResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (result != other.result) return false
    return true
  }

  override fun hashCode(): Int {
    var result_ = super.hashCode
    if (result_ == 0) {
      result_ = unknownFields.hashCode()
      result_ = result_ * 37 + result.hashCode()
      super.hashCode = result_
    }
    return result_
  }

  override fun toString(): String {
    val result_ = mutableListOf<String>()
    result_ += """result=$result"""
    return result_.joinToString(prefix = "GetOrderTypeResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(result: OrderType = this.result, unknownFields: ByteString = this.unknownFields):
      GetOrderTypeResponse = GetOrderTypeResponse(result, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<GetOrderTypeResponse> = object :
        ProtoAdapter<GetOrderTypeResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      GetOrderTypeResponse::class, 
      "type.googleapis.com/fedpro.GetOrderTypeResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: GetOrderTypeResponse): Int {
        var size = value.unknownFields.size
        if (value.result != OrderType.RECEIVE) size += OrderType.ADAPTER.encodedSizeWithTag(1,
            value.result)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: GetOrderTypeResponse) {
        if (value.result != OrderType.RECEIVE) OrderType.ADAPTER.encodeWithTag(writer, 1,
            value.result)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: GetOrderTypeResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.result != OrderType.RECEIVE) OrderType.ADAPTER.encodeWithTag(writer, 1,
            value.result)
      }

      override fun decode(reader: ProtoReader): GetOrderTypeResponse {
        var result: OrderType = OrderType.RECEIVE
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> try {
              result = OrderType.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return GetOrderTypeResponse(
          result = result,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: GetOrderTypeResponse): GetOrderTypeResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
