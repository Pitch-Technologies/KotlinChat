// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.RestoreStatus in DataTypes.proto
package fedpro.type

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Int

public enum class RestoreStatus(
  override val `value`: Int,
) : WireEnum {
  NO_RESTORE_IN_PROGRESS(0),
  FEDERATE_RESTORE_REQUEST_PENDING(1),
  FEDERATE_WAITING_FOR_RESTORE_TO_BEGIN(2),
  FEDERATE_PREPARED_TO_RESTORE(3),
  FEDERATE_RESTORING(4),
  FEDERATE_WAITING_FOR_FEDERATION_TO_RESTORE(5),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RestoreStatus> = object : EnumAdapter<RestoreStatus>(
      RestoreStatus::class, 
      PROTO_3, 
      RestoreStatus.NO_RESTORE_IN_PROGRESS
    ) {
      override fun fromValue(`value`: Int): RestoreStatus? = RestoreStatus.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): RestoreStatus? = when (value) {
      0 -> NO_RESTORE_IN_PROGRESS
      1 -> FEDERATE_RESTORE_REQUEST_PENDING
      2 -> FEDERATE_WAITING_FOR_RESTORE_TO_BEGIN
      3 -> FEDERATE_PREPARED_TO_RESTORE
      4 -> FEDERATE_RESTORING
      5 -> FEDERATE_WAITING_FOR_FEDERATION_TO_RESTORE
      else -> null
    }
  }
}