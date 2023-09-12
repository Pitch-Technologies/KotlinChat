// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SubscribeInteractionClassWithRegionsRequest in RtiAmbassador.proto
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
import fedpro.type.RegionHandleSet
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

public class SubscribeInteractionClassWithRegionsRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.InteractionClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theClass: InteractionClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val active: Boolean = false,
  @field:WireField(
    tag = 3,
    adapter = "fedpro.type.RegionHandleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val regions: RegionHandleSet? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SubscribeInteractionClassWithRegionsRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SubscribeInteractionClassWithRegionsRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theClass != other.theClass) return false
    if (active != other.active) return false
    if (regions != other.regions) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theClass?.hashCode() ?: 0)
      result = result * 37 + active.hashCode()
      result = result * 37 + (regions?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theClass != null) result += """theClass=$theClass"""
    result += """active=$active"""
    if (regions != null) result += """regions=$regions"""
    return result.joinToString(prefix = "SubscribeInteractionClassWithRegionsRequest{", separator =
        ", ", postfix = "}")
  }

  public fun copy(
    theClass: InteractionClassHandle? = this.theClass,
    active: Boolean = this.active,
    regions: RegionHandleSet? = this.regions,
    unknownFields: ByteString = this.unknownFields,
  ): SubscribeInteractionClassWithRegionsRequest =
      SubscribeInteractionClassWithRegionsRequest(theClass, active, regions, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SubscribeInteractionClassWithRegionsRequest> = object :
        ProtoAdapter<SubscribeInteractionClassWithRegionsRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      SubscribeInteractionClassWithRegionsRequest::class, 
      "type.googleapis.com/fedpro.SubscribeInteractionClassWithRegionsRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: SubscribeInteractionClassWithRegionsRequest): Int {
        var size = value.unknownFields.size
        if (value.theClass != null) size += InteractionClassHandle.ADAPTER.encodedSizeWithTag(1,
            value.theClass)
        if (value.active != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(2, value.active)
        if (value.regions != null) size += RegionHandleSet.ADAPTER.encodedSizeWithTag(3,
            value.regions)
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: SubscribeInteractionClassWithRegionsRequest) {
        if (value.theClass != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
        if (value.active != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.active)
        if (value.regions != null) RegionHandleSet.ADAPTER.encodeWithTag(writer, 3, value.regions)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: SubscribeInteractionClassWithRegionsRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.regions != null) RegionHandleSet.ADAPTER.encodeWithTag(writer, 3, value.regions)
        if (value.active != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.active)
        if (value.theClass != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
      }

      override fun decode(reader: ProtoReader): SubscribeInteractionClassWithRegionsRequest {
        var theClass: InteractionClassHandle? = null
        var active: Boolean = false
        var regions: RegionHandleSet? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theClass = InteractionClassHandle.ADAPTER.decode(reader)
            2 -> active = ProtoAdapter.BOOL.decode(reader)
            3 -> regions = RegionHandleSet.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SubscribeInteractionClassWithRegionsRequest(
          theClass = theClass,
          active = active,
          regions = regions,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SubscribeInteractionClassWithRegionsRequest):
          SubscribeInteractionClassWithRegionsRequest = value.copy(
        theClass = value.theClass?.let(InteractionClassHandle.ADAPTER::redact),
        regions = value.regions?.let(RegionHandleSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
