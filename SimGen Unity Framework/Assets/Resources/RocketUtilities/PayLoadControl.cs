using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PayLoadControl : MonoBehaviour {

	private FixedJoint fj;
	public Rigidbody rb;
	public Transform t;
	private ConstantForce cf;
	private float time;
	private float breakTime;
	public bool popYN = false;
	public double compass;
	public double tilt;
	// Use this for initialization
	void Start () {
		 fj = GetComponent<FixedJoint> ();
		 rb = GetComponent<Rigidbody>();
		 t = GetComponent<Transform> ();
		Debug.Log (t.position.y);
		 cf = GetComponent<ConstantForce> ();
		time = Time.time;
		breakTime = time;
	}

	// Update is called once per frame
	void Update () {
		if(breakTime != time&& Time.time>time){
			cf.relativeForce.Set(0,0,0);
			time = 0;
		}
		if (popYN == true) {
			pop ();
		}
	}

	public void setBreakForce(int force){
		fj.breakForce = force;
	}

	public float getStickPercent(){
		float force1 = Mathf.Abs(fj.currentForce.x);
		float force2 = Mathf.Abs(fj.currentForce.y);
		float force3 = Mathf.Abs(fj.currentForce.z);
		float highest =  Mathf.Max (force1, force2, force3);
		return (highest/fj.breakForce);
	}
	public void pop(){
		fj.breakForce = 0;
		cf.relativeForce.Set(0,1,0);
		time = Time.time+(Time.deltaTime*3);
		breakTime = Time.time;
	}
}
