using System.Collections;
using System.Collections.Generic;
using UnityEngine;
   		
public class starter : MonoBehaviour {
// ---- These must be assigned as prefabs in Unity and as "metaobjects" in the DSL
	public GameObject Generic;
	public GameObject Plane;
	public GameObject Rover;
	public GameObject Car;
	public GameObject Gem;
//-----
	void Start () {
//-- adding the necessary instances
   	GameObject landObject = Instantiate (Plane,transform);
   	landObject.AddComponent<landScript>();
   	GameObject buddyObject = Instantiate (Rover,transform);
   	buddyObject.AddComponent<buddyScript>();
   	GameObject realdealObject = Instantiate (Rover,transform);
   	realdealObject.AddComponent<realdealScript>();
   	GameObject obstacleObject = Instantiate (Generic,transform);
   	obstacleObject.AddComponent<obstacleScript>();
//adding the necessary channel information scripts	
   	gameObject.AddComponent<ChannelControllerMyChannel>();
	}
}
