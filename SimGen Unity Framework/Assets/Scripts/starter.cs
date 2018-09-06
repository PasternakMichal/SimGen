using System.Collections;
using System.Collections.Generic;
using UnityEngine;
   		
public class starter : MonoBehaviour {
// ---- These must be assigned as prefabs in Unity and as "metaobjects" in the DSL
	public sateliteCameraScript Camera;

	
	GameObject CameraObject;
//-----
	void Start () {
	Application.runInBackground = true;
//-- adding the necessary instances
	CameraObject = (GameObject)Instantiate (Resources.Load("CameraController"),transform);
   	

//adding the necessary channel information scripts	
	Camera = CameraObject.GetComponent<sateliteCameraScript>();
   	Camera.off = new Vector3(10.0f,16.0f,0.0f);
	}
	

		void Update(){//
		
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
