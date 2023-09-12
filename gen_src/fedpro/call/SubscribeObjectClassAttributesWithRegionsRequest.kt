// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SubscribeObjectClassAttributesWithRegionsRequest in RtiAmbassador.proto
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
import fedpro.type.AttributeSetRegionSetPairList
import fedpro.type.ObjectClassHandle
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

public class SubscribeObjectClassAttributesWithRegionsRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ObjectClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theClass: ObjectClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.AttributeSetRegionSetPairList#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val attributesAndRegions: AttributeSetRegionSetPairList? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val active: Boolean = false,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SubscribeObjectClassAttributesWithRegionsRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SubscribeObjectClassAttributesWithRegionsRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theClass != other.theClass) return false
    if (attributesAndRegions != other.attributesAndRegions) return false
    if (active != other.active) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theClass?.hashCode() ?: 0)
      result = result * 37 + (attributesAndRegions?.hashCode() ?: 0)
      result = result * 37 + active.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theClass != null) result += """theClass=$theClass"""
    if (attributesAndRegions != null) result += """attributesAndRegions=$attributesAndRegions"""
    result += """active=$active"""
    return result.joinToString(prefix = "SubscribeObjectClassAttributesWithRegionsRequest{",
        separator = ", ", postfix = "}")
  }

  public fun copy(
    theClass: ObjectClassHandle? = this.theClass,
    attributesAndRegions: AttributeSetRegionSetPairList? = this.attributesAndRegions,
    active: Boolean = this.active,
    unknownFields: ByteString = this.unknownFields,
  ): SubscribeObjectClassAttributesWithRegionsRequest =
      SubscribeObjectClassAttributesWithRegionsRequest(theClass, attributesAndRegions, active,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SubscribeObjectClassAttributesWithRegionsRequest> = object :
        ProtoAdapter<SubscribeObjectClassAttributesWithRegionsRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      SubscribeObjectClassAttributesWithRegionsRequest::class, 
      "type.googleapis.com/fedpro.SubscribeObjectClassAttributesWithRegionsRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: SubscribeObjectClassAttributesWithRegionsRequest): Int {
        var size = value.unknownFields.size
        if (value.theClass != null) size += ObjectClassHandle.ADAPTER.encodedSizeWithTag(1,
            value.theClass)
        if (value.attributesAndRegions != null) size +=
            AttributeSetRegionSetPairList.ADAPTER.encodedSizeWithTag(2, value.attributesAndRegions)
        if (value.active != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(3, value.active)
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: SubscribeObjectClassAttributesWithRegionsRequest) {
        if (value.theClass != null) ObjectClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
        if (value.attributesAndRegions != null)
            AttributeSetRegionSetPairList.ADAPTER.encodeWithTag(writer, 2,
            value.attributesAndRegions)
        if (value.active != false) ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.active)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: SubscribeObjectClassAttributesWithRegionsRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.active != false) ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.active)
        if (value.attributesAndRegions != null)
            AttributeSetRegionSetPairList.ADAPTER.encodeWithTag(writer, 2,
            value.attributesAndRegions)
        if (value.theClass != null) ObjectClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
      }

      override fun decode(reader: ProtoReader): SubscribeObjectClassAttributesWithRegionsRequest {
        var theClass: ObjectClassHandle? = null
        var attributesAndRegions: AttributeSetRegionSetPairList? = null
        var active: Boolean = false
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theClass = ObjectClassHandle.ADAPTER.decode(reader)
            2 -> attributesAndRegions = AttributeSetRegionSetPairList.ADAPTER.decode(reader)
            3 -> active = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SubscribeObjectClassAttributesWithRegionsRequest(
          theClass = theClass,
          attributesAndRegions = attributesAndRegions,
          active = active,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SubscribeObjectClassAttributesWithRegionsRequest):
          SubscribeObjectClassAttributesWithRegionsRequest = value.copy(
        theClass = value.theClass?.let(ObjectClassHandle.ADAPTER::redact),
        attributesAndRegions =
            value.attributesAndRegions?.let(AttributeSetRegionSetPairList.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}