// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.RequestAttributeOwnershipAssumption in FederateAmbassador.proto
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

public class RequestAttributeOwnershipAssumption(
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
  public val offeredAttributes: AttributeHandleSet? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val userSuppliedTag: ByteString = ByteString.EMPTY,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<RequestAttributeOwnershipAssumption, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RequestAttributeOwnershipAssumption) return false
    if (unknownFields != other.unknownFields) return false
    if (theObject != other.theObject) return false
    if (offeredAttributes != other.offeredAttributes) return false
    if (userSuppliedTag != other.userSuppliedTag) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theObject?.hashCode() ?: 0)
      result = result * 37 + (offeredAttributes?.hashCode() ?: 0)
      result = result * 37 + userSuppliedTag.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theObject != null) result += """theObject=$theObject"""
    if (offeredAttributes != null) result += """offeredAttributes=$offeredAttributes"""
    result += """userSuppliedTag=$userSuppliedTag"""
    return result.joinToString(prefix = "RequestAttributeOwnershipAssumption{", separator = ", ",
        postfix = "}")
  }

  public fun copy(
    theObject: ObjectInstanceHandle? = this.theObject,
    offeredAttributes: AttributeHandleSet? = this.offeredAttributes,
    userSuppliedTag: ByteString = this.userSuppliedTag,
    unknownFields: ByteString = this.unknownFields,
  ): RequestAttributeOwnershipAssumption = RequestAttributeOwnershipAssumption(theObject,
      offeredAttributes, userSuppliedTag, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RequestAttributeOwnershipAssumption> = object :
        ProtoAdapter<RequestAttributeOwnershipAssumption>(
      FieldEncoding.LENGTH_DELIMITED, 
      RequestAttributeOwnershipAssumption::class, 
      "type.googleapis.com/fedpro.RequestAttributeOwnershipAssumption", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: RequestAttributeOwnershipAssumption): Int {
        var size = value.unknownFields.size
        if (value.theObject != null) size += ObjectInstanceHandle.ADAPTER.encodedSizeWithTag(1,
            value.theObject)
        if (value.offeredAttributes != null) size +=
            AttributeHandleSet.ADAPTER.encodedSizeWithTag(2, value.offeredAttributes)
        if (value.userSuppliedTag != ByteString.EMPTY) size +=
            ProtoAdapter.BYTES.encodedSizeWithTag(3, value.userSuppliedTag)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: RequestAttributeOwnershipAssumption) {
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theObject)
        if (value.offeredAttributes != null) AttributeHandleSet.ADAPTER.encodeWithTag(writer, 2,
            value.offeredAttributes)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 3,
            value.userSuppliedTag)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: RequestAttributeOwnershipAssumption) {
        writer.writeBytes(value.unknownFields)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 3,
            value.userSuppliedTag)
        if (value.offeredAttributes != null) AttributeHandleSet.ADAPTER.encodeWithTag(writer, 2,
            value.offeredAttributes)
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theObject)
      }

      override fun decode(reader: ProtoReader): RequestAttributeOwnershipAssumption {
        var theObject: ObjectInstanceHandle? = null
        var offeredAttributes: AttributeHandleSet? = null
        var userSuppliedTag: ByteString = ByteString.EMPTY
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theObject = ObjectInstanceHandle.ADAPTER.decode(reader)
            2 -> offeredAttributes = AttributeHandleSet.ADAPTER.decode(reader)
            3 -> userSuppliedTag = ProtoAdapter.BYTES.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RequestAttributeOwnershipAssumption(
          theObject = theObject,
          offeredAttributes = offeredAttributes,
          userSuppliedTag = userSuppliedTag,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: RequestAttributeOwnershipAssumption):
          RequestAttributeOwnershipAssumption = value.copy(
        theObject = value.theObject?.let(ObjectInstanceHandle.ADAPTER::redact),
        offeredAttributes = value.offeredAttributes?.let(AttributeHandleSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
