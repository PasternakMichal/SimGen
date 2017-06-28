package cs.queensu.ca.typing

import cs.queensu.ca.typing.ExpressionsType

class NotValid implements ExpressionsType {
	override toString() { "NotValid" }
	
	override canBeAdded() {
		return false
	}
	
	override canBeMul() {
		false
	}
	
	override canBeDevide() {
		false
	}
	
	override canBeCompared() {
		false
	}
	
}