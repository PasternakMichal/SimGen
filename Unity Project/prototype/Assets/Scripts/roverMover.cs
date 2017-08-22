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
		RightPower (0);
		LeftPower (0);
		RightBrake (20);
		LeftBrake (20);
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

	public void LeftPower(float percent){
		ColliderL1.motorTorque = percent * maxPower;
		ColliderL2.motorTorque = percent * maxPower;
		ColliderL3.motorTorque = percent * maxPower;
	}

	public void RightPower(float percent){
		ColliderR1.motorTorque = percent * maxPower;
		ColliderR2.motorTorque = percent * maxPower;
		ColliderR3.motorTorque = percent * maxPower;
	}

	public void LeftBrake(float percent){
		ColliderL1.brakeTorque = percent * maxBrake;
		ColliderL2.brakeTorque = percent * maxBrake;
		ColliderL3.brakeTorque = percent * maxBrake;
	}
	public void RightBrake(float percent){
		ColliderR1.brakeTorque = percent * maxBrake;
		ColliderR2.brakeTorque = percent * maxBrake;
		ColliderR3.brakeTorque = percent * maxBrake;
	}

	public float RightSpeed(){
		return ColliderR1.motorTorque;
	}
	public float LeftSpeed(){
		return ColliderL1.motorTorque;
	}
	public float LeftBrake(){
		return ColliderL1.brakeTorque;
	}
	public float RightBrake(){
		return ColliderR1.brakeTorque;
	}
	public string RoverEngine(){
		return "" + LeftSpeed () + "," + RightSpeed () + "," + LeftBrake () + "," + RightBrake ();
	}
}

