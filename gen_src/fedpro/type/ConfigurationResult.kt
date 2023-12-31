// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ConfigurationResult in DataTypes.proto
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

public class ConfigurationResult(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val configurationUsed: Boolean = false,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val addressUsed: Boolean = false,
  @field:WireField(
    tag = 3,
    adapter = "fedpro.type.AdditionalSettingsResultCode#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val additionalSettingsResultCode: AdditionalSettingsResultCode =
      AdditionalSettingsResultCode.SETTINGS_IGNORED,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val message: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ConfigurationResult, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ConfigurationResult) return false
    if (unknownFields != other.unknownFields) return false
    if (configurationUsed != other.configurationUsed) return false
    if (addressUsed != other.addressUsed) return false
    if (additionalSettingsResultCode != other.additionalSettingsResultCode) return false
    if (message != other.message) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + configurationUsed.hashCode()
      result = result * 37 + addressUsed.hashCode()
      result = result * 37 + additionalSettingsResultCode.hashCode()
      result = result * 37 + message.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """configurationUsed=$configurationUsed"""
    result += """addressUsed=$addressUsed"""
    result += """additionalSettingsResultCode=$additionalSettingsResultCode"""
    result += """message=${sanitize(message)}"""
    return result.joinToString(prefix = "ConfigurationResult{", separator = ", ", postfix = "}")
  }

  public fun copy(
    configurationUsed: Boolean = this.configurationUsed,
    addressUsed: Boolean = this.addressUsed,
    additionalSettingsResultCode: AdditionalSettingsResultCode = this.additionalSettingsResultCode,
    message: String = this.message,
    unknownFields: ByteString = this.unknownFields,
  ): ConfigurationResult = ConfigurationResult(configurationUsed, addressUsed,
      additionalSettingsResultCode, message, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ConfigurationResult> = object :
        ProtoAdapter<ConfigurationResult>(
      FieldEncoding.LENGTH_DELIMITED, 
      ConfigurationResult::class, 
      "type.googleapis.com/fedpro.ConfigurationResult", 
      PROTO_3, 
      null, 
      "DataTypes.proto"
    ) {
      override fun encodedSize(`value`: ConfigurationResult): Int {
        var size = value.unknownFields.size
        if (value.configurationUsed != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(1,
            value.configurationUsed)
        if (value.addressUsed != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(2,
            value.addressUsed)
        if (value.additionalSettingsResultCode != AdditionalSettingsResultCode.SETTINGS_IGNORED)
            size += AdditionalSettingsResultCode.ADAPTER.encodedSizeWithTag(3,
            value.additionalSettingsResultCode)
        if (value.message != "") size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.message)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ConfigurationResult) {
        if (value.configurationUsed != false) ProtoAdapter.BOOL.encodeWithTag(writer, 1,
            value.configurationUsed)
        if (value.addressUsed != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2,
            value.addressUsed)
        if (value.additionalSettingsResultCode != AdditionalSettingsResultCode.SETTINGS_IGNORED)
            AdditionalSettingsResultCode.ADAPTER.encodeWithTag(writer, 3,
            value.additionalSettingsResultCode)
        if (value.message != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.message)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ConfigurationResult) {
        writer.writeBytes(value.unknownFields)
        if (value.message != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.message)
        if (value.additionalSettingsResultCode != AdditionalSettingsResultCode.SETTINGS_IGNORED)
            AdditionalSettingsResultCode.ADAPTER.encodeWithTag(writer, 3,
            value.additionalSettingsResultCode)
        if (value.addressUsed != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2,
            value.addressUsed)
        if (value.configurationUsed != false) ProtoAdapter.BOOL.encodeWithTag(writer, 1,
            value.configurationUsed)
      }

      override fun decode(reader: ProtoReader): ConfigurationResult {
        var configurationUsed: Boolean = false
        var addressUsed: Boolean = false
        var additionalSettingsResultCode: AdditionalSettingsResultCode =
            AdditionalSettingsResultCode.SETTINGS_IGNORED
        var message: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> configurationUsed = ProtoAdapter.BOOL.decode(reader)
            2 -> addressUsed = ProtoAdapter.BOOL.decode(reader)
            3 -> try {
              additionalSettingsResultCode = AdditionalSettingsResultCode.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            4 -> message = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ConfigurationResult(
          configurationUsed = configurationUsed,
          addressUsed = addressUsed,
          additionalSettingsResultCode = additionalSettingsResultCode,
          message = message,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ConfigurationResult): ConfigurationResult = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
