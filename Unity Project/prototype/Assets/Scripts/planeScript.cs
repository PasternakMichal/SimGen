using System.Collections;
using System.Collections.Generic;
using UnityEngine;
   		
public class planeScript : PlaneMetaObject {
   			
   	public string channelID;
   	public sateliteCameraScript cam;
   	
   	// -- auto declare all "properties"
   	// -- End auto declare properties
   	// -- add all new actions
   	// -- End adding all new actions
   	// -- overide existing actions
   	 // -- End overrideActions
   	 
   	 // -- Handle incoming message
	public string translate(string name){
   	return "";
   	} 
   	// -- End message handling
   	
   	void focus(){
   		cam.observedObject = gameObject;
   	}
}


