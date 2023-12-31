// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.NormalizeServiceGroupRequest in RtiAmbassador.proto
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
import fedpro.type.ServiceGroup
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

public class NormalizeServiceGroupRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ServiceGroup#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val group: ServiceGroup = ServiceGroup.FEDERATION_MANAGEMENT,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<NormalizeServiceGroupRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NormalizeServiceGroupRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (group != other.group) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + group.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """group=$group"""
    return result.joinToString(prefix = "NormalizeServiceGroupRequest{", separator = ", ", postfix =
        "}")
  }

  public fun copy(group: ServiceGroup = this.group, unknownFields: ByteString = this.unknownFields):
      NormalizeServiceGroupRequest = NormalizeServiceGroupRequest(group, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<NormalizeServiceGroupRequest> = object :
        ProtoAdapter<NormalizeServiceGroupRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      NormalizeServiceGroupRequest::class, 
      "type.googleapis.com/fedpro.NormalizeServiceGroupRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: NormalizeServiceGroupRequest): Int {
        var size = value.unknownFields.size
        if (value.group != ServiceGroup.FEDERATION_MANAGEMENT) size +=
            ServiceGroup.ADAPTER.encodedSizeWithTag(1, value.group)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: NormalizeServiceGroupRequest) {
        if (value.group != ServiceGroup.FEDERATION_MANAGEMENT)
            ServiceGroup.ADAPTER.encodeWithTag(writer, 1, value.group)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: NormalizeServiceGroupRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.group != ServiceGroup.FEDERATION_MANAGEMENT)
            ServiceGroup.ADAPTER.encodeWithTag(writer, 1, value.group)
      }

      override fun decode(reader: ProtoReader): NormalizeServiceGroupRequest {
        var group: ServiceGroup = ServiceGroup.FEDERATION_MANAGEMENT
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> try {
              group = ServiceGroup.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return NormalizeServiceGroupRequest(
          group = group,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: NormalizeServiceGroupRequest): NormalizeServiceGroupRequest =
          value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
