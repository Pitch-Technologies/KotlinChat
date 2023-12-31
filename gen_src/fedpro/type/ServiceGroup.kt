// Code generated by Wire protocol buffer compiler, do not edit.
// Source: fedpro.ServiceGroup in DataTypes.proto
package fedpro.type

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Int

public enum class ServiceGroup(
  override val `value`: Int,
) : WireEnum {
  FEDERATION_MANAGEMENT(0),
  DECLARATION_MANAGEMENT(1),
  OBJECT_MANAGEMENT(2),
  OWNERSHIP_MANAGEMENT(3),
  TIME_MANAGEMENT(4),
  DATA_DISTRIBUTION_MANAGEMENT(5),
  SUPPORT_SERVICES(6),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ServiceGroup> = object : EnumAdapter<ServiceGroup>(
      ServiceGroup::class, 
      PROTO_3, 
      ServiceGroup.FEDERATION_MANAGEMENT
    ) {
      override fun fromValue(`value`: Int): ServiceGroup? = ServiceGroup.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): ServiceGroup? = when (value) {
      0 -> FEDERATION_MANAGEMENT
      1 -> DECLARATION_MANAGEMENT
      2 -> OBJECT_MANAGEMENT
      3 -> OWNERSHIP_MANAGEMENT
      4 -> TIME_MANAGEMENT
      5 -> DATA_DISTRIBUTION_MANAGEMENT
      6 -> SUPPORT_SERVICES
      else -> null
    }
  }
}
