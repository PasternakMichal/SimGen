
#ifndef UNITYGATEWAYP_HH
#define UNITYGATEWAYP_HH

#include "umlrtoutsignal.hh"
#include "umlrtprotocol.hh"
#include "umlrtsignal.hh"
struct UMLRTCommsPort;

namespace UnityGatewayP
{
    class Base : public UMLRTProtocol
    {
    public:
        Base( const UMLRTCommsPort * & srcPort );
        UMLRTOutSignal context( char * contextData ) const;
    };
    class Conj : public UMLRTProtocol
    {
    public:
        Conj( const UMLRTCommsPort * & srcPort );
        UMLRTOutSignal Request( char * command ) const;
    };
    enum SignalId
    {
        signal_Request = UMLRTSignal::FIRST_PROTOCOL_SIGNAL_ID,
        signal_context
    };
};

#endif

