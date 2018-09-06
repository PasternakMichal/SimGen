
#include "TOPControllers.hh"

#include "CarController.hh"
#include "TOP.hh"
#include "UnityGateway.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtcapsulepart.hh"
#include "umlrtcommsport.hh"
#include "umlrtcommsportfarend.hh"
#include "umlrtcontroller.hh"
#include "umlrtslot.hh"
#include <cstddef>


UMLRTController DefaultController( "DefaultController" );

static Capsule_TOP tOP( &TOP, &TOP_slots[InstId_TOP], NULL, NULL, true );

static UMLRTSlot * slots_TOP[] = 
{
    &TOP_slots[InstId_TOP_CarController],
    &TOP_slots[InstId_TOP_reciever]
};

static UMLRTCapsulePart parts_TOP[] = 
{
    {
        &TOP,
        Capsule_TOP::part_CarController,
        1,
        &slots_TOP[0]
    },
    {
        &TOP,
        Capsule_TOP::part_reciever,
        1,
        &slots_TOP[1]
    }
};

static UMLRTCommsPortFarEnd borderfarEndList_TOP_CarController[] = 
{
    {
        0,
        NULL
    },
    {
        0,
        NULL
    }
};

UMLRTCommsPort borderports_TOP_CarController[] = 
{
    {
        &CarController,
        Capsule_CarController::borderport_Timer1,
        &TOP_slots[InstId_TOP_CarController],
        1,
        borderfarEndList_TOP_CarController,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        true
    },
    {
        &CarController,
        Capsule_CarController::borderport_unityGatewayComm,
        &TOP_slots[InstId_TOP_CarController],
        1,
        &borderfarEndList_TOP_CarController[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        true,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_TOP_CarController_ptrs[] = 
{
    &borderports_TOP_CarController[0],
    &borderports_TOP_CarController[1]
};

static Capsule_CarController tOP_CarController( &CarController, &TOP_slots[InstId_TOP_CarController], borderports_TOP_CarController_ptrs, NULL, true );

static UMLRTCommsPortFarEnd borderfarEndList_TOP_reciever[] = 
{
    {
        0,
        NULL
    },
    {
        0,
        NULL
    },
    {
        0,
        NULL
    }
};

UMLRTCommsPort borderports_TOP_reciever[] = 
{
    {
        &UnityGateway,
        Capsule_UnityGateway::borderport_configTimer,
        &TOP_slots[InstId_TOP_reciever],
        1,
        borderfarEndList_TOP_reciever,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        true
    },
    {
        &UnityGateway,
        Capsule_UnityGateway::borderport_reportContextTimer,
        &TOP_slots[InstId_TOP_reciever],
        1,
        &borderfarEndList_TOP_reciever[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        true
    },
    {
        &UnityGateway,
        Capsule_UnityGateway::borderport_unityGatewayComm,
        &TOP_slots[InstId_TOP_reciever],
        1,
        &borderfarEndList_TOP_reciever[2],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        true,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_TOP_reciever_ptrs[] = 
{
    &borderports_TOP_reciever[0],
    &borderports_TOP_reciever[1],
    &borderports_TOP_reciever[2]
};

static Capsule_UnityGateway tOP_reciever( &UnityGateway, &TOP_slots[InstId_TOP_reciever], borderports_TOP_reciever_ptrs, NULL, true );

UMLRTSlot TOP_slots[] = 
{
    {
        "TOP",
        0,
        &TOP,
        NULL,
        0,
        &tOP,
        &DefaultController,
        2,
        parts_TOP,
        0,
        NULL,
        NULL,
        true,
        false
    },
    {
        "TOP.CarController",
        0,
        &CarController,
        &TOP,
        Capsule_TOP::part_CarController,
        &tOP_CarController,
        &DefaultController,
        0,
        NULL,
        2,
        borderports_TOP_CarController,
        NULL,
        true,
        false
    },
    {
        "TOP.reciever",
        0,
        &UnityGateway,
        &TOP,
        Capsule_TOP::part_reciever,
        &tOP_reciever,
        &DefaultController,
        0,
        NULL,
        3,
        borderports_TOP_reciever,
        NULL,
        true,
        false
    }
};

