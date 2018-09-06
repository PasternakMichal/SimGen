package cs.queensu.ca.generator

import com.google.inject.Injector
import cs.queensu.ca.UnityStandaloneSetup
import cs.queensu.ca.unity.BoolLiteral
import cs.queensu.ca.unity.Channel
import cs.queensu.ca.unity.ENV
import cs.queensu.ca.unity.Expression
import cs.queensu.ca.unity.Instance
import cs.queensu.ca.unity.IntLiteral
import cs.queensu.ca.unity.Literal
import cs.queensu.ca.unity.StLiteral
import cs.queensu.ca.unity.UnityObject
import java.io.IOException
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.XtextResourceSet
import cs.queensu.ca.unity.MetaObject
import cs.queensu.ca.unity.impl.PropertyImpl
import cs.queensu.ca.unity.impl.IdentifierImpl
import cs.queensu.ca.unity.impl.MultiplicationImpl
import cs.queensu.ca.unity.impl.AdditionImpl
import cs.queensu.ca.unity.impl.AssignImpl
import cs.queensu.ca.unity.impl.ModuloImpl
import cs.queensu.ca.unity.impl.DivideImpl
import cs.queensu.ca.unity.impl.MinusImpl
import cs.queensu.ca.unity.UnaryExpression
import cs.queensu.ca.unity.impl.SingleRefImpl
import cs.queensu.ca.unity.Ref
import cs.queensu.ca.unity.Attribute
import cs.queensu.ca.unity.VarType
import java.io.FileReader
import java.util.Set
import static extension com.google.common.io.CharStreams.*

class ChannelGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//----- Unity File Generation -----
		println("Checking config file2...");

		generateChannelCode(resource,fsa,context);

	}
	
	def generateChannelCode(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		for (a: resource.allContents.toIterable.filter(ENV)){
			// ------- Create Unity scripts for each metaobject -------
   			for (c: a.channels){
   				fsa.generateFile(("Simulator/"+"ChannelController"+c.name+".cs"),channelcontroller(c));
   			}
   		}		
		
	}
	
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
   		
   			// Update is called once per frame
   			void Update () {
   				if (externalComm.isContainerEmpty () == false) {
   					route(externalComm.getMessage());
   				}
   		
   			}
   			
   			// take out the important information from the message
   				public void route(string S){
   					if (S != null || S.Equals("")== false) {
   						string name = S.Substring (0, S.IndexOf (','));
   						S = cut (S);
   						// send the message on to the designated recipient inout
   		«FOR q: c.boundInstances»
   			if (name == "«q.name»") {
   				«q.name»Script «q.name» = GetComponentInChildren<«q.name»Script> ();
   				
   				// send the action name, return the reply that is generated
   				string reply = «q.name».translate (S);
   				
   				
   				// if inout, then do this if in only don't 
   				if (reply.Equals("") == false || reply != null)
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
   	
}