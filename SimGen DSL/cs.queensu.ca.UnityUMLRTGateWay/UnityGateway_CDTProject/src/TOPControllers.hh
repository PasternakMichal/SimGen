
#ifndef TOPCONTROLLERS_HH
#define TOPCONTROLLERS_HH

#include "umlrtcontroller.hh"
struct UMLRTCommsPort;
struct UMLRTSlot;

enum CapsuleInstanceId
{
    InstId_TOP,
    InstId_TOP_CarController,
    InstId_TOP_reciever
};
extern UMLRTController DefaultController;
extern UMLRTCommsPort borderports_TOP_CarController[];
extern UMLRTCommsPort borderports_TOP_reciever[];
extern UMLRTSlot TOP_slots[];

#endif

