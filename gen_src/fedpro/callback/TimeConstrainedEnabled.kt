// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.TimeConstrainedEnabled in FederateAmbassador.proto
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
import fedpro.type.LogicalTime
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

public class TimeConstrainedEnabled(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.LogicalTime#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val time: LogicalTime? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<TimeConstrainedEnabled, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is TimeConstrainedEnabled) return false
    if (unknownFields != other.unknownFields) return false
    if (time != other.time) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (time?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (time != null) result += """time=$time"""
    return result.joinToString(prefix = "TimeConstrainedEnabled{", separator = ", ", postfix = "}")
  }

  public fun copy(time: LogicalTime? = this.time, unknownFields: ByteString = this.unknownFields):
      TimeConstrainedEnabled = TimeConstrainedEnabled(time, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<TimeConstrainedEnabled> = object :
        ProtoAdapter<TimeConstrainedEnabled>(
      FieldEncoding.LENGTH_DELIMITED, 
      TimeConstrainedEnabled::class, 
      "type.googleapis.com/fedpro.TimeConstrainedEnabled", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: TimeConstrainedEnabled): Int {
        var size = value.unknownFields.size
        if (value.time != null) size += LogicalTime.ADAPTER.encodedSizeWithTag(1, value.time)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: TimeConstrainedEnabled) {
        if (value.time != null) LogicalTime.ADAPTER.encodeWithTag(writer, 1, value.time)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: TimeConstrainedEnabled) {
        writer.writeBytes(value.unknownFields)
        if (value.time != null) LogicalTime.ADAPTER.encodeWithTag(writer, 1, value.time)
      }

      override fun decode(reader: ProtoReader): TimeConstrainedEnabled {
        var time: LogicalTime? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> time = LogicalTime.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return TimeConstrainedEnabled(
          time = time,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: TimeConstrainedEnabled): TimeConstrainedEnabled = value.copy(
        time = value.time?.let(LogicalTime.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
