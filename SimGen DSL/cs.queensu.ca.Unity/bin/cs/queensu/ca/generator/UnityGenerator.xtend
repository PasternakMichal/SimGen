/*
 * generated by Xtext 2.11.0
 */


package cs.queensu.ca.generator

import com.google.inject.Injector
import cs.queensu.ca.UnityStandaloneSetup
import cs.queensu.ca.unity.Attribute
import cs.queensu.ca.unity.BoolLiteral
import cs.queensu.ca.unity.Channel
import cs.queensu.ca.unity.ENV
import cs.queensu.ca.unity.Expression
import cs.queensu.ca.unity.Instance
import cs.queensu.ca.unity.IntLiteral
import cs.queensu.ca.unity.Literal
import cs.queensu.ca.unity.MetaObject
import cs.queensu.ca.unity.RealLiteral
import cs.queensu.ca.unity.Ref
import cs.queensu.ca.unity.StLiteral
import cs.queensu.ca.unity.UnaryExpression
import cs.queensu.ca.unity.UnityObject
import cs.queensu.ca.unity.VarType
import cs.queensu.ca.unity.impl.AdditionImpl
import cs.queensu.ca.unity.impl.AssignImpl
import cs.queensu.ca.unity.impl.DivideImpl
import cs.queensu.ca.unity.impl.IdentifierImpl
import cs.queensu.ca.unity.impl.MinusImpl
import cs.queensu.ca.unity.impl.ModuloImpl
import cs.queensu.ca.unity.impl.MultiplicationImpl
import cs.queensu.ca.unity.impl.PropertyImpl
import cs.queensu.ca.unity.impl.SingleRefImpl
import java.io.FileReader
import java.io.IOException
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.XtextResourceSet

