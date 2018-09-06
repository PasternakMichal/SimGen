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


	public float maxBrake;
	public float maxPower;
	public bool On = false;
	public string RoverName;

	void Start () {
	}

	// Update is called once per frame
	void Update () {


	}
	public void ConnectRover(float brake, float power,string name){
		maxPower = power;
		maxBrake = brake;
		On = true;
		RoverName = name;
	}
}
