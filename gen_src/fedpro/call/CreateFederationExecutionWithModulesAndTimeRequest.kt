// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.CreateFederationExecutionWithModulesAndTimeRequest in RtiAmbassador.proto
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
import fedpro.type.FomModuleSet
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

public class CreateFederationExecutionWithModulesAndTimeRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val federationExecutionName: String = "",
  @field:WireField(
    tag = 2,
    adapter = "fedpro.type.FomModuleSet#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val fomModules: FomModuleSet? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val logicalTimeImplementationName: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<CreateFederationExecutionWithModulesAndTimeRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is CreateFederationExecutionWithModulesAndTimeRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (federationExecutionName != other.federationExecutionName) return false
    if (fomModules != other.fomModules) return false
    if (logicalTimeImplementationName != other.logicalTimeImplementationName) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + federationExecutionName.hashCode()
      result = result * 37 + (fomModules?.hashCode() ?: 0)
      result = result * 37 + logicalTimeImplementationName.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """federationExecutionName=${sanitize(federationExecutionName)}"""
    if (fomModules != null) result += """fomModules=$fomModules"""
    result += """logicalTimeImplementationName=${sanitize(logicalTimeImplementationName)}"""
    return result.joinToString(prefix = "CreateFederationExecutionWithModulesAndTimeRequest{",
        separator = ", ", postfix = "}")
  }

  public fun copy(
    federationExecutionName: String = this.federationExecutionName,
    fomModules: FomModuleSet? = this.fomModules,
    logicalTimeImplementationName: String = this.logicalTimeImplementationName,
    unknownFields: ByteString = this.unknownFields,
  ): CreateFederationExecutionWithModulesAndTimeRequest =
      CreateFederationExecutionWithModulesAndTimeRequest(federationExecutionName, fomModules,
      logicalTimeImplementationName, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<CreateFederationExecutionWithModulesAndTimeRequest> = object :
        ProtoAdapter<CreateFederationExecutionWithModulesAndTimeRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      CreateFederationExecutionWithModulesAndTimeRequest::class, 
      "type.googleapis.com/fedpro.CreateFederationExecutionWithModulesAndTimeRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: CreateFederationExecutionWithModulesAndTimeRequest): Int {
        var size = value.unknownFields.size
        if (value.federationExecutionName != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.federationExecutionName)
        if (value.fomModules != null) size += FomModuleSet.ADAPTER.encodedSizeWithTag(2,
            value.fomModules)
        if (value.logicalTimeImplementationName != "") size +=
            ProtoAdapter.STRING.encodedSizeWithTag(3, value.logicalTimeImplementationName)
        return size
      }

      override fun encode(writer: ProtoWriter,
          `value`: CreateFederationExecutionWithModulesAndTimeRequest) {
        if (value.federationExecutionName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.federationExecutionName)
        if (value.fomModules != null) FomModuleSet.ADAPTER.encodeWithTag(writer, 2,
            value.fomModules)
        if (value.logicalTimeImplementationName != "") ProtoAdapter.STRING.encodeWithTag(writer, 3,
            value.logicalTimeImplementationName)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: CreateFederationExecutionWithModulesAndTimeRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.logicalTimeImplementationName != "") ProtoAdapter.STRING.encodeWithTag(writer, 3,
            value.logicalTimeImplementationName)
        if (value.fomModules != null) FomModuleSet.ADAPTER.encodeWithTag(writer, 2,
            value.fomModules)
        if (value.federationExecutionName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.federationExecutionName)
      }

      override fun decode(reader: ProtoReader): CreateFederationExecutionWithModulesAndTimeRequest {
        var federationExecutionName: String = ""
        var fomModules: FomModuleSet? = null
        var logicalTimeImplementationName: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> federationExecutionName = ProtoAdapter.STRING.decode(reader)
            2 -> fomModules = FomModuleSet.ADAPTER.decode(reader)
            3 -> logicalTimeImplementationName = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return CreateFederationExecutionWithModulesAndTimeRequest(
          federationExecutionName = federationExecutionName,
          fomModules = fomModules,
          logicalTimeImplementationName = logicalTimeImplementationName,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: CreateFederationExecutionWithModulesAndTimeRequest):
          CreateFederationExecutionWithModulesAndTimeRequest = value.copy(
        fomModules = value.fomModules?.let(FomModuleSet.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
