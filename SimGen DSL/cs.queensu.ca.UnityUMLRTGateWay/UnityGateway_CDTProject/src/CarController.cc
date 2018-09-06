
#include "CarController.hh"

#include "UnityGatewayP.hh"
#include "umlrtcommsportrole.hh"
#include "umlrtmessage.hh"
#include "umlrtslot.hh"
#include <cstddef>
#include "umlrtcapsuleclass.hh"
#include "umlrtframeservice.hh"
class UMLRTRtsInterface;
struct UMLRTCommsPort;

#include <iostream>
#include <unistd.h>

Capsule_CarController::Capsule_CarController( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat )
: UMLRTCapsule( NULL, cd, st, border, internal, isStat )
, Timer1( borderPorts[borderport_Timer1] )
, unityGatewayComm( borderPorts[borderport_unityGatewayComm] )
, currentState( SPECIAL_INTERNAL_STATE_UNVISITED )
{
    stateNames[top__CityDrive] = "top__CityDrive";
    stateNames[top__HighwayDrive] = "top__HighwayDrive";
    stateNames[top__NormalDrive] = "top__NormalDrive";
    stateNames[top__Config] = "top__Config";
    stateNames[top__NormalStop] = "top__NormalStop";
    stateNames[top__CityDrive__Drive] = "top__CityDrive__Drive";
    stateNames[top__CityDrive__Stop] = "top__CityDrive__Stop";
    stateNames[top__CityDrive__boundary] = "top__CityDrive__boundary";
    stateNames[top__HighwayDrive__DriveHighway] = "top__HighwayDrive__DriveHighway";
    stateNames[top__HighwayDrive__ExitHighway] = "top__HighwayDrive__ExitHighway";
    stateNames[top__HighwayDrive__boundary] = "top__HighwayDrive__boundary";
    stateNames[SPECIAL_INTERNAL_STATE_UNVISITED] = "<uninitialized>";
    int i = 0;
    while( i < 2 )
        history[i++] = SPECIAL_INTERNAL_STATE_UNVISITED;
}






void Capsule_CarController::bindPort( bool isBorder, int portId, int index )
{
    if( isBorder )
        switch( portId )
        {
        case borderport_Timer1:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_Timer1, index, true );
            break;
        }
}

void Capsule_CarController::unbindPort( bool isBorder, int portId, int index )
{
    if( isBorder )
        switch( portId )
        {
        case borderport_Timer1:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_Timer1, index, false );
            UMLRTFrameService::disconnectPort( borderPorts[borderport_Timer1], index );
            break;
        }
}





void Capsule_CarController::driveInCity()
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_9ypPUFeuEearHKEzCEQGQw */
    // generated code ends
    double distanceStartTostop=100;
    double distance=context.getEndPointX()-context.getPositionX();
    std::cout<<"Distance to goal is : "<<distance<<"\n";
    std::cout<<"postion X is:"<<context.getPositionX()<<"\n";
    if (
    (distance > distanceStartTostop ) &
    (context.getSpeed()<=atoi(config.getConfig("maxSpeed").c_str()))
    )
    command.setGas(command.getGas()+1);
    else if (
    (distance <= distanceStartTostop ) &
    (context.getSpeed()>=atoi(config.getConfig("minSpeed").c_str()))
    )
    command.setGas(command.getGas()-1);
    //// manage the steer
    std::cout<<"postion Z is:"<<context.getPositionZ()<<"\n";
    if (context.getPositionZ() < context.getEndPointZ())
    command.setSteer(-1);
    else if (context.getPositionZ() > context.getEndPointZ())
    command.setSteer(+1);
    ///////  manage to stop
    if ( distance < distanceStartTostop)
    {
    command.setGas(command.getGas()-5);
    command.setBrake(command.getBrake()+5);
    }
    if ( distance <= 20)
    {
    command.setBrake(100);
    command.setGas(0);
    }
    ///////
    std::string tmpCmd=context.getName()+command.generateUnitySetCommand();
    strcpy(cmd,tmpCmd.c_str());
    std::cout<<cmd<<"\n";
    unityGatewayComm.Request(cmd).send();
    //unityGatewayComm.Request("gas+").send();
    //command.generateUnitySetCommand();
}

