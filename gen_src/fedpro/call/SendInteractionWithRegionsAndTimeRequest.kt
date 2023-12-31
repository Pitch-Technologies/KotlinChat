// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SendInteractionWithRegionsAndTimeRequest in RtiAmbassador.proto
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
import fedpro.type.LogicalTime
import fedpro.type.ParameterHandleValueMap
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

public class SendInteractionWithRegionsAndTimeRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.InteractionClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theInteraction: InteractionClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.ParameterHandleValueMap#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theParameters: ParameterHandleValueMap? = null,
  @field:WireField(
    tag = 3,
    adapter = "fedpro.type.RegionHandleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val regions: RegionHandleSet? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val userSuppliedTag: ByteString = ByteString.EMPTY,
  @field:WireField(
    tag = 5,
    adapter = "fedpro.type.LogicalTime#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 4,
  )
  public val theTime: LogicalTime? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SendInteractionWithRegionsAndTimeRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SendInteractionWithRegionsAndTimeRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theInteraction != other.theInteraction) return false
    if (theParameters != other.theParameters) return false
    if (regions != other.regions) return false
    if (userSuppliedTag != other.userSuppliedTag) return false
    if (theTime != other.theTime) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theInteraction?.hashCode() ?: 0)
      result = result * 37 + (theParameters?.hashCode() ?: 0)
      result = result * 37 + (regions?.hashCode() ?: 0)
      result = result * 37 + userSuppliedTag.hashCode()
      result = result * 37 + (theTime?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theInteraction != null) result += """theInteraction=$theInteraction"""
    if (theParameters != null) result += """theParameters=$theParameters"""
    if (regions != null) result += """regions=$regions"""
    result += """userSuppliedTag=$userSuppliedTag"""
    if (theTime != null) result += """theTime=$theTime"""
    return result.joinToString(prefix = "SendInteractionWithRegionsAndTimeRequest{", separator =
        ", ", postfix = "}")
  }

  public fun copy(
    theInteraction: InteractionClassHandle? = this.theInteraction,
    theParameters: ParameterHandleValueMap? = this.theParameters,
    regions: RegionHandleSet? = this.regions,
    userSuppliedTag: ByteString = this.userSuppliedTag,
    theTime: LogicalTime? = this.theTime,
    unknownFields: ByteString = this.unknownFields,
  ): SendInteractionWithRegionsAndTimeRequest =
      SendInteractionWithRegionsAndTimeRequest(theInteraction, theParameters, regions,
      userSuppliedTag, theTime, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SendInteractionWithRegionsAndTimeRequest> = object :
        ProtoAdapter<SendInteractionWithRegionsAndTimeRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      SendInteractionWithRegionsAndTimeRequest::class, 
      "type.googleapis.com/fedpro.SendInteractionWithRegionsAndTimeRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: SendInteractionWithRegionsAndTimeRequest): Int {
        var size = value.unknownFields.size
        if (value.theInteraction != null) size +=
            InteractionClassHandle.ADAPTER.encodedSizeWithTag(1, value.theInteraction)
        if (value.theParameters != null) size +=
            ParameterHandleValueMap.ADAPTER.encodedSizeWithTag(2, value.theParameters)
        if (value.regions != null) size += RegionHandleSet.ADAPTER.encodedSizeWithTag(3,
            value.regions)
        if (value.userSuppliedTag != ByteString.EMPTY) size +=
            ProtoAdapter.BYTES.encodedSizeWithTag(4, value.userSuppliedTag)
        if (value.theTime != null) size += LogicalTime.ADAPTER.encodedSizeWithTag(5, value.theTime)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SendInteractionWithRegionsAndTimeRequest) {
        if (value.theInteraction != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theInteraction)
        if (value.theParameters != null) ParameterHandleValueMap.ADAPTER.encodeWithTag(writer, 2,
            value.theParameters)
        if (value.regions != null) RegionHandleSet.ADAPTER.encodeWithTag(writer, 3, value.regions)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 4,
            value.userSuppliedTag)
        if (value.theTime != null) LogicalTime.ADAPTER.encodeWithTag(writer, 5, value.theTime)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: SendInteractionWithRegionsAndTimeRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theTime != null) LogicalTime.ADAPTER.encodeWithTag(writer, 5, value.theTime)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 4,
            value.userSuppliedTag)
        if (value.regions != null) RegionHandleSet.ADAPTER.encodeWithTag(writer, 3, value.regions)
        if (value.theParameters != null) ParameterHandleValueMap.ADAPTER.encodeWithTag(writer, 2,
            value.theParameters)
        if (value.theInteraction != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theInteraction)
      }

      override fun decode(reader: ProtoReader): SendInteractionWithRegionsAndTimeRequest {
        var theInteraction: InteractionClassHandle? = null
        var theParameters: ParameterHandleValueMap? = null
        var regions: RegionHandleSet? = null
        var userSuppliedTag: ByteString = ByteString.EMPTY
        var theTime: LogicalTime? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theInteraction = InteractionClassHandle.ADAPTER.decode(reader)
            2 -> theParameters = ParameterHandleValueMap.ADAPTER.decode(reader)
            3 -> regions = RegionHandleSet.ADAPTER.decode(reader)
            4 -> userSuppliedTag = ProtoAdapter.BYTES.decode(reader)
            5 -> theTime = LogicalTime.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SendInteractionWithRegionsAndTimeRequest(
          theInteraction = theInteraction,
          theParameters = theParameters,
          regions = regions,
          userSuppliedTag = userSuppliedTag,
          theTime = theTime,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SendInteractionWithRegionsAndTimeRequest):
          SendInteractionWithRegionsAndTimeRequest = value.copy(
        theInteraction = value.theInteraction?.let(InteractionClassHandle.ADAPTER::redact),
        theParameters = value.theParameters?.let(ParameterHandleValueMap.ADAPTER::redact),
        regions = value.regions?.let(RegionHandleSet.ADAPTER::redact),
        theTime = value.theTime?.let(LogicalTime.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
