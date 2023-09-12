// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.NormalizeFederateHandleResponse in RtiAmbassador.proto
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

public class NormalizeFederateHandleResponse(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#UINT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val result: Int = 0,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<NormalizeFederateHandleResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NormalizeFederateHandleResponse) return false
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
    return result_.joinToString(prefix = "NormalizeFederateHandleResponse{", separator = ", ",
        postfix = "}")
  }

  public fun copy(result: Int = this.result, unknownFields: ByteString = this.unknownFields):
      NormalizeFederateHandleResponse = NormalizeFederateHandleResponse(result, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<NormalizeFederateHandleResponse> = object :
        ProtoAdapter<NormalizeFederateHandleResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      NormalizeFederateHandleResponse::class, 
      "type.googleapis.com/fedpro.NormalizeFederateHandleResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: NormalizeFederateHandleResponse): Int {
        var size = value.unknownFields.size
        if (value.result != 0) size += ProtoAdapter.UINT32.encodedSizeWithTag(1, value.result)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: NormalizeFederateHandleResponse) {
        if (value.result != 0) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.result)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: NormalizeFederateHandleResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.result != 0) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.result)
      }

      override fun decode(reader: ProtoReader): NormalizeFederateHandleResponse {
        var result: Int = 0
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> result = ProtoAdapter.UINT32.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return NormalizeFederateHandleResponse(
          result = result,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: NormalizeFederateHandleResponse): NormalizeFederateHandleResponse
          = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
