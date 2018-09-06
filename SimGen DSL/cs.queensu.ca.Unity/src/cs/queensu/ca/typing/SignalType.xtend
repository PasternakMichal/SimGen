package cs.queensu.ca.typing

import cs.queensu.ca.typing.ExpressionsType

class SignalType implements ExpressionsType {
	override toString() { "SignalType" }
	
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
}