void Capsule_CarController::stopCar()
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_pfAhkFevEearHKEzCEQGQw */
    // generated code ends
    //write the stop car function
}


void Capsule_CarController::inject( const UMLRTMessage & message )
{
    msg = &message;
    switch( currentState )
    {
    case top__Config:
        currentState = state_____top__Config( &message );
        break;
    case top__NormalDrive:
        currentState = state_____top__NormalDrive( &message );
        break;
    case top__NormalStop:
        currentState = state_____top__NormalStop( &message );
        break;
    case top__CityDrive__Drive:
        currentState = state_____top__CityDrive__Drive( &message );
        break;
    case top__CityDrive__Stop:
        currentState = state_____top__CityDrive__Stop( &message );
        break;
    case top__CityDrive__boundary:
        currentState = state_____top__CityDrive__boundary( &message );
        break;
    case top__HighwayDrive__DriveHighway:
        currentState = state_____top__HighwayDrive__DriveHighway( &message );
        break;
    case top__HighwayDrive__ExitHighway:
        currentState = state_____top__HighwayDrive__ExitHighway( &message );
        break;
    case top__HighwayDrive__boundary:
        currentState = state_____top__HighwayDrive__boundary( &message );
        break;
    default:
        break;
    }
}

void Capsule_CarController::initialize( const UMLRTMessage & message )
{
    msg = &message;
    actionchain_____action_____UnityGateway__CarController__CarController__Region1__init( &message );
    currentState = top__Config;
}

const char * Capsule_CarController::getCurrentStateString() const
{
    return stateNames[currentState];
}





void Capsule_CarController::save_history( Capsule_CarController::State compositeState, Capsule_CarController::State subState )
{
    history[compositeState] = subState;
}

bool Capsule_CarController::check_history( Capsule_CarController::State compositeState, Capsule_CarController::State subState )
{
    return history[compositeState] == subState;
}

