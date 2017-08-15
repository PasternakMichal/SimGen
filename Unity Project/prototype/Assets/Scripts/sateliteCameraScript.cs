using UnityEngine;
using System.Collections;

public class sateliteCameraScript : MonoBehaviour {
	public GameObject rover; 
	Vector3 offset ;
	// Use this for initialization
	void Start () {
		offset = transform.position - rover.transform.position;
	}
	
	// Update is called once per frame
	void LateUpdate () {
		transform.position = rover.transform.position + offset;
	}
}
