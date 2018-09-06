
#include "SharedMem.hh"

#include "umlrtobjectclass.hh"
#include "umlrtobjectclassgeneric.hh"
#include <cstddef>

const UMLRTObject_field SharedMem::fields[] = 
{
};


static const UMLRTObject_class desc = 
{
    UMLRTObjectInitialize<SharedMem>,
    UMLRTObjectCopy<SharedMem>,
    UMLRTObject_decode,
    UMLRTObject_encode,
    UMLRTObjectDestroy<SharedMem>,
    UMLRTObject_fprintf,
    "SharedMem",
    NULL,
    {
        sizeof( SharedMem ),
        0,
        SharedMem::fields
    },
    UMLRTOBJECTCLASS_DEFAULT_VERSION,
    UMLRTOBJECTCLASS_DEFAULT_BACKWARDS
};

const UMLRTObject_class * const UMLRTType_SharedMem = &desc;

