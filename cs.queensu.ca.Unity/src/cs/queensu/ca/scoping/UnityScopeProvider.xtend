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

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class UnityScopeProvider extends AbstractUnityScopeProvider {
//class AutoModelScopeProvider extends AbstractDeclarativeScopeProvider {
   private static final Logger logger = Logger.getLogger(UnityScopeProvider.getName() );
   
////
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
	def dispatch IScope extractScop(DotExpression exp,EReference ref){
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
	} 
///////
	def dispatch IScope extractScop(UnityObject com,EReference ref){
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
	}
///////	 
	def dispatch IScope extractScop(SingleRef p,EReference ref){
		/*var scop=IScope::NULLSCOPE
		if (p.containerOfType(Identifier)!==null && p.containerOfType(Action)!==null && 
			p.containerOfType(Actuator)!==null){
			var Actuator a1=p.containerOfType(Actuator) as Actuator
			scop=Scopes::scopeFor(a1.attributes)
			var Action ac1=p.containerOfType(Action) as Action
			if (ac1.trigger.triggerSignal!==null)
				scop=Scopes::scopeFor(ac1.trigger.triggerSignal.payload.params,scop)
			println(scop)		
		}
		scop*/
	}
///////
	/*def dispatch IScope extractScop(Signal sig,EReference ref){
		var scop=IScope::NULLSCOPE
		scop=Scopes::scopeFor(sig.payload.params)	
	} 
////
	def dispatch IScope extractScop(Sensor sen,EReference ref){
		var scop=IScope::NULLSCOPE
		scop=Scopes::scopeFor(sen.signals)		
	} 
/////*/
	def dispatch IScope extractScop(OverrideAction overrideAct,EReference ref){
		var scop=IScope::NULLSCOPE
		var UnityObject parentObj=overrideAct.containerOfType(UnityObject) as UnityObject
		if (parentObj!==null){
			if (parentObj.type!==null)
				scop=Scopes::scopeFor(parentObj.type.actions)
		}
		return scop
	} 

	override getScope(EObject context, EReference reference) {
    	
    	var parentScope = IScope::NULLSCOPE
    	switch (context){
    		OverrideAction: 
					return extractScop(context as OverrideAction, reference)
    		
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
