using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class realdealScript : MonoBehaviour {
   	public string channelID;
   	public sateliteCameraScript cam;
	void Start () {
   		Transform t = GetComponentInChildren<Transform>();
   		t.localScale = new Vector3 (2f,2f,2f);
   		t.localPosition = new Vector3(5f,3f,0f);
   		Rigidbody rb = GetComponent<Rigidbody> ();
   		rb.velocity = new Vector3 (0f,0f,0f);
   		rb.angularVelocity = new Vector3 (0f,0f,0f);
   		roverMover interface1 = GetComponent<roverMover>();
   		interface1.ConnectRover(200f,1000f,"realdeal");
   	}
   			
   	void Update () {}
   			
   	public string command(string com){
   		return translate(com);
   	}
   	string translate(string message){
   		string reply = null;
   		roverMover rover = GetComponent<roverMover> ();
   		int num = (int) decode(message);
   		message = cut(message);
   		switch (num){
   			case 1: 
   			rover.LeftPower(decode(message));
   			message=cut(message);
   			rover.RightPower(decode(message));
   			message=cut(message);
   			rover.LeftBrake(decode(message));
   			message=cut(message);
   			rover.LeftBrake(decode(message));
   			break;
   					
   			case 2:
   			reply = "2,"+rover.RoverEngine();
   			break;
  		}
   			
   		return reply;
   	}
   		
	public float decode(string message){
   		if (message !="" || message!= null){
   			return float.Parse( message.Substring(0,message.IndexOf(',')));
   		}
   		else{
   			Debug.Log("error in the decode function, decoding empty string");
   			return 0;
   		}
   	}
	public string cut(string message){
   		return message.Substring(message.IndexOf(','));
   	}
	void focus(){
		cam.observedObject = gameObject;
	}
}
//1,LS,RS,LB,RB
// 1 - send a state command
// 2- request a state command
