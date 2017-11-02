using UnityEngine;
using System.Collections;

public class RoverMetaObject : MonoBehaviour {

public roverMover rm;
public Rigidbody rb;
public Transform t;


// maybe out this is some loop to auto initialize all variables in meta object.
public double posx;
	public double posy;
	public double posz;

	public double velx;
	public double vely;
	public double velz;

	public double sizex;
	public double sizey;
	public double sizez;

	public double angVelx;
	public double angVely;
	public double angVelz;

// -- predefined utility functions
void requiredStart(){
		rm = GetComponent<roverMover> ();
		rb = GetComponent<Rigidbody> ();
		t = GetComponentInChildren<Transform>();
		t.localScale = new Vector3 (1,1,1);
		t.localPosition = new Vector3(5f,1f,5f);
		rb.velocity = new Vector3 (0,0,0);
		rb.angularVelocity = new Vector3 (0f,0f,0f);
	}
	
 void statusUpdate(){
	posx = t.localPosition.x;
	posy = t.localPosition.y;
	posz = t.localPosition.z;

	sizex = t.localScale.x;
	sizey = t.localScale.y;
	sizez = t.localScale.z;

	velx = rb.velocity.x;
	vely = rb.velocity.y;
	velz = rb.velocity.z;

	angVelx = rb.angularVelocity.x;
	angVely = rb.angularVelocity.y;
	angVelz = rb.angularVelocity.z;
}

void update(){
	statusUpdate();
}

// -- End predfined utility functions

// -- DSL generated functions
	
	public virtual string Start(){
		requiredStart(); //true
sizex = 1;
sizey = 1;
sizez = 1;
		   	return ""; // this should be based off return payload?
		}
		
	public virtual string testing(){
rm.ColliderR2.motorTorque = 4;
		   	return ""; // this should be based off return payload?
		}
		
	public virtual string setPos(){
posx = 1;
posy = 1;
posz = posy;
		   	return ""; // this should be based off return payload?
		}
		
	public virtual string increaseSpeed(){
rm.ColliderL1.motorTorque = rm.ColliderL1.motorTorque + 1;
rm.ColliderR1.motorTorque = rm.ColliderR1.motorTorque + 1;
rm.ColliderL2.motorTorque = rm.ColliderL2.motorTorque + 1;
rm.ColliderR2.motorTorque = rm.ColliderR2.motorTorque + 1;
rm.ColliderL3.motorTorque = rm.ColliderL3.motorTorque + 1;
rm.ColliderR3.motorTorque = rm.ColliderR3.motorTorque + 1;
		   	return ""; // this should be based off return payload?
		}
		
	// -- End DSL generated functions
}
