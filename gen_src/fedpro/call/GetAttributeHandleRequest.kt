// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.GetAttributeHandleRequest in RtiAmbassador.proto
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

public class GetAttributeHandleRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ObjectClassHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val whichClass: ObjectClassHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val theName: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<GetAttributeHandleRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is GetAttributeHandleRequest) return false
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
    return result.joinToString(prefix = "GetAttributeHandleRequest{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    whichClass: ObjectClassHandle? = this.whichClass,
    theName: String = this.theName,
    unknownFields: ByteString = this.unknownFields,
  ): GetAttributeHandleRequest = GetAttributeHandleRequest(whichClass, theName, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<GetAttributeHandleRequest> = object :
        ProtoAdapter<GetAttributeHandleRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      GetAttributeHandleRequest::class, 
      "type.googleapis.com/fedpro.GetAttributeHandleRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: GetAttributeHandleRequest): Int {
        var size = value.unknownFields.size
        if (value.whichClass != null) size += ObjectClassHandle.ADAPTER.encodedSizeWithTag(1,
            value.whichClass)
        if (value.theName != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.theName)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: GetAttributeHandleRequest) {
        if (value.whichClass != null) ObjectClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.whichClass)
        if (value.theName != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.theName)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: GetAttributeHandleRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.theName != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.theName)
        if (value.whichClass != null) ObjectClassHandle.ADAPTER.encodeWithTag(writer, 1,
            value.whichClass)
      }

      override fun decode(reader: ProtoReader): GetAttributeHandleRequest {
        var whichClass: ObjectClassHandle? = null
        var theName: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> whichClass = ObjectClassHandle.ADAPTER.decode(reader)
            2 -> theName = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return GetAttributeHandleRequest(
          whichClass = whichClass,
          theName = theName,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: GetAttributeHandleRequest): GetAttributeHandleRequest =
          value.copy(
        whichClass = value.whichClass?.let(ObjectClassHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
