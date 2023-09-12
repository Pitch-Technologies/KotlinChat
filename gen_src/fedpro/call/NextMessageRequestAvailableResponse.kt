// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.NextMessageRequestAvailableResponse in RtiAmbassador.proto
package fedpro.call

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.`internal`.JvmField
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

public class NextMessageRequestAvailableResponse(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<NextMessageRequestAvailableResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NextMessageRequestAvailableResponse) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "NextMessageRequestAvailableResponse{}"

  public fun copy(unknownFields: ByteString = this.unknownFields):
      NextMessageRequestAvailableResponse = NextMessageRequestAvailableResponse(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<NextMessageRequestAvailableResponse> = object :
        ProtoAdapter<NextMessageRequestAvailableResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      NextMessageRequestAvailableResponse::class, 
      "type.googleapis.com/fedpro.NextMessageRequestAvailableResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: NextMessageRequestAvailableResponse): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: NextMessageRequestAvailableResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: NextMessageRequestAvailableResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): NextMessageRequestAvailableResponse {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return NextMessageRequestAvailableResponse(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: NextMessageRequestAvailableResponse):
          NextMessageRequestAvailableResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
