// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.RegisterFederationSynchronizationPointWithSetRequest in RtiAmbassador.proto
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
import fedpro.type.FederateHandleSet
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

public class RegisterFederationSynchronizationPointWithSetRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val synchronizationPointLabel: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val userSuppliedTag: ByteString = ByteString.EMPTY,
  @field:WireField(
    tag = 3,
    adapter = "fedpro.type.FederateHandleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val synchronizationSet: FederateHandleSet? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<RegisterFederationSynchronizationPointWithSetRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RegisterFederationSynchronizationPointWithSetRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (synchronizationPointLabel != other.synchronizationPointLabel) return false
    if (userSuppliedTag != other.userSuppliedTag) return false
    if (synchronizationSet != other.synchronizationSet) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + synchronizationPointLabel.hashCode()
      result = result * 37 + userSuppliedTag.hashCode()
      result = result * 37 + (synchronizationSet?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """synchronizationPointLabel=${sanitize(synchronizationPointLabel)}"""
    result += """userSuppliedTag=$userSuppliedTag"""
    if (synchronizationSet != null) result += """synchronizationSet=$synchronizationSet"""
    return result.joinToString(prefix = "RegisterFederationSynchronizationPointWithSetRequest{",
        separator = ", ", postfix = "}")
  }

  public fun copy(
    synchronizationPointLabel: String = this.synchronizationPointLabel,
    userSuppliedTag: ByteString = this.userSuppliedTag,
    synchronizationSet: FederateHandleSet? = this.synchronizationSet,
    unknownFields: ByteString = this.unknownFields,
  ): RegisterFederationSynchronizationPointWithSetRequest =
      RegisterFederationSynchronizationPointWithSetRequest(synchronizationPointLabel,
      userSuppliedTag, synchronizationSet, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RegisterFederationSynchronizationPointWithSetRequest> = object
        : ProtoAdapter<RegisterFederationSynchronizationPointWithSetRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      RegisterFederationSynchronizationPointWithSetRequest::class, 
      "type.googleapis.com/fedpro.RegisterFederationSynchronizationPointWithSetRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: RegisterFederationSynchronizationPointWithSetRequest): Int {
        var size = value.unknownFields.size
        if (value.synchronizationPointLabel != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.synchronizationPointLabel)
        if (value.userSuppliedTag != ByteString.EMPTY) size +=
            ProtoAdapter.BYTES.encodedSizeWithTag(2, value.userSuppliedTag)
        if (value.synchronizationSet != null) size +=
            FederateHandleSet.ADAPTER.encodedSizeWithTag(3, value.synchronizationSet)
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: RegisterFederationSynchronizationPointWithSetRequest) {
        if (value.synchronizationPointLabel != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.synchronizationPointLabel)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 2,
            value.userSuppliedTag)
        if (value.synchronizationSet != null) FederateHandleSet.ADAPTER.encodeWithTag(writer, 3,
            value.synchronizationSet)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: RegisterFederationSynchronizationPointWithSetRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.synchronizationSet != null) FederateHandleSet.ADAPTER.encodeWithTag(writer, 3,
            value.synchronizationSet)
        if (value.userSuppliedTag != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 2,
            value.userSuppliedTag)
        if (value.synchronizationPointLabel != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.synchronizationPointLabel)
      }

      override fun decode(reader: ProtoReader):
          RegisterFederationSynchronizationPointWithSetRequest {
        var synchronizationPointLabel: String = ""
        var userSuppliedTag: ByteString = ByteString.EMPTY
        var synchronizationSet: FederateHandleSet? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> synchronizationPointLabel = ProtoAdapter.STRING.decode(reader)
            2 -> userSuppliedTag = ProtoAdapter.BYTES.decode(reader)
            3 -> synchronizationSet = FederateHandleSet.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RegisterFederationSynchronizationPointWithSetRequest(
          synchronizationPointLabel = synchronizationPointLabel,
          userSuppliedTag = userSuppliedTag,
          synchronizationSet = synchronizationSet,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: RegisterFederationSynchronizationPointWithSetRequest):
          RegisterFederationSynchronizationPointWithSetRequest = value.copy(
        synchronizationSet = value.synchronizationSet?.let(FederateHandleSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
