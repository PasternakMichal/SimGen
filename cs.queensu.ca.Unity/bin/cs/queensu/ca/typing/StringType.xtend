package cs.queensu.ca.typing

import cs.queensu.ca.typing.ExpressionsType

class StringType implements ExpressionsType {
	override toString() { "String" }
	
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