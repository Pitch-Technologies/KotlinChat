// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ReceiveDirectedInteraction in FederateAmbassador.proto
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
import fedpro.type.ObjectInstanceHandle
import fedpro.type.OrderType
import fedpro.type.ParameterHandleValueMap
import fedpro.type.SupplementalReceiveInfo
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

public class ReceiveDirectedInteraction(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.InteractionClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val interactionClass: InteractionClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.ObjectInstanceHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theObject: ObjectInstanceHandle? = null,
  @field:WireField(
    tag = 3,
    adapter = "fedpro.type.ParameterHandleValueMap#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val theParameters: ParameterHandleValueMap? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val userSuppliedTag: ByteString = ByteString.EMPTY,
  @field:WireField(
    tag = 5,
    adapter = "fedpro.type.OrderType#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 4,
  )
  public val sentOrdering: OrderType = OrderType.RECEIVE,
  @field:WireField(
    tag = 6,
    adapter = "fedpro.type.TransportationTypeHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 5,
  )
  public val theTransport: TransportationTypeHandle? = null,
  @field:WireField(
    tag = 7,
    adapter = "fedpro.type.SupplementalReceiveInfo#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 6,
  )
  public val receiveInfo: SupplementalReceiveInfo? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ReceiveDirectedInteraction, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ReceiveDirectedInteraction) return false
    if (unknownFields != other.unknownFields) return false
    if (interactionClass != other.interactionClass) return false
    if (theObject != other.theObject) return false
    if (theParameters != other.theParameters) return false
    if (userSuppliedTag != other.userSuppliedTag) return false
    if (sentOrdering != other.sentOrdering) return false
    if (theTransport != other.theTransport) return false
    if (receiveInfo != other.receiveInfo) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (interactionClass?.hashCode() ?: 0)
      result = result * 37 + (theObject?.hashCode() ?: 0)
      result = result * 37 + (theParameters?.hashCode() ?: 0)
      result = result * 37 + userSuppliedTag.hashCode()
      result = result * 37 + sentOrdering.hashCode()
      result = result * 37 + (theTransport?.hashCode() ?: 0)
      result = result * 37 + (receiveInfo?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (interactionClass != null) result += """interactionClass=$interactionClass"""
    if (theObject != null) result += """theObject=$theObject"""
    if (theParameters != null) result += """theParameters=$theParameters"""
    result += """userSuppliedTag=$userSuppliedTag"""
    result += """sentOrdering=$sentOrdering"""
    if (theTransport != null) result += """theTransport=$theTransport"""
    if (receiveInfo != null) result += """receiveInfo=$receiveInfo"""
    return result.joinToString(prefix = "ReceiveDirectedInteraction{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    interactionClass: InteractionClassHandle? = this.interactionClass,
    theObject: ObjectInstanceHandle? = this.theObject,
    theParameters: ParameterHandleValueMap? = this.theParameters,
    userSuppliedTag: ByteString = this.userSuppliedTag,
    sentOrdering: OrderType = this.sentOrdering,
    theTransport: TransportationTypeHandle? = this.theTransport,
    receiveInfo: SupplementalReceiveInfo? = this.receiveInfo,
    unknownFields: ByteString = this.unknownFields,
  ): ReceiveDirectedInteraction = ReceiveDirectedInteraction(interactionClass, theObject,
      theParameters, userSuppliedTag, sentOrdering, theTransport, receiveInfo, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ReceiveDirectedInteraction> = object :
        ProtoAdapter<ReceiveDirectedInteraction>(
      FieldEncoding.LENGTH_DELIMITED, 
      ReceiveDirectedInteraction::class, 
      "type.googleapis.com/fedpro.ReceiveDirectedInteraction", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: ReceiveDirectedInteraction): Int {
        var size = value.unknownFields.size
        if (value.interactionClass != null) size +=
            InteractionClassHandle.ADAPTER.encodedSizeWithTag(1, value.interactionClass)
        if (value.theObject != null) size += ObjectInstanceHandle.ADAPTER.encodedSizeWithTag(2,
            value.theObject)
        if (value.theParameters != null) size +=
            ParameterHandleValueMap.ADAPTER.encodedSizeWithTag(3, value.theParameters)
        if (value.userSuppliedTag != ByteString.EMPTY) size +=
            ProtoAdapter.BYTES.encodedSizeWithTag(4, value.userSuppliedTag)
        if (value.sentOrdering != OrderType.RECEIVE) size += OrderType.ADAPTER.encodedSizeWithTag(5,
            value.sentOrdering)
        if (value.theTransport != null) size +=
            TransportationTypeHandle.ADAPTER.encodedSizeWithTag(6, value.theTransport)
        if (value.receiveInfo != null) size += SupplementalReceiveInfo.ADAPTER.encodedSizeWithTag(7,
            value.receiveInfo)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ReceiveDirectedInteraction) {
        if (value.interactionClass != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.interactionClass)
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 2,
            value.theObject)
        if (value.theParameters != null) ParameterHandleValueMap.ADAPTER.encodeWithTag(writer, 3,
            value.theParameters)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 4,
            value.userSuppliedTag)
        if (value.sentOrdering != OrderType.RECEIVE) OrderType.ADAPTER.encodeWithTag(writer, 5,
            value.sentOrdering)
        if (value.theTransport != null) TransportationTypeHandle.ADAPTER.encodeWithTag(writer, 6,
            value.theTransport)
        if (value.receiveInfo != null) SupplementalReceiveInfo.ADAPTER.encodeWithTag(writer, 7,
            value.receiveInfo)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ReceiveDirectedInteraction) {
        writer.writeBytes(value.unknownFields)
        if (value.receiveInfo != null) SupplementalReceiveInfo.ADAPTER.encodeWithTag(writer, 7,
            value.receiveInfo)
        if (value.theTransport != null) TransportationTypeHandle.ADAPTER.encodeWithTag(writer, 6,
            value.theTransport)
        if (value.sentOrdering != OrderType.RECEIVE) OrderType.ADAPTER.encodeWithTag(writer, 5,
            value.sentOrdering)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 4,
            value.userSuppliedTag)
        if (value.theParameters != null) ParameterHandleValueMap.ADAPTER.encodeWithTag(writer, 3,
            value.theParameters)
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 2,
            value.theObject)
        if (value.interactionClass != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.interactionClass)
      }

      override fun decode(reader: ProtoReader): ReceiveDirectedInteraction {
        var interactionClass: InteractionClassHandle? = null
        var theObject: ObjectInstanceHandle? = null
        var theParameters: ParameterHandleValueMap? = null
        var userSuppliedTag: ByteString = ByteString.EMPTY
        var sentOrdering: OrderType = OrderType.RECEIVE
        var theTransport: TransportationTypeHandle? = null
        var receiveInfo: SupplementalReceiveInfo? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> interactionClass = InteractionClassHandle.ADAPTER.decode(reader)
            2 -> theObject = ObjectInstanceHandle.ADAPTER.decode(reader)
            3 -> theParameters = ParameterHandleValueMap.ADAPTER.decode(reader)
            4 -> userSuppliedTag = ProtoAdapter.BYTES.decode(reader)
            5 -> try {
              sentOrdering = OrderType.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            6 -> theTransport = TransportationTypeHandle.ADAPTER.decode(reader)
            7 -> receiveInfo = SupplementalReceiveInfo.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ReceiveDirectedInteraction(
          interactionClass = interactionClass,
          theObject = theObject,
          theParameters = theParameters,
          userSuppliedTag = userSuppliedTag,
          sentOrdering = sentOrdering,
          theTransport = theTransport,
          receiveInfo = receiveInfo,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ReceiveDirectedInteraction): ReceiveDirectedInteraction =
          value.copy(
        interactionClass = value.interactionClass?.let(InteractionClassHandle.ADAPTER::redact),
        theObject = value.theObject?.let(ObjectInstanceHandle.ADAPTER::redact),
        theParameters = value.theParameters?.let(ParameterHandleValueMap.ADAPTER::redact),
        theTransport = value.theTransport?.let(TransportationTypeHandle.ADAPTER::redact),
        receiveInfo = value.receiveInfo?.let(SupplementalReceiveInfo.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
