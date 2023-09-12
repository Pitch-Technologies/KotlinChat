// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.AttributeSetRegionSetPair in DataTypes.proto
package fedpro.type

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

public class AttributeSetRegionSetPair(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.AttributeHandleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val attributeSet: AttributeHandleSet? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.RegionHandleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val regionSet: RegionHandleSet? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<AttributeSetRegionSetPair, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is AttributeSetRegionSetPair) return false
    if (unknownFields != other.unknownFields) return false
    if (attributeSet != other.attributeSet) return false
    if (regionSet != other.regionSet) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (attributeSet?.hashCode() ?: 0)
      result = result * 37 + (regionSet?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (attributeSet != null) result += """attributeSet=$attributeSet"""
    if (regionSet != null) result += """regionSet=$regionSet"""
    return result.joinToString(prefix = "AttributeSetRegionSetPair{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    attributeSet: AttributeHandleSet? = this.attributeSet,
    regionSet: RegionHandleSet? = this.regionSet,
    unknownFields: ByteString = this.unknownFields,
  ): AttributeSetRegionSetPair = AttributeSetRegionSetPair(attributeSet, regionSet, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<AttributeSetRegionSetPair> = object :
        ProtoAdapter<AttributeSetRegionSetPair>(
      FieldEncoding.LENGTH_DELIMITED, 
      AttributeSetRegionSetPair::class, 
      "type.googleapis.com/fedpro.AttributeSetRegionSetPair", 
      PROTO_3, 
      null, 
      "DataTypes.proto"
    ) {
      override fun encodedSize(`value`: AttributeSetRegionSetPair): Int {
        var size = value.unknownFields.size
        if (value.attributeSet != null) size += AttributeHandleSet.ADAPTER.encodedSizeWithTag(1,
            value.attributeSet)
        if (value.regionSet != null) size += RegionHandleSet.ADAPTER.encodedSizeWithTag(2,
            value.regionSet)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: AttributeSetRegionSetPair) {
        if (value.attributeSet != null) AttributeHandleSet.ADAPTER.encodeWithTag(writer, 1,
            value.attributeSet)
        if (value.regionSet != null) RegionHandleSet.ADAPTER.encodeWithTag(writer, 2,
            value.regionSet)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: AttributeSetRegionSetPair) {
        writer.writeBytes(value.unknownFields)
        if (value.regionSet != null) RegionHandleSet.ADAPTER.encodeWithTag(writer, 2,
            value.regionSet)
        if (value.attributeSet != null) AttributeHandleSet.ADAPTER.encodeWithTag(writer, 1,
            value.attributeSet)
      }

      override fun decode(reader: ProtoReader): AttributeSetRegionSetPair {
        var attributeSet: AttributeHandleSet? = null
        var regionSet: RegionHandleSet? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> attributeSet = AttributeHandleSet.ADAPTER.decode(reader)
            2 -> regionSet = RegionHandleSet.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return AttributeSetRegionSetPair(
          attributeSet = attributeSet,
          regionSet = regionSet,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: AttributeSetRegionSetPair): AttributeSetRegionSetPair =
          value.copy(
        attributeSet = value.attributeSet?.let(AttributeHandleSet.ADAPTER::redact),
        regionSet = value.regionSet?.let(RegionHandleSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}