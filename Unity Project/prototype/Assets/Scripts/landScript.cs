using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class landScript : MonoBehaviour {
	public sateliteCameraScript cam;
	void Start () {
		Transform t = GetComponentInChildren<Transform>();
		t.localScale = new Vector3 (20f,1f,20f);
		t.localPosition = new Vector3(0f,0f,0f);
		
	}
	
	void Update () {
		// on going monitoring or changing things based on object
	}
	void focus(){
		cam.observedObject = gameObject;
	}
}
