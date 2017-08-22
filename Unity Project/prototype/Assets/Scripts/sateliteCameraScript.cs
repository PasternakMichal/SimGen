using UnityEngine;
using System.Collections;

public class sateliteCameraScript : MonoBehaviour {
	public GameObject observedObject; 
	Vector3 posOffset = new Vector3 (0,2,-4);
	Vector3 rotOffset = new Vector3 (20,0,0);
	// Use this for initialization
	void Start () {
	}
	
	// Update is called once per frame
	void LateUpdate () {
		transform.position = observedObject.transform.position + posOffset;
		transform.rotation = observedObject.transform.rotation;
		transform.Rotate(rotOffset);
	}
}
