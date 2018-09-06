using UnityEngine;
using System.Collections;

public class roverMover : MonoBehaviour {

	// script which provides an interface to controlling and customizing the rover. This script is part of the prefab.

	public WheelCollider ColliderR1;
	public WheelCollider ColliderR2;
	public WheelCollider ColliderR3;
	public WheelCollider ColliderL1;
	public WheelCollider ColliderL2;
	public WheelCollider ColliderL3;
	public Rigidbody rb;
	public Transform t;
	public double compass=0;

	public float maxBrake;
	public float maxPower;
	public bool On = false;
	public string RoverName;

	void Start () {
		rb = GetComponent<Rigidbody> ();
		rb.velocity = new Vector3 (0f, 0f, 0f);
		rb.angularVelocity = new Vector3 (0f, 0f, 0f);
		t = GetComponent<Transform> ();
	}


	// Update is called once per frame
	void Update () {
		
		Vector3 targetDir = Vector3.forward;
		Vector3 forward = t.forward;
		compass = Vector3.SignedAngle(targetDir,forward,Vector3.up);
		if (compass<0)
			compass = 360+compass;
	}

	public void ConnectRover(float brake, float power,string name){
		maxPower = power;
		maxBrake = brake;
		On = true;
		RoverName = name;
	}
}
