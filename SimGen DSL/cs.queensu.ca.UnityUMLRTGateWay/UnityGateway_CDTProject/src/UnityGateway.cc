
#include "UnityGateway.hh"

#include "UnityGatewayP.hh"
#include "umlrtcommsportrole.hh"
#include "umlrtmessage.hh"
#include "umlrtslot.hh"
#include "umlrttimerprotocol.hh"
#include <cstddef>
#include "umlrtcapsuleclass.hh"
#include "umlrtframeservice.hh"
class UMLRTRtsInterface;
struct UMLRTCommsPort;

Capsule_UnityGateway::Capsule_UnityGateway( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat )
: UMLRTCapsule( NULL, cd, st, border, internal, isStat )
, configTimer( borderPorts[borderport_configTimer] )
, reportContextTimer( borderPorts[borderport_reportContextTimer] )
, unityGatewayComm( borderPorts[borderport_unityGatewayComm] )
, currentState( SPECIAL_INTERNAL_STATE_UNVISITED )
{
    stateNames[top__config] = "top__config";
    stateNames[top__ControlWithTCP] = "top__ControlWithTCP";
    stateNames[top__observationWithSharedMem] = "top__observationWithSharedMem";
    stateNames[SPECIAL_INTERNAL_STATE_UNVISITED] = "<uninitialized>";
}







void Capsule_UnityGateway::bindPort( bool isBorder, int portId, int index )
{
    if( isBorder )
        switch( portId )
        {
        case borderport_configTimer:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_configTimer, index, true );
            break;
        case borderport_reportContextTimer:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_reportContextTimer, index, true );
            break;
        }
}

void Capsule_UnityGateway::unbindPort( bool isBorder, int portId, int index )
{
    if( isBorder )
        switch( portId )
        {
        case borderport_configTimer:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_configTimer, index, false );
            UMLRTFrameService::disconnectPort( borderPorts[borderport_configTimer], index );
            break;
        case borderport_reportContextTimer:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_reportContextTimer, index, false );
            UMLRTFrameService::disconnectPort( borderPorts[borderport_reportContextTimer], index );
            break;
        }
}





void Capsule_UnityGateway::inject( const UMLRTMessage & message )
{
    msg = &message;
    switch( currentState )
    {
    case top__ControlWithTCP:
        currentState = state_____top__ControlWithTCP( &message );
        break;
    case top__config:
        currentState = state_____top__config( &message );
        break;
    case top__observationWithSharedMem:
        currentState = state_____top__observationWithSharedMem( &message );
        break;
    default:
        break;
    }
}

void Capsule_UnityGateway::initialize( const UMLRTMessage & message )
{
    msg = &message;
    actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__init( &message );
    currentState = top__config;
}

const char * Capsule_UnityGateway::getCurrentStateString() const
{
    return stateNames[currentState];
}




void Capsule_UnityGateway::entryaction_____UnityGateway__UnityGateway__GateWay__Region1__ControlWithTCP__ControlStateEntry( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_zEmszE_JEeaAu87Fs2V0IA */
    #define umlrtparam_command ( *(const char * *)msg->getParam( 0 ) )
    #define rtdata ( (const char * *)msg->getParam( 0 ) )
    // generated code ends
    //std::cout<<"Etering the Control State\n";
    /*std::string tempStr=config.getConfig("contextFreguencySec");
    long timeoutSec=atol(tempStr.c_str());
    tempStr=config.getConfig("contextFreguencyNano");
    long timeoutNano=atol(tempStr.c_str());
    std::cout<<"The Timeout for the next context query is:  "<<  timeoutSec << " second  "<<timeoutNano<<" Nanosecond\n";
    reportContextTimer.informIn(UMLRTTimespec(timeoutSec,timeoutNano), 3);*/
    // the following code has been generated
    #undef rtdata
    #undef umlrtparam_command
    // generated code ends
}

