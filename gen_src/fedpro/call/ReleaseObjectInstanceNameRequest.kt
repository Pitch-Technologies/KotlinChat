// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ReleaseObjectInstanceNameRequest in RtiAmbassador.proto
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

public class ReleaseObjectInstanceNameRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theObjectInstanceName: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ReleaseObjectInstanceNameRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ReleaseObjectInstanceNameRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theObjectInstanceName != other.theObjectInstanceName) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + theObjectInstanceName.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """theObjectInstanceName=${sanitize(theObjectInstanceName)}"""
    return result.joinToString(prefix = "ReleaseObjectInstanceNameRequest{", separator = ", ",
        postfix = "}")
  }

  public fun copy(theObjectInstanceName: String = this.theObjectInstanceName,
      unknownFields: ByteString = this.unknownFields): ReleaseObjectInstanceNameRequest =
      ReleaseObjectInstanceNameRequest(theObjectInstanceName, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ReleaseObjectInstanceNameRequest> = object :
        ProtoAdapter<ReleaseObjectInstanceNameRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      ReleaseObjectInstanceNameRequest::class, 
      "type.googleapis.com/fedpro.ReleaseObjectInstanceNameRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: ReleaseObjectInstanceNameRequest): Int {
        var size = value.unknownFields.size
        if (value.theObjectInstanceName != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.theObjectInstanceName)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ReleaseObjectInstanceNameRequest) {
        if (value.theObjectInstanceName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.theObjectInstanceName)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ReleaseObjectInstanceNameRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theObjectInstanceName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.theObjectInstanceName)
      }

      override fun decode(reader: ProtoReader): ReleaseObjectInstanceNameRequest {
        var theObjectInstanceName: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theObjectInstanceName = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ReleaseObjectInstanceNameRequest(
          theObjectInstanceName = theObjectInstanceName,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ReleaseObjectInstanceNameRequest):
          ReleaseObjectInstanceNameRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
