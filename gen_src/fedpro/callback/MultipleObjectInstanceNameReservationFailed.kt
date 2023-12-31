// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.MultipleObjectInstanceNameReservationFailed in FederateAmbassador.proto
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
import com.squareup.wire.`internal`.immutableCopyOf
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
import kotlin.collections.List
import okio.ByteString

public class MultipleObjectInstanceNameReservationFailed(
  objectNames: List<String> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<MultipleObjectInstanceNameReservationFailed, Nothing>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 0,
  )
  public val objectNames: List<String> = immutableCopyOf("objectNames", objectNames)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MultipleObjectInstanceNameReservationFailed) return false
    if (unknownFields != other.unknownFields) return false
    if (objectNames != other.objectNames) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + objectNames.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (objectNames.isNotEmpty()) result += """objectNames=${sanitize(objectNames)}"""
    return result.joinToString(prefix = "MultipleObjectInstanceNameReservationFailed{", separator =
        ", ", postfix = "}")
  }

  public fun copy(objectNames: List<String> = this.objectNames, unknownFields: ByteString =
      this.unknownFields): MultipleObjectInstanceNameReservationFailed =
      MultipleObjectInstanceNameReservationFailed(objectNames, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<MultipleObjectInstanceNameReservationFailed> = object :
        ProtoAdapter<MultipleObjectInstanceNameReservationFailed>(
      FieldEncoding.LENGTH_DELIMITED, 
      MultipleObjectInstanceNameReservationFailed::class, 
      "type.googleapis.com/fedpro.MultipleObjectInstanceNameReservationFailed", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: MultipleObjectInstanceNameReservationFailed): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.objectNames)
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: MultipleObjectInstanceNameReservationFailed) {
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.objectNames)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: MultipleObjectInstanceNameReservationFailed) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.objectNames)
      }

      override fun decode(reader: ProtoReader): MultipleObjectInstanceNameReservationFailed {
        val objectNames = mutableListOf<String>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> objectNames.add(ProtoAdapter.STRING.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return MultipleObjectInstanceNameReservationFailed(
          objectNames = objectNames,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: MultipleObjectInstanceNameReservationFailed):
          MultipleObjectInstanceNameReservationFailed = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
