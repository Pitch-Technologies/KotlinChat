// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.FederationNotRestored in FederateAmbassador.proto
package fedpro.callback

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import fedpro.type.RestoreFailureReason
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

public class FederationNotRestored(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.RestoreFailureReason#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val reason: RestoreFailureReason = RestoreFailureReason.RTI_UNABLE_TO_RESTORE,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FederationNotRestored, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FederationNotRestored) return false
    if (unknownFields != other.unknownFields) return false
    if (reason != other.reason) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + reason.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """reason=$reason"""
    return result.joinToString(prefix = "FederationNotRestored{", separator = ", ", postfix = "}")
  }

  public fun copy(reason: RestoreFailureReason = this.reason, unknownFields: ByteString =
      this.unknownFields): FederationNotRestored = FederationNotRestored(reason, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<FederationNotRestored> = object :
        ProtoAdapter<FederationNotRestored>(
      FieldEncoding.LENGTH_DELIMITED, 
      FederationNotRestored::class, 
      "type.googleapis.com/fedpro.FederationNotRestored", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: FederationNotRestored): Int {
        var size = value.unknownFields.size
        if (value.reason != RestoreFailureReason.RTI_UNABLE_TO_RESTORE) size +=
            RestoreFailureReason.ADAPTER.encodedSizeWithTag(1, value.reason)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: FederationNotRestored) {
        if (value.reason != RestoreFailureReason.RTI_UNABLE_TO_RESTORE)
            RestoreFailureReason.ADAPTER.encodeWithTag(writer, 1, value.reason)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: FederationNotRestored) {
        writer.writeBytes(value.unknownFields)
        if (value.reason != RestoreFailureReason.RTI_UNABLE_TO_RESTORE)
            RestoreFailureReason.ADAPTER.encodeWithTag(writer, 1, value.reason)
      }

      override fun decode(reader: ProtoReader): FederationNotRestored {
        var reason: RestoreFailureReason = RestoreFailureReason.RTI_UNABLE_TO_RESTORE
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> try {
              reason = RestoreFailureReason.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return FederationNotRestored(
          reason = reason,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: FederationNotRestored): FederationNotRestored = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}