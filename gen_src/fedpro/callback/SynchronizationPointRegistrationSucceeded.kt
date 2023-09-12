// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SynchronizationPointRegistrationSucceeded in FederateAmbassador.proto
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

public class SynchronizationPointRegistrationSucceeded(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val synchronizationPointLabel: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SynchronizationPointRegistrationSucceeded, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SynchronizationPointRegistrationSucceeded) return false
    if (unknownFields != other.unknownFields) return false
    if (synchronizationPointLabel != other.synchronizationPointLabel) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + synchronizationPointLabel.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """synchronizationPointLabel=${sanitize(synchronizationPointLabel)}"""
    return result.joinToString(prefix = "SynchronizationPointRegistrationSucceeded{", separator =
        ", ", postfix = "}")
  }

  public fun copy(synchronizationPointLabel: String = this.synchronizationPointLabel,
      unknownFields: ByteString = this.unknownFields): SynchronizationPointRegistrationSucceeded =
      SynchronizationPointRegistrationSucceeded(synchronizationPointLabel, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SynchronizationPointRegistrationSucceeded> = object :
        ProtoAdapter<SynchronizationPointRegistrationSucceeded>(
      FieldEncoding.LENGTH_DELIMITED, 
      SynchronizationPointRegistrationSucceeded::class, 
      "type.googleapis.com/fedpro.SynchronizationPointRegistrationSucceeded", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: SynchronizationPointRegistrationSucceeded): Int {
        var size = value.unknownFields.size
        if (value.synchronizationPointLabel != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.synchronizationPointLabel)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SynchronizationPointRegistrationSucceeded) {
        if (value.synchronizationPointLabel != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.synchronizationPointLabel)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: SynchronizationPointRegistrationSucceeded) {
        writer.writeBytes(value.unknownFields)
        if (value.synchronizationPointLabel != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.synchronizationPointLabel)
      }

      override fun decode(reader: ProtoReader): SynchronizationPointRegistrationSucceeded {
        var synchronizationPointLabel: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> synchronizationPointLabel = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SynchronizationPointRegistrationSucceeded(
          synchronizationPointLabel = synchronizationPointLabel,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SynchronizationPointRegistrationSucceeded):
          SynchronizationPointRegistrationSucceeded = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
