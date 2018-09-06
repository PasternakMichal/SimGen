using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ConeControl : MonoBehaviour {
	ParticleSystem ps;
	public int isOn =0;
	// Use this for initialization
	void Start () {
		ps = GetComponentInChildren<ParticleSystem> ();
	}
	
	// Update is called once per frame
	void Update () {
		if (isOn == 1) {
			isOn = 2;
			ps.Play ();
		}
		if (isOn == 0) {
			isOn = 3;
			ps.Stop ();
		}
	}
}
