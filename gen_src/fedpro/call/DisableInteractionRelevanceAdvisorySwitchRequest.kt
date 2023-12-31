// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.DisableInteractionRelevanceAdvisorySwitchRequest in RtiAmbassador.proto
package fedpro.call

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
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

public class DisableInteractionRelevanceAdvisorySwitchRequest(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<DisableInteractionRelevanceAdvisorySwitchRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is DisableInteractionRelevanceAdvisorySwitchRequest) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "DisableInteractionRelevanceAdvisorySwitchRequest{}"

  public fun copy(unknownFields: ByteString = this.unknownFields):
      DisableInteractionRelevanceAdvisorySwitchRequest =
      DisableInteractionRelevanceAdvisorySwitchRequest(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<DisableInteractionRelevanceAdvisorySwitchRequest> = object :
        ProtoAdapter<DisableInteractionRelevanceAdvisorySwitchRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      DisableInteractionRelevanceAdvisorySwitchRequest::class, 
      "type.googleapis.com/fedpro.DisableInteractionRelevanceAdvisorySwitchRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: DisableInteractionRelevanceAdvisorySwitchRequest): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: DisableInteractionRelevanceAdvisorySwitchRequest) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: DisableInteractionRelevanceAdvisorySwitchRequest) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): DisableInteractionRelevanceAdvisorySwitchRequest {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return DisableInteractionRelevanceAdvisorySwitchRequest(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: DisableInteractionRelevanceAdvisorySwitchRequest):
          DisableInteractionRelevanceAdvisorySwitchRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
