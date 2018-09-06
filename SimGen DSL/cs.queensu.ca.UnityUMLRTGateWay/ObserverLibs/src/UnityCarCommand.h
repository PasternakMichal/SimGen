/*
 * UnityCardCommand.h
 *
 *  Created on: Jul 31, 2016
 *      Author: mojtaba
 */

#ifndef UNITYCARCOMMAND_H_
#define UNITYCARCOMMAND_H_

#include "UnityCommand.h"
/*
 * 	brz = name of car being controlled
		speed = speed in km/h
		gas% = 0 to 100 percentage of gas Input
		steer% = -100 to 100 percentage left/right of straight
		brake% = 0 to 100 percentage of brake Input
		reverse = 0 or 1; 0 is forwards, 1 is backwards
		obstacle = 0 or 1; 0 is no obstacle 1 is obstacle detected; <- not yet implemented
		faceangle = 0 to 359; compass degrees from North
		x = global x position of car;
		z = global z position of car;
*/

namespace Unity {

class UnityCarCommand: public UnityCommand {
public:
	UnityCarCommand();
	inline virtual ~UnityCarCommand(){};
	/*std::string genGasCommand(actionType action);
	std::string genSteerCommand(actionType action);
	std::string genSpeedCommand(actionType action);
	std::string genBrakeCommand(actionType action);
	std::string genReverseCommand(actionType action); */
	bool setCommand(int gas, int steer,int brake,bool reverse);
	bool relativeChangeCommand(int gasChange, int steerChange,int brakeChange,bool reverse); // chnage the commands beased
	std::string generateUnitySetCommand();
	int getBrake() const;
	bool setBrake(int brake);
	int getGas() const;
	bool setGas(int gas);
	bool isReverse() const;
	void setReverse(bool reverse);
	int getSteer() const;
	bool setSteer(int steer);

	//on current value, set negative to decease , set postive to increase
private:
	int gas;
	int steer;
	int brake;
	bool reverse;


};

} /* namespace Unity */

inline Unity::UnityCarCommand::UnityCarCommand() {
	gas=0;
	steer=0;
	brake=0;
	reverse=false;
}

/*inline std::string Unity::UnityCarCommand::genGasCommand(actionType action) {
}

inline std::string Unity::UnityCarCommand::genSteerCommand(actionType action) {
}

inline std::string Unity::UnityCarCommand::genSpeedCommand(actionType action) {
}

inline std::string Unity::UnityCarCommand::genBrakeCommand(actionType action) {
}

inline std::string Unity::UnityCarCommand::genReverseCommand(
		actionType action) {
}
*/
inline bool Unity::UnityCarCommand::setCommand(int gas, int steer,
		int brake, bool reverse)
{

	if (brake<=100 and brake>=0 and gas<=100 and gas>=0 and steer>=-100 and steer<=100)
	{
		setGas(gas);
		setBrake(brake);
		setSteer(steer);
		setReverse(reverse);
		return true;
	}
	else
		return true;

}

inline bool Unity::UnityCarCommand::relativeChangeCommand(
		int gasChange, int steerChange, int brakeChange, bool reverse)
{
	int newBrake=brakeChange+this->getBrake();
	int newGas=gasChange+this->getGas();
	int newSteer=steerChange+ this->getSteer();
	if (newBrake<=100 and newBrake>=0 and newGas<=100 and newGas>=0 and newSteer>=-100 and newSteer<=100)
		{
			setGas(newGas);
			setBrake(newBrake);
			setSteer(newSteer);
			setReverse(reverse);
			return true;
		}
	else
			return true;

}

inline int Unity::UnityCarCommand::getBrake() const {
	return brake;
}

inline bool Unity::UnityCarCommand::setBrake(int brake) {
	if (brake<=100 and brake>=0)
	{
		this->brake = brake;
		return true;
	}
	else
		return false;
}

inline int Unity::UnityCarCommand::getGas() const {
	return gas;
}

inline bool Unity::UnityCarCommand::setGas(int gas) {
	if ( gas<=100 and gas>=0 )
	{
		this->gas = gas;
		return true;
	}
	else
		return false;
}

inline bool Unity::UnityCarCommand::isReverse() const {
	return reverse;
}

inline void Unity::UnityCarCommand::setReverse(bool reverse) {
	this->reverse = reverse;
}

inline int Unity::UnityCarCommand::getSteer() const {
	return steer;
}

inline std::string Unity::UnityCarCommand::generateUnitySetCommand() {
	std::stringstream ss;
	ss<<":"<<"set"<<":"<<this->getGas()<<":"<<this->getSteer()<<":"<<this->getBrake()<<":";
	if (this->reverse)
		ss<<"1";
	else
		ss<<"0";
	return ss.str();
}

inline bool Unity::UnityCarCommand::setSteer(int steer) {
	if (steer>=-100 and steer<=100)
	{
		this->steer = steer;
		return true;
	}
	else
		return false;
}

#endif /* UNITYCARCOMMAND_H_ */
