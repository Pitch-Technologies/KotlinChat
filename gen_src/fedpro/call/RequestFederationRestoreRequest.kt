// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.RequestFederationRestoreRequest in RtiAmbassador.proto
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

public class RequestFederationRestoreRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val label: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<RequestFederationRestoreRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RequestFederationRestoreRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (label != other.label) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + label.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """label=${sanitize(label)}"""
    return result.joinToString(prefix = "RequestFederationRestoreRequest{", separator = ", ",
        postfix = "}")
  }

  public fun copy(label: String = this.label, unknownFields: ByteString = this.unknownFields):
      RequestFederationRestoreRequest = RequestFederationRestoreRequest(label, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RequestFederationRestoreRequest> = object :
        ProtoAdapter<RequestFederationRestoreRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      RequestFederationRestoreRequest::class, 
      "type.googleapis.com/fedpro.RequestFederationRestoreRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: RequestFederationRestoreRequest): Int {
        var size = value.unknownFields.size
        if (value.label != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.label)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: RequestFederationRestoreRequest) {
        if (value.label != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: RequestFederationRestoreRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.label != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label)
      }

      override fun decode(reader: ProtoReader): RequestFederationRestoreRequest {
        var label: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> label = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RequestFederationRestoreRequest(
          label = label,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: RequestFederationRestoreRequest): RequestFederationRestoreRequest
          = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
