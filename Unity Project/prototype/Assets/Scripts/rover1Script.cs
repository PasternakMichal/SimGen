using System.Collections;
using System.Collections.Generic;
using UnityEngine;
   		
public class rover1Script : RoverMetaObject {
   			
   	public string channelID;
   	public sateliteCameraScript cam;
   	
   	// -- auto declare all "properties"
   	int myVar;
   	double speed;
   	string testing;
   	// -- End auto declare properties
   	// -- add all new actions
   	public void test1(){
   		speed = 5;
   	}
   	// -- End adding all new actions
   	// -- overide existing actions
   	 // -- End overrideActions
   	 
   	 // -- Handle incoming message
	public string translate(string name){
   	if(name == "test1"){
   		return test1();
   	 }
   	if(name == "Start"){
   		return Start();
				}
   	if(name == "testing"){
   		return testing();
				}
   	if(name == "setPos"){
   		return setPos();
				}
   	if(name == "increaseSpeed"){
   		return increaseSpeed();
				}
   	else return "";
   	return "";
   	} 
   	// -- End message handling
   	
   	void focus(){
   		cam.observedObject = gameObject;
   	}
}


