using UnityEngine;
using System.Collections;

public class RoverMetaObject : MonoBehaviour {

public roverMover rm;
public Rigidbody rb;
public Transform t;


void requiredStart(){
		rm = GetComponent<roverMover> ();
		rb = GetComponent<Rigidbody> ();
		t = GetComponentInChildren<Transform>();
		t.localScale = new Vector3 (1,1,1);
		t.localPosition = new Vector3(5f,1f,5f);
		rb.velocity = new Vector3 (0,0,0);
		rb.angularVelocity = new Vector3 (0f,0f,0f);
	}

void update(){}
	
	
	public virtual string Start(){
		requiredStart(); //true
t.localScale.x = 1;
t.localScale.y = 1;
t.localScale.z = 1;
t.localPosition.x = 1;
t.localPosition.y = 1;
t.localPosition.z = t.localPosition.y;
		   	return ""; // this should be based off return payload?
		}
		
	public virtual string testing(){
rm.ColliderR2.motorTorque = 4;
		   	return ""; // this should be based off return payload?
		}
		
	
}
