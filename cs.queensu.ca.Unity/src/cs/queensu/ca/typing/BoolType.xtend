package cs.queensu.ca.typing

import cs.queensu.ca.typing.ExpressionsType

class BoolType implements ExpressionsType {
	override toString() { "Boolean" }
	
	override canBeAdded() {
		return true
	}
	
	override canBeMul() {
		false
	}
	
	override canBeDevide() {
		false
	}
	
	override canBeCompared() {
		true
	}
	
}