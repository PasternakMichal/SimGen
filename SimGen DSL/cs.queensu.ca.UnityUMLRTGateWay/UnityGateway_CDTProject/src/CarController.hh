
#ifndef CARCONTROLLER_HH
#define CARCONTROLLER_HH

#include "UnityGatewayP.hh"
#include "umlrtcapsule.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtmessage.hh"
#include "umlrttimerprotocol.hh"
struct UMLRTCommsPort;
struct UMLRTSlot;

#include "Config.h"
#include "SharedMem.h"
#include "MobileContext.h"
#include "UnityCarCommand.h"
using  namespace Comms;
using  namespace ConfigUtil;

class Capsule_CarController : public UMLRTCapsule
{
public:
    Capsule_CarController( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat );
protected:
    UMLRTTimerProtocol_baserole Timer1;
public:
    enum BorderPortId
    {
        borderport_Timer1,
        borderport_unityGatewayComm
    };
protected:
    UnityGatewayP::Conj unityGatewayComm;
public:
    enum PartId
    {
    };
    enum PortId
    {
        port_Timer1,
        port_unityGatewayComm
    };
    virtual void bindPort( bool isBorder, int portId, int index );
    virtual void unbindPort( bool isBorder, int portId, int index );
    Config config;
    Unity::MobileContext context;
    Unity::UnityCarCommand command;
    char cmd[50];
    void driveInCity();
    void stopCar();
    bool checkConfig()
            {
                    if (!config.isLoaded())
                    {

                    	std::cout<<"The config is not loaded\n";
                    	return false;
                    }
                    else if (atof(config.getConfig("endpointX").c_str())==0 ||atof(config.getConfig("endpointZ").c_str())==0)
                    {
                    	std::cout<<"The endpount data  is not set\n";
                    	return false;
                    }
                    return true;
            }

    virtual void inject( const UMLRTMessage & message );
    virtual void initialize( const UMLRTMessage & message );
    const char * getCurrentStateString() const;
private:
    enum State
    {
        top__CityDrive,
        top__HighwayDrive,
        top__NormalDrive,
        top__Config,
        top__NormalStop,
        top__CityDrive__Drive,
        top__CityDrive__Stop,
        top__CityDrive__boundary,
        top__HighwayDrive__DriveHighway,
        top__HighwayDrive__ExitHighway,
        top__HighwayDrive__boundary,
        SPECIAL_INTERNAL_STATE_UNVISITED
    };
    const char * stateNames[12];
    State currentState;
    State history[2];
    void save_history( State compositeState, State subState );
    bool check_history( State compositeState, State subState );
    void entryaction_____UnityGateway__CarController__CarController__Region1__Config__loadConfig( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForDrive__driveInCity( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForStop__stop( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__CarController__CarController__Region1__OK__setGoals( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__CarController__CarController__Region1__checkconfig__loadContext( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__CarController__CarController__Region1__init__intial( const UMLRTMessage * msg );
    void transitionaction_____UnityGateway__CarController__CarController__Region1__nextMove__driveInCity( const UMLRTMessage * msg );
    bool guard_____UnityGateway__CarController__CarController__Region1__OK__checkconfig( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForDrive( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForStop( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__CarController__CarController__Region1__HighwayDrive__Region1__Transition2( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__CarController__CarController__Region1__NOk( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__CarController__CarController__Region1__OK( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__CarController__CarController__Region1__checkconfig( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__CarController__CarController__Region1__init( const UMLRTMessage * msg );
    void actionchain_____action_____UnityGateway__CarController__CarController__Region1__nextMove( const UMLRTMessage * msg );
    void actionchain_____top__CityDrive__new_transition_4( const UMLRTMessage * msg );
    void actionchain_____top__CityDrive__new_transition_5( const UMLRTMessage * msg );
    void actionchain_____top__CityDrive__new_transition_6( const UMLRTMessage * msg );
    State junction_____top__CityDrive__init3( const UMLRTMessage * msg );
    State junction_____top__HighwayDrive__JunctionPoint6( const UMLRTMessage * msg );
    State junction_____top__HighwayDrive__init5( const UMLRTMessage * msg );
    State choice_____top__CityDrive__deephistory( const UMLRTMessage * msg );
    State choice_____top__HighwayDrive__deephistory( const UMLRTMessage * msg );
    State choice_____top__configIsOk( const UMLRTMessage * msg );
    State state_____top__CityDrive__Drive( const UMLRTMessage * msg );
    State state_____top__CityDrive__Stop( const UMLRTMessage * msg );
    State state_____top__CityDrive__boundary( const UMLRTMessage * msg );
    State state_____top__Config( const UMLRTMessage * msg );
    State state_____top__HighwayDrive__DriveHighway( const UMLRTMessage * msg );
    State state_____top__HighwayDrive__ExitHighway( const UMLRTMessage * msg );
    State state_____top__HighwayDrive__boundary( const UMLRTMessage * msg );
    State state_____top__NormalDrive( const UMLRTMessage * msg );
    State state_____top__NormalStop( const UMLRTMessage * msg );
};
extern const UMLRTCapsuleClass CarController;

#endif

