//============================================================================
// Name        : SharedMemory.cpp
// Author      : Mojtaba B.
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

#include "src/SharedMem.h"

using namespace ObserverComm;




//Define an STL compatible allocator of ints that allocates from the managed_shared_memory.
//This allocator will allow placing containers in the segment




//Main function. For parent process argc == 1, for child process argc == 2
int main(int argc, char *argv[])
{

	std::string tempStr;
	SharedMem ObserversharedMem;

	std::cout<<"Client is starting\n";
	ObserversharedMem.setUp(client);
	std::cout<<"Share memory setup is done\n";
	while (true)
	//ObserversharedMem.safePushFrontString("test");
	{
		tempStr=ObserversharedMem.safePopFrontString();
		if (tempStr!="")
			std::cout<<tempStr<<"  \n";

	}
	return 0;
};

