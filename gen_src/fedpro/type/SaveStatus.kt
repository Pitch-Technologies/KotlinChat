// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.SaveStatus in DataTypes.proto
package fedpro.type

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Int

public enum class SaveStatus(
  override val `value`: Int,
) : WireEnum {
  NO_SAVE_IN_PROGRESS(0),
  FEDERATE_INSTRUCTED_TO_SAVE(1),
  FEDERATE_SAVING(2),
  FEDERATE_WAITING_FOR_FEDERATION_TO_SAVE(3),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SaveStatus> = object : EnumAdapter<SaveStatus>(
      SaveStatus::class, 
      PROTO_3, 
      SaveStatus.NO_SAVE_IN_PROGRESS
    ) {
      override fun fromValue(`value`: Int): SaveStatus? = SaveStatus.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): SaveStatus? = when (value) {
      0 -> NO_SAVE_IN_PROGRESS
      1 -> FEDERATE_INSTRUCTED_TO_SAVE
      2 -> FEDERATE_SAVING
      3 -> FEDERATE_WAITING_FOR_FEDERATION_TO_SAVE
      else -> null
    }
  }
}
