// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.QueryLookaheadResponse in RtiAmbassador.proto
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
import fedpro.type.LogicalTimeInterval
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

public class QueryLookaheadResponse(
  @field:WireField(
    tag = 1,
    adapter = "fedpro.type.LogicalTimeInterval#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val result: LogicalTimeInterval? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<QueryLookaheadResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is QueryLookaheadResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (result != other.result) return false
    return true
  }

  override fun hashCode(): Int {
    var result_ = super.hashCode
    if (result_ == 0) {
      result_ = unknownFields.hashCode()
      result_ = result_ * 37 + (result?.hashCode() ?: 0)
      super.hashCode = result_
    }
    return result_
  }

  override fun toString(): String {
    val result_ = mutableListOf<String>()
    if (result != null) result_ += """result=$result"""
    return result_.joinToString(prefix = "QueryLookaheadResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(result: LogicalTimeInterval? = this.result, unknownFields: ByteString =
      this.unknownFields): QueryLookaheadResponse = QueryLookaheadResponse(result, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<QueryLookaheadResponse> = object :
        ProtoAdapter<QueryLookaheadResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      QueryLookaheadResponse::class, 
      "type.googleapis.com/fedpro.QueryLookaheadResponse", 
      PROTO_3, 
      null, 
      "RtiAmbassador.proto"
    ) {
      override fun encodedSize(`value`: QueryLookaheadResponse): Int {
        var size = value.unknownFields.size
        if (value.result != null) size += LogicalTimeInterval.ADAPTER.encodedSizeWithTag(1,
            value.result)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: QueryLookaheadResponse) {
        if (value.result != null) LogicalTimeInterval.ADAPTER.encodeWithTag(writer, 1, value.result)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: QueryLookaheadResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.result != null) LogicalTimeInterval.ADAPTER.encodeWithTag(writer, 1, value.result)
      }

      override fun decode(reader: ProtoReader): QueryLookaheadResponse {
        var result: LogicalTimeInterval? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> result = LogicalTimeInterval.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return QueryLookaheadResponse(
          result = result,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: QueryLookaheadResponse): QueryLookaheadResponse = value.copy(
        result = value.result?.let(LogicalTimeInterval.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
