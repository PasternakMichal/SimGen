using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RocketControl : MonoBehaviour {
	// an easy interface for accessing all items in the rocket.

	public PayLoadControl pl;
	public EngineControl [] Engines;
	public GameObject spentEngine;
	public Transform bt;
	public Rigidbody brb;
	public Vector3 bodyPos = new Vector3(0,0,0);
	public Vector3 plPos = new Vector3(0,0,0);
	public Vector3[] enginePos = new Vector3[4];
	public Vector3[] engineVel = new Vector3[4];
	// Use this for initialization
	void Start () {
		pl = GetComponentInChildren<PayLoadControl> ();
		bt = spentEngine.GetComponent<Transform> ();
		brb = spentEngine.GetComponent<Rigidbody> ();
		Engines = GetComponentsInChildren<EngineControl>();
	}
	
	// Update is called once per frame
	void Update () {
		getengineVelPos ();
	}
	public EngineControl getEngine(int i){
		if (Engines.Length < i) {
			return Engines [i];
		} else
			return null;
	}

	public void getengineVelPos(){
		for (int i = 0; i<4; i++) {
			enginePos [i] = Engines [i].transform.position;
			engineVel [i] = Engines [i].GetComponent<Rigidbody>().velocity;
			}
	}
}
