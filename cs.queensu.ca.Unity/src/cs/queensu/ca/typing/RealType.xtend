package cs.queensu.ca.typing

import cs.queensu.ca.typing.ExpressionsType

class RealType implements ExpressionsType {
	override toString() { "Real" }
	
	override canBeAdded() {
		return true
	}
	
	override canBeMul() {
		true
	}
	
	override canBeDevide() {
		true
	}
	
	override canBeCompared() {
		true
	}
	
}