// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ConnectWithCredentialsResponse in RtiAmbassador.proto
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
import fedpro.type.ConfigurationResult
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

public class ConnectWithCredentialsResponse(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.ConfigurationResult#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val configurationResult: ConfigurationResult? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ConnectWithCredentialsResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ConnectWithCredentialsResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (configurationResult != other.configurationResult) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (configurationResult?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (configurationResult != null) result += """configurationResult=$configurationResult"""
    return result.joinToString(prefix = "ConnectWithCredentialsResponse{", separator = ", ", postfix
        = "}")
  }

  public fun copy(configurationResult: ConfigurationResult? = this.configurationResult,
      unknownFields: ByteString = this.unknownFields): ConnectWithCredentialsResponse =
      ConnectWithCredentialsResponse(configurationResult, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ConnectWithCredentialsResponse> = object :
        ProtoAdapter<ConnectWithCredentialsResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      ConnectWithCredentialsResponse::class, 
      "type.googleapis.com/fedpro.ConnectWithCredentialsResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: ConnectWithCredentialsResponse): Int {
        var size = value.unknownFields.size
        if (value.configurationResult != null) size +=
            ConfigurationResult.ADAPTER.encodedSizeWithTag(1, value.configurationResult)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ConnectWithCredentialsResponse) {
        if (value.configurationResult != null) ConfigurationResult.ADAPTER.encodeWithTag(writer, 1,
            value.configurationResult)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ConnectWithCredentialsResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.configurationResult != null) ConfigurationResult.ADAPTER.encodeWithTag(writer, 1,
            value.configurationResult)
      }

      override fun decode(reader: ProtoReader): ConnectWithCredentialsResponse {
        var configurationResult: ConfigurationResult? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> configurationResult = ConfigurationResult.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ConnectWithCredentialsResponse(
          configurationResult = configurationResult,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ConnectWithCredentialsResponse): ConnectWithCredentialsResponse =
          value.copy(
        configurationResult = value.configurationResult?.let(ConfigurationResult.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
