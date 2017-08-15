using System.Collections;
   		using System.Collections.Generic;
   		using UnityEngine;
   		
   		public class starter : MonoBehaviour {
   			// ---- These must be assigned as prefabs in Unity and as "metaobjects" in the DSL
   			public GameObject Plane;
   			public GameObject Rover;
   			public GameObject Car;
   			public GameObject Gem;
   			void Start () {
   				GameObject landObject = Instantiate (Plane);
   				landObject.AddComponent<landScript>();
   				GameObject buddyObject = Instantiate (Rover);
   				buddyObject.AddComponent<buddyScript>();
   				GameObject lolzObject = Instantiate (Plane);
   				lolzObject.AddComponent<lolzScript>();
   			}
   			
   			// Update is called once per frame
   			void Update () {
   				
   			}
   		}

