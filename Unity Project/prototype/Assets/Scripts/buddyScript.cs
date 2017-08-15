using System.Collections;
   using System.Collections.Generic;
   		using UnityEngine;
   		
   		public class buddyScript : MonoBehaviour {
	public Network comms;
   			void Start () {
   				Transform t = GetComponentInChildren<Transform>();
   				t.localScale = new Vector3 (1f,1f,1f);
   				t.localPosition = new Vector3(0f,3f,0f);
   				roverMover interface1 = GetComponent<roverMover>();
   			interface1.ConnectRover(200f,1000f,"buddy");
   			comms = new Network(8888,23,20);
   			Debug.Log("comms initiated on 8888 for rover buddy");
   			}
   			
   			// Update is called once per frame
   			void Update () {
		if (comms.isContainerEmpty () == false) {
			translate(comms.getMessage ());

		}
   			}

		void translate(string message){
		string reply = null;
		roverMover rover = GetComponent<roverMover> ();
		int num = (int) decode (message);
			message = cut(message);
			switch (num)
			{
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

		if (reply!=null)
		comms.SendMessage (reply);
	}
			public float decode(string message){
		if (message !="" || message!= null|| message.Contains(",")==true){
			return float.Parse(message.Substring(0,message.IndexOf(',')));
						}
				else
						{
						Debug.Log("error in the decode function, decoding empty string");
						return 0;
						}
					
	}
			public string cut(string message){
		if (message.Contains (","))
			return message.Substring (message.IndexOf (','));
		else
			return "";
	}

   		}

//1,LS,RS,LB,RB
// 1 - send a state command
// 2- request a state command