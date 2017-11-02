using System.Collections;
using System.Collections.Generic;
using UnityEngine;
   		
public class planeScript : PlaneMetaObject {
   			
   	public string channelID;
   	public sateliteCameraScript cam;
   		
   	 
	public string translate(string name){
   	} 
   	
   	void focus(){
   		cam.observedObject = gameObject;
   	}
}


