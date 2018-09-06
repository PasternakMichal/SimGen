# set default value for TARGETOS if is it not defined
ifeq ($(TARGETOS), )
$(warning warning: TARGETOS not defined. Choosing linux)
TARGETOS=linux
endif

# set default value for BUILDTOOLS if is it not defined
ifeq ($(BUILDTOOLS), )
$(warning warning: BUILDTOOLS not defined. Choosing x86-gcc-4.6.3)
BUILDTOOLS=x86-gcc-4.6.3
endif

# Location of RTS root.
#CC_INCLUDES+=/home/mojtaba/sources/phd_coding_projects/Models/ObserverLibs/src
UMLRTS_ROOT ?= /home/mojtaba/.p2/pool/plugins/org.eclipse.papyrusrt.rts_0.7.2.201604191919/umlrts

CONFIG=$(TARGETOS).$(BUILDTOOLS)

# Destination directory for the RTS services library.
LIBDEST=$(UMLRTS_ROOT)/lib/$(CONFIG)

include $(UMLRTS_ROOT)/build/host/host.mk
include $(UMLRTS_ROOT)/build/buildtools/$(BUILDTOOLS)/buildtools.mk

LD_PATHS=$(LIBDEST)
CC_INCLUDES+=$(UMLRTS_ROOT)/include
CC_INCLUDES+=/home/mojtaba/sources/phd_coding_projects/Models/ObserverLibs/src
#UMLRTS_ROOT ?= /home/mojtaba/.p2/pool/plugins/org.eclipse.papyrusrt.rts_0.7.2.201604191919/umlrts
CC_DEFINES:=$(foreach d, $(CC_DEFINES), $(CC_DEF)$d)
CC_INCLUDES:=$(foreach i, $(CC_INCLUDES), $(CC_INC)$i)
LD_LIBS:=$(foreach i, $(LD_LIBS), $(LD_LIB)$i)
LD_PATHS:=$(foreach i, $(LD_PATHS), $(LD_LIBPATH)$i)

SRCS = TOPMain.cc UnityGatewayP.cc UnityGateway.cc CarController.cc  TOP.cc TOPControllers.cc 
OBJS = $(subst $(CC_EXT),$(OBJ_EXT),$(SRCS))

MAIN = TOPMain$(EXE_EXT)

all: $(MAIN)

$(MAIN): $(OBJS) $(UMLRTS_ROOT)/lib/$(CONFIG)/$(LIB_PRFX)rts$(LIB_EXT)
	$(LD) $(LD_FLAGS) $(OBJS) $(LD_PATHS) $(LD_LIBS) $(LD_OUT)$@

%$(OBJ_EXT) : %$(CC_EXT)
	$(CC) $< $(CC_FLAGS) $(CC_DEFINES) $(CC_INCLUDES) $(CC_OUT)$@

clean :
	@echo $(RM) main$(EXE_EXT) *$(OBJ_EXT) *$(DEP_EXT) $(DBG_FILES)
	@$(RM) main$(EXE_EXT) *$(OBJ_EXT) *$(DEP_EXT) $(DBG_FILES)

.PHONY: all clean
