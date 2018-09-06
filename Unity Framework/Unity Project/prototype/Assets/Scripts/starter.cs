using System.Collections;
using System.Collections.Generic;
using UnityEngine;
   		
public class starter : MonoBehaviour {
// ---- These must be assigned as prefabs in Unity and as "metaobjects" in the DSL
	public sateliteCameraScript Camera;
	public GameObject Generic;
	public GameObject Plane;
	public GameObject Rover;
	public GameObject Car;
	public GameObject Gem;
	
GameObject planeObject;
GameObject rover1Object;
//-----
	void Start () {
	Application.runInBackground = true;
//-- adding the necessary instances
   	planeObject = Instantiate (Plane,transform);
   	planeObject.AddComponent<planeScript>();
   	rover1Object = Instantiate (Rover,transform);
   	rover1Object.AddComponent<rover1Script>();
//adding the necessary channel information scripts	
   	gameObject.AddComponent<ChannelControllercomp1>();
	}
	

		void Update(){//
		
			if (Input.GetKeyDown(KeyCode.Alpha1)){
				Camera.observedObject = planeObject;
			}
		
			if (Input.GetKeyDown(KeyCode.Alpha2)){
				Camera.observedObject = rover1Object;
			}
			if (Input.GetKeyDown(KeyCode.Z)){
				Camera.follow = true;
			}
			if (Input.GetKeyDown(KeyCode.X)){
				Camera.follow = false;
			}
			if (Input.GetKeyDown(KeyCode.LeftArrow)){
						Camera.transform.Rotate (0, -10, 0);
					}
					if (Input.GetKeyDown(KeyCode.RightArrow)){
						Camera.transform.Rotate (0, 10, 0);
					}
		}
}
