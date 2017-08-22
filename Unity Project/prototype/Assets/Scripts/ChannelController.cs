using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ChannelController : MonoBehaviour {
	
	public Network externalComm;

	void Start () {
		externalComm = new Network(8888,"bla",20); // port, net ID, Container size
		externalComm.StartNetwork();
	}

	// Update is called once per frame
	void Update () {
		if (externalComm.isContainerEmpty () == false) {
			route(externalComm.getMessage());
		}

	}
		public void route(string S){
			if (S != null || S != "") {
				string name = S.Substring (0, S.IndexOf (','));
				S = cut (S);
				// send the message on to the designated recipient inout
			if (name == "buddy") {
				buddyScript buddy = GetComponentInChildren<buddyScript> ();
				string reply = buddy.command (S);
				// if inout, then do this if in only don't 
				if (reply!= "" || reply != null)
					externalComm.SendMessage("buddy,"+reply);
				}
				
			}
		}

	public string cut(string message){
		return message.Substring(message.IndexOf(','));
	}
}
//"buddy,1,LS,RS,LB,RB"