package cs.queensu.ca.scoping

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

class AutoModelScopeUtility {
	def int ownerLevel(EObject o, EClass ownerType){
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
}