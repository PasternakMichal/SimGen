/*
 * generated by Xtext 2.11.0
 */
package cs.queensu.ca.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.XtextResourceSet
import cs.queensu.ca.UnityStandaloneSetup
import java.io.IOException
import com.google.inject.Injector
import cs.queensu.ca.unity.Channel
import cs.queensu.ca.unity.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UnityGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//----- Unity File Generation -----
		println("Saving Ecore model is started");
		
		for (a: resource.allContents.toIterable.filter(ENV)){
			//starter populates the scene with all relevant objects for the simulation
			fsa.generateFile("starter.cs",starter(a));
			// ------- Create Unity scripts for each metaobject -------
   		for (b: a.instances){
   			if (b.instanceType.type.kind == 'others'){
   			fsa.generateFile((b.name+"Script.cs"),landscape(b));
   			}
   			
   			else if (b.instanceType.type.kind == 'rover'){
   			fsa.generateFile((b.name+"Script.cs"),rover(b));
   			}
   			else if (b.instanceType.type.kind == 'car'){
   			fsa.generateFile((b.name+"Script.cs"),car(b));
   			}
   			else
   			println("unknown MetaObject");
   			}
   			
   		}
   		
   		// ----- XMI generation -----
		var Injector injector = new UnityStandaloneSetup().createInjectorAndDoEMFRegistration();
		var XtextResourceSet resourceSet =injector.getInstance(XtextResourceSet);
		var String xtextFilename=resource.URI.lastSegment;
		var String EcoreFileName=xtextFilename.replace(xtextFilename.split("\\.").get(1),"xmi")
		var Resource xmiResource=resourceSet.createResource(fsa.getURI(EcoreFileName));

		xmiResource.getContents().add(resource.getContents().get(0));

   			try {
      		 	xmiResource.save(null);
    		} 
    		catch (IOException e) {
       	 		e.printStackTrace();
   			}
   		
	}
	   		// --- utilities ---
	   		
	   		
	   		// can only return a certain type that must be consistent ie. bool or int
	   		def intExtractor(Expression e){
		    
	   			switch (e)
	   			{
	   				Literal: {
	   						var Literal litvalue=e as Literal;
	   						if (litvalue instanceof IntLiteral){
	   							 print((litvalue as IntLiteral).getInt()) ;
	   							 var int i=(litvalue as IntLiteral).getInt().intValue;
	   							 return i;
	   							 }
	   							 
	   						
	   						}
	   			}
	   		}
	   		
	   		
	   		def boolExtractor(Expression e){
	   			
	   			switch (e)
	   			{
	   				Literal: {
	   					var Literal litvalue=e as Literal;
	   					if (litvalue instanceof BoolLiteral){
	   							print((litvalue as BoolLiteral).isBool());
	   							var boolean b = (litvalue as BoolLiteral).isBool().booleanValue;
	   							return b;
	   						}
	   				}
	   			}
	   			
	   		}
	   	
	   		def getIntValue(UnityObject a,String b){
	   			for (q: a.configurations){
	   				for (w: q.configs){
	   					if (w.propertyName.name == b)
	   						return (intExtractor(w.propertyValue));
	   				}
	   			}
	   			return 0;
	   		}
	   		
	   		def getBoolValue(UnityObject a,String b){
	   			for (q: a.configurations){
	   				for (w: q.configs){
	   					if (w.propertyName.name == b)
	   						return ((boolExtractor(w.propertyValue)));
	   				}
	   			}
	   			return false;
	   		}
	   		
	   		def sizeAndScale(UnityObject e,String a)'''
	   		Transform t = GetComponentInChildren<Transform>();
	   		«IF a=="rover"»
	   		t.localScale = new Vector3 («e.getIntValue("size")»f,«e.getIntValue("size")»f,«e.getIntValue("size")»f);
	   		«ELSE»
	   		t.localScale = new Vector3 («e.getIntValue("sizex")»f,«e.getIntValue("sizey")»f,«e.getIntValue("sizez")»f);
	   		«ENDIF»
	   		t.localPosition = new Vector3(«e.getIntValue("posx")»f,«e.getIntValue("posy")»f,«e.getIntValue("posz")»f);
	   		'''
   		// --- script definitions ---
   		def landscape(Instance e) '''
   		using System.Collections;
   		using System.Collections.Generic;
   		using UnityEngine;
   		
   		public class «e.name»Script : MonoBehaviour {
   			void Start () {
   				«sizeAndScale(e.instanceType,e.name)»
   			}
   			
   			void Update () {
   				// on going monitoring or changing things based on object
   			}
   		}
   		
   		
   		
   		'''
   		// --- starter needs all game object pre fabs to be declared and attached
   		def starter(ENV e)'''
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
   		   				«FOR k:e.instances»
   		   				GameObject «k.name»Object = Instantiate («k.instanceType.type.name»);
   		   				«k.name»Object.AddComponent<«k.name»Script>();
   		   				«ENDFOR»
   		   			}
   		   			
   		   			// Update is called once per frame
   		   			void Update () {
   		   				
   		   			}
   		   		}
   		
   		'''
   		
   		def car(Instance e)'''
   		using System.Collections;
   		   		using System.Collections.Generic;
   		   		using UnityEngine;
   		   		
   		   		public class «e.name»Script : MonoBehaviour {
   		   			void Start () {
   		   				«sizeAndScale(e.instanceType,e.name)»
   		   				carMover interface1 = GetComponent<carMover>();
   		   				interface1.ConnectCar(«getIntValue(e.instanceType,"brake")»f,«getIntValue(e.instanceType,"power")»f,"«e.name»");
   		   				«includeNetwork(e,getBoolValue(e.instanceType,"network"),20)»
   		   			}
   		   			
   		   			void Update () {
   		   				if (comms.isContainerEmpty() ==false){
   		   					translate(comms.getMessage());
   		   					}
   		   			}
   		   			
   		   			void translate(string message){
   		   				string reply = null;
   		   				int num = (num) decode(message);
   		   				message = cut(message);
   		   				
   		   				switch(num){
   		   					case 1: 
   		   					comms.EnginePower(decode(message));
   		   					message = cut(message);
   		   					comms.SteerInput(decode(message));
   		   					message = cut(message);
   		   					comms.BrakePower(decode(message));
   		   					case 2:
   		   					reply = comms.CarInfo();
   		   					}
   		   					if(reply!= null)
   		   						comms.SendMessage(reply);
   		   				}
   		   				
   		   			public float decode(string message){
   		   				if (message !="" || message!= null){
   		   			   		return float.Parse( message.Substring(0,message.IndexOf(',')));
   		   			   	}
   		   			   	else
   		   			   	{
   		   			   		Debug.Log("error in the decode function, decoding empty string");
   		   			   		return 0;
   		   			   	}
   		   			}
   		   			public string cut(string message){
   		   			   	return message.Substring(message.IndexOf(','));
   		   			}
   		   		}
   		// 1 = set speed,brake;
   		//2 = get speed,brake, position;
   		'''
   		
   		def rover(Instance e) '''
   		using System.Collections;
   		   		using System.Collections.Generic;
   		   		using UnityEngine;
   		   		
   		   		public class «e.name»Script : MonoBehaviour {
   		
   		   			void Start () {
   		   				«sizeAndScale(e.instanceType,"rover")»
   		   				roverMover interface1 = GetComponent<roverMover>();
   		   			interface1.ConnectRover(«getIntValue(e.instanceType,"brake")»f,«getIntValue(e.instanceType,"power")»f,"«e.name»");
   		   			«includeNetwork(e,getBoolValue(e.instanceType,"network"),20)»
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
   		   					int num = (int) decode(message);
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
   		   							if (message !="" || message!= null){
   		   								return float.Parse( message.Substring(0,message.IndexOf(',')));
   		   									}
   		   							else
   		   									{
   		   									Debug.Log("error in the decode function, decoding empty string");
   		   									return 0;
   		   									}
   		   								
   		   				}
   		   						public string cut(string message){
   		   							return message.Substring(message.IndexOf(','));
   		   				}
   		   			
   		   			   		}
   		   			
   		   			//1,LS,RS,LB,RB
   		   			// 1 - send a state command
   		   			// 2- request a state command
   		'''
   		
   		def includeNetwork(Instance e, boolean nets,int size ) '''
   		«IF nets ==true»
   		Network comms = new Network(«getIntValue(e.instanceType,"Port")»,«getIntValue(e.instanceType,"NetId")»,«size»);
   		Debug.Log("comms initiated on «getIntValue(e.instanceType,"Port")» for «e.name»");
   		«ELSE»
   		Debug.Log("«e.name» has no network capability");
   		«ENDIF»
   		'''
   		
}
