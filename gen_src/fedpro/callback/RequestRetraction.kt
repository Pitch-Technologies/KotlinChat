// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.RequestRetraction in FederateAmbassador.proto
package fedpro.callback

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import fedpro.type.MessageRetractionHandle
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

public class RequestRetraction(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.MessageRetractionHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theHandle: MessageRetractionHandle? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<RequestRetraction, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RequestRetraction) return false
    if (unknownFields != other.unknownFields) return false
    if (theHandle != other.theHandle) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theHandle?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theHandle != null) result += """theHandle=$theHandle"""
    return result.joinToString(prefix = "RequestRetraction{", separator = ", ", postfix = "}")
  }

  public fun copy(theHandle: MessageRetractionHandle? = this.theHandle, unknownFields: ByteString =
      this.unknownFields): RequestRetraction = RequestRetraction(theHandle, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RequestRetraction> = object : ProtoAdapter<RequestRetraction>(
      FieldEncoding.LENGTH_DELIMITED, 
      RequestRetraction::class, 
      "type.googleapis.com/fedpro.RequestRetraction", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: RequestRetraction): Int {
        var size = value.unknownFields.size
        if (value.theHandle != null) size += MessageRetractionHandle.ADAPTER.encodedSizeWithTag(1,
            value.theHandle)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: RequestRetraction) {
        if (value.theHandle != null) MessageRetractionHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theHandle)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: RequestRetraction) {
        writer.writeBytes(value.unknownFields)
        if (value.theHandle != null) MessageRetractionHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theHandle)
      }

      override fun decode(reader: ProtoReader): RequestRetraction {
        var theHandle: MessageRetractionHandle? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theHandle = MessageRetractionHandle.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RequestRetraction(
          theHandle = theHandle,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: RequestRetraction): RequestRetraction = value.copy(
        theHandle = value.theHandle?.let(MessageRetractionHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
