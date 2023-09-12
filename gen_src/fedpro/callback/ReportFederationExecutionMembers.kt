// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ReportFederationExecutionMembers in FederateAmbassador.proto
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
import fedpro.type.FederationExecutionMemberInformationSet
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

public class ReportFederationExecutionMembers(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val federationName: String = "",
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.FederationExecutionMemberInformationSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val federationExecutionMemberInformationSet: FederationExecutionMemberInformationSet? =
      null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ReportFederationExecutionMembers, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ReportFederationExecutionMembers) return false
    if (unknownFields != other.unknownFields) return false
    if (federationName != other.federationName) return false
    if (federationExecutionMemberInformationSet != other.federationExecutionMemberInformationSet)
        return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + federationName.hashCode()
      result = result * 37 + (federationExecutionMemberInformationSet?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """federationName=${sanitize(federationName)}"""
    if (federationExecutionMemberInformationSet != null) result +=
        """federationExecutionMemberInformationSet=$federationExecutionMemberInformationSet"""
    return result.joinToString(prefix = "ReportFederationExecutionMembers{", separator = ", ",
        postfix = "}")
  }

  public fun copy(
    federationName: String = this.federationName,
    federationExecutionMemberInformationSet: FederationExecutionMemberInformationSet? =
        this.federationExecutionMemberInformationSet,
    unknownFields: ByteString = this.unknownFields,
  ): ReportFederationExecutionMembers = ReportFederationExecutionMembers(federationName,
      federationExecutionMemberInformationSet, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ReportFederationExecutionMembers> = object :
        ProtoAdapter<ReportFederationExecutionMembers>(
      FieldEncoding.LENGTH_DELIMITED, 
      ReportFederationExecutionMembers::class, 
      "type.googleapis.com/fedpro.ReportFederationExecutionMembers", 
      PROTO_3, 
      null, 
      "FederateAmbassador.proto"
    ) {
      override fun encodedSize(`value`: ReportFederationExecutionMembers): Int {
        var size = value.unknownFields.size
        if (value.federationName != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.federationName)
        if (value.federationExecutionMemberInformationSet != null) size +=
            FederationExecutionMemberInformationSet.ADAPTER.encodedSizeWithTag(2,
            value.federationExecutionMemberInformationSet)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ReportFederationExecutionMembers) {
        if (value.federationName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.federationName)
        if (value.federationExecutionMemberInformationSet != null)
            FederationExecutionMemberInformationSet.ADAPTER.encodeWithTag(writer, 2,
            value.federationExecutionMemberInformationSet)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ReportFederationExecutionMembers) {
        writer.writeBytes(value.unknownFields)
        if (value.federationExecutionMemberInformationSet != null)
            FederationExecutionMemberInformationSet.ADAPTER.encodeWithTag(writer, 2,
            value.federationExecutionMemberInformationSet)
        if (value.federationName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.federationName)
      }

      override fun decode(reader: ProtoReader): ReportFederationExecutionMembers {
        var federationName: String = ""
        var federationExecutionMemberInformationSet: FederationExecutionMemberInformationSet? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> federationName = ProtoAdapter.STRING.decode(reader)
            2 -> federationExecutionMemberInformationSet =
                FederationExecutionMemberInformationSet.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ReportFederationExecutionMembers(
          federationName = federationName,
          federationExecutionMemberInformationSet = federationExecutionMemberInformationSet,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ReportFederationExecutionMembers):
          ReportFederationExecutionMembers = value.copy(
        federationExecutionMemberInformationSet =
            value.federationExecutionMemberInformationSet?.let(FederationExecutionMemberInformationSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}