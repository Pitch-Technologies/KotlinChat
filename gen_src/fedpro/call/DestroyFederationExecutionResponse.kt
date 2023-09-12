// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.DestroyFederationExecutionResponse in RtiAmbassador.proto
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

public class DestroyFederationExecutionResponse(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<DestroyFederationExecutionResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is DestroyFederationExecutionResponse) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "DestroyFederationExecutionResponse{}"

  public fun copy(unknownFields: ByteString = this.unknownFields):
      DestroyFederationExecutionResponse = DestroyFederationExecutionResponse(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<DestroyFederationExecutionResponse> = object :
        ProtoAdapter<DestroyFederationExecutionResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      DestroyFederationExecutionResponse::class, 
      "type.googleapis.com/fedpro.DestroyFederationExecutionResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: DestroyFederationExecutionResponse): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: DestroyFederationExecutionResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: DestroyFederationExecutionResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): DestroyFederationExecutionResponse {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return DestroyFederationExecutionResponse(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: DestroyFederationExecutionResponse):
          DestroyFederationExecutionResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}