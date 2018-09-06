//============================================================================
// Name        : ObserverLibs.cpp
// Author      : Mojtaba
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include "Config.h"
#include "TCPClient.h"
#include "UnityObject.h"
#include "MobileContext.h"
#include "UnityCarCommand.h"

using namespace Unity;

int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	ConfigUtil::Config config=ConfigUtil::Config();
	config.loadConfig();
	std::cout<<config.getConfig("ip");
	std::cout<<config;
	char * s="test";
	std::string s1=std::string(s);
	cout<<s1<<"\n";
	UnityCarCommand command;
	command.setBrake(10);
	command.setGas(10);
	command.setSteer(11);
	command.setReverse(false);
	std::cout<<command.generateUnitySetCommand()<<"\n";
	command.setCommand(11, 11, 101, false);
	std::cout<<command.generateUnitySetCommand()<<"\n";
	command.setCommand(11, 11, 100, false);
	std::cout<<command.generateUnitySetCommand()<<"\n";
	command.relativeChangeCommand(90, 90, 100, false);
	std::cout<<command.generateUnitySetCommand()<<"\n";
	command.relativeChangeCommand(1, 1, 0, false);
	std::cout<<command.generateUnitySetCommand()<<"\n";
	std::string commandStr="brz"+command.generateUnitySetCommand();
	std::cout<<commandStr;
	////
    /*Comms::TCPClient  client(8888);
    client.conn();
    cout<<client.checkConnectionStatus()<<"\n";
    //client.sendData("endpoint");
    //char buffer1[256];
    //int len=client.receive(256, buffer1);
    //buffer1[len]='\0';
    //cout<<buffer1<<"\n";
    //client.sendData("context");
    char buffer[256];
    //len=client.receive(256, buffer);
    //buffer[len]='\0';
    //cout<<buffer<<"\n";
    MobileContext context;
    //context.pasrseContext(string(buffer));
    ///
    /*int len;
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    client.sendData("gas+");
    client.sendData("gas+");
    client.sendData("gas+");
    client.sendData("steer+");
    //client.sendData("steer+");
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    sleep(1);
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    sleep(1);
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    sleep(1);
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    sleep(10);
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    sleep(60);
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    client.sendData("steer-");
    sleep(30);
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    client.sendData("steer-");
    sleep(30);
    client.sendData("context");
    len=client.receive(256, buffer);
    buffer[len]='\0';
    context.pasrseContext(string(buffer));
    std::cout<<context;
    client.closeConn();*/
	return 0;
}
