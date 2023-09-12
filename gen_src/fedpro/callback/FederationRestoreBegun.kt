// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.FederationRestoreBegun in FederateAmbassador.proto
package fedpro.callback

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

public class FederationRestoreBegun(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FederationRestoreBegun, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FederationRestoreBegun) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "FederationRestoreBegun{}"

  public fun copy(unknownFields: ByteString = this.unknownFields): FederationRestoreBegun =
      FederationRestoreBegun(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<FederationRestoreBegun> = object :
        ProtoAdapter<FederationRestoreBegun>(
      FieldEncoding.LENGTH_DELIMITED, 
      FederationRestoreBegun::class, 
      "type.googleapis.com/fedpro.FederationRestoreBegun", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: FederationRestoreBegun): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: FederationRestoreBegun) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: FederationRestoreBegun) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): FederationRestoreBegun {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return FederationRestoreBegun(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: FederationRestoreBegun): FederationRestoreBegun = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
