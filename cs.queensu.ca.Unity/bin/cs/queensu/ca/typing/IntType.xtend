package cs.queensu.ca.typing

import cs.queensu.ca.typing.ExpressionsType

class IntType implements ExpressionsType {
	override toString() { "int" }
	
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