void Capsule_UnityGateway::entryaction_____UnityGateway__UnityGateway__GateWay__Region1__config__initObserver( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_zEmszk_JEeaAu87Fs2V0IA */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    //init the time for config read -----
    configTimer.informAt(UMLRTTimespec(2,0),4);
    // include read config
    config.loadConfig();
    ///
    std::string tempStr =config.getConfig("ip");
    if (tempStr!="")
    clientConn.setServerAddress(tempStr);
    tempStr=config.getConfig("port");
    if (tempStr!="")
    clientConn.setPort(atoi(tempStr.c_str()));
    // configure shared memory
    tempStr=config.getConfig("areaname");
    if (tempStr!="")
    sharedMemory.setName(tempStr);
    tempStr=config.getConfig("qname");
    if (tempStr!="")
    sharedMemory.setQueueName(tempStr);
    /// Unity Config
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_UnityGateway::transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__Transition2__enterInControlstate( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_ZdyZEFhREeaVFuc_XL9xNA */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    std::cout<<"UnityGareway: Enter Control State" ;
    std::string tempStr=config.getConfig("contextFreguencySec");
    long timeoutSec=atol(tempStr.c_str());
    tempStr=config.getConfig("contextFreguencyNano");
    long timeoutNano=atol(tempStr.c_str());
    std::cout<<"The Timeout for the next context query is:  "<<  timeoutSec << " second  "<<timeoutNano<<" Nanosecond\n";
    reportContextTimer.informIn(UMLRTTimespec(timeoutSec,timeoutNano), 3);
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_UnityGateway::transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__Transition3__OpaqueBehavior( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_zEmsxE_JEeaAu87Fs2V0IA */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    clientConn.conn();
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_UnityGateway::transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__gotCommand__processForwardCommand( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_zEmssk_JEeaAu87Fs2V0IA */
    #define umlrtparam_command ( *(const char * *)msg->getParam( 0 ) )
    #define rtdata ( (const char * *)msg->getParam( 0 ) )
    // generated code ends
    // parse the message, if the foerward is instant send it right away, otherwise add it in queeue
    std::cout<<"spp message "<<umlrtparam_command<<"\n";
    if (clientConn.checkConnectionStatus()!=-1)
    clientConn.sendData(umlrtparam_command);
    else
    {
    clientConn.closeConn();
    clientConn.conn();
    }
    // the following code has been generated
    #undef rtdata
    #undef umlrtparam_command
    // generated code ends
}

void Capsule_UnityGateway::transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__init__initial( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_zEmssE_JEeaAu87Fs2V0IA */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    // instantiate the configutility class 
    std::cout<<"Gateway is Starting\n";
    config.setCommentStr("#");
    config.setFieldSeperaor("=");
    config.setConfigFileName("gateWay.config");
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_UnityGateway::transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__processAndForwardEvent__processAndForwardCommand( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_zEmsyE_JEeaAu87Fs2V0IA */
    #define umlrtparam_command ( *(const char * *)msg->getParam( 0 ) )
    #define rtdata ( (const char * *)msg->getParam( 0 ) )
    // generated code ends
    std::cout<<"Observer: new event, write to shared memory"<<"\n";
    sharedMemory.safePushBackString(std::string(umlrtparam_command));
    // the following code has been generated
    #undef rtdata
    #undef umlrtparam_command
    // generated code ends
}

void Capsule_UnityGateway::transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__reportContext__sendContextcmd( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_zEmsvk_JEeaAu87Fs2V0IA */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    std::cout<<"asking for context\n";
    if (clientConn.checkConnectionStatus()!=-1)
    {
    std::string tempStr=config.getConfig("contextCmd");	
    clientConn.sendData(tempStr.c_str());
    //char  buffer[45];
    /// i am reading one by one, since message get fragmented when the system is busy and then .....
    char singleBuf[1];
    singleBuf[0]=' ';
    int len=0;
    while (singleBuf[0]!='>')
    {
    clientConn.receive(1, singleBuf);
    buffer[len++]=singleBuf[0];
    }
    //int len=clientConn.receive(45, this->buffer);
    this->buffer[len]='\0';
    //char *  contextData=new char(len+1);
    //strcpy(contextData, buffer);
    //unityGatewayComm.context(contextData).send();
    //std::cout<<"UnityGateWay: context data is : "<<contextData<<"\n";
    unityGatewayComm.context(buffer).send();
    std::cout<<"UnityGateWay: context data is : "<<buffer<<"\n";
    //free(contextData);
    }
    else
    {
    clientConn.closeConn();
    clientConn.conn();
    }
    std::string tempStr=config.getConfig("contextFreguencySec");
    long timeoutSec=atol(tempStr.c_str());
    tempStr=config.getConfig("contextFreguencyNano");
    long timeoutNano=atol(tempStr.c_str());
    std::cout<<"The Timeout for the next context query is:  "<<  timeoutSec << " second  "<<timeoutNano<<" Nanosecond\n";
    reportContextTimer.informIn(UMLRTTimespec(timeoutSec,timeoutNano), 3);
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_UnityGateway::transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem__setupSHM( const UMLRTMessage * msg )
{
    // the following code has been generated
    /* UMLRT-CODEGEN:platform:/resource/UnityGateway/model.uml#_zEmswk_JEeaAu87Fs2V0IA */
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    // set shared memory as a server
    sharedMemory.setUp(server);
    std::cout<<"observer works with SHM"<<"\n";
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

bool Capsule_UnityGateway::guard_____UnityGateway__UnityGateway__GateWay__Region1__Transition2__checkTCPConn( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    if (clientConn.checkConnectionStatus()==-1)
    return false;
    else
    return true;
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

bool Capsule_UnityGateway::guard_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem__checkCommType( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    // generated code ends
    std::string tempStr =config.getConfig("comm");
    if (tempStr=="shm")
    return true;
    else 
    return false;
    // the following code has been generated
    #undef rtdata
    // generated code ends
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition1( const UMLRTMessage * msg )
{
    entryaction_____UnityGateway__UnityGateway__GateWay__Region1__config__initObserver( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition2( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__Transition2__enterInControlstate( msg );
    entryaction_____UnityGateway__UnityGateway__GateWay__Region1__ControlWithTCP__ControlStateEntry( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition3( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__Transition3__OpaqueBehavior( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__gotCommand( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__gotCommand__processForwardCommand( msg );
    entryaction_____UnityGateway__UnityGateway__GateWay__Region1__ControlWithTCP__ControlStateEntry( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__init( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__init__initial( msg );
    entryaction_____UnityGateway__UnityGateway__GateWay__Region1__config__initObserver( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__processAndForwardEvent( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__processAndForwardEvent__processAndForwardCommand( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__reconfigSHM( const UMLRTMessage * msg )
{
    entryaction_____UnityGateway__UnityGateway__GateWay__Region1__config__initObserver( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__reconfigTCP( const UMLRTMessage * msg )
{
    entryaction_____UnityGateway__UnityGateway__GateWay__Region1__config__initObserver( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__reportContext( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__reportContext__sendContextcmd( msg );
    entryaction_____UnityGateway__UnityGateway__GateWay__Region1__ControlWithTCP__ControlStateEntry( msg );
}

void Capsule_UnityGateway::actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem( const UMLRTMessage * msg )
{
    transitionaction_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem__setupSHM( msg );
}

Capsule_UnityGateway::State Capsule_UnityGateway::choice_____top__CommsType( const UMLRTMessage * msg )
{
    if( guard_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem__checkCommType( msg ) )
    {
        actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__setupSharedMem( msg );
        return top__observationWithSharedMem;
    }
    else
    {
        actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition3( msg );
        return choice_____top__checkTCPConn( msg );
    }
    return currentState;
}

Capsule_UnityGateway::State Capsule_UnityGateway::choice_____top__checkTCPConn( const UMLRTMessage * msg )
{
    if( guard_____UnityGateway__UnityGateway__GateWay__Region1__Transition2__checkTCPConn( msg ) )
    {
        actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition2( msg );
        return top__ControlWithTCP;
    }
    else
    {
        actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__Transition1( msg );
        return top__config;
    }
    return currentState;
}

Capsule_UnityGateway::State Capsule_UnityGateway::state_____top__ControlWithTCP( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_unityGatewayComm:
        switch( msg->getSignalId() )
        {
        case UnityGatewayP::signal_Request:
            actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__gotCommand( msg );
            return top__ControlWithTCP;
        default:
            this->unexpectedMessage();
            break;
        }
        return currentState;
    case port_reportContextTimer:
        switch( msg->getSignalId() )
        {
        case UMLRTTimerProtocol::signal_timeout:
            actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__reportContext( msg );
            return top__ControlWithTCP;
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

Capsule_UnityGateway::State Capsule_UnityGateway::state_____top__config( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_configTimer:
        switch( msg->getSignalId() )
        {
        case UMLRTTimerProtocol::signal_timeout:
            return choice_____top__CommsType( msg );
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

Capsule_UnityGateway::State Capsule_UnityGateway::state_____top__observationWithSharedMem( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_unityGatewayComm:
        switch( msg->getSignalId() )
        {
        case UnityGatewayP::signal_Request:
            actionchain_____action_____UnityGateway__UnityGateway__GateWay__Region1__processAndForwardEvent( msg );
            return top__observationWithSharedMem;
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


static const UMLRTCommsPortRole portroles_border[] = 
{
    {
        Capsule_UnityGateway::port_configTimer,
        "Timing",
        "configTimer",
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
        Capsule_UnityGateway::port_reportContextTimer,
        "Timing",
        "reportContextTimer",
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
        Capsule_UnityGateway::port_unityGatewayComm,
        "UnityGatewayP",
        "unityGatewayComm",
        "",
        1,
        true,
        false,
        false,
        false,
        false,
        true,
        false
    }
};

static void instantiate_UnityGateway( const UMLRTRtsInterface * rts, UMLRTSlot * slot, const UMLRTCommsPort * * borderPorts )
{
    slot->capsule = new Capsule_UnityGateway( &UnityGateway, slot, borderPorts, NULL, false );
}

const UMLRTCapsuleClass UnityGateway = 
{
    "UnityGateway",
    NULL,
    instantiate_UnityGateway,
    0,
    NULL,
    3,
    portroles_border,
    0,
    NULL
};

