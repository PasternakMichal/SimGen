/*
 * TCPClient.h
 *
 *  Created on: Jun 12, 2016
 *      Author: mojtaba
 */

#ifndef TCPCLIENT_H_
#define TCPCLIENT_H_
#include<iostream>
#include<string.h>
#include<string>
#include<sys/socket.h>
#include<arpa/inet.h>
#include<netdb.h>
#include<stdlib.h>
#include "TCPClient.h"
namespace Comms {
enum connectionStatus{closed,opened};
class TCPClient {
public:
	inline TCPClient(int port=8001,std::string ip="127.0.0.1")
	{
		this->socketfd=-1;
		this->port=port;
		this->serverAddress=ip;
		status=closed;
	}
	inline virtual ~TCPClient()
	{
		if (this->status==opened)
		{
			close(this->socketfd);
		}

	}
	int conn();
	int sendData(std::string data);
	int receive(int len, char * buffer);
	void closeConn();
	int getPort() const ;

	void setPort(int port);

	const std::string& getServerAddress() ;

	void setServerAddress(const std::string& serverAddress) ;

	connectionStatus getStatus() const ;

	void setStatus(connectionStatus status);

	int  checkConnectionStatus(); // check if the connection is dropper or no

private:

	int socketfd;
	std::string serverAddress;
	int port;
	struct sockaddr_in serv_addr;
	//struct hostent *server;
	connectionStatus status;

};


/////
inline int  TCPClient::checkConnectionStatus() // check if the connection is dropper or no
{
  int result=-1;
  struct sockaddr_in  addr;
  socklen_t len=sizeof(addr);
  result=getpeername(this->socketfd,(sockaddr *)& addr,&len);
  if (result==-1)
  {
	  perror("Get name failed, it seems that connection is dropped, close and con again\n");
	  this->setStatus(closed);
  }

  return result;
}
/////
inline void TCPClient::closeConn() // close the connection, after close we can connect again, of the connection fail establishment
                            // the connection need to be closed first.
{
	if (socketfd!=-1)
	{
		close(socketfd);
		this->socketfd=-1;
		this->setStatus(closed);

	}
}



inline int TCPClient::conn(){ // return 0 if the conenction is sucessfull, otherwise -1 and print the error message
	int result=-1;
	if (this->socketfd==-1)
		socketfd = socket(AF_INET, SOCK_STREAM, 0);
	if (socketfd < 0) {
	      perror("ERROR opening socket");
	      return result;
	   }
	struct hostent *server;
	server = gethostbyname(serverAddress.c_str());
	if (server == NULL) {
			perror("ERROR, no such host\n");
			return result;
		}
	bzero((char *) &serv_addr, sizeof(serv_addr));
	serv_addr.sin_family = AF_INET;
	bcopy((char *)server->h_addr,(char *)&serv_addr.sin_addr.s_addr,server->h_length);
	serv_addr.sin_port = htons(this->port);
	//free(server);
	if (connect(this->socketfd,(struct sockaddr *) &serv_addr,sizeof(serv_addr)) < 0)
	{
		perror("ERROR connecting");
	    return -1;
	}
	this->setStatus(opened);
	return 0; // means connection is successful
}

inline int TCPClient::sendData(std::string data) // send string data, append  the "\0" to end of string for parsing purpose.
{
	int result=-1;
	//if (this->checkConnectionStatus()!=-1)
	if (this->getStatus()==opened)
	{
	result = write(this->socketfd,data.c_str(),data.length()+1);
	if (result < 0)
		{
		perror("ERROR writing to socket");
		this->setStatus(closed);
		}
	}
	return result;
}

inline int TCPClient::receive(int len, char * buffer)
{
	//buffer= new char[len];
	int result  = read(this->socketfd,buffer,len);
	if (result < 0)
	{
	    perror("ERROR reading from socket");
	}
	//std::cout<<"message come from server\n";
	return result;

}

inline int TCPClient::getPort() const {
	return this->port;
}

inline void TCPClient::setPort(int port) {
	this->port = port;
}

inline const std::string& TCPClient::getServerAddress()  {
	return serverAddress;
}

inline void TCPClient::setServerAddress(const std::string& serverAddress) {
	this->serverAddress = serverAddress;
}

inline connectionStatus TCPClient::getStatus() const {
	return status;
}

inline void TCPClient::setStatus(connectionStatus status) {
	this->status = status;
}

} /* namespace Comms */

#endif /* TCPCLIENT_H_ */
