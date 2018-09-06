using UnityEngine;
using System.Collections;

public class sateliteCameraScript : MonoBehaviour {
	public GameObject observedObject; 
	public bool follow = true;
	Vector3 posOffset = new Vector3 (0,2,-4);
	Vector3 rotOffset = new Vector3 (20,0,0);
	// Use this for initialization
	void Start () {
	}
	
	// Update is called once per frame
	void LateUpdate () {
		if (follow == true) {
			transform.rotation = observedObject.transform.rotation;
			transform.Rotate (rotOffset);
			transform.position = observedObject.transform.position + posOffset;
		}
	}
}
