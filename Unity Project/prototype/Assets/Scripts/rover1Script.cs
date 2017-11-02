using System.Collections;
using System.Collections.Generic;
using UnityEngine;
   		
public class rover1Script : RoverMetaObject {
   			
   	public string channelID;
   	public sateliteCameraScript cam;
   	public void test1(){
   		speed = 5;
   	}
   		
   	 
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
else return "";
   	} 
   	
   	void focus(){
   		cam.observedObject = gameObject;
   	}
}