import static extension com.google.common.io.CharStreams.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UnityGenerator extends AbstractGenerator {
	var ArrayList<String> lines = new ArrayList<String>();
	var HashMap<String, String> keyHash = new HashMap<String, String>();

	//UMLRTLibraryGenerator umlrtUtil;
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//----- Unity File Generation -----
		println("Checking config file...");
		
       System.out.println("Working Directory = " +
              System.getProperty("user.dir"));
		readFile("prototypeConfig.txt");
		// -- read file to figure out which .xtend files should be generated
		// generate unity code
		generateUnityCode(resource,fsa,context);
		
		// generate model xmi
		generateXMIFile(resource,fsa); 
		// generate UMLRT model library
		//var UMLRTLibraryGenerator umlrtUtil=new UMLRTLibraryGenerator(resource,fsa,context) ;
		//umlrtUtil.generateModelLibrary();
	}
	
	def UMLRTLibraryGenerator(Resource resource, IFileSystemAccess2 access2, IGeneratorContext context) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	   		// --- utilities ---
	// generate xmi file 
	def generateXMIFile(Resource resource, IFileSystemAccess2 fsa) {
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
		
	// main unity code generation function
	def generateUnityCode(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (m: resource.allContents.toIterable.filter(MetaObject)){
			// ----- Generate all the MetaObject classes for reference in unity
			
			fsa.generateFile(("Simulator/"+resource.URI.lastSegment+"/"+m.name+"MetaObject.cs"),allClass(m));
		}
		
		for (a: resource.allContents.toIterable.filter(ENV)){
			//starter populates the scene with all relevant objects for the simulation
			
			fsa.generateFile("Simulator/"+resource.URI.lastSegment+"/"+"starter.cs",starter(a));
			// ------- Create Unity scripts for each MetaObject -------
			
   			for (b: a.instances){
   				if (b.instanceType.type.kind == 'generic'){
   					fsa.generateFile(("Simulator/"+resource.URI.lastSegment+"/"+b.name+"Script.cs"),generic(b));
   				}
   				else{
   				fsa.generateFile(("Simulator/"+resource.URI.lastSegment+"/"+b.name+"Script.cs"),allObject(b));
   				}
   			}		
   			for (c: a.channels){
   				fsa.generateFile(("Simulator/"+resource.URI.lastSegment+"/"+"ChannelController"+c.name+".cs"),channelcontroller(c));
   			}
   			fsa.generateFile(("Simulator/"+resource.URI.lastSegment+"/"+"README.txt"),readme(a));
   		}		
	} 		

	def readFile(String fileName){
		if(keyHash.empty==true){
			val file = new FileReader(fileName).readLines
			for(a:file){
				if(a.contains(":")==false && a.contains("=")==true){
					keyHash.put(a.substring(0,a.indexOf("=")),a.substring(a.indexOf("=")+1));
				}
				else if(a.contains(":")==true){
					lines.add(a);
				}
			}
		}
	}
	

	
	def int intExtractor(Expression e){
		switch (e){
	   		Literal:{
	   				var Literal litvalue=e as Literal;
	   				if (litvalue instanceof IntLiteral){
	   				print((litvalue as IntLiteral).getInt()) ;
	   				var int i=(litvalue as IntLiteral).getInt().intValue;
	   				return i;
	   				}			 		
	   			}
	   		UnaryExpression:{ 
	   			var Expression myExp = e.exp;
	   			var answer = intExtractor(myExp);
	   			return -answer
	   			}
	   		
	   		}
	   		
	   		return 0;
	}
	def double realExtractor(Expression e){
		switch (e){
	   		Literal:{
	   				var Literal litvalue=e as Literal;
	   				if (litvalue instanceof RealLiteral){
	   				print((litvalue as RealLiteral).getReal()) ;
	   				var double i=(litvalue as RealLiteral).getReal().doubleValue;
	   				return i;
	   				}			 		
	   			}
	   		UnaryExpression:{ 
	   			var Expression myExp = e.exp;
	   			var answer = realExtractor(myExp);
	   			return -answer;
	   			}
	   		
	   		}
	   		
	   		return 0.0;
	}
	
	def String stringify(Expression e,String s,MetaObject m){
		 switch(e){
		 	PropertyImpl:{return translateToUnity(e.name,m)}
		 	IdentifierImpl:{s+translateToUnity(refExtract(e.refrence),m)}
		 	Literal:{return stringExtractor(e)}
		 	MultiplicationImpl:{return (stringify(e.left,s,m)+" * "+stringify(e.right,s,m))}
		 	AdditionImpl: {return stringify(e.left,s,m)+" + "+stringify(e.right,s,m)}
		 	AssignImpl:{return (stringify(e.left,s,m)+" = "+stringify(e.right,s,m))}
		 	ModuloImpl:{return (stringify(e.left,s,m) +" % "+stringify(e.right,s,m))}
		 	DivideImpl:{return (stringify(e.left,s,m) +" / "+stringify(e.right,s,m))}
		 	MinusImpl:{return (stringify(e.left,s,m) +" - "+stringify(e.right,s,m))}
		 	Expression:{return "error help me"}
		 }
	}
		
	def String translateToUnity(String s,MetaObject m){
			// --- common to all objects ---
			
		if (s!==null){ // config file overrides defaults.
			 if (keyHash.get(m.name+"."+s)!==null){
			 	return keyHash.get(m.name+"."+s);
			 }
		}
				
		if (s.equals("posX")) return "posx"
		else if (s.equals("posY")) return "posy"
		else if (s.equals("posZ")) return "posz"	
		else if (s.equals("sizeX")) return "sizex"
		else if (s.equals("sizeY")) return "sizey"
		else if (s.equals("sizeZ")) return "sizez"
		else if (s.equals("rotX")) return "rotx"
		else if (s.equals("rotY")) return "roty"
		else if (s.equals("rotZ")) return "rotz"
					
		else return s
	}
		
		
		
	def String refExtract(Ref a){
		switch(a){
			SingleRefImpl:{
				a.singleRef.name
			}
		}
	}
		
	def stringExtractor(Expression e){   
	   	switch (e){
			Literal: {
				var Literal litvalue=e as Literal;
				if (litvalue instanceof StLiteral){
					// print((litvalue as StLiteral).getString()) ;
					 var String i=(litvalue as StLiteral).getString();
					 return i;
				} 
				if (litvalue instanceof IntLiteral){
					return (intExtractor(litvalue)).toString
				}
				if (litvalue instanceof BoolLiteral){
					return (boolExtractor(litvalue)).toString
				}
				if (litvalue instanceof RealLiteral){
					return (realExtractor(litvalue)).toString
				}
			}
		}
	}
	   		
	   		
	def boolExtractor(Expression e){
		switch (e){
	   		Literal: {
	   			var Literal litvalue=e as Literal;
	   			if (litvalue instanceof BoolLiteral){
	   	//			print((litvalue as BoolLiteral).isBool());
	   				var boolean b = (litvalue as BoolLiteral).isBool().booleanValue;
	   				return b;
	   			}
	   		}
	   	}
	   			
	}
	   	
	def getIntValue(UnityObject a,String b){
		for (q: a.configurations){
	   		for (w: q.configs){
	   			if (w.propertyName.name == b){
	 				return (intExtractor(w.propertyValue));
	   			}
	   		}
	   	}
	   	return 0;
	}
	   	
	 
	def getRealValue(UnityObject a,String b){
		for (q: a.configurations){
			for (w: q.configs){
				if (w.propertyName.name == b){
						return (realExtractor(w.propertyValue));
				}
			}
		}
		return 0.0;
	}	   		
	def getStringValue(UnityObject a,String b){
		for (q: a.configurations){
			for (w: q.configs){
				if (w.propertyName.name == b){
					return (stringExtractor(w.propertyValue));
	   				}
	   			}
	   		}
		return "";
	}
	   		
	def getBoolValue(UnityObject a,String b){
		for (q: a.configurations){
			for (w: q.configs){
				if (w.propertyName.name == b){
					return ((boolExtractor(w.propertyValue)));
				}
			}
		}
		return false;
	}
	def String getVarType(Attribute p) {
   		if (p.propertyType.name == 'bool'){
   			return 'bool'
   		}
   		else if (p.propertyType.name ==  'int'){
   			return 'int'
   		}
   		else if (p.propertyType.name == 'string'){
   			return 'string'
   		}
   		else {
   			return 'double'
   		}
   	}
   	def String getVarType(VarType p) {
   		if (p === null){
   			return ''
   		}
   		else if (p.name ==  'bool'){
   			return 'bool'
   		}
   		else if (p.name ==  'int'){
   			return 'int'
   		}
   		else if (p.name == 'string'){
   			return 'string'
   		}
   		else {
   			return 'double'
   		}
   	}
	   		
	def sizeAndScale(UnityObject e,String a)'''
	t.localScale = new Vector3 («e.getRealValue("sizeX")»f,«e.getRealValue("sizeY")»f,«e.getRealValue("sizeZ")»f);
	t.localPosition = new Vector3(«e.getRealValue("posX")»f,«e.getRealValue("posY")»f,«e.getRealValue("posZ")»f);
	'''
   		// --- script definitions ---
   	def generic(Instance e) '''
   		using System.Collections;
   		using System.Collections.Generic;
   		using UnityEngine;
   		public class «e.name»Script : «e.instanceType.type.name»MetaObject {
   			public sateliteCameraScript cam;
   			void Start () {
   				Rigidbody rb = gameObject.GetComponent<Rigidbody> ();
   				rb.mass = «getIntValue(e.instanceType,"mass")»;
   				«sizeAndScale(e.instanceType,e.instanceType.type.kind)»
   				
   				// load all meshes in model and find the specified mesh
   				MeshFilter myMeshFilter = gameObject.GetComponent<MeshFilter> ();
   				GameObject loadedModel = Resources.Load("«getStringValue(e.instanceType,"model")»") as GameObject; 
   				// first check object, if not found then check all children.
   				if (loadedModel.GetComponent<MeshFilter> () != null && loadedModel.GetComponent<MeshFilter> ().sharedMesh.name ==("
«getStringValue(e.instanceType,"mesh")»")) {
   					myMeshFilter.mesh = loadedModel.GetComponent<MeshFilter> ().sharedMesh;
   				} else {
   					MeshFilter[] loadedMeshFilters = loadedModel.GetComponentsInChildren<MeshFilter> ();
   					foreach (MeshFilter mf in loadedMeshFilters) { 
   						if (mf.sharedMesh.name == "«getStringValue(e.instanceType,"mesh")»") {
   							myMeshFilter.mesh = mf.sharedMesh; 
   							break;
   						}
   					}
   				}
   				// Set the renderer to specified image 
   				Renderer myRenderer = gameObject.GetComponent<Renderer>();
   				myRenderer.material = new Material(Shader.Find("Diffuse"));
   				myRenderer.material.mainTexture = Resources.Load("«getStringValue(e.instanceType,"texture")»") as Texture;
   				// Set Collider
   				MeshCollider myMeshCollider = gameObject.GetComponent<MeshCollider> ();
   				myMeshCollider.sharedMesh = myMeshFilter.mesh;
   				
   			}
   			// -- add all new actions
   			   		   	«FOR a:e.instanceType.newActions»
   			   		   	«IF a.name.equals("place")»
   			   		   	«ELSE»
   			   		«var counter=0»
   			   		«var counter2=0»
   			   		«var returnVal = ""»
   			   		«var VarType returnType = null»
   			   		   	«IF a !== null»
   			   		   	public «IF a.returnPayload === null»void«ELSE»«FOR b:a.returnPayload.params»«IF b.type.name.equals("int")&&
   			   		   	counter2==0»int«{counter2++;null}»«{returnVal = b.name;null}»«{returnType = b.type;null}»«ELSEIF 
   			   		   	b.type.name.equals("string")&&counter2==0»string«{counter2++;null}»«{returnVal = b.name;null}»
«{returnType = b.type;null}»«ELSEIF b.type.name.equals("real")&&counter2==0»double«{counter2++;null}»
«{returnVal = b.name;null}»«{returnType = b.type;null}»«ELSEIF b.type.name.equals("bool")&&counter2==0»boolean«{counter2++;null}»
«{returnVal = b.name;null}»«{returnType = b.type;null}»«ENDIF»«ENDFOR»«ENDIF» «a.name»(«IF a.payload !== null»
«FOR b:a.payload.params»«b.type.name» «b.name»«{counter++;null}»«IF counter<a.payload.params.length»,«ENDIF»«ENDFOR»«ENDIF»){
   			   		   		«IF a.returnPayload !== null»«getVarType(returnType)» «returnVal»;«ENDIF»
   			   		   		«FOR v:a.expressions»
   			   		   		«stringify(v,'',e.instanceType.type)»;
   			   		   		«ENDFOR»
   			   		   		«IF a.returnPayload !== null»return «returnVal»;«ENDIF»
   			   		   	}
   			   		   		«ENDIF»
   			   		   		«ENDIF»
   			   		   		«ENDFOR»
   			   		   
   			   		   	// -- End adding all new actions
   			   		   	// -- overide existing actions
   			   		   	«FOR a:e.instanceType.overrideActions»
   			   		   	   	public override string «a.actionName.name»(){
   			   		   	   		base.«a.actionName.name»();
   			   		   	   		«FOR v:a.expressions»
   			   		   	   		«stringify(v,'',e.instanceType.type)»;
   			   		   	   		«ENDFOR»
   			   		   	   		   	}
   			   		   	 «ENDFOR»
   			   		   	 // -- End overrideActions
   			   		   	 
   			   		   	 // -- Handle incoming message
   			   			public string translate(string message){
   			   				// -- Update basic object properties
   			   				statusUpdate();
   			   				//--Get parameters as strings.
   			   				string name = message.Substring (0, message.IndexOf ('('));
   			   				message = cut(message,'(');
   			   				string [] param = extractParam(message);
   			   				
   			   				
   			   				
   			   		   	«FOR a:e.instanceType.newActions»
   			   		   	«var counter=0»
   			   		   		if(name == "«a.name»"){
   			   		   			«IF a.name.equals("place")»
   			   		   			   	GameObject temp = (GameObject)Instantiate(Resources.Load("«FOR z:a.expressions»
   	«stringExtractor(z)»«ENDFOR»"),transform.position,transform.rotation);
   			   		   			   	temp.transform.Rotate(90f,0,0);
   			   		   			   	lastx = transform.position.x;
   			   		   			   	lastz = transform.position.z;
   			   		   			«ELSE»
   			   		   		«IF a.returnPayload !== null»return ""+«ENDIF» «a.name»(«IF a.payload !== null»
«FOR b:a.payload.params»«IF b.type.name.equals("int")»Int32.Parse«ENDIF»«IF b.type.name.equals("bool")»Boolean.Parse«ENDIF»
«IF b.type.name.equals("real")»double.Parse«ENDIF»(param[«counter++»])«IF counter<a.payload.params.length»,«ENDIF»«ENDFOR»«ENDIF»);
   			   		   		«ENDIF»
   			   		   		 }
   			   		   	«ENDFOR»
   			   		   	«FOR a:e.instanceType.type.actions»
   			   		   	«var counter=0»
   			   		   		if(name == "«a.name»"){
   			   		   		«IF a.returnPayload !== null»return ""+«ENDIF» «a.name»(«IF a.payload !== null»
«FOR b:a.payload.params»«IF b.type.name.equals("int")»Int32.Parse«ENDIF»«IF b.type.name.equals("bool")»Boolean.Parse«ENDIF»
«IF b.type.name.equals("real")»double.Parse«ENDIF»(param[«counter++»])«IF counter<a.payload.params.length»,«ENDIF»«ENDFOR»«ENDIF»);
   			   		   		}
   						«ENDFOR»
   			   		   	«IF e.instanceType.type.actions.length != 0 && e.instanceType.newActions.length != 0»		
   			   		   		else return "";
   			   		   	«ENDIF»
   			   		   	return "";
   			   		   	} 
   			   		   	// -- End message handling
   			
   			void Update () {
   				// on going monitoring or changing things based on object
   			}
   			void focus(){
   				cam.observedObject = gameObject;
   			}
   			// -- utils
   			   		     public string cut(string message,char cutter){
   			   		   	 	return message.Substring(message.IndexOf(cutter)+1);
   			   		   	}
   			   		   	public string[] extractParam(string message){
   			   		   		message = message.Substring(message.IndexOf("(")+1,(message.IndexOf(")")));
   			   		   	    return message.Split(',');
   			   		   	}
   		}
   		'''
   		// --- starter needs all game object prefabs to be declared and attached
   	def starter(ENV e)'''
   		using System.Collections;
   		using System.Collections.Generic;
   		using UnityEngine;
   		   		
   		public class starter : MonoBehaviour {
   		// ---- These must be assigned as prefabs in Unity and as "metaobjects" in the DSL
   			public sateliteCameraScript Camera;

   			
   			GameObject CameraObject;
   		«FOR k:e.instances»
   			GameObject «k.name»Object;
   		«ENDFOR»
   		//-----
   			void Start () {
   			Application.runInBackground = true;
   		//-- adding the necessary instances
   			CameraObject = (GameObject)Instantiate (Resources.Load("CameraController"),transform);
   		   	
   		   	«FOR k:e.instances»
   		   		«k.name»Object = (GameObject)Instantiate (Resources.Load("«k.instanceType.type.name»"),transform);
   		   		«k.name»Object.AddComponent<«k.name»Script>();
   		   	«ENDFOR»
   		//adding the necessary channel information scripts	
   			Camera = CameraObject.GetComponent<sateliteCameraScript>();
   		   	Camera.observedObject = «e.focus.focusObject.name»Object;
   		   	Camera.off = new Vector3(«e.focus.dx»f,«e.focus.dy»f,«e.focus.dz»f);
   		   	«FOR k:e.channels»
   		   	gameObject.AddComponent<ChannelController«k.name»>();
   		   	«ENDFOR»
   			}
   				void Update(){//«var i = 0»
   				«FOR k:e.instances»
   				
   					if (Input.GetKeyDown(KeyCode.Alpha«i=i+1»)){
   						Camera.observedObject = «k.name»Object;
   					}
   					«ENDFOR»
   					if (Input.GetKeyDown(KeyCode.Z)){
   						Camera.follow = true;
   					}
   					if (Input.GetKeyDown(KeyCode.X)){ 
   						Camera.follow = false;
   					}
   					if (Input.GetKeyDown(KeyCode.LeftArrow)){
   								Camera.transform.Rotate (0, -10, 0);
   							}
   							if (Input.GetKeyDown(KeyCode.RightArrow)){
   								Camera.transform.Rotate (0, 10, 0);
   							}
   				}
   		}
   		'''
   		
   		def channelcontroller(Channel c)'''
   		using System.Collections;
   		using System.Collections.Generic;
   		using UnityEngine;
   		
   		public class ChannelController«c.name» : MonoBehaviour {
   			public Network externalComm;
   			public string myName = "«c.name»";
   		
   			void Start () {
   				externalComm = new Network(«c.port.portnumber»,myName,20); // port, net ID, Container size
   				externalComm.StartNetwork();
   			}
   		
   			void Update () {
   				if (externalComm.isContainerEmpty () == false) {
   					route(externalComm.getMessage());
   				}
   			}
   			
   		// take out the important information from the message
   			public void route(string S){
   				if (S != null && S.Equals("")== false && S.Length>0) {
   					string name = S.Substring (0, S.IndexOf (','));
   					S = cut (S);
   		// send the message on to the designated recipient inout
   		
   			«FOR q: c.boundInstances»
   				if (name == "«q.name»") {
   					«q.name»Script «q.name» = GetComponentInChildren<«q.name»Script> ();
   				
   					// send the action name, return the reply that is generated
   					string reply = «q.name».translate (S);
   					// if there is a reply send one
   					if (reply.Equals("") == false && reply != null&& S.Length>0)
   						externalComm.SendMessage("«q.name»,"+reply+";");
   					}
   		«ENDFOR»
   				}
   			}
   			public string cut(string message){
   				return message.Substring(message.IndexOf(',')+1);
   			}
   		}
   		'''

   		def getValue(String s){
   		return s.substring(s.indexOf(":")+1)
   		}
   		
   		def extractType(String s){
   			return s.substring(s.indexOf("<")+1,s.indexOf(">"));
   		}
   		
   		def extractName(String s){
   			return s.substring(0,s.indexOf("="));
   		}
   		
   		def readLibInit(String s)'''
   		«FOR a:lines»
   		«IF a.contains(s+":")»
   		public «extractType(getValue(a))» «extractName(getValue(a))»;
   		«ENDIF»
   		«ENDFOR»
   		'''
   		def allClass (MetaObject m)'''
   		using UnityEngine;
   		using System.Collections;
   		
   		public class «m.name»MetaObject : MonoBehaviour {
   			
   			public Transform t;
   			// --- Get neccessary access components
   			«readLibInit(m.name)»
   			// --- End Get neccessary access components
   			
   			public double posx;
   			public double posy;
   			public double posz;
   			
   			public double sizex;
   			public double sizey;
   			public double sizez;
   			
   			public double rotx;
   			public double roty;
   			public double rotz;
   			
   			void update(){
   				posx = t.localPosition.x;
   				posy = t.localPosition.y;
   				posz = t.localPosition.z;
   				
   				sizex = t.localScale.x;
   				sizey = t.localScale.y;
   				sizez = t.localScale.z;
   			}
   			
   			public void requiredStart(){
   				t = GetComponent<Transform>();
   				// --- Load components
   				«FOR a:lines»
   				«IF a.contains(m.name+":")»
   				«a.substring(a.indexOf(":")+1)»
   				«ENDIF»
   				«ENDFOR»
   				// --- End Load components
   			}
   		
   			   // -- DSL generated "actions"

   		«var isStart = false»
   		«FOR a:m.actions»
   		«var counter=0»
   		«var commas=false»
   		«IF a !== null»
   		
   			 public «IF a.returnPayload === null»void«ELSE»string«ENDIF» «a.name»(«IF
   			   		 a.payload !== null»«FOR b:a.payload.params»«getVarType(b.type)» «b.name»«{counter++;null}»«IF
   			   		  counter<a.payload.params.length»,«ENDIF»«ENDFOR»«ENDIF»){
   		
   		«IF a.returnPayload!== null»«FOR u:a.returnPayload.params»
   		«IF u.type!== null»«getVarType(u.type)»«ENDIF» «u.name»;
   		«ENDFOR»«ENDIF»
   			
   			«IF a.name == "Start"»requiredStart();«{isStart =true;null}»«ENDIF»
   			«FOR v:a.expressions»
   			«stringify(v,'',m)»;
   			«ENDFOR»
   			
   			«IF a.returnPayload !== null»return «FOR u:a.returnPayload.params»«IF
   			commas==true»+","+«ELSE»«{commas=true;null}»«ENDIF»«u.name»«ENDFOR»+"";«ENDIF»
   			}
   			«ENDIF»
   			«ENDFOR»
   		
   			«IF isStart== false» // if start is not defined in metaobject we define it here.
   			void Start(){
   				requiredStart();
   			}
   			   			«ENDIF»
   			// -- End DSL generated functions

   			// --- Utility functions

   			public string cut(string message,char cutter){
   				return message.Substring(message.IndexOf(cutter)+1);
   			}
   			
   			public string[] extractParam(string message){
   				message = message.Substring(message.IndexOf("(")+1,(message.IndexOf(")")));
   				return message.Split(',');
   			}
   		}
   		'''
   		
def allObject (Instance e)'''
using System.Collections;
using System.Collections.Generic;
using System;
using UnityEngine;

public class «e.name»Script : «e.instanceType.type.name»MetaObject {
	public string channelID;

	// --- auto declare all "properties"
   	«FOR a:e.instanceType.properties»
	«IF a.propertyType.name == "int"»int «a.name»;
   	«ENDIF»
   	«IF a.propertyType.name == "real"»double «a.name»;
   	«ENDIF»
   	«IF a.propertyType.name == "string"»string «a.name»;
   	«ENDIF»
   	«IF a.propertyType.name == "bool"»bool «a.name»;
   	«ENDIF»
   	«ENDFOR»
	// --- End auto declare properties

	// --- Initialize object size/position
	void Start(){
		requiredStart();
		«sizeAndScale(e.instanceType,e.instanceType.type.name)»
	}
	// --- End start function
	
	// --- Add all new actions

	// -- DSL generated "actions"
	«var isStart = false»
   	«FOR a:e.instanceType.newActions»
«var counter=0»
«var commas=false»
   	«IF a !== null»
   	public «IF a.returnPayload === null»void«ELSE»string«ENDIF» «a.name»(«IF
   			 a.payload !== null»«FOR b:a.payload.params»«getVarType(b.type)» «b.name»«{counter++;null}»«IF
   			  counter<a.payload.params.length»,«ENDIF»«ENDFOR»«ENDIF»){
   			 «IF a.returnPayload!== null»«FOR u:a.returnPayload.params»
   		«IF u.type!== null»«getVarType(u.type)»«ENDIF» «u.name»;
   		«ENDFOR»«ENDIF»
   			«IF a.name == "Start"»requiredStart();«{isStart =true;null}»«ENDIF»
   			«FOR v:a.expressions»
   			«stringify(v,'',e.instanceType.type)»;
   			«ENDFOR»
   			«IF a.returnPayload !== null»return «FOR u:a.returnPayload.params»«IF
   			commas==true»+","+«ELSE»«{commas=true;null}»«ENDIF»«u.name»«ENDFOR»+"";«ENDIF»
   		}
   			«ENDIF»
   		«ENDFOR»
	// --- End adding all new actions
	// --- Overide existing actions
	«FOR a:e.instanceType.overrideActions»
		public override string «a.actionName.name»(){
		base.«a.actionName.name»();
   		«FOR v:a.expressions»
			«stringify(v,'',e.instanceType.type)»;
		«ENDFOR»
		}
   		 «ENDFOR»
	// --- End overrideActions

	// --- Begin message handling
	public string translate(string message){	   				
	//--Get parameters as strings.
		string name = message.Substring (0, message.IndexOf ('('));
		message = cut(message,'(');
		string [] param = extractParam(message);

   	«FOR a:e.instanceType.newActions»
   	«var counter=0»
   		if(name == "«a.name»"){
   			«IF a.returnPayload !== null»return ""+«ENDIF» «a.name»(«IF a.payload !== null»«FOR b:a.payload.params»«IF 
   			b.type.name.equals("int")»Int32.Parse«ENDIF»«IF b.type.name.equals("bool")»Boolean.Parse«ENDIF»«IF 
   			b.type.name.equals("real")»double.Parse«ENDIF»(param[«counter++»])
«IF counter<a.payload.params.length»,«ENDIF»«ENDFOR»«ENDIF»);
   		}
   	«ENDFOR»
   	«FOR a:e.instanceType.type.actions»
	«var counter=0»
		if(name == "«a.name»"){
   			«IF a.returnPayload !== null»return ""+«ENDIF» «a.name»(«IF a.payload !== null»«FOR b:a.payload.params»«IF 
				b.type.name.equals("int")»Int32.Parse«ENDIF»«IF b.type.name.equals("bool")»Boolean.Parse«ENDIF»«IF 
				b.type.name.equals("real")»double.Parse«ENDIF»(param[«counter++»])
«IF counter<a.payload.params.length»,«ENDIF»«ENDFOR»«ENDIF»);
		}
   	«ENDFOR»
   	«IF e.instanceType.type.actions.length != 0 && e.instanceType.newActions.length != 0»	else return "";
	«ENDIF»
	return "";
	}
	// --- End message handling
}
'''

   		
   		def readme (ENV a)'''
   		-----------------------------------------------------------------------
   		Generated with SimGen v1.0.0
   		Created by Michal Pasternak at Queen's University MASE lab
   		-----------------------------------------------------------------------
   		This generated simulation "«a.name»" was created by: «a.author.authorString»
   		The purpose of this simulation is to:"«a.purpose.purposeString»"
   		
   		NOTICE!!!
   		«FOR b:a.channels»
   		
   		Channel «b.name» requires port «b.port.portnumber» to be available for connection on the host machine.
   		«ENDFOR»
   		-----------------------------------------------------------------------
   		
   		«FOR b:a.channels»
   		Connecting on Port «b.port.portnumber» will allow you to control: «var s =false»«FOR c:b.boundInstances»«IF s==false»«{s=true;null}»«c.name»«ELSE», «c.name»«ENDIF»«ENDFOR»
   		
   		«ENDFOR»
   		«var names = ""»«FOR b:a.instances»«IF b.instanceType.newActions.length==0&&b.instanceType.type.actions.length==0»
«{names=names+b.name+" ";null}»«ENDIF»«ENDFOR»
   		«IF names!= ""»WARNING: The following instantiated objects can not be controlled: «names»«ENDIF»
 
   		«FOR b:a.instances»
   		«IF b.instanceType.newActions.length!=0»
   		
   		-----------------------------------------------------------------------
   		
   		You can interact with «b.name» by using these actions:
   		
   		«FOR c:b.instanceType.newActions»
   		Action: «c.name»
   		Message Syntax: «b.name»,«c.name»«var s =false»(«IF c.payload!== null»«FOR d:c.payload.params»«IF s== false»«{s=true;null}»«ELSE»,«ENDIF»«d.type.name»«ENDFOR»«ENDIF»)
   		Returns: «IF c.returnPayload!== null»String in form "«b.name»,«{s =false;null}»«FOR d:c.returnPayload.params»«IF s== false»«{s=true;null}»«ELSE»,«ENDIF»«d.type.name»«ENDFOR»;"«ELSE» No Return«ENDIF»
   		Description: «IF c.description!==null»«c.description.purposeString»«ELSE»no description provided«ENDIF»
   		
   		«ENDFOR»«ENDIF»
   		«IF b.instanceType.type.actions.length!=0»
   		 
   		-----------------------------------------------------------------------
   		«b.name» inherits these actions from the metaModel:
   		
   		«FOR c:b.instanceType.type.actions»  
   		Action: «c.name»
   		Message Syntax: «b.name»,«c.name»«var s =false»(«IF c.payload!== null»«FOR d:c.payload.params»«IF s== false»«{s=true;null}»«ELSE»,«ENDIF»«d.type.name»«ENDFOR»«ENDIF»)
   		Returns: «IF c.returnPayload!== null»String in form "«b.name»,«{s =false;null}»«FOR d:c.returnPayload.params»«IF s== false»«{s=true;null}»«ELSE»,«ENDIF»«d.type.name»«ENDFOR»;"«ELSE» No Return«ENDIF»
   		Description: «IF c.description!==null»«c.description.purposeString»«ELSE»no description provided«ENDIF»
   		
   		«ENDFOR»
   		«ENDIF»
   		«ENDFOR»
   		
   		'''
   		
   		}
   		
   		