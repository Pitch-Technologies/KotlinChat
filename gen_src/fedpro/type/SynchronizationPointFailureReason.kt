// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SynchronizationPointFailureReason in DataTypes.proto
package fedpro.type

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Int

public enum class SynchronizationPointFailureReason(
  override val `value`: Int,
) : WireEnum {
  SYNCHRONIZATION_POINT_LABEL_NOT_UNIQUE(0),
  SYNCHRONIZATION_SET_MEMBER_NOT_JOINED(1),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SynchronizationPointFailureReason> = object :
        EnumAdapter<SynchronizationPointFailureReason>(
      SynchronizationPointFailureReason::class, 
      PROTO_3, 
      SynchronizationPointFailureReason.SYNCHRONIZATION_POINT_LABEL_NOT_UNIQUE
    ) {
      override fun fromValue(`value`: Int): SynchronizationPointFailureReason? =
          SynchronizationPointFailureReason.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): SynchronizationPointFailureReason? = when (value) {
      0 -> SYNCHRONIZATION_POINT_LABEL_NOT_UNIQUE
      1 -> SYNCHRONIZATION_SET_MEMBER_NOT_JOINED
      else -> null
    }
  }
}
