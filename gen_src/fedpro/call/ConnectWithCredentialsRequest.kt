// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ConnectWithCredentialsRequest in RtiAmbassador.proto
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
import fedpro.type.Credentials
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

public class ConnectWithCredentialsRequest(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.Credentials#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val credentials: Credentials? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ConnectWithCredentialsRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ConnectWithCredentialsRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (credentials != other.credentials) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (credentials?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (credentials != null) result += """credentials=$credentials"""
    return result.joinToString(prefix = "ConnectWithCredentialsRequest{", separator = ", ", postfix
        = "}")
  }

  public fun copy(credentials: Credentials? = this.credentials, unknownFields: ByteString =
      this.unknownFields): ConnectWithCredentialsRequest =
      ConnectWithCredentialsRequest(credentials, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ConnectWithCredentialsRequest> = object :
        ProtoAdapter<ConnectWithCredentialsRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      ConnectWithCredentialsRequest::class, 
      "type.googleapis.com/fedpro.ConnectWithCredentialsRequest", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: ConnectWithCredentialsRequest): Int {
        var size = value.unknownFields.size
        if (value.credentials != null) size += Credentials.ADAPTER.encodedSizeWithTag(1,
            value.credentials)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ConnectWithCredentialsRequest) {
        if (value.credentials != null) Credentials.ADAPTER.encodeWithTag(writer, 1,
            value.credentials)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ConnectWithCredentialsRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.credentials != null) Credentials.ADAPTER.encodeWithTag(writer, 1,
            value.credentials)
      }

      override fun decode(reader: ProtoReader): ConnectWithCredentialsRequest {
        var credentials: Credentials? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> credentials = Credentials.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ConnectWithCredentialsRequest(
          credentials = credentials,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ConnectWithCredentialsRequest): ConnectWithCredentialsRequest =
          value.copy(
        credentials = value.credentials?.let(Credentials.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}