// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.AbortFederationRestoreResponse in RtiAmbassador.proto
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

public class AbortFederationRestoreResponse(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<AbortFederationRestoreResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is AbortFederationRestoreResponse) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "AbortFederationRestoreResponse{}"

  public fun copy(unknownFields: ByteString = this.unknownFields): AbortFederationRestoreResponse =
      AbortFederationRestoreResponse(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<AbortFederationRestoreResponse> = object :
        ProtoAdapter<AbortFederationRestoreResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      AbortFederationRestoreResponse::class, 
      "type.googleapis.com/fedpro.AbortFederationRestoreResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: AbortFederationRestoreResponse): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: AbortFederationRestoreResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: AbortFederationRestoreResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): AbortFederationRestoreResponse {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return AbortFederationRestoreResponse(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: AbortFederationRestoreResponse): AbortFederationRestoreResponse =
          value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
