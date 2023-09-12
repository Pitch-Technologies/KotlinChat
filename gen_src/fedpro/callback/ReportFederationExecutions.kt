// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ReportFederationExecutions in FederateAmbassador.proto
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
import fedpro.type.FederationExecutionInformationSet
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

public class ReportFederationExecutions(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.FederationExecutionInformationSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val theFederationExecutionInformationSet: FederationExecutionInformationSet? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ReportFederationExecutions, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ReportFederationExecutions) return false
    if (unknownFields != other.unknownFields) return false
    if (theFederationExecutionInformationSet != other.theFederationExecutionInformationSet)
        return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (theFederationExecutionInformationSet?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (theFederationExecutionInformationSet != null) result +=
        """theFederationExecutionInformationSet=$theFederationExecutionInformationSet"""
    return result.joinToString(prefix = "ReportFederationExecutions{", separator = ", ", postfix =
        "}")
  }

  public fun copy(theFederationExecutionInformationSet: FederationExecutionInformationSet? =
      this.theFederationExecutionInformationSet, unknownFields: ByteString = this.unknownFields):
      ReportFederationExecutions = ReportFederationExecutions(theFederationExecutionInformationSet,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ReportFederationExecutions> = object :
        ProtoAdapter<ReportFederationExecutions>(
      FieldEncoding.LENGTH_DELIMITED, 
      ReportFederationExecutions::class, 
      "type.googleapis.com/fedpro.ReportFederationExecutions", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: ReportFederationExecutions): Int {
        var size = value.unknownFields.size
        if (value.theFederationExecutionInformationSet != null) size +=
            FederationExecutionInformationSet.ADAPTER.encodedSizeWithTag(1,
            value.theFederationExecutionInformationSet)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ReportFederationExecutions) {
        if (value.theFederationExecutionInformationSet != null)
            FederationExecutionInformationSet.ADAPTER.encodeWithTag(writer, 1,
            value.theFederationExecutionInformationSet)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ReportFederationExecutions) {
        writer.writeBytes(value.unknownFields)
        if (value.theFederationExecutionInformationSet != null)
            FederationExecutionInformationSet.ADAPTER.encodeWithTag(writer, 1,
            value.theFederationExecutionInformationSet)
      }

      override fun decode(reader: ProtoReader): ReportFederationExecutions {
        var theFederationExecutionInformationSet: FederationExecutionInformationSet? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> theFederationExecutionInformationSet =
                FederationExecutionInformationSet.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ReportFederationExecutions(
          theFederationExecutionInformationSet = theFederationExecutionInformationSet,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ReportFederationExecutions): ReportFederationExecutions =
          value.copy(
        theFederationExecutionInformationSet =
            value.theFederationExecutionInformationSet?.let(FederationExecutionInformationSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
