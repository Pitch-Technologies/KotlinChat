// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.GetOrderNameRequest in RtiAmbassador.proto
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

public class GetOrderNameRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.OrderType#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theType: OrderType = OrderType.RECEIVE,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<GetOrderNameRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is GetOrderNameRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theType != other.theType) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + theType.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """theType=$theType"""
    return result.joinToString(prefix = "GetOrderNameRequest{", separator = ", ", postfix = "}")
  }

  public fun copy(theType: OrderType = this.theType, unknownFields: ByteString =
      this.unknownFields): GetOrderNameRequest = GetOrderNameRequest(theType, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<GetOrderNameRequest> = object :
        ProtoAdapter<GetOrderNameRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      GetOrderNameRequest::class, 
      "type.googleapis.com/fedpro.GetOrderNameRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: GetOrderNameRequest): Int {
        var size = value.unknownFields.size
        if (value.theType != OrderType.RECEIVE) size += OrderType.ADAPTER.encodedSizeWithTag(1,
            value.theType)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: GetOrderNameRequest) {
        if (value.theType != OrderType.RECEIVE) OrderType.ADAPTER.encodeWithTag(writer, 1,
            value.theType)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: GetOrderNameRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theType != OrderType.RECEIVE) OrderType.ADAPTER.encodeWithTag(writer, 1,
            value.theType)
      }

      override fun decode(reader: ProtoReader): GetOrderNameRequest {
        var theType: OrderType = OrderType.RECEIVE
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> try {
              theType = OrderType.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return GetOrderNameRequest(
          theType = theType,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: GetOrderNameRequest): GetOrderNameRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}