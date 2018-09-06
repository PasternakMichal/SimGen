using UnityEngine;
using System.Collections;

public class wheelScript: MonoBehaviour {
	// This script is responsible for visual representation of the rover wheels
	public Transform WheelR1;
	public Transform WheelR2;
	public Transform WheelR3;
	public Transform WheelL1;
	public Transform WheelL2;
	public Transform WheelL3;
	public WheelCollider ColliderR1;
	public WheelCollider ColliderR2;
	public WheelCollider ColliderR3;
	public WheelCollider ColliderL1;
	public WheelCollider ColliderL2;
	public WheelCollider ColliderL3;

	void Start(){
		
	}
	void Update(){
		// --- Spinning the Wheels according to colliders
		WheelR1.Rotate(ColliderR1.rpm / 60 * 360 * Time.deltaTime, 0, 0);
		WheelR2.Rotate(ColliderR2.rpm / 60 * 360 * Time.deltaTime, 0, 0);
		WheelR3.Rotate(ColliderR3.rpm / 60 * 360 * Time.deltaTime, 0, 0);
		WheelL1.Rotate(ColliderL1.rpm / 60 * 360 * Time.deltaTime, 0, 0);
		WheelL2.Rotate(ColliderL2.rpm / 60 * 360 * Time.deltaTime, 0, 0);
		WheelL3.Rotate(ColliderL3.rpm / 60 * 360 * Time.deltaTime, 0, 0);

		// --- moving the wheels with the suspension
		Vector3 pos;
		Quaternion quat;

		ColliderR1.GetWorldPose(out pos, out quat );
		WheelR1.position = pos;
		ColliderR2.GetWorldPose(out pos, out quat );
		WheelR2.position = pos;
		ColliderR3.GetWorldPose(out pos, out quat );
		WheelR3.position = pos;

		ColliderL1.GetWorldPose(out pos, out quat );
		WheelL1.position = pos;
		ColliderL2.GetWorldPose(out pos, out quat );
		WheelL2.position = pos;
		ColliderL3.GetWorldPose(out pos, out quat );
		WheelL3.position = pos;
	}

}