void Capsule_CarController::entryaction_____UnityGateway__CarController__CarController__Region1__Config__loadConfig( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_DdQ7sFeiEearHKEzCEQGQw */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    std::cout<<"CarController: Entering Config state\n";
    config.loadConfig();
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_CarController::transitionaction_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForDrive__driveInCity( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_GuXNIFevEearHKEzCEQGQw */
    #define umlrtparam_contextData ( *(const char * *)msg->getParam( 0 ) )
    #define rtdata ( (const char * *)msg->getParam( 0 ) )
    // generated code ends
    driveInCity();
    // the following code has been generated
    #undef rtdata
    #undef umlrtparam_contextData
    // generated code ends
}

void Capsule_CarController::transitionaction_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForStop__stop( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_t7yO4FevEearHKEzCEQGQw */
    #define umlrtparam_contextData ( *(const char * *)msg->getParam( 0 ) )
    #define rtdata ( (const char * *)msg->getParam( 0 ) )
    // generated code ends
    stopCar();
    // the following code has been generated
    #undef rtdata
    #undef umlrtparam_contextData
    // generated code ends
}

void Capsule_CarController::transitionaction_____UnityGateway__CarController__CarController__Region1__OK__setGoals( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_NQlt8FgFEearHKEzCEQGQw */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    std::cout<<"CarController: Config is ok, going to drive state\n";
    std::cout<<"CarController: Config is ok, going to drive state\n";
    context.setEndPointX(atof(config.getConfig("endpointX").c_str()));
    context.setEndPointZ(atof(config.getConfig("endpointZ").c_str()));
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_CarController::transitionaction_____UnityGateway__CarController__CarController__Region1__checkconfig__loadContext( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_6eYi4FemEearHKEzCEQGQw */
    #define umlrtparam_contextData ( *(const char * *)msg->getParam( 0 ) )
    #define rtdata ( (const char * *)msg->getParam( 0 ) )
    // generated code ends
    std::cout<<"CarController: Got context message, Leaving the config state\n";
    std::cout<<"CarController: Context data is : "<<umlrtparam_contextData<<"\n";
    context.pasrseContext(std::string(umlrtparam_contextData));
    // the following code has been generated
    #undef rtdata
    #undef umlrtparam_contextData
    // generated code ends
}

void Capsule_CarController::transitionaction_____UnityGateway__CarController__CarController__Region1__init__intial( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_ZZT9uk_KEeaAu87Fs2V0IA */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    // instantiate the configutility class 
    std::cout<<"Controller is Starting\n";
    config.setCommentStr("#");
    config.setFieldSeperaor("=");
    config.setConfigFileName("controller.config");
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_CarController::transitionaction_____UnityGateway__CarController__CarController__Region1__nextMove__driveInCity( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_P0gcYFgqEeaVFuc_XL9xNA */
    #define umlrtparam_contextData ( *(const char * *)msg->getParam( 0 ) )
    #define rtdata ( (const char * *)msg->getParam( 0 ) )
    // generated code ends
    context.pasrseContext(std::string(umlrtparam_contextData));
    driveInCity();
    // the following code has been generated
    #undef rtdata
    #undef umlrtparam_contextData
    // generated code ends
}

bool Capsule_CarController::guard_____UnityGateway__CarController__CarController__Region1__OK__checkconfig( const UMLRTMessage * msg )
{
    #define umlrtparam_contextData ( *(const char * *)msg->getParam( 0 ) )
    #define rtdata ( (const char * *)msg->getParam( 0 ) )
    // generated code ends
    return checkConfig();
    // the following code has been generated
    #undef rtdata
    #undef umlrtparam_contextData
    // generated code ends
}

void Capsule_CarController::actionchain_____action_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForDrive( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForDrive__driveInCity( msg );
}

void Capsule_CarController::actionchain_____action_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForStop( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForStop__stop( msg );
}

void Capsule_CarController::actionchain_____action_____UnityGateway__CarController__CarController__Region1__HighwayDrive__Region1__Transition2( const UMLRTMessage * msg )
{
    save_history( top__HighwayDrive, top__HighwayDrive__ExitHighway );
}

void Capsule_CarController::actionchain_____action_____UnityGateway__CarController__CarController__Region1__NOk( const UMLRTMessage * msg )
{
    entryaction_____UnityGateway__CarController__CarController__Region1__Config__loadConfig( msg );
}

void Capsule_CarController::actionchain_____action_____UnityGateway__CarController__CarController__Region1__OK( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__CarController__CarController__Region1__OK__setGoals( msg );
}

void Capsule_CarController::actionchain_____action_____UnityGateway__CarController__CarController__Region1__checkconfig( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__CarController__CarController__Region1__checkconfig__loadContext( msg );
}

void Capsule_CarController::actionchain_____action_____UnityGateway__CarController__CarController__Region1__init( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__CarController__CarController__Region1__init__intial( msg );
    entryaction_____UnityGateway__CarController__CarController__Region1__Config__loadConfig( msg );
}

void Capsule_CarController::actionchain_____action_____UnityGateway__CarController__CarController__Region1__nextMove( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__CarController__CarController__Region1__nextMove__driveInCity( msg );
}

void Capsule_CarController::actionchain_____top__CityDrive__new_transition_4( const UMLRTMessage * msg )
{
    save_history( top__CityDrive, top__CityDrive__Drive );
}

void Capsule_CarController::actionchain_____top__CityDrive__new_transition_5( const UMLRTMessage * msg )
{
    save_history( top__CityDrive, top__CityDrive__Stop );
}

void Capsule_CarController::actionchain_____top__CityDrive__new_transition_6( const UMLRTMessage * msg )
{
    save_history( top__CityDrive, top__CityDrive__boundary );
}

Capsule_CarController::State Capsule_CarController::junction_____top__CityDrive__init3( const UMLRTMessage * msg )
{
    return choice_____top__HighwayDrive__deephistory( msg );
}

Capsule_CarController::State Capsule_CarController::junction_____top__HighwayDrive__JunctionPoint6( const UMLRTMessage * msg )
{
    return top__HighwayDrive__DriveHighway;
}

Capsule_CarController::State Capsule_CarController::junction_____top__HighwayDrive__init5( const UMLRTMessage * msg )
{
    return choice_____top__CityDrive__deephistory( msg );
}

Capsule_CarController::State Capsule_CarController::choice_____top__CityDrive__deephistory( const UMLRTMessage * msg )
{
    if( check_history( top__CityDrive, top__CityDrive__Drive ) )
        return top__CityDrive__Drive;
    else if( check_history( top__CityDrive, top__CityDrive__Stop ) )
        return top__CityDrive__Stop;
    else if( check_history( top__CityDrive, SPECIAL_INTERNAL_STATE_UNVISITED ) )
        return top__CityDrive__boundary;
    return currentState;
}

Capsule_CarController::State Capsule_CarController::choice_____top__HighwayDrive__deephistory( const UMLRTMessage * msg )
{
    if( check_history( top__HighwayDrive, top__HighwayDrive__DriveHighway ) )
        return top__HighwayDrive__DriveHighway;
    else if( check_history( top__HighwayDrive, top__HighwayDrive__ExitHighway ) )
        return top__HighwayDrive__ExitHighway;
    else if( check_history( top__HighwayDrive, SPECIAL_INTERNAL_STATE_UNVISITED ) )
        return top__HighwayDrive__boundary;
    return currentState;
}

Capsule_CarController::State Capsule_CarController::choice_____top__configIsOk( const UMLRTMessage * msg )
{
    if( guard_____UnityGateway__CarController__CarController__Region1__OK__checkconfig( msg ) )
    {
        actionchain_____action_____UnityGateway__CarController__CarController__Region1__OK( msg );
        return top__NormalDrive;
    }
    else
    {
        actionchain_____action_____UnityGateway__CarController__CarController__Region1__NOk( msg );
        return top__Config;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__CityDrive__Drive( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_unityGatewayComm:
        switch( msg->getSignalId() )
        {
        case UnityGatewayP::signal_context:
            actionchain_____action_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForDrive( msg );
            return top__CityDrive__Drive;
        default:
            this->unexpectedMessage();
            break;
        }
        return currentState;
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__CityDrive__Stop( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_unityGatewayComm:
        switch( msg->getSignalId() )
        {
        case UnityGatewayP::signal_context:
            actionchain_____action_____UnityGateway__CarController__CarController__Region1__CityDrive__Region1__contextForStop( msg );
            return top__CityDrive__Stop;
        default:
            this->unexpectedMessage();
            break;
        }
        return currentState;
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__CityDrive__boundary( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__Config( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_unityGatewayComm:
        switch( msg->getSignalId() )
        {
        case UnityGatewayP::signal_context:
            actionchain_____action_____UnityGateway__CarController__CarController__Region1__checkconfig( msg );
            return choice_____top__configIsOk( msg );
        default:
            this->unexpectedMessage();
            break;
        }
        return currentState;
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__HighwayDrive__DriveHighway( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__HighwayDrive__ExitHighway( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__HighwayDrive__boundary( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__NormalDrive( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_unityGatewayComm:
        switch( msg->getSignalId() )
        {
        case UnityGatewayP::signal_context:
            actionchain_____action_____UnityGateway__CarController__CarController__Region1__nextMove( msg );
            return top__NormalDrive;
        default:
            this->unexpectedMessage();
            break;
        }
        return currentState;
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_CarController::State Capsule_CarController::state_____top__NormalStop( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}


static const UMLRTCommsPortRole portroles_border[] = 
{
    {
        Capsule_CarController::port_Timer1,
        "Timing",
        "Timer1",
        "",
        1,
        true,
        false,
        false,
        false,
        false,
        false,
        true
    },
    {
        Capsule_CarController::port_unityGatewayComm,
        "UnityGatewayP",
        "unityGatewayComm",
        "",
        1,
        true,
        true,
        false,
        false,
        true,
        false,
        false
    }
};

static void instantiate_CarController( const UMLRTRtsInterface * rts, UMLRTSlot * slot, const UMLRTCommsPort * * borderPorts )
{
    slot->capsule = new Capsule_CarController( &CarController, slot, borderPorts, NULL, false );
}

const UMLRTCapsuleClass CarController = 
{
    "CarController",
    NULL,
    instantiate_CarController,
    0,
    NULL,
    2,
    portroles_border,
    0,
    NULL
};

