/*
 * UnityCommand.h
 *
 *  Created on: Jul 31, 2016
 *      Author: mojtaba
 */

#ifndef UNITYCOMMAND_H_
#define UNITYCOMMAND_H_




namespace Unity {
enum actionType{increase,decrease,none};
class UnityCommand {
public:
	UnityCommand(){};
	virtual ~UnityCommand(){};
	virtual std::string generateUnityCommand(){return "";};
	//virtual std::string getCommandStr(){};

};

} /* namespace Unity */

#endif /* UNITYCOMMAND_H_ */
