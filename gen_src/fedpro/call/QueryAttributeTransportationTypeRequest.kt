// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.QueryAttributeTransportationTypeRequest in RtiAmbassador.proto
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
import fedpro.type.AttributeHandle
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

public class QueryAttributeTransportationTypeRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ObjectInstanceHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theObject: ObjectInstanceHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.AttributeHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theAttribute: AttributeHandle? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<QueryAttributeTransportationTypeRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is QueryAttributeTransportationTypeRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theObject != other.theObject) return false
    if (theAttribute != other.theAttribute) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theObject?.hashCode() ?: 0)
      result = result * 37 + (theAttribute?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theObject != null) result += """theObject=$theObject"""
    if (theAttribute != null) result += """theAttribute=$theAttribute"""
    return result.joinToString(prefix = "QueryAttributeTransportationTypeRequest{", separator =
        ", ", postfix = "}")
  }

  public fun copy(
    theObject: ObjectInstanceHandle? = this.theObject,
    theAttribute: AttributeHandle? = this.theAttribute,
    unknownFields: ByteString = this.unknownFields,
  ): QueryAttributeTransportationTypeRequest = QueryAttributeTransportationTypeRequest(theObject,
      theAttribute, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<QueryAttributeTransportationTypeRequest> = object :
        ProtoAdapter<QueryAttributeTransportationTypeRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      QueryAttributeTransportationTypeRequest::class, 
      "type.googleapis.com/fedpro.QueryAttributeTransportationTypeRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: QueryAttributeTransportationTypeRequest): Int {
        var size = value.unknownFields.size
        if (value.theObject != null) size += ObjectInstanceHandle.ADAPTER.encodedSizeWithTag(1,
            value.theObject)
        if (value.theAttribute != null) size += AttributeHandle.ADAPTER.encodedSizeWithTag(2,
            value.theAttribute)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: QueryAttributeTransportationTypeRequest) {
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theObject)
        if (value.theAttribute != null) AttributeHandle.ADAPTER.encodeWithTag(writer, 2,
            value.theAttribute)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: QueryAttributeTransportationTypeRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theAttribute != null) AttributeHandle.ADAPTER.encodeWithTag(writer, 2,
            value.theAttribute)
        if (value.theObject != null) ObjectInstanceHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theObject)
      }

      override fun decode(reader: ProtoReader): QueryAttributeTransportationTypeRequest {
        var theObject: ObjectInstanceHandle? = null
        var theAttribute: AttributeHandle? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theObject = ObjectInstanceHandle.ADAPTER.decode(reader)
            2 -> theAttribute = AttributeHandle.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return QueryAttributeTransportationTypeRequest(
          theObject = theObject,
          theAttribute = theAttribute,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: QueryAttributeTransportationTypeRequest):
          QueryAttributeTransportationTypeRequest = value.copy(
        theObject = value.theObject?.let(ObjectInstanceHandle.ADAPTER::redact),
        theAttribute = value.theAttribute?.let(AttributeHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
