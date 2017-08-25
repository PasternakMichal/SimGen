
#include "UnityGatewayP.hh"

#include "umlrtobjectclass.hh"
#include "umlrtoutsignal.hh"
struct UMLRTCommsPort;

static UMLRTObject_field fields_Request[] = 
{
    {
        "command",
        UMLRTType_ptr,
        0,
        1,
        0
    }
};

static UMLRTObject payload_Request = 
{
    sizeof( char * ),
    1,
    fields_Request
};

static UMLRTObject_field fields_context[] = 
{
    {
        "contextData",
        UMLRTType_ptr,
        0,
        1,
        0
    }
};

static UMLRTObject payload_context = 
{
    sizeof( char * ),
    1,
    fields_context
};

UnityGatewayP::Base::Base( const UMLRTCommsPort * & srcPort )
: UMLRTProtocol( srcPort )
{
}

UMLRTOutSignal UnityGatewayP::Base::context( char * contextData ) const
{
    UMLRTOutSignal signal;
    signal.initialize( "context", signal_context, srcPort, &payload_context, &contextData );
    return signal;
}

UnityGatewayP::Conj::Conj( const UMLRTCommsPort * & srcPort )
: UMLRTProtocol( srcPort )
{
}

UMLRTOutSignal UnityGatewayP::Conj::Request( char * command ) const
{
    UMLRTOutSignal signal;
    signal.initialize( "Request", signal_Request, srcPort, &payload_Request, &command );
    return signal;
}


