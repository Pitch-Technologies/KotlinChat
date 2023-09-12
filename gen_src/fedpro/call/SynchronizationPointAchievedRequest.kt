// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SynchronizationPointAchievedRequest in RtiAmbassador.proto
package fedpro.call

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

public class SynchronizationPointAchievedRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val synchronizationPointLabel: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val successIndicator: Boolean = false,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SynchronizationPointAchievedRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SynchronizationPointAchievedRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (synchronizationPointLabel != other.synchronizationPointLabel) return false
    if (successIndicator != other.successIndicator) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + synchronizationPointLabel.hashCode()
      result = result * 37 + successIndicator.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """synchronizationPointLabel=${sanitize(synchronizationPointLabel)}"""
    result += """successIndicator=$successIndicator"""
    return result.joinToString(prefix = "SynchronizationPointAchievedRequest{", separator = ", ",
        postfix = "}")
  }

  public fun copy(
    synchronizationPointLabel: String = this.synchronizationPointLabel,
    successIndicator: Boolean = this.successIndicator,
    unknownFields: ByteString = this.unknownFields,
  ): SynchronizationPointAchievedRequest =
      SynchronizationPointAchievedRequest(synchronizationPointLabel, successIndicator,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SynchronizationPointAchievedRequest> = object :
        ProtoAdapter<SynchronizationPointAchievedRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      SynchronizationPointAchievedRequest::class, 
      "type.googleapis.com/fedpro.SynchronizationPointAchievedRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: SynchronizationPointAchievedRequest): Int {
        var size = value.unknownFields.size
        if (value.synchronizationPointLabel != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.synchronizationPointLabel)
        if (value.successIndicator != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(2,
            value.successIndicator)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SynchronizationPointAchievedRequest) {
        if (value.synchronizationPointLabel != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.synchronizationPointLabel)
        if (value.successIndicator != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2,
            value.successIndicator)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: SynchronizationPointAchievedRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.successIndicator != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2,
            value.successIndicator)
        if (value.synchronizationPointLabel != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.synchronizationPointLabel)
      }

      override fun decode(reader: ProtoReader): SynchronizationPointAchievedRequest {
        var synchronizationPointLabel: String = ""
        var successIndicator: Boolean = false
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> synchronizationPointLabel = ProtoAdapter.STRING.decode(reader)
            2 -> successIndicator = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SynchronizationPointAchievedRequest(
          synchronizationPointLabel = synchronizationPointLabel,
          successIndicator = successIndicator,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SynchronizationPointAchievedRequest):
          SynchronizationPointAchievedRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}