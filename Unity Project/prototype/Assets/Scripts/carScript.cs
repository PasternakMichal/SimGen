using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class carScript : MonoBehaviour {


	public WheelCollider ColliderFL;
	public WheelCollider ColliderFR;
	public WheelCollider ColliderBL;
	public WheelCollider ColliderBR;
	public Transform car;

	float prevx,prevy,prev2x,prev2y,timenow,timethen;

	public float maxBrake;
	public float maxPower;
	public bool On = false;
	public string CarName;
	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		prev2x = prevx;
		prev2y = prevy;
		prevx = car.position.x;
		prevy = car.position.y;
		timethen = timenow;
		timenow = Time.time;
	}
	public void ConnectCar(float brake, float power,string name){
		maxPower = power;
		maxBrake = brake;
		On = true;
		CarName = name;
	}

	public void EnginePower(float percent){
		ColliderBL.motorTorque = percent * maxPower;
		ColliderBR.motorTorque = percent * maxPower;
	}

	public void Brake(float percent){
		ColliderBR.brakeTorque = percent * maxBrake;
		ColliderBL.brakeTorque = percent * maxBrake;
		ColliderFR.brakeTorque = percent * maxBrake;
		ColliderFL.brakeTorque = percent * maxBrake;
	}
		
	public float Speed(){
		return (Mathf.Abs(prevx - prev2x) + Mathf.Abs(prevy-prev2y))/(timenow-timethen);
	}
	public string Position(){
		return (""+prevx+","+prevy+","+car.position.z);
	}
	public float CheckBrake(){
		return ColliderFL.brakeTorque;
	}
	public string CarInfo(){
		return "" + Speed () + "," + CheckBrake()+"," + Position();
	}
}
