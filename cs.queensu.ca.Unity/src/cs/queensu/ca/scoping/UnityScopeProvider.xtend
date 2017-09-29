package cs.queensu.ca.scoping

import cs.queensu.ca.unity.Action
import cs.queensu.ca.unity.DotExpression
import cs.queensu.ca.unity.Expression
import cs.queensu.ca.unity.Identifier
import cs.queensu.ca.unity.Instance
import cs.queensu.ca.unity.MetaObject
import cs.queensu.ca.unity.OverrideAction
import cs.queensu.ca.unity.Config
import cs.queensu.ca.unity.Param
import cs.queensu.ca.unity.Payload
import cs.queensu.ca.unity.Property
import cs.queensu.ca.unity.SingleRef
import cs.queensu.ca.unity.UnityObject
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import cs.queensu.ca.unity.ConfigAssignment
import cs.queensu.ca.unity.Init
import cs.queensu.ca.unity.ENV
import cs.queensu.ca.unity.Attribute

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
   

//////*/	 
	def dispatch IScope extractScop(SingleRef sr,EReference ref){
		
		var scop=IScope::NULLSCOPE
		scop=super.getScope(sr.eContainer,ref);
		//println (scop)
		
		
		
		
		if (sr.containerOfType(Action)!==null){
			var Action action=sr.containerOfType(Action) as Action;
			if ((action.payload as Payload)!=null)
			scop=Scopes::scopeFor((action.payload as Payload).params,scop)
			if ((action.returnPayload as Payload)!=null)
			scop=Scopes::scopeFor((action.returnPayload as Payload).params,scop)
			//var MetaObject metaObj=(sr.containerOfType(UnityObject) as UnityObject).type ?: null;
			
		}
		if (sr.containerOfType(MetaObject)!==null){
			var MetaObject metaObj=sr.containerOfType(MetaObject) as MetaObject;
			scop=Scopes::scopeFor(metaObj.properties,scop)

		}
		
		if (sr.containerOfType(UnityObject)!==null){
			var MetaObject uniObj=(sr.containerOfType(UnityObject) as UnityObject).type;
			if (uniObj.properties!==null)
				scop=Scopes::scopeFor(uniObj.properties,scop)

		}
		
		if (sr.containerOfType(Config)!==null && sr.containerOfType(UnityObject)!==null ){
			var MetaObject metaObj=(sr.containerOfType(UnityObject) as UnityObject).type ?: null;
			var UnityObject unityObj=(sr.containerOfType(UnityObject) as UnityObject) ?: null;
			scop=Scopes::scopeFor(metaObj.properties,scop)
			scop=Scopes::scopeFor(unityObj.properties,scop);

		}
		if (sr.containerOfType(OverrideAction)!==null && sr.containerOfType(UnityObject)!==null ){
			var MetaObject metaObj=(sr.containerOfType(UnityObject) as UnityObject).type ?: null;
			scop=Scopes::scopeFor(metaObj.properties,scop)
			var Action refAction=((sr.containerOfType(OverrideAction) as OverrideAction).actionName)
	        //var Action refAction=metaObj.actions.findFirst[name==actionName];
	        scop=Scopes::scopeFor(refAction.payload.params,scop)
	        scop=Scopes::scopeFor(refAction.returnPayload.params,scop)
		}

		println (scop)
		scop

	}

//////*/
	def dispatch IScope extractScop(DotExpression exp,EReference ref){
		var scop=IScope::NULLSCOPE
		if (exp.head instanceof SingleRef){
			var SingleRef head=exp.head as SingleRef
			switch(head.singleRef){
				Instance: 
					scop=extractScop((head.singleRef as Instance),ref)
				Property:
					scop=extractScop((head.singleRef as Property),ref)
				default: 
					return scop  // the attribute and Param can not be head of Dot expression
			}
		}
		else if (exp.head instanceof DotExpression)	{
				return scop // we do not have DotExpression more that two level, means we only have a.1 and not a.a1.1
		}	
		//super.getScope(exp,ref);
		
	} 
	
//////*/
	def dispatch IScope extractScop(Property pro,EReference ref){
		var scop=IScope::NULLSCOPE
		switch(pro){
			Instance: scop=extractScop((pro as Instance), ref)
			Param: scop=extractScop((pro as Param), ref)
			Attribute: scop=extractScop((pro as Attribute), ref)
			
		}	
	}

/////////////////
def dispatch IScope extractScop(Attribute att,EReference ref){
			
	}


