package cs.queensu.ca.validation


import org.apache.log4j.Logger
import cs.queensu.ca.unity.Payload
import cs.queensu.ca.unity.Ref
import java.awt.Component
import cs.queensu.ca.unity.DotExpression
import cs.queensu.ca.unity.Attribute
import cs.queensu.ca.unity.SingleRef
import cs.queensu.ca.typing.StringType
import cs.queensu.ca.typing.IntType
import cs.queensu.ca.typing.BoolType
import cs.queensu.ca.typing.RealType
import cs.queensu.ca.typing.NotValid
import cs.queensu.ca.typing.SignalType
import cs.queensu.ca.typing.DivideByZero
import cs.queensu.ca.typing.ExpressionsType
import cs.queensu.ca.unity.Expression
import cs.queensu.ca.unity.BoolLiteral
import cs.queensu.ca.unity.StLiteral
import cs.queensu.ca.unity.IntLiteral
import cs.queensu.ca.unity.RealLiteral
import cs.queensu.ca.unity.GT
import cs.queensu.ca.unity.LT
import cs.queensu.ca.unity.GE
import cs.queensu.ca.unity.LE
import cs.queensu.ca.unity.EQ
import cs.queensu.ca.unity.NE
import cs.queensu.ca.unity.NotBooleanExpression
import cs.queensu.ca.unity.OrExpression
import cs.queensu.ca.unity.AndExpression
import cs.queensu.ca.unity.Multiplication
import cs.queensu.ca.unity.Divide
import cs.queensu.ca.unity.Modulo
import cs.queensu.ca.unity.Addition
import cs.queensu.ca.unity.Minus
import cs.queensu.ca.unity.UnaryExpression
import cs.queensu.ca.unity.Assign
import cs.queensu.ca.unity.VarType
import cs.queensu.ca.unity.Identifier
import cs.queensu.ca.unity.Param
import cs.queensu.ca.unity.ConfigAssignment
import cs.queensu.ca.unity.Config

