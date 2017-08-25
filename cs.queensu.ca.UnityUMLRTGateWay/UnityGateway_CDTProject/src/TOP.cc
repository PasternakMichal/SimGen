
#include "TOP.hh"

#include "CarController.hh"
#include "UnityGateway.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtcapsulepart.hh"
#include "umlrtslot.hh"
#include <cstddef>
#include "umlrtcapsulerole.hh"
#include "umlrtframeservice.hh"
class UMLRTRtsInterface;
struct UMLRTCommsPort;

Capsule_TOP::Capsule_TOP( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat )
: UMLRTCapsule( NULL, cd, st, border, internal, isStat )
, CarController( &slot->parts[part_CarController] )
, reciever( &slot->parts[part_reciever] )
{
}




void Capsule_TOP::bindPort( bool isBorder, int portId, int index )
{
}

void Capsule_TOP::unbindPort( bool isBorder, int portId, int index )
{
}

void Capsule_TOP::initialize( const UMLRTMessage & msg )
{
}

void Capsule_TOP::inject( const UMLRTMessage & msg )
{
}


static const UMLRTCapsuleRole roles[] = 
{
    {
        "CarController",
        &CarController,
        1,
        1,
        false,
        false
    },
    {
        "reciever",
        &UnityGateway,
        1,
        1,
        false,
        false
    }
};

static void instantiate_TOP( const UMLRTRtsInterface * rts, UMLRTSlot * slot, const UMLRTCommsPort * * borderPorts )
{
    CarController.instantiate( NULL, slot->parts[Capsule_TOP::part_CarController].slots[0], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_TOP::part_CarController].slots[0], CarController.numPortRolesBorder ) );
    UnityGateway.instantiate( NULL, slot->parts[Capsule_TOP::part_reciever].slots[0], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_TOP::part_reciever].slots[0], UnityGateway.numPortRolesBorder ) );
    slot->capsule = new Capsule_TOP( &TOP, slot, borderPorts, NULL, false );
}

const UMLRTCapsuleClass TOP = 
{
    "TOP",
    NULL,
    instantiate_TOP,
    2,
    roles,
    0,
    NULL,
    0,
    NULL
};