//////*/
	def dispatch IScope extractScop(Instance ins,EReference ref){
		var scop=IScope::NULLSCOPE
			scop=Scopes::scopeFor(ins.instanceType.type.properties)
			scop=Scopes::scopeFor (ins.instanceType.properties,scop)
			
	}
//////*/
	def dispatch IScope extractScop(Param param,EReference ref){
		
	}
//////*/
	def dispatch IScope extractScop(OverrideAction overrideAct,EReference ref){
		if (ref.name.compareTo("actionName")==0)
			return Scopes::scopeFor((overrideAct.eContainer as UnityObject)?.type.actions)
		var scop=IScope::NULLSCOPE
		var UnityObject parentObj=overrideAct.containerOfType(UnityObject) as UnityObject
		if (parentObj!==null){
			if (parentObj.type!==null)
				//scop=Scopes::scopeFor(parentObj.type.actions)
	        	scop=Scopes::scopeFor(overrideAct.actionName.payload.params,scop)
	        	scop=Scopes::scopeFor(overrideAct.actionName.returnPayload.params,scop)
				scop=Scopes::scopeFor(parentObj.type.properties,scop)
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
//////
	def dispatch IScope extractScop(Config configAssig, EReference ref){
		var scop=IScope::NULLSCOPE
		var UnityObject parentObj=configAssig.containerOfType(UnityObject) as UnityObject
		if (parentObj!==null){
			if (parentObj.type!==null){
				scop=Scopes::scopeFor(parentObj.type.properties)
				scop=Scopes::scopeFor(parentObj.properties,scop)
				}
				
		}
		return scop
	}
/////
	def dispatch IScope extractScop(Expression exp, EReference ref){
		var scop=IScope::NULLSCOPE
		if (exp.containerOfType(Action)!==null){
			var Action action=exp.containerOfType(Action) as Action;
			scop=Scopes::scopeFor((action.payload as Payload).params,scop)
			scop=Scopes::scopeFor((action.returnPayload as Payload).params,scop)
		}
		if (exp.containerOfType(MetaObject)!==null){
			var MetaObject metaObj=exp.containerOfType(MetaObject) as MetaObject;
			scop=Scopes::scopeFor(metaObj.properties,scop)

		}
		if (exp.containerOfType(Config)!==null && exp.containerOfType(UnityObject)!==null ){
			var MetaObject metaObj=(exp.containerOfType(UnityObject) as UnityObject).type ?: null;
			scop=Scopes::scopeFor(metaObj.properties,scop)
		}
		if (exp.containerOfType(OverrideAction)!==null && exp.containerOfType(UnityObject)!==null ){
			var MetaObject metaObj=(exp.containerOfType(UnityObject) as UnityObject).type ?: null;
			scop=Scopes::scopeFor(metaObj.properties,scop)
			var Action refAction=((exp.containerOfType(OverrideAction) as OverrideAction).actionName)
	        //var Action refAction=metaObj.actions.findFirst[name==actionName];
	        scop=Scopes::scopeFor(refAction.payload.params,scop)
	        scop=Scopes::scopeFor(refAction.returnPayload.params,scop)
		}
		if (exp.containerOfType(Attribute)!==null && exp.containerOfType(UnityObject)!==null ){
			var MetaObject metaObj=(exp.containerOfType(UnityObject) as UnityObject).type ?: null;
			scop=Scopes::scopeFor(metaObj.properties,scop)
		}
		
		if (exp.containerOfType(Init)!==null && exp.containerOfType(ENV)!==null ){
			scop=super.getScope(exp,ref);
		}
		println (scop)
	    scop
	}
	
	override getScope(EObject context, EReference reference) {
    	
    	var parentScope = IScope::NULLSCOPE
    	switch (context){
    		//UnityObject : 
    		//		return extractScop(context as UnityObject, reference)
    		OverrideAction: 
					return extractScop(context as OverrideAction, reference)
			Identifier:
					if (context.refrence instanceof SingleRef)
						return (context.refrence as SingleRef).extractScop(reference)
    		ConfigAssignment:
					return extractScop(context as ConfigAssignment, reference)
			Config:
					return extractScop(context as Config, reference)
    		SingleRef:
    				return (context as SingleRef).extractScop(reference)
    		
    		DotExpression: 
					return (context as DotExpression).extractScop(reference)
    		Expression: 
    				return (context as Expression).extractScop(reference)
    		default: super.getScope(context,reference)
    	}  
		super.getScope(context,reference)
    }
}

 
 
 
