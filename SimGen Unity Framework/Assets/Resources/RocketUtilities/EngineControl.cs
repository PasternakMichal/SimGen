using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class EngineControl : MonoBehaviour {

	public double fuelCapacity;
	public double temperature= 0;
	public double heatLimit=10000;
	public double thrustPercent=0;
	public double mass = 0;
	public double maxThrust=4000;
	Rigidbody rb;
	ConstantForce booster;
	FixedJoint joint;
	ConeControl cone;
	Transform t;
	// Use this for initialization
	void Start () {
		rb = GetComponent<Rigidbody>();
		booster = GetComponent<ConstantForce> ();
		joint = GetComponent<FixedJoint> ();
		cone = GetComponentInChildren<ConeControl> (); 
		t = GetComponent<Transform> ();
		thrustPercent = 0;
		mass = 1;
	}

	public 
	
	// Update is called once per frame
	void Update () {
		normalizePercent ();
		calcEnvForces ();
		double thrust = ((thrustPercent / 100) * maxThrust);
		if (temperature > heatLimit) {
			Combust ();
		}

		if (thrust > 0&& cone.isOn != 2) {
			cone.isOn = 1;
		}
		if (thrust == 0 && cone.isOn != 3) {
			cone.isOn = 0;
			//Debug.Log ("Joint force: "+joint.currentForce);
		}
		booster.relativeForce = new Vector3 (0.0f, (float)thrust, 0.0f);
	}
	void normalizePercent(){
		if (thrustPercent < 0)
			thrustPercent = 0;
		if (thrustPercent > 100)
			thrustPercent = 100;
	}

	public void Combust(){
		GameObject.Destroy(this);
	}

	public void calcEnvForces(){
		// --- gravity force ---
		rb.mass = (float)mass;
		// --- Drag force ---
		rb.drag = 0.001f;
	}

	public void setJoint(float force){
		joint.breakForce = force;
	}

	public void setBreakForce(int force){
		joint.breakForce = force;
	}

	public float getStickPercent(){
		float force1 = Mathf.Abs(joint.currentForce.x);
		float force2 = Mathf.Abs(joint.currentForce.y);
		float force3 = Mathf.Abs(joint.currentForce.z);
		float highest =  Mathf.Max(force1, force2, force3);
		return (highest/joint.breakForce);
	}

}
