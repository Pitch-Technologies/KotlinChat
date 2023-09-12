// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.RequestInteractionTransportationTypeChangeRequest in RtiAmbassador.proto
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

public class RequestInteractionTransportationTypeChangeRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.InteractionClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theClass: InteractionClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.TransportationTypeHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theType: TransportationTypeHandle? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<RequestInteractionTransportationTypeChangeRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RequestInteractionTransportationTypeChangeRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theClass != other.theClass) return false
    if (theType != other.theType) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theClass?.hashCode() ?: 0)
      result = result * 37 + (theType?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theClass != null) result += """theClass=$theClass"""
    if (theType != null) result += """theType=$theType"""
    return result.joinToString(prefix = "RequestInteractionTransportationTypeChangeRequest{",
        separator = ", ", postfix = "}")
  }

  public fun copy(
    theClass: InteractionClassHandle? = this.theClass,
    theType: TransportationTypeHandle? = this.theType,
    unknownFields: ByteString = this.unknownFields,
  ): RequestInteractionTransportationTypeChangeRequest =
      RequestInteractionTransportationTypeChangeRequest(theClass, theType, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RequestInteractionTransportationTypeChangeRequest> = object :
        ProtoAdapter<RequestInteractionTransportationTypeChangeRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      RequestInteractionTransportationTypeChangeRequest::class, 
      "type.googleapis.com/fedpro.RequestInteractionTransportationTypeChangeRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: RequestInteractionTransportationTypeChangeRequest): Int {
        var size = value.unknownFields.size
        if (value.theClass != null) size += InteractionClassHandle.ADAPTER.encodedSizeWithTag(1,
            value.theClass)
        if (value.theType != null) size += TransportationTypeHandle.ADAPTER.encodedSizeWithTag(2,
            value.theType)
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: RequestInteractionTransportationTypeChangeRequest) {
        if (value.theClass != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
        if (value.theType != null) TransportationTypeHandle.ADAPTER.encodeWithTag(writer, 2,
            value.theType)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: RequestInteractionTransportationTypeChangeRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theType != null) TransportationTypeHandle.ADAPTER.encodeWithTag(writer, 2,
            value.theType)
        if (value.theClass != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
      }

      override fun decode(reader: ProtoReader): RequestInteractionTransportationTypeChangeRequest {
        var theClass: InteractionClassHandle? = null
        var theType: TransportationTypeHandle? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theClass = InteractionClassHandle.ADAPTER.decode(reader)
            2 -> theType = TransportationTypeHandle.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RequestInteractionTransportationTypeChangeRequest(
          theClass = theClass,
          theType = theType,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: RequestInteractionTransportationTypeChangeRequest):
          RequestInteractionTransportationTypeChangeRequest = value.copy(
        theClass = value.theClass?.let(InteractionClassHandle.ADAPTER::redact),
        theType = value.theType?.let(TransportationTypeHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
