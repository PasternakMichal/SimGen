package cs.queensu.ca.typing

import cs.queensu.ca.typing.ExpressionsType

class DivideByZero implements ExpressionsType {
	
	override canBeAdded() {
		return false
	}
	
	override canBeMul() {
		return false
	}
	
	override canBeDevide() {
		return false
	}
	
	override canBeCompared() {
		return false
	}
	
	override toString() { "DevideByZero" }
	
}