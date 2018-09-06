/*
 * Context.h
 *
 *  Created on: Jul 26, 2016
 *      Author: mojtaba
 */

#ifndef CONTEXT_H_
#define CONTEXT_H_

namespace Unity {

class Context {
public:
	Context();
	virtual ~Context();
	long getEnvId() const;

	const std::string& getEnvName() const;

	const std::string& getName() const;


protected:
	std::string name;
	std::string envName;
	long envID;
	void setEnvId(long envId);
	void setEnvName(const std::string& envName);
	void setName(const std::string& name);
};

} /* namespace Unity */

inline long Unity::Context::getEnvId() const {
	return envID;
}

inline void Unity::Context::setEnvId(long envId) {
	envID = envId;
}

inline const std::string& Unity::Context::getEnvName() const {
	return envName;
}

inline void Unity::Context::setEnvName(const std::string& envName) {
	this->envName = envName;
}

inline const std::string& Unity::Context::getName() const {
	return name;
}

inline Unity::Context::Context() {
	name="";
	envID=0;

}

inline Unity::Context::~Context() {
}

inline void Unity::Context::setName(const std::string& name) {
	this->name = name;
}

#endif /* CONTEXT_H_ */
