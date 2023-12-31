// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SynchronizationPointRegistrationFailed in FederateAmbassador.proto
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
import com.squareup.wire.`internal`.sanitize
import fedpro.type.SynchronizationPointFailureReason
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

public class SynchronizationPointRegistrationFailed(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val synchronizationPointLabel: String = "",
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.SynchronizationPointFailureReason#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val reason: SynchronizationPointFailureReason =
      SynchronizationPointFailureReason.SYNCHRONIZATION_POINT_LABEL_NOT_UNIQUE,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SynchronizationPointRegistrationFailed, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SynchronizationPointRegistrationFailed) return false
    if (unknownFields != other.unknownFields) return false
    if (synchronizationPointLabel != other.synchronizationPointLabel) return false
    if (reason != other.reason) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + synchronizationPointLabel.hashCode()
      result = result * 37 + reason.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """synchronizationPointLabel=${sanitize(synchronizationPointLabel)}"""
    result += """reason=$reason"""
    return result.joinToString(prefix = "SynchronizationPointRegistrationFailed{", separator = ", ",
        postfix = "}")
  }

  public fun copy(
    synchronizationPointLabel: String = this.synchronizationPointLabel,
    reason: SynchronizationPointFailureReason = this.reason,
    unknownFields: ByteString = this.unknownFields,
  ): SynchronizationPointRegistrationFailed =
      SynchronizationPointRegistrationFailed(synchronizationPointLabel, reason, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SynchronizationPointRegistrationFailed> = object :
        ProtoAdapter<SynchronizationPointRegistrationFailed>(
      FieldEncoding.LENGTH_DELIMITED, 
      SynchronizationPointRegistrationFailed::class, 
      "type.googleapis.com/fedpro.SynchronizationPointRegistrationFailed", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: SynchronizationPointRegistrationFailed): Int {
        var size = value.unknownFields.size
        if (value.synchronizationPointLabel != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.synchronizationPointLabel)
        if (value.reason !=
            SynchronizationPointFailureReason.SYNCHRONIZATION_POINT_LABEL_NOT_UNIQUE) size +=
            SynchronizationPointFailureReason.ADAPTER.encodedSizeWithTag(2, value.reason)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SynchronizationPointRegistrationFailed) {
        if (value.synchronizationPointLabel != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.synchronizationPointLabel)
        if (value.reason !=
            SynchronizationPointFailureReason.SYNCHRONIZATION_POINT_LABEL_NOT_UNIQUE)
            SynchronizationPointFailureReason.ADAPTER.encodeWithTag(writer, 2, value.reason)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: SynchronizationPointRegistrationFailed) {
        writer.writeBytes(value.unknownFields)
        if (value.reason !=
            SynchronizationPointFailureReason.SYNCHRONIZATION_POINT_LABEL_NOT_UNIQUE)
            SynchronizationPointFailureReason.ADAPTER.encodeWithTag(writer, 2, value.reason)
        if (value.synchronizationPointLabel != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.synchronizationPointLabel)
      }

      override fun decode(reader: ProtoReader): SynchronizationPointRegistrationFailed {
        var synchronizationPointLabel: String = ""
        var reason: SynchronizationPointFailureReason =
            SynchronizationPointFailureReason.SYNCHRONIZATION_POINT_LABEL_NOT_UNIQUE
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> synchronizationPointLabel = ProtoAdapter.STRING.decode(reader)
            2 -> try {
              reason = SynchronizationPointFailureReason.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return SynchronizationPointRegistrationFailed(
          synchronizationPointLabel = synchronizationPointLabel,
          reason = reason,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SynchronizationPointRegistrationFailed):
          SynchronizationPointRegistrationFailed = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
