// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.PublishObjectClassAttributesRequest in RtiAmbassador.proto
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
import fedpro.type.AttributeHandleSet
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

public class PublishObjectClassAttributesRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ObjectClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theClass: ObjectClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.AttributeHandleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val attributeList: AttributeHandleSet? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<PublishObjectClassAttributesRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is PublishObjectClassAttributesRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theClass != other.theClass) return false
    if (attributeList != other.attributeList) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theClass?.hashCode() ?: 0)
      result = result * 37 + (attributeList?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theClass != null) result += """theClass=$theClass"""
    if (attributeList != null) result += """attributeList=$attributeList"""
    return result.joinToString(prefix = "PublishObjectClassAttributesRequest{", separator = ", ",
        postfix = "}")
  }

  public fun copy(
    theClass: ObjectClassHandle? = this.theClass,
    attributeList: AttributeHandleSet? = this.attributeList,
    unknownFields: ByteString = this.unknownFields,
  ): PublishObjectClassAttributesRequest = PublishObjectClassAttributesRequest(theClass,
      attributeList, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<PublishObjectClassAttributesRequest> = object :
        ProtoAdapter<PublishObjectClassAttributesRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      PublishObjectClassAttributesRequest::class, 
      "type.googleapis.com/fedpro.PublishObjectClassAttributesRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: PublishObjectClassAttributesRequest): Int {
        var size = value.unknownFields.size
        if (value.theClass != null) size += ObjectClassHandle.ADAPTER.encodedSizeWithTag(1,
            value.theClass)
        if (value.attributeList != null) size += AttributeHandleSet.ADAPTER.encodedSizeWithTag(2,
            value.attributeList)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: PublishObjectClassAttributesRequest) {
        if (value.theClass != null) ObjectClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
        if (value.attributeList != null) AttributeHandleSet.ADAPTER.encodeWithTag(writer, 2,
            value.attributeList)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: PublishObjectClassAttributesRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.attributeList != null) AttributeHandleSet.ADAPTER.encodeWithTag(writer, 2,
            value.attributeList)
        if (value.theClass != null) ObjectClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
      }

      override fun decode(reader: ProtoReader): PublishObjectClassAttributesRequest {
        var theClass: ObjectClassHandle? = null
        var attributeList: AttributeHandleSet? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theClass = ObjectClassHandle.ADAPTER.decode(reader)
            2 -> attributeList = AttributeHandleSet.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return PublishObjectClassAttributesRequest(
          theClass = theClass,
          attributeList = attributeList,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: PublishObjectClassAttributesRequest):
          PublishObjectClassAttributesRequest = value.copy(
        theClass = value.theClass?.let(ObjectClassHandle.ADAPTER::redact),
        attributeList = value.attributeList?.let(AttributeHandleSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
