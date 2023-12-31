// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SetAutomaticResignDirectiveResponse in RtiAmbassador.proto
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

public class SetAutomaticResignDirectiveResponse(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SetAutomaticResignDirectiveResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SetAutomaticResignDirectiveResponse) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "SetAutomaticResignDirectiveResponse{}"

  public fun copy(unknownFields: ByteString = this.unknownFields):
      SetAutomaticResignDirectiveResponse = SetAutomaticResignDirectiveResponse(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SetAutomaticResignDirectiveResponse> = object :
        ProtoAdapter<SetAutomaticResignDirectiveResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      SetAutomaticResignDirectiveResponse::class, 
      "type.googleapis.com/fedpro.SetAutomaticResignDirectiveResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: SetAutomaticResignDirectiveResponse): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SetAutomaticResignDirectiveResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: SetAutomaticResignDirectiveResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): SetAutomaticResignDirectiveResponse {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return SetAutomaticResignDirectiveResponse(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SetAutomaticResignDirectiveResponse):
          SetAutomaticResignDirectiveResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
