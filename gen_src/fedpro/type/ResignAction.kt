// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ResignAction in DataTypes.proto
package fedpro.type

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Int

public enum class ResignAction(
  override val `value`: Int,
) : WireEnum {
  UNCONDITIONALLY_DIVEST_ATTRIBUTES(0),
  DELETE_OBJECTS(1),
  CANCEL_PENDING_OWNERSHIP_ACQUISITIONS(2),
  DELETE_OBJECTS_THEN_DIVEST(3),
  CANCEL_THEN_DELETE_THEN_DIVEST(4),
  NO_ACTION(5),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ResignAction> = object : EnumAdapter<ResignAction>(
      ResignAction::class, 
      PROTO_3, 
      ResignAction.UNCONDITIONALLY_DIVEST_ATTRIBUTES
    ) {
      override fun fromValue(`value`: Int): ResignAction? = ResignAction.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): ResignAction? = when (value) {
      0 -> UNCONDITIONALLY_DIVEST_ATTRIBUTES
      1 -> DELETE_OBJECTS
      2 -> CANCEL_PENDING_OWNERSHIP_ACQUISITIONS
      3 -> DELETE_OBJECTS_THEN_DIVEST
      4 -> CANCEL_THEN_DELETE_THEN_DIVEST
      5 -> NO_ACTION
      else -> null
    }
  }
}
