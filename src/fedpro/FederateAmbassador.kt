package fedpro

import fedpro.type.AttributeHandle
import fedpro.type.InteractionClassHandle
import fedpro.type.ObjectInstanceHandle
import fedpro.type.ParameterHandle

interface FederateAmbassador {
   fun objectInstanceNameReservationSucceeded(instanceName: String)
   fun objectInstanceNameReservationFailed(instanceName: String)
   fun reflectAttributeValues(instanceHandle: ObjectInstanceHandle, attributes: Map<AttributeHandle, ByteArray>)
   fun receiveInteraction(interactionHandle: InteractionClassHandle, parameters: Map<ParameterHandle, ByteArray>)
   fun removeObjectInstance(instanceHandle: ObjectInstanceHandle)
   fun provideAttributeValueUpdate(instanceHandle: ObjectInstanceHandle, attributes: Set<AttributeHandle>)
}