/// this class provide service for type induction
class UnityTypeValidationUtility {
	public static val stringType = new StringType 
	public static val intType = new IntType 
	public static val boolType = new BoolType
	public static val reallType = new RealType
	public static val notValid = new NotValid
	public static val signalType = new SignalType
	public static val divideByZero = new DivideByZero
    private static final Logger LOGGER = Logger.getLogger(UnityTypeValidationUtility.getName() );
////// simple expression typing
	def dispatch ExpressionsType typeFor(Expression e){
		if (e===null)
			return notValid
		switch (e){
			BoolLiteral: return boolType
			StLiteral : return stringType
			IntLiteral : return intType
			RealLiteral : return reallType
			//Identifier : return reallType
			default : return notValid
		}

	}
	
///rule for Greater Than,  int>real, int>int, real>real string>string, boolean>boolean and real>int return valid type, others are not valid
	def dispatch ExpressionsType typeFor(GT e){
		if (e?.left===null || e?.rest===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.rest.typeFor
		if ((leftType==intType && righType==reallType) ||(leftType==reallType&&righType==intType))
			return boolType
		else if (leftType==righType)
			return boolType
		else 
			return notValid
	}
	
///rule for Lower Than,  int<real, int<int, real<real string<string, boolean<boolean and real<int return valid type, others are not valid
	def dispatch ExpressionsType typeFor(LT e){
		if (e?.left===null || e?.rest===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.rest.typeFor
		if ((leftType==intType && righType==reallType) ||(leftType==reallType&&righType==intType))
			return boolType
		else if (leftType==righType)
			return boolType
		else 
			return notValid
	}
	
///rule for Greater or Equal, int>=real, int>=int, real>=real, string>=string, boolean>=boolean and real>=int return valid type, others are not valid	
	def dispatch ExpressionsType typeFor(GE e){
		if (e?.left===null || e?.rest===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.rest.typeFor
		if ((leftType==intType && righType==reallType) ||(leftType==reallType&&righType==intType))
			return boolType
		else if (leftType==righType)
			return boolType
		else 
			return notValid
	}	
	
///rule for Lower or Equal, int<=real, int<=int, real<=real, string<=string, boolean<=boolean and real<=int return valid type, others are not valid
	def dispatch ExpressionsType typeFor(LE e){
		if (e?.left===null || e?.rest===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.rest.typeFor
		if ((leftType==intType && righType==reallType) ||(leftType==reallType&&righType==intType))
			return boolType
		else if (leftType==righType)
			return boolType
		else 
			return notValid
	}
	
///rule for Equal, int==real, int==int, real==real, string==string, boolean==boolean and real==int return valid type, others are not valid	
	def dispatch ExpressionsType typeFor(EQ e){
		if (e?.left===null || e?.rest===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.rest.typeFor
		if ((leftType==intType && righType==reallType) ||(leftType==reallType&&righType==intType))
			return boolType
		else if (leftType==righType)
			return boolType
		else 
			return notValid
	}	

///rule for Not Equal, int!=real, int!=int, real!=real, string!=string, boolean!=boolean and real!=int return valid type, others are not valid	
	def dispatch ExpressionsType typeFor(NE e){
		if (e?.left===null || e?.rest===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.rest.typeFor
		if ((leftType==intType && righType==reallType) ||(leftType==reallType&&righType==intType))
			return boolType
		else if (leftType==righType)
			return boolType
		else 
			return notValid
	}
	
///rule for NotBooleanExpression, !(boolean), returns valid type, others are not valid	

	def dispatch ExpressionsType typeFor(NotBooleanExpression e){
		if (e?.exp===null)
			return notValid
		val expType=e?.exp.typeFor
		if (expType==boolType)
			return boolType
		else 
			return notValid
	}
///rule for OR expression, boolean or boolean returns valid type, others are not valid	
	def dispatch ExpressionsType typeFor(OrExpression e){
		if (e?.left===null || e?.right===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.right.typeFor
		if (leftType== boolType && righType==boolType)
			return boolType
		else 
			return notValid
	}

///rule for AND expression, boolean AND boolean returns valid type, others are not valid	
	def dispatch ExpressionsType typeFor(AndExpression e){
		if (e?.left===null || e?.right===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.right.typeFor
		if (leftType== boolType&&righType==boolType)
			return boolType
		else 
			return notValid
	}
///rule for Multiplication, only int*real ,int*int , real*real and real*int return valid type, other results are not valid
	def dispatch ExpressionsType typeFor(Multiplication e){
		if (e?.left===null || e?.right===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.right.typeFor
		if (leftType==stringType||righType==stringType||leftType==boolType||righType==boolType)
			return notValid
		//else if (e?.left==0||e?.right==0)
		//	return intType
		else if (leftType==righType)
			return leftType
		else if (leftType==reallType ||righType==reallType)
			return reallType
		else 
			return notValid
	}
////

	
/// rule for divide, only int/real , real/real, int*int and real/int return valid type, other results are not valid, check divide by zero/divide two ints can produce real
	def dispatch ExpressionsType typeFor(Divide e){
		if (e?.left===null || e?.right===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.right.typeFor
		if (((e.right  instanceof IntLiteral) && (e.right as IntLiteral).int==0))
			return divideByZero
		else if (((e.right  instanceof RealLiteral) && (e.right as RealLiteral).real==0 ))
			return divideByZero
		if (leftType==stringType||righType==stringType||leftType==boolType||righType==boolType||e?.right==0)
			return notValid
		else if (leftType==righType)
			return leftType
		else if (leftType==reallType ||righType==reallType)
			return reallType
		else 
			return notValid
	}
	
//// rule for Modulo, only int%real , real%real, int%int,  and real%int return valid type, other results are not valid, check divide by zero
	def dispatch ExpressionsType typeFor(Modulo e){
		if (e?.left===null || e?.right===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.right.typeFor
		if (((e.right  instanceof IntLiteral) && (e.right as IntLiteral).int==0))
			return divideByZero
		else if (((e.right  instanceof RealLiteral) && (e.right as RealLiteral).real==0))
			return divideByZero
		if (leftType==stringType||righType==stringType||leftType==boolType||righType==boolType||e?.right==0)
			return notValid
		else if (leftType==righType)
			return leftType
		else if (leftType==reallType || righType==reallType)
			return reallType
		else 
			return notValid
	}
	
/// rule for addition, only int+real , real+real, int+int, int,real+string return valid type, otherwise the result is not valid/ exception adding two reals can result in int
	def dispatch ExpressionsType typeFor(Addition e){
		if (e?.left===null || e?.right===null)
			return notValid
		val leftType=e?.left.typeFor   ?: notValid
		val righType=e?.right.typeFor  ?: notValid
		if (leftType==boolType||righType==boolType)
			return notValid
		else if (leftType==righType)
			return leftType
		else if ((leftType==intType &&righType==reallType)||(leftType===reallType &&righType==intType))
			return reallType
		else if (leftType==stringType ||righType==stringType)
			return stringType
		else 
			return notValid
	}
	
///rule for Minus, only int-real , real-real, int-int, return valid type, other results are not valid
	def dispatch ExpressionsType typeFor(Minus e){
		if (e?.left===null || e?.right===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.right.typeFor
		if (leftType==boolType||righType==boolType||leftType==stringType||righType==stringType)
			return notValid
		else if (leftType==righType)
			return leftType
		else if (leftType==reallType||righType==reallType)
			return reallType
		else 
			return notValid
	}
///rule for Unary, only -(int) , -(real) return valid type, other results are not valid
	def dispatch ExpressionsType typeFor(UnaryExpression e){
		if (e?.exp===null)
			return null
		val expressionType=e?.exp.typeFor
		if (expressionType==boolType||expressionType==stringType)
			return notValid
		else
			return expressionType
	}
//// rule for assignment
	def dispatch ExpressionsType typeFor(Assign e){
		if (e?.left===null || e?.right===null)
			return notValid
		val leftType=e?.left.typeFor
		val righType=e?.right.typeFor
		if (leftType==righType)
			return leftType
		else if (leftType==reallType && righType==intType)
			return leftType
		else 
			return notValid
	}
	
//// rule for ConfigAssignment
		def dispatch ExpressionsType typeFor(Config ca){
		if ((ca?.propertyName===null) ||(ca?.propertyValue===null))
					return notValid	
		val leftType=ca?.propertyName.typeFor
		val righType=ca?.propertyValue.typeFor
		if (leftType==righType)
			return leftType
		else if (leftType==reallType && righType==intType)
			return leftType
		else 
			return notValid
	
	}
/// rule for VarType 
 	def dispatch ExpressionsType typeFor(VarType varType){
 		if (varType?.name===null)
 			return notValid
 		switch (varType?.name)	{
 			 case  "bool": return boolType
 			 case  "int"    : return intType 
 			 case  "string" : return stringType
 			 case  "real"   : return reallType
		}
	 return notValid
	}
//// rule for attribute
	def dispatch ExpressionsType typeFor(Attribute a){	
		if (a?.propertyType===null)
			return notValid
		a?.propertyType.typeFor 
	}
////  rule for identifier

///  rule for identifier
 	def dispatch ExpressionsType typeFor(Identifier e){
		switch  (e?.refrence){
			SingleRef: {
				return  (e?.refrence as SingleRef).typeFor
			}
			DotExpression: {
			   return 	(e.refrence as DotExpression).typeFor 
			}
		}
		notValid
	}
//////
 	def dispatch ExpressionsType typeFor(DotExpression e){
 		if (e.tail.name===null)
 			return notValid
 		var type=e?.tail?.typeFor ?: notValid
		return type
 	}
///// 
 	def dispatch ExpressionsType typeFor(Param p){
		if (p.type===null)
			return null
		return p.type.typeFor
		
 	} 	
/////
 	def dispatch ExpressionsType typeFor(SingleRef p){
		if (p.singleRef instanceof Attribute){
			val attr=p.singleRef as Attribute
			return (attr.propertyType as VarType).typeFor	
		} 
		else if  (p.singleRef instanceof Param){
			//println((p.partRef as Component).typeFor)
			return (p.singleRef as Param).typeFor
		}
		else 
			return notValid	

 	}

/// compare dot expression with names
	def dispatch Boolean compareName(Ref r1,Ref r2){
		if (r1 instanceof SingleRef && r2 instanceof SingleRef)
			return compareName((r1 as SingleRef).singleRef, (r2 as SingleRef).singleRef)
		else if (r1 instanceof DotExpression && r2 instanceof DotExpression)
			return compareName((r1 as DotExpression), (r2 as DotExpression))
		else return false
	}
	
	def dispatch Boolean compareName(DotExpression e1,DotExpression e2){
		if (compareName(e1.head,e2.head))
			return compareName(e1.tail,e2.tail)
		else return false
	}
	def dispatch Boolean compareName(Component c1,Component c2){
		if (c1.name==c2.name) 
			return true
		else
			return false
	}
/// compare attribute expression
	def dispatch Boolean compareName(Attribute a1,Attribute a2){
		if (a1.name==a2.name) 
			return true
		else
			return false
	}	
}