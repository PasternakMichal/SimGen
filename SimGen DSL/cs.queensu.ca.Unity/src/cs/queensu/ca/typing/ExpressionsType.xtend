package cs.queensu.ca.typing



interface ExpressionsType {
	override String  toString();
	def Boolean canBeAdded();
	def Boolean canBeMul();
	def Boolean canBeDevide();
	def Boolean canBeCompared();	
}
