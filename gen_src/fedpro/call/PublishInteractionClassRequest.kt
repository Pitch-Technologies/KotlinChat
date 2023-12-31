// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.PublishInteractionClassRequest in RtiAmbassador.proto
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

public class PublishInteractionClassRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.InteractionClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theInteraction: InteractionClassHandle? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<PublishInteractionClassRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is PublishInteractionClassRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theInteraction != other.theInteraction) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theInteraction?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theInteraction != null) result += """theInteraction=$theInteraction"""
    return result.joinToString(prefix = "PublishInteractionClassRequest{", separator = ", ", postfix
        = "}")
  }

  public fun copy(theInteraction: InteractionClassHandle? = this.theInteraction,
      unknownFields: ByteString = this.unknownFields): PublishInteractionClassRequest =
      PublishInteractionClassRequest(theInteraction, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<PublishInteractionClassRequest> = object :
        ProtoAdapter<PublishInteractionClassRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      PublishInteractionClassRequest::class, 
      "type.googleapis.com/fedpro.PublishInteractionClassRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: PublishInteractionClassRequest): Int {
        var size = value.unknownFields.size
        if (value.theInteraction != null) size +=
            InteractionClassHandle.ADAPTER.encodedSizeWithTag(1, value.theInteraction)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: PublishInteractionClassRequest) {
        if (value.theInteraction != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theInteraction)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: PublishInteractionClassRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theInteraction != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theInteraction)
      }

      override fun decode(reader: ProtoReader): PublishInteractionClassRequest {
        var theInteraction: InteractionClassHandle? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theInteraction = InteractionClassHandle.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return PublishInteractionClassRequest(
          theInteraction = theInteraction,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: PublishInteractionClassRequest): PublishInteractionClassRequest =
          value.copy(
        theInteraction = value.theInteraction?.let(InteractionClassHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
