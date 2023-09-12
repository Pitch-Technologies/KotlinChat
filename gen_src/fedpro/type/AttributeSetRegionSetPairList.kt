// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.AttributeSetRegionSetPairList in DataTypes.proto
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
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.redactElements
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import okio.ByteString

public class AttributeSetRegionSetPairList(
  fedpro_AttributeSetRegionSetPair: List<AttributeSetRegionSetPair> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<AttributeSetRegionSetPairList, Nothing>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.AttributeSetRegionSetPair#ADAPTER",
    label = WireField.Label.REPEATED,
    declaredName = "AttributeSetRegionSetPair",
    schemaIndex = 0,
  )
  public val fedpro_AttributeSetRegionSetPair: List<AttributeSetRegionSetPair> =
      immutableCopyOf("fedpro_AttributeSetRegionSetPair", fedpro_AttributeSetRegionSetPair)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is AttributeSetRegionSetPairList) return false
    if (unknownFields != other.unknownFields) return false
    if (fedpro_AttributeSetRegionSetPair != other.fedpro_AttributeSetRegionSetPair) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + fedpro_AttributeSetRegionSetPair.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (fedpro_AttributeSetRegionSetPair.isNotEmpty()) result +=
        """fedpro_AttributeSetRegionSetPair=$fedpro_AttributeSetRegionSetPair"""
    return result.joinToString(prefix = "AttributeSetRegionSetPairList{", separator = ", ", postfix
        = "}")
  }

  public fun copy(fedpro_AttributeSetRegionSetPair: List<AttributeSetRegionSetPair> =
      this.fedpro_AttributeSetRegionSetPair, unknownFields: ByteString = this.unknownFields):
      AttributeSetRegionSetPairList =
      AttributeSetRegionSetPairList(fedpro_AttributeSetRegionSetPair, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<AttributeSetRegionSetPairList> = object :
        ProtoAdapter<AttributeSetRegionSetPairList>(
      FieldEncoding.LENGTH_DELIMITED, 
      AttributeSetRegionSetPairList::class, 
      "type.googleapis.com/fedpro.AttributeSetRegionSetPairList", 
      PROTO_3, 
      null, 
      "DataTypes.proto"
    ) {
      override fun encodedSize(`value`: AttributeSetRegionSetPairList): Int {
        var size = value.unknownFields.size
        size += AttributeSetRegionSetPair.ADAPTER.asRepeated().encodedSizeWithTag(1,
            value.fedpro_AttributeSetRegionSetPair)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: AttributeSetRegionSetPairList) {
        AttributeSetRegionSetPair.ADAPTER.asRepeated().encodeWithTag(writer, 1,
            value.fedpro_AttributeSetRegionSetPair)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: AttributeSetRegionSetPairList) {
        writer.writeBytes(value.unknownFields)
        AttributeSetRegionSetPair.ADAPTER.asRepeated().encodeWithTag(writer, 1,
            value.fedpro_AttributeSetRegionSetPair)
      }

      override fun decode(reader: ProtoReader): AttributeSetRegionSetPairList {
        val fedpro_AttributeSetRegionSetPair = mutableListOf<AttributeSetRegionSetPair>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 ->
                fedpro_AttributeSetRegionSetPair.add(AttributeSetRegionSetPair.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return AttributeSetRegionSetPairList(
          fedpro_AttributeSetRegionSetPair = fedpro_AttributeSetRegionSetPair,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: AttributeSetRegionSetPairList): AttributeSetRegionSetPairList =
          value.copy(
        fedpro_AttributeSetRegionSetPair =
            value.fedpro_AttributeSetRegionSetPair.redactElements(AttributeSetRegionSetPair.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}