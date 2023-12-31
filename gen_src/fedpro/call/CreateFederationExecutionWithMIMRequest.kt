// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.CreateFederationExecutionWithMIMRequest in RtiAmbassador.proto
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
import fedpro.type.FomModule
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

public class CreateFederationExecutionWithMIMRequest(
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
    adapter = "fedpro.type.FomModule#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val mimModule: FomModule? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<CreateFederationExecutionWithMIMRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is CreateFederationExecutionWithMIMRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (federationExecutionName != other.federationExecutionName) return false
    if (fomModules != other.fomModules) return false
    if (mimModule != other.mimModule) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + federationExecutionName.hashCode()
      result = result * 37 + (fomModules?.hashCode() ?: 0)
      result = result * 37 + (mimModule?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """federationExecutionName=${sanitize(federationExecutionName)}"""
    if (fomModules != null) result += """fomModules=$fomModules"""
    if (mimModule != null) result += """mimModule=$mimModule"""
    return result.joinToString(prefix = "CreateFederationExecutionWithMIMRequest{", separator =
        ", ", postfix = "}")
  }

  public fun copy(
    federationExecutionName: String = this.federationExecutionName,
    fomModules: FomModuleSet? = this.fomModules,
    mimModule: FomModule? = this.mimModule,
    unknownFields: ByteString = this.unknownFields,
  ): CreateFederationExecutionWithMIMRequest =
      CreateFederationExecutionWithMIMRequest(federationExecutionName, fomModules, mimModule,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<CreateFederationExecutionWithMIMRequest> = object :
        ProtoAdapter<CreateFederationExecutionWithMIMRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      CreateFederationExecutionWithMIMRequest::class, 
      "type.googleapis.com/fedpro.CreateFederationExecutionWithMIMRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: CreateFederationExecutionWithMIMRequest): Int {
        var size = value.unknownFields.size
        if (value.federationExecutionName != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.federationExecutionName)
        if (value.fomModules != null) size += FomModuleSet.ADAPTER.encodedSizeWithTag(2,
            value.fomModules)
        if (value.mimModule != null) size += FomModule.ADAPTER.encodedSizeWithTag(3,
            value.mimModule)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: CreateFederationExecutionWithMIMRequest) {
        if (value.federationExecutionName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.federationExecutionName)
        if (value.fomModules != null) FomModuleSet.ADAPTER.encodeWithTag(writer, 2,
            value.fomModules)
        if (value.mimModule != null) FomModule.ADAPTER.encodeWithTag(writer, 3, value.mimModule)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter,
          `value`: CreateFederationExecutionWithMIMRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.mimModule != null) FomModule.ADAPTER.encodeWithTag(writer, 3, value.mimModule)
        if (value.fomModules != null) FomModuleSet.ADAPTER.encodeWithTag(writer, 2,
            value.fomModules)
        if (value.federationExecutionName != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.federationExecutionName)
      }

      override fun decode(reader: ProtoReader): CreateFederationExecutionWithMIMRequest {
        var federationExecutionName: String = ""
        var fomModules: FomModuleSet? = null
        var mimModule: FomModule? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> federationExecutionName = ProtoAdapter.STRING.decode(reader)
            2 -> fomModules = FomModuleSet.ADAPTER.decode(reader)
            3 -> mimModule = FomModule.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return CreateFederationExecutionWithMIMRequest(
          federationExecutionName = federationExecutionName,
          fomModules = fomModules,
          mimModule = mimModule,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: CreateFederationExecutionWithMIMRequest):
          CreateFederationExecutionWithMIMRequest = value.copy(
        fomModules = value.fomModules?.let(FomModuleSet.ADAPTER::redact),
        mimModule = value.mimModule?.let(FomModule.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
