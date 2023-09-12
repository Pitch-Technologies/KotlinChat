// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ConfirmInteractionTransportationTypeChange in FederateAmbassador.proto
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
import fedpro.type.InteractionClassHandle
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

public class ConfirmInteractionTransportationTypeChange(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.InteractionClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theInteraction: InteractionClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.TransportationTypeHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theTransportation: TransportationTypeHandle? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ConfirmInteractionTransportationTypeChange, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ConfirmInteractionTransportationTypeChange) return false
    if (unknownFields != other.unknownFields) return false
    if (theInteraction != other.theInteraction) return false
    if (theTransportation != other.theTransportation) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theInteraction?.hashCode() ?: 0)
      result = result * 37 + (theTransportation?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theInteraction != null) result += """theInteraction=$theInteraction"""
    if (theTransportation != null) result += """theTransportation=$theTransportation"""
    return result.joinToString(prefix = "ConfirmInteractionTransportationTypeChange{", separator =
        ", ", postfix = "}")
  }

  public fun copy(
    theInteraction: InteractionClassHandle? = this.theInteraction,
    theTransportation: TransportationTypeHandle? = this.theTransportation,
    unknownFields: ByteString = this.unknownFields,
  ): ConfirmInteractionTransportationTypeChange =
      ConfirmInteractionTransportationTypeChange(theInteraction, theTransportation, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ConfirmInteractionTransportationTypeChange> = object :
        ProtoAdapter<ConfirmInteractionTransportationTypeChange>(
      FieldEncoding.LENGTH_DELIMITED, 
      ConfirmInteractionTransportationTypeChange::class, 
      "type.googleapis.com/fedpro.ConfirmInteractionTransportationTypeChange", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: ConfirmInteractionTransportationTypeChange): Int {
        var size = value.unknownFields.size
        if (value.theInteraction != null) size +=
            InteractionClassHandle.ADAPTER.encodedSizeWithTag(1, value.theInteraction)
        if (value.theTransportation != null) size +=
            TransportationTypeHandle.ADAPTER.encodedSizeWithTag(2, value.theTransportation)
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: ConfirmInteractionTransportationTypeChange) {
        if (value.theInteraction != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theInteraction)
        if (value.theTransportation != null) TransportationTypeHandle.ADAPTER.encodeWithTag(writer,
            2, value.theTransportation)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: ConfirmInteractionTransportationTypeChange) {
        writer.writeBytes(value.unknownFields)
        if (value.theTransportation != null) TransportationTypeHandle.ADAPTER.encodeWithTag(writer,
            2, value.theTransportation)
        if (value.theInteraction != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theInteraction)
      }

      override fun decode(reader: ProtoReader): ConfirmInteractionTransportationTypeChange {
        var theInteraction: InteractionClassHandle? = null
        var theTransportation: TransportationTypeHandle? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theInteraction = InteractionClassHandle.ADAPTER.decode(reader)
            2 -> theTransportation = TransportationTypeHandle.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ConfirmInteractionTransportationTypeChange(
          theInteraction = theInteraction,
          theTransportation = theTransportation,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ConfirmInteractionTransportationTypeChange):
          ConfirmInteractionTransportationTypeChange = value.copy(
        theInteraction = value.theInteraction?.let(InteractionClassHandle.ADAPTER::redact),
        theTransportation = value.theTransportation?.let(TransportationTypeHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}