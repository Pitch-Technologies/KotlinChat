// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.FederateRestoreStatus in DataTypes.proto
package fedpro.type

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
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

public class FederateRestoreStatus(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.FederateHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val preRestoreHandle: FederateHandle? = null,
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.FederateHandle#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val postRestoreHandle: FederateHandle? = null,
  @field:WireField(
    tag = 3,
    adapter = "fedpro.type.RestoreStatus#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val restoreStatus: RestoreStatus = RestoreStatus.NO_RESTORE_IN_PROGRESS,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FederateRestoreStatus, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FederateRestoreStatus) return false
    if (unknownFields != other.unknownFields) return false
    if (preRestoreHandle != other.preRestoreHandle) return false
    if (postRestoreHandle != other.postRestoreHandle) return false
    if (restoreStatus != other.restoreStatus) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (preRestoreHandle?.hashCode() ?: 0)
      result = result * 37 + (postRestoreHandle?.hashCode() ?: 0)
      result = result * 37 + restoreStatus.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (preRestoreHandle != null) result += """preRestoreHandle=$preRestoreHandle"""
    if (postRestoreHandle != null) result += """postRestoreHandle=$postRestoreHandle"""
    result += """restoreStatus=$restoreStatus"""
    return result.joinToString(prefix = "FederateRestoreStatus{", separator = ", ", postfix = "}")
  }

  public fun copy(
    preRestoreHandle: FederateHandle? = this.preRestoreHandle,
    postRestoreHandle: FederateHandle? = this.postRestoreHandle,
    restoreStatus: RestoreStatus = this.restoreStatus,
    unknownFields: ByteString = this.unknownFields,
  ): FederateRestoreStatus = FederateRestoreStatus(preRestoreHandle, postRestoreHandle,
      restoreStatus, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<FederateRestoreStatus> = object :
        ProtoAdapter<FederateRestoreStatus>(
      FieldEncoding.LENGTH_DELIMITED, 
      FederateRestoreStatus::class, 
      "type.googleapis.com/fedpro.FederateRestoreStatus", 
      PROTO_3, 
      null, 
      "DataTypes.proto"
    ) {
      override fun encodedSize(`value`: FederateRestoreStatus): Int {
        var size = value.unknownFields.size
        if (value.preRestoreHandle != null) size += FederateHandle.ADAPTER.encodedSizeWithTag(1,
            value.preRestoreHandle)
        if (value.postRestoreHandle != null) size += FederateHandle.ADAPTER.encodedSizeWithTag(2,
            value.postRestoreHandle)
        if (value.restoreStatus != RestoreStatus.NO_RESTORE_IN_PROGRESS) size +=
            RestoreStatus.ADAPTER.encodedSizeWithTag(3, value.restoreStatus)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: FederateRestoreStatus) {
        if (value.preRestoreHandle != null) FederateHandle.ADAPTER.encodeWithTag(writer, 1,
            value.preRestoreHandle)
        if (value.postRestoreHandle != null) FederateHandle.ADAPTER.encodeWithTag(writer, 2,
            value.postRestoreHandle)
        if (value.restoreStatus != RestoreStatus.NO_RESTORE_IN_PROGRESS)
            RestoreStatus.ADAPTER.encodeWithTag(writer, 3, value.restoreStatus)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: FederateRestoreStatus) {
        writer.writeBytes(value.unknownFields)
        if (value.restoreStatus != RestoreStatus.NO_RESTORE_IN_PROGRESS)
            RestoreStatus.ADAPTER.encodeWithTag(writer, 3, value.restoreStatus)
        if (value.postRestoreHandle != null) FederateHandle.ADAPTER.encodeWithTag(writer, 2,
            value.postRestoreHandle)
        if (value.preRestoreHandle != null) FederateHandle.ADAPTER.encodeWithTag(writer, 1,
            value.preRestoreHandle)
      }

      override fun decode(reader: ProtoReader): FederateRestoreStatus {
        var preRestoreHandle: FederateHandle? = null
        var postRestoreHandle: FederateHandle? = null
        var restoreStatus: RestoreStatus = RestoreStatus.NO_RESTORE_IN_PROGRESS
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> preRestoreHandle = FederateHandle.ADAPTER.decode(reader)
            2 -> postRestoreHandle = FederateHandle.ADAPTER.decode(reader)
            3 -> try {
              restoreStatus = RestoreStatus.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return FederateRestoreStatus(
          preRestoreHandle = preRestoreHandle,
          postRestoreHandle = postRestoreHandle,
          restoreStatus = restoreStatus,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: FederateRestoreStatus): FederateRestoreStatus = value.copy(
        preRestoreHandle = value.preRestoreHandle?.let(FederateHandle.ADAPTER::redact),
        postRestoreHandle = value.postRestoreHandle?.let(FederateHandle.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
