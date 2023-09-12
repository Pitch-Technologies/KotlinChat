// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.UpdateAttributeValuesWithTimeRequest in RtiAmbassador.proto
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
import fedpro.type.AttributeHandleValueMap
import fedpro.type.LogicalTime
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

public class UpdateAttributeValuesWithTimeRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ObjectInstanceHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theObject: ObjectInstanceHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.AttributeHandleValueMap#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theAttributes: AttributeHandleValueMap? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val userSuppliedTag: ByteString = ByteString.EMPTY,
  @field:WireField(
    tag = 4,
    adapter = "fedpro.type.LogicalTime#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val theTime: LogicalTime? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<UpdateAttributeValuesWithTimeRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is UpdateAttributeValuesWithTimeRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theObject != other.theObject) return false
    if (theAttributes != other.theAttributes) return false
    if (userSuppliedTag != other.userSuppliedTag) return false
    if (theTime != other.theTime) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theObject?.hashCode() ?: 0)
      result = result * 37 + (theAttributes?.hashCode() ?: 0)
      result = result * 37 + userSuppliedTag.hashCode()
      result = result * 37 + (theTime?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theObject != null) result += """theObject=$theObject"""
    if (theAttributes != null) result += """theAttributes=$theAttributes"""
    result += """userSuppliedTag=$userSuppliedTag"""
    if (theTime != null) result += """theTime=$theTime"""
    return result.joinToString(prefix = "UpdateAttributeValuesWithTimeRequest{", separator = ", ",
        postfix = "}")
  }

  public fun copy(
    theObject: ObjectInstanceHandle? = this.theObject,
    theAttributes: AttributeHandleValueMap? = this.theAttributes,
    userSuppliedTag: ByteString = this.userSuppliedTag,
    theTime: LogicalTime? = this.theTime,
    unknownFields: ByteString = this.unknownFields,
  ): UpdateAttributeValuesWithTimeRequest = UpdateAttributeValuesWithTimeRequest(theObject,
      theAttributes, userSuppliedTag, theTime, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<UpdateAttributeValuesWithTimeRequest> = object :
        ProtoAdapter<UpdateAttributeValuesWithTimeRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      UpdateAttributeValuesWithTimeRequest::class, 
      "type.googleapis.com/fedpro.UpdateAttributeValuesWithTimeRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: UpdateAttributeValuesWithTimeRequest): Int {
        var size = value.unknownFields.size
        if (value.theObject != null) size += ObjectInstanceHandle.ADAPTER.encodedSizeWithTag(1,
            value.theObject)
        if (value.theAttributes != null) size +=
            AttributeHandleValueMap.ADAPTER.encodedSizeWithTag(2, value.theAttributes)
        if (value.userSuppliedTag != ByteString.EMPTY) size +=
            ProtoAdapter.BYTES.encodedSizeWithTag(3, value.userSuppliedTag)
        if (value.theTime != null) size += LogicalTime.ADAPTER.encodedSizeWithTag(4, value.theTime)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: UpdateAttributeValuesWithTimeRequest) {
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theObject)
        if (value.theAttributes != null) AttributeHandleValueMap.ADAPTER.encodeWithTag(writer, 2,
            value.theAttributes)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 3,
            value.userSuppliedTag)
        if (value.theTime != null) LogicalTime.ADAPTER.encodeWithTag(writer, 4, value.theTime)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: UpdateAttributeValuesWithTimeRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theTime != null) LogicalTime.ADAPTER.encodeWithTag(writer, 4, value.theTime)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 3,
            value.userSuppliedTag)
        if (value.theAttributes != null) AttributeHandleValueMap.ADAPTER.encodeWithTag(writer, 2,
            value.theAttributes)
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theObject)
      }

      override fun decode(reader: ProtoReader): UpdateAttributeValuesWithTimeRequest {
        var theObject: ObjectInstanceHandle? = null
        var theAttributes: AttributeHandleValueMap? = null
        var userSuppliedTag: ByteString = ByteString.EMPTY
        var theTime: LogicalTime? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theObject = ObjectInstanceHandle.ADAPTER.decode(reader)
            2 -> theAttributes = AttributeHandleValueMap.ADAPTER.decode(reader)
            3 -> userSuppliedTag = ProtoAdapter.BYTES.decode(reader)
            4 -> theTime = LogicalTime.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return UpdateAttributeValuesWithTimeRequest(
          theObject = theObject,
          theAttributes = theAttributes,
          userSuppliedTag = userSuppliedTag,
          theTime = theTime,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: UpdateAttributeValuesWithTimeRequest):
          UpdateAttributeValuesWithTimeRequest = value.copy(
        theObject = value.theObject?.let(ObjectInstanceHandle.ADAPTER::redact),
        theAttributes = value.theAttributes?.let(AttributeHandleValueMap.ADAPTER::redact),
        theTime = value.theTime?.let(LogicalTime.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
