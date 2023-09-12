// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.PublishObjectClassDirectedInteractionsRequest in RtiAmbassador.proto
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
import fedpro.type.InteractionClassHandleSet
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

public class PublishObjectClassDirectedInteractionsRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ObjectClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theClass: ObjectClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.InteractionClassHandleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val interactionList: InteractionClassHandleSet? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<PublishObjectClassDirectedInteractionsRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is PublishObjectClassDirectedInteractionsRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (theClass != other.theClass) return false
    if (interactionList != other.interactionList) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theClass?.hashCode() ?: 0)
      result = result * 37 + (interactionList?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theClass != null) result += """theClass=$theClass"""
    if (interactionList != null) result += """interactionList=$interactionList"""
    return result.joinToString(prefix = "PublishObjectClassDirectedInteractionsRequest{", separator
        = ", ", postfix = "}")
  }

  public fun copy(
    theClass: ObjectClassHandle? = this.theClass,
    interactionList: InteractionClassHandleSet? = this.interactionList,
    unknownFields: ByteString = this.unknownFields,
  ): PublishObjectClassDirectedInteractionsRequest =
      PublishObjectClassDirectedInteractionsRequest(theClass, interactionList, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<PublishObjectClassDirectedInteractionsRequest> = object :
        ProtoAdapter<PublishObjectClassDirectedInteractionsRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      PublishObjectClassDirectedInteractionsRequest::class, 
      "type.googleapis.com/fedpro.PublishObjectClassDirectedInteractionsRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: PublishObjectClassDirectedInteractionsRequest): Int {
        var size = value.unknownFields.size
        if (value.theClass != null) size += ObjectClassHandle.ADAPTER.encodedSizeWithTag(1,
            value.theClass)
        if (value.interactionList != null) size +=
            InteractionClassHandleSet.ADAPTER.encodedSizeWithTag(2, value.interactionList)
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: PublishObjectClassDirectedInteractionsRequest) {
        if (value.theClass != null) ObjectClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
        if (value.interactionList != null) InteractionClassHandleSet.ADAPTER.encodeWithTag(writer,
            2, value.interactionList)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: PublishObjectClassDirectedInteractionsRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.interactionList != null) InteractionClassHandleSet.ADAPTER.encodeWithTag(writer,
            2, value.interactionList)
        if (value.theClass != null) ObjectClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.theClass)
      }

      override fun decode(reader: ProtoReader): PublishObjectClassDirectedInteractionsRequest {
        var theClass: ObjectClassHandle? = null
        var interactionList: InteractionClassHandleSet? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theClass = ObjectClassHandle.ADAPTER.decode(reader)
            2 -> interactionList = InteractionClassHandleSet.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return PublishObjectClassDirectedInteractionsRequest(
          theClass = theClass,
          interactionList = interactionList,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: PublishObjectClassDirectedInteractionsRequest):
          PublishObjectClassDirectedInteractionsRequest = value.copy(
        theClass = value.theClass?.let(ObjectClassHandle.ADAPTER::redact),
        interactionList = value.interactionList?.let(InteractionClassHandleSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
