package cs.queensu.ca.scoping

import cs.queensu.ca.unity.DotExpression
import cs.queensu.ca.unity.SingleRef
import cs.queensu.ca.unity.UnityObject
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import cs.queensu.ca.unity.OverrideAction
import org.eclipse.xtext.scoping.Scopes
import cs.queensu.ca.unity.ConfigAssignment
import cs.queensu.ca.unity.Instance
import cs.queensu.ca.unity.Param
import cs.queensu.ca.unity.Identifier
import cs.queensu.ca.unity.Action
import cs.queensu.ca.unity.ENV
import cs.queensu.ca.unity.Property

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class UnityScopeProvider extends AbstractUnityScopeProvider {
//class AutoModelScopeProvider extends AbstractDeclarativeScopeProvider {
   private static final Logger logger = Logger.getLogger(UnityScopeProvider.getName() );
   
//////*/
	def int containerLevel(EObject o, Class<?> ownerType){
		var int i=1
		var EObject tempObject=o.eContainer
		while (tempObject!==null){
			if (ownerType.isInstance(tempObject))
				return i
			tempObject=tempObject.eContainer
			i=i+1
		}
		return 0
	}   
	def EObject containerOfType(EObject o, Class<?> ownerType){
		var int i=1
		var EObject tempObject=o.eContainer
		while (tempObject!==null){
			if (ownerType.isInstance(tempObject))
				return tempObject
			tempObject=tempObject.eContainer
			i=i+1
		}
		return null
	}   
   
///////	
	//def dispatch IScope extractScop(DotExpression exp,EReference ref){
		/*var scop=IScope::NULLSCOPE
		if (exp.partRef1 instanceof PartRef){
			var partRef1=exp.partRef1
			switch((partRef1 as PartRef).partRef){
				UnityObject: scop=extractScop((partRef1 as PartRef).partRef,ref)
				
				ENV: scop=extractScop((partRef1 as PartRef).partRef as ENV,ref)
				default: return scop
			}
		}
		else if (exp.partRef1 instanceof DotExpression)	{
		//	if ((exp.partRef1 as   DotExpression).tail instanceof Signal)
				scop=extractScop((exp.partRef1 as   DotExpression).tail,ref)
		}	
		scop	*/	
	//} 
///////
	//def dispatch IScope extractScop(UnityObject com,EReference ref){
		/*var scop=IScope::NULLSCOPE
		if(com.actionBodies!==null){
			actionBodies: (com.actionBodies as actionBodies).extractScop(ref)
		}
		else if(com. ){
			Actuator: (com.type as Actuator).extractScop(ref)
		}
		else if (com. ){
		}
		else{
			 scop
		}	*/
	//}
	
//////*/	 
	def dispatch IScope extractScop(SingleRef sr,EReference ref){
		
		var scop=IScope::NULLSCOPE
		println (scop)
		/*if (sr.containerOfType(Identifier)!==null && sr.containerOfType(Action)!==null && 
			sr.containerOfType(Actuator)!==null){
			var Actuator a1=p.containerOfType(Actuator) as Actuator
			scop=Scopes::scopeFor(a1.attributes)
			var Action ac1=p.containerOfType(Action) as Action
			if (ac1.trigger.triggerSignal!==null)
				scop=Scopes::scopeFor(ac1.trigger.triggerSignal.payload.params,scop)
			println(scop)		
		}
		scop*/
	}

//////*/
	def dispatch IScope extractScop(DotExpression exp,EReference ref){
		var scop=IScope::NULLSCOPE
		if (exp.head instanceof SingleRef){
			var singleRef=exp.head
			switch((singleRef as SingleRef).singleRef){
				Property: scop=extractScop((singleRef as Property),ref)
				//Param: scop=extractScop((singleRef as Param),ref)
				//default: return scop
			}
		}
		else if (exp.head instanceof DotExpression)	{
		//	if ((exp.partRef1 as   DotExpression).tail instanceof Signal)
				//scop=extractScop((exp.head as DotExpression).tail,ref)
		}	
		super.getScope(exp,ref);
		
	} 
	
//////*/
	def dispatch IScope extractScop(Property pro,EReference ref){
		var scop=IScope::NULLSCOPE
		switch(pro){
			Instance: scop=extractScop((pro as Instance), ref)
			Param: scop=extractScop((pro as Param), ref)
			
		}	
	}

//////*/
	def dispatch IScope extractScop(Instance ins,EReference ref){
		var scop=IScope::NULLSCOPE
			scop=Scopes::scopeFor (ins.instanceType.properties)
			scop=Scopes::scopeFor(ins.instanceType.type.properties)
	}
//////*/
	def dispatch IScope extractScop(Param param,EReference ref){
		
	}
//////*/
	def dispatch IScope extractScop(OverrideAction overrideAct,EReference ref){
		var scop=IScope::NULLSCOPE
		var UnityObject parentObj=overrideAct.containerOfType(UnityObject) as UnityObject
		if (parentObj!==null){
			if (parentObj.type!==null)
				scop=Scopes::scopeFor(parentObj.type.actions)
		}
		return scop
	} 
//////*/
	def dispatch IScope extractScop(ConfigAssignment configAssig, EReference ref){
		var scop=IScope::NULLSCOPE
		var UnityObject parentObj=configAssig.containerOfType(UnityObject) as UnityObject
		if (parentObj!==null){
			if (parentObj.type!==null)
				scop=Scopes::scopeFor(parentObj.type.properties)
		}
		return scop
	}
	
	override getScope(EObject context, EReference reference) {
    	
    	var parentScope = IScope::NULLSCOPE
    	switch (context){
    		OverrideAction: 
					return extractScop(context as OverrideAction, reference)
    		ConfigAssignment:
					return extractScop(context as ConfigAssignment, reference)
    		SingleRef:
    				return (context as SingleRef).extractScop(reference)
    		DotExpression: 
					return (context as DotExpression).extractScop(reference)
    		
    		default: super.getScope(context,reference)
    	}  
		super.getScope(context,reference)
    }
}

 
 
 
/*class UnityScopeProvider extends AbstractUnityScopeProvider {
	
	override getScope(EObject context, EReference reference) {
    	switch (context){
    		DotExpression: {
    				var exp=context
    				if (!(exp.partRef1 instanceof PartRef))
    					return super.getScope(context, reference)			
    				var PartRef mainRef=exp.partRef1 as PartRef
    				var MetaObject mto=mainRef.partRef as MetaObject
					var UnityObject uo=mainRef.partRef as UnityObject
					if (mainRef.partRef==UnityObject){		
    						println(mto.properties)
    						Scopes::scopeFor(mto.properties)    								
    				}	
    				else if (mainRef.partRef==ENV){
    						println(mto.properties)
    						Scopes::scopeFor(mto.properties)	
    				}				
					
					else { 
							super.getScope(context,reference)
					}
    			}
    	}  

    }

    
}*/
