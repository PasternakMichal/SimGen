
#ifndef UNITYGATEWAY_HH
#define UNITYGATEWAY_HH

//#include "Config.hh"
//#include "SharedMem.hh"
//#include "TCPClient.hh"
#include "UnityGatewayP.hh"
#include "umlrtcapsule.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtmessage.hh"
#include "umlrttimerprotocol.hh"
struct UMLRTCommsPort;
struct UMLRTSlot;

#include <iostream>
#include <unistd.h>
#include "TCPClient.h"
#include "Config.h"
#include "SharedMem.h"
using  namespace Comms;
using  namespace ConfigUtil;

class Capsule_UnityGateway : public UMLRTCapsule
{
public:
    Capsule_UnityGateway( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat );
protected:
    UMLRTTimerProtocol_baserole configTimer;
public:
    enum BorderPortId
    {
        borderport_configTimer,
        borderport_reportContextTimer,
        borderport_unityGatewayComm
    };
protected:
    UMLRTTimerProtocol_baserole reportContextTimer;
    UnityGatewayP::Base unityGatewayComm;
public:
    enum PartId
    {
    };
    enum PortId
    {
        port_configTimer,
        port_reportContextTimer,
        port_unityGatewayComm
    };
    virtual void bindPort( bool isBorder, int portId, int index );
    virtual void unbindPort( bool isBorder, int portId, int index );
    TCPClient clientConn;
    Config config;
    SharedMem sharedMemory;
    char buffer[100];
    virtual void inject( const UMLRTMessage & message );
    virtual void initialize( const UMLRTMessage & message );
    const char * getCurrentStateString() const;
private:
    enum State
    {
        top__config,
        top__ControlWithTCP,
        top__observationWithSharedMem,
        SPECIAL_INTERNAL_STATE_UNVISITED
    };
    const char * stateNames[4];
    State currentState;
    void entryaction_____UnityGateway__UnityGateway__GateWay__Region1__ControlWithTCP__ControlStateEntry( const UMLRTMessage * msg );
    void entryaction_____UnityGateway__UnityGateway__GateWay__Region1__config__initObserver( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__Transition2__enterInControlstate( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__Transition3__OpaqueBehavior( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__gotCommand__processForwardCommand( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__init__initial( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__processAndForwardEvent__processAndForwardCommand( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__reportContext__sendContextcmd( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem__setupSHM( const UMLRTMessage * msg );
    bool guard_____UnityGateway__UnityGateway__GateWay__Region1__Transition2__checkTCPConn( const UMLRTMessage * msg );
    bool guard_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem__checkCommType( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition1( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition2( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition3( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__gotCommand( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__init( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__processAndForwardEvent( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__reconfigSHM( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__reconfigTCP( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__reportContext( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem( const UMLRTMessage * msg );
    State choice_____top__CommsType( const UMLRTMessage * msg );
    State choice_____top__checkTCPConn( const UMLRTMessage * msg );
    State state_____top__ControlWithTCP( const UMLRTMessage * msg );
    State state_____top__config( const UMLRTMessage * msg );
    State state_____top__observationWithSharedMem( const UMLRTMessage * msg );
};
extern const UMLRTCapsuleClass UnityGateway;

#endif

