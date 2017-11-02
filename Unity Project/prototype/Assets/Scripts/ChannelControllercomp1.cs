using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ChannelControllercomp1 : MonoBehaviour {
	
	public Network externalComm;
	public string myName = "comp1";

	void Start () {
		externalComm = new Network(8886,myName,20); // port, net ID, Container size
		externalComm.StartNetwork();
	}

	// Update is called once per frame
	void Update () {
		if (externalComm.isContainerEmpty () == false) {
			route(externalComm.getMessage());
		}

	}
	
	// take out the important information from the message
		public void route(string S){
			if (S != null || S != "") {
				string name = S.Substring (0, S.IndexOf (','));
				S = cut (S);
				// send the message on to the designated recipient inout
if (name == "rover1") {
	rover1Script rover1 = GetComponentInChildren<rover1Script> ();
	
	// send the action name, return the reply that is generated
	string reply = rover1.translate (S);
	
	
	// if inout, then do this if in only don't 
	if (reply!= "" || reply != null)
		externalComm.SendMessage("rover1,"+reply+";");
	}
	}
}

	public string cut(string message){
		return message.Substring(message.IndexOf(',')+1);
	}
}
