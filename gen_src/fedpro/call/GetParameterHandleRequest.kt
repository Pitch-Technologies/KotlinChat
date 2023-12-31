// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.GetParameterHandleRequest in RtiAmbassador.proto
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
import com.squareup.wire.`internal`.sanitize
import fedpro.type.InteractionClassHandle
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

public class GetParameterHandleRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.InteractionClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val whichClass: InteractionClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theName: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<GetParameterHandleRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is GetParameterHandleRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (whichClass != other.whichClass) return false
    if (theName != other.theName) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (whichClass?.hashCode() ?: 0)
      result = result * 37 + theName.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (whichClass != null) result += """whichClass=$whichClass"""
    result += """theName=${sanitize(theName)}"""
    return result.joinToString(prefix = "GetParameterHandleRequest{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    whichClass: InteractionClassHandle? = this.whichClass,
    theName: String = this.theName,
    unknownFields: ByteString = this.unknownFields,
  ): GetParameterHandleRequest = GetParameterHandleRequest(whichClass, theName, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<GetParameterHandleRequest> = object :
        ProtoAdapter<GetParameterHandleRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      GetParameterHandleRequest::class, 
      "type.googleapis.com/fedpro.GetParameterHandleRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: GetParameterHandleRequest): Int {
        var size = value.unknownFields.size
        if (value.whichClass != null) size += InteractionClassHandle.ADAPTER.encodedSizeWithTag(1,
            value.whichClass)
        if (value.theName != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.theName)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: GetParameterHandleRequest) {
        if (value.whichClass != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.whichClass)
        if (value.theName != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.theName)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: GetParameterHandleRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theName != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.theName)
        if (value.whichClass != null) InteractionClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.whichClass)
      }

      override fun decode(reader: ProtoReader): GetParameterHandleRequest {
        var whichClass: InteractionClassHandle? = null
        var theName: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> whichClass = InteractionClassHandle.ADAPTER.decode(reader)
            2 -> theName = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return GetParameterHandleRequest(
          whichClass = whichClass,
          theName = theName,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: GetParameterHandleRequest): GetParameterHandleRequest =
          value.copy(
        whichClass = value.whichClass?.let(InteractionClassHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
