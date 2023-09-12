// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.GetInteractionClassHandleRequest in RtiAmbassador.proto
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
import com.squareup.wire.`internal`.sanitize
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

public class GetInteractionClassHandleRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theName: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<GetInteractionClassHandleRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is GetInteractionClassHandleRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theName != other.theName) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + theName.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """theName=${sanitize(theName)}"""
    return result.joinToString(prefix = "GetInteractionClassHandleRequest{", separator = ", ",
        postfix = "}")
  }

  public fun copy(theName: String = this.theName, unknownFields: ByteString = this.unknownFields):
      GetInteractionClassHandleRequest = GetInteractionClassHandleRequest(theName, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<GetInteractionClassHandleRequest> = object :
        ProtoAdapter<GetInteractionClassHandleRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      GetInteractionClassHandleRequest::class, 
      "type.googleapis.com/fedpro.GetInteractionClassHandleRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: GetInteractionClassHandleRequest): Int {
        var size = value.unknownFields.size
        if (value.theName != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.theName)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: GetInteractionClassHandleRequest) {
        if (value.theName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.theName)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: GetInteractionClassHandleRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.theName)
      }

      override fun decode(reader: ProtoReader): GetInteractionClassHandleRequest {
        var theName: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theName = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return GetInteractionClassHandleRequest(
          theName = theName,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: GetInteractionClassHandleRequest):
          GetInteractionClassHandleRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
