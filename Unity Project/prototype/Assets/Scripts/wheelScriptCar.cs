using UnityEngine;
using System.Collections;

public class wheelScriptCar: MonoBehaviour {
	// This script is responsible for visual representation of the rover wheels
	public Transform WheelFL;
	public Transform WheelFR;
	public Transform WheelBR;
	public Transform WheelBL;
	public WheelCollider ColliderFL;
	public WheelCollider ColliderFR;
	public WheelCollider ColliderBR;
	public WheelCollider ColliderBL;


	void Start(){

	}
	void Update(){
		// --- Spinning the Wheels according to colliders



		// --- moving the wheels with the suspension
		Vector3 pos;
		Quaternion quat;

		ColliderFL.GetWorldPose(out pos, out quat );
		WheelFL.position = pos;
		WheelFL.rotation = quat;
		ColliderFR.GetWorldPose(out pos, out quat );
		WheelFR.position = pos;
		WheelFR.rotation = quat;
		ColliderBL.GetWorldPose(out pos, out quat );
		WheelBL.position = pos;
		WheelBL.rotation = quat;
		ColliderBR.GetWorldPose(out pos, out quat );
		WheelBR.position = pos;
		WheelBR.rotation = quat;
	}

}
