/*
 * UnityObject.h
 *
 *  Created on: Jul 26, 2016
 *      Author: mojtaba
 */

#ifndef UNITYOBJECT_H_
#define UNITYOBJECT_H_

namespace Unity {
template< typename Context,typename Command, typename Constraints  >
class UnityObject {
public:
	UnityObject();
	virtual ~UnityObject();
	int t();
	
private:

	//Context context;
};


} /* namespace Unity */

template<typename Context,typename Command, typename Constraints>
inline Unity::UnityObject<Context,Command,Constraints>::UnityObject() {

}

template<typename Context,typename Command, typename Constraints>
inline Unity::UnityObject<Context,Command,Constraints>::~UnityObject() {
}




#endif /* UNITYOBJECT_H_ */
