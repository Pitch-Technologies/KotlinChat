// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.TurnUpdatesOnForObjectInstanceWithRate in FederateAmbassador.proto
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
import com.squareup.wire.`internal`.sanitize
import fedpro.type.AttributeHandleSet
import fedpro.type.ObjectInstanceHandle
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

public class TurnUpdatesOnForObjectInstanceWithRate(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ObjectInstanceHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theObject: ObjectInstanceHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.AttributeHandleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theAttributes: AttributeHandleSet? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val updateRateDesignator: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<TurnUpdatesOnForObjectInstanceWithRate, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is TurnUpdatesOnForObjectInstanceWithRate) return false
    if (unknownFields != other.unknownFields) return false
    if (theObject != other.theObject) return false
    if (theAttributes != other.theAttributes) return false
    if (updateRateDesignator != other.updateRateDesignator) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theObject?.hashCode() ?: 0)
      result = result * 37 + (theAttributes?.hashCode() ?: 0)
      result = result * 37 + updateRateDesignator.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theObject != null) result += """theObject=$theObject"""
    if (theAttributes != null) result += """theAttributes=$theAttributes"""
    result += """updateRateDesignator=${sanitize(updateRateDesignator)}"""
    return result.joinToString(prefix = "TurnUpdatesOnForObjectInstanceWithRate{", separator = ", ",
        postfix = "}")
  }

  public fun copy(
    theObject: ObjectInstanceHandle? = this.theObject,
    theAttributes: AttributeHandleSet? = this.theAttributes,
    updateRateDesignator: String = this.updateRateDesignator,
    unknownFields: ByteString = this.unknownFields,
  ): TurnUpdatesOnForObjectInstanceWithRate = TurnUpdatesOnForObjectInstanceWithRate(theObject,
      theAttributes, updateRateDesignator, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<TurnUpdatesOnForObjectInstanceWithRate> = object :
        ProtoAdapter<TurnUpdatesOnForObjectInstanceWithRate>(
      FieldEncoding.LENGTH_DELIMITED, 
      TurnUpdatesOnForObjectInstanceWithRate::class, 
      "type.googleapis.com/fedpro.TurnUpdatesOnForObjectInstanceWithRate", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: TurnUpdatesOnForObjectInstanceWithRate): Int {
        var size = value.unknownFields.size
        if (value.theObject != null) size += ObjectInstanceHandle.ADAPTER.encodedSizeWithTag(1,
            value.theObject)
        if (value.theAttributes != null) size += AttributeHandleSet.ADAPTER.encodedSizeWithTag(2,
            value.theAttributes)
        if (value.updateRateDesignator != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3,
            value.updateRateDesignator)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: TurnUpdatesOnForObjectInstanceWithRate) {
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theObject)
        if (value.theAttributes != null) AttributeHandleSet.ADAPTER.encodeWithTag(writer, 2,
            value.theAttributes)
        if (value.updateRateDesignator != "") ProtoAdapter.STRING.encodeWithTag(writer, 3,
            value.updateRateDesignator)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: TurnUpdatesOnForObjectInstanceWithRate) {
        writer.writeBytes(value.unknownFields)
        if (value.updateRateDesignator != "") ProtoAdapter.STRING.encodeWithTag(writer, 3,
            value.updateRateDesignator)
        if (value.theAttributes != null) AttributeHandleSet.ADAPTER.encodeWithTag(writer, 2,
            value.theAttributes)
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theObject)
      }

      override fun decode(reader: ProtoReader): TurnUpdatesOnForObjectInstanceWithRate {
        var theObject: ObjectInstanceHandle? = null
        var theAttributes: AttributeHandleSet? = null
        var updateRateDesignator: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theObject = ObjectInstanceHandle.ADAPTER.decode(reader)
            2 -> theAttributes = AttributeHandleSet.ADAPTER.decode(reader)
            3 -> updateRateDesignator = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return TurnUpdatesOnForObjectInstanceWithRate(
          theObject = theObject,
          theAttributes = theAttributes,
          updateRateDesignator = updateRateDesignator,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: TurnUpdatesOnForObjectInstanceWithRate):
          TurnUpdatesOnForObjectInstanceWithRate = value.copy(
        theObject = value.theObject?.let(ObjectInstanceHandle.ADAPTER::redact),
        theAttributes = value.theAttributes?.let(AttributeHandleSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
