/*
 * MobileContext.h
 *
 *  Created on: Jul 26, 2016
 *      Author: mojtaba
 */

#ifndef MOBILECONTEXT_H_
#define MOBILECONTEXT_H_
#include <sstream>
#include <string>
#include <vector>

#include "Context.h"

namespace Unity {

class MobileContext: public Context {
public:
	MobileContext();
	virtual ~MobileContext();
	bool pasrseContext(std::string);
	double getPositionX() const;

	int getBrake() const;

	double getFaceAngle() const;

	int getGas() const;

	bool isObstcle() const;

	double getPositionY() const;

	double getPositionZ() const;

	bool isReverse() const;

	int getSpeed() const;

	int getSteer() const;

	friend std::ostream & operator << (std::ostream &, const MobileContext  context);
	double getEndPointX() const;
	void setEndPointX(double endPointX);
	double getEndPointZ() const;
	void setEndPointZ(double endPointZ);

private:
	double positionX, positionY,positionZ,faceAngle;
	int gas,steer,brake,speed;
	bool obstcle,reverse;
	double endPointX,endPointZ;
	void setPositionX(double positionX = 0);
	void setBrake(int brake = 0);
	void setFaceAngle(double faceAngle = 0);
	void setGas(int gas = 0);
	void setObstcle(bool obstcle = false);
	void setPositionY(double positionY = 0);
	void setPositionZ(double positionZ = 0);
	void setReverse(bool reverse = false);
	void setSpeed(int speed = 0);
	void setSteer(int sterr = 0);



};

inline std::ostream & operator << (std::ostream & os,  const Unity::MobileContext  context )
{
	/*
		brz = name of car being controlled
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
	os<<"The Context data are:\n";
    os<< "Object Name is:"<<context.getName()<<"\n";
    os<< "Speed is :"<<context.getSpeed()<<"\n";
    os<< "gas is :"<<context.getGas()<<"\n";
    os<< "Steer is :"<<context.getSteer()<<"\n";
    os<< "Brake is :"<<context.getBrake()<<"\n";
    os<< "Reverse is :"<<context.isReverse()<<"\n";
    os<< "Obstacle is :"<<context.isObstcle()<<"\n";
    os<< "FaceAngle is :"<<context.getFaceAngle()<<"\n";
    os<< "Position X is :"<<context.getPositionX()<<"\n";
    os<< "Position Z is :"<<context.getPositionZ()<<"\n";

    return os;
}

} /* namespace Unity */



inline double Unity::MobileContext::getPositionX() const {
	return positionX;
}

inline void Unity::MobileContext::setPositionX(double positionX) {
	this->positionX = positionX;
}

inline int Unity::MobileContext::getBrake() const {
	return brake;
}

inline void Unity::MobileContext::setBrake(int brake ) {
	this->brake = brake;
}

inline double Unity::MobileContext::getFaceAngle() const {
	return faceAngle;
}

inline void Unity::MobileContext::setFaceAngle(double faceAngle) {
	this->faceAngle = faceAngle;
}

inline int Unity::MobileContext::getGas() const {
	return gas;
}

inline void Unity::MobileContext::setGas(int gas ) {
	this->gas = gas;
}

inline bool Unity::MobileContext::isObstcle() const {
	return obstcle;
}

inline void Unity::MobileContext::setObstcle(bool obstcle ) {
	this->obstcle = obstcle;
}

inline double Unity::MobileContext::getPositionY() const {
	return positionY;
}

inline void Unity::MobileContext::setPositionY(double positionY) {
	this->positionY = positionY;
}

inline double Unity::MobileContext::getPositionZ() const {
	return positionZ;
}

inline void Unity::MobileContext::setPositionZ(double positionZ ) {
	this->positionZ = positionZ;
}

inline bool Unity::MobileContext::isReverse() const {
	return reverse;
}

inline void Unity::MobileContext::setReverse(bool reverse ) {
	this->reverse = reverse;
}

inline int Unity::MobileContext::getSpeed() const {
	return speed;
}

inline void Unity::MobileContext::setSpeed(int speed ) {
	this->speed = speed;
}

inline int Unity::MobileContext::getSteer() const {
	return steer;
}

inline bool Unity::MobileContext::pasrseContext(std::string contextStr) {

	//tempStr=tempStr.substr(1,len-2); for removing first and last character of message
	//std::cout<<"context to Parse before substr:"<<contextStr<<"\n";
	if (contextStr.length()<=2)
		return false;

	std::stringstream ss(contextStr.substr(1,contextStr.length()-2));
	//std::cout<<"context to Parse after substr:"<<ss.str()<<"\n";
	std::vector<std::string> elems;
	std::string item;
	while (getline(ss, item, ':')) {
	        elems.push_back(item);
	    }
	/*
	brz = name of car being controlled
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

	std::cout<<"Number of element in context:"<<elems.size()<<"\n";
	if (elems.size()==10)
	{
	//std::cout<<"content of context:";
		setName(elems[0]); // read name
	//std::cout<<elems[0];
		this->setSpeed(atoi(elems[1].c_str())); // read
	//std::cout<<elems[1];
		this->setGas(atoi(elems[2].c_str()));
		this->setSteer(atoi(elems[3].c_str()));
		this->setBrake(atoi(elems[4].c_str()));
		this->setReverse(atoi(elems[5].c_str()));
		this->setObstcle(atoi(elems[6].c_str()));
		this->setFaceAngle(atof(elems[7].c_str()));
		this->setPositionX(atof(elems[8].c_str()));
		this->setPositionZ(atof(elems[9].c_str()));
		return true;
	}
	else
	{
		std::cout<<"Context Data is wrong\n ";
		return false;
	}
}

inline Unity::MobileContext::MobileContext() {
	positionX=0;
	positionY=0;
	brake=0;
	faceAngle=0;
	gas=0;
	obstcle=false;
	positionZ=0;
	reverse=false;
	speed=0;
	steer=0;
	endPointX=0;
	endPointZ=0;

}

inline Unity::MobileContext::~MobileContext() {
}

inline double Unity::MobileContext::getEndPointX() const {
	return endPointX;
}

inline void Unity::MobileContext::setEndPointX(double endPointX) {
	this->endPointX = endPointX;
}

inline double Unity::MobileContext::getEndPointZ() const {
	return endPointZ;
}

inline void Unity::MobileContext::setEndPointZ(double endPointZ) {
	this->endPointZ = endPointZ;
}

inline void Unity::MobileContext::setSteer(int steer) {
	this->steer = steer;
}

#endif /* MOBILECONTEXT_H_ */
