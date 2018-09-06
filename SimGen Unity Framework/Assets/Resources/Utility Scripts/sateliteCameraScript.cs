using UnityEngine;
using System.Collections;

public class sateliteCameraScript : MonoBehaviour {
	public GameObject observedObject; 
	public bool follow = true;
	public Vector3 off = new Vector3 (0, 2, 0);
	Vector3 posOffset = new Vector3 (0,2,-4);
	Vector3 rotOffset = new Vector3 (20,0,0);
	// Use this for initialization
	void Start () {
	}
	
	// Update is called once per frame
	void LateUpdate () {
		if (follow == true) {
			Vector3 actOffset = off;
			//Debug.Log ("X = "+Mathf.Sin (observedObject.transform.rotation.y));
			transform.rotation = observedObject.transform.rotation;
			transform.position = observedObject.transform.position + actOffset;
			transform.Rotate (rotOffset);
		}
	}
}
