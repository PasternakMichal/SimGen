package cs.queensu.ca.validation;

import com.google.common.base.Objects;
import cs.queensu.ca.typing.BoolType;
import cs.queensu.ca.typing.DivideByZero;
import cs.queensu.ca.typing.ExpressionsType;
import cs.queensu.ca.typing.IntType;
import cs.queensu.ca.typing.NotValid;
import cs.queensu.ca.typing.RealType;
import cs.queensu.ca.typing.SignalType;
import cs.queensu.ca.typing.StringType;
import cs.queensu.ca.unity.Addition;
import cs.queensu.ca.unity.AndExpression;
import cs.queensu.ca.unity.Assign;
import cs.queensu.ca.unity.Attribute;
import cs.queensu.ca.unity.BoolLiteral;
import cs.queensu.ca.unity.Config;
import cs.queensu.ca.unity.Divide;
import cs.queensu.ca.unity.DotExpression;
import cs.queensu.ca.unity.EQ;
import cs.queensu.ca.unity.Expression;
import cs.queensu.ca.unity.GE;
import cs.queensu.ca.unity.GT;
import cs.queensu.ca.unity.Identifier;
import cs.queensu.ca.unity.IntLiteral;
import cs.queensu.ca.unity.LE;
import cs.queensu.ca.unity.LT;
import cs.queensu.ca.unity.Minus;
import cs.queensu.ca.unity.Modulo;
import cs.queensu.ca.unity.Multiplication;
import cs.queensu.ca.unity.NE;
import cs.queensu.ca.unity.NotBooleanExpression;
import cs.queensu.ca.unity.OrExpression;
import cs.queensu.ca.unity.Param;
import cs.queensu.ca.unity.Property;
import cs.queensu.ca.unity.RealLiteral;
import cs.queensu.ca.unity.Ref;
import cs.queensu.ca.unity.SingleRef;
import cs.queensu.ca.unity.StLiteral;
import cs.queensu.ca.unity.UnaryExpression;
import cs.queensu.ca.unity.VarType;
import java.awt.Component;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class UnityTypeValidationUtility {
  public final static StringType stringType = new StringType();
  
  public final static IntType intType = new IntType();
  
  public final static BoolType boolType = new BoolType();
  
  public final static RealType reallType = new RealType();
  
  public final static NotValid notValid = new NotValid();
  
  public final static SignalType signalType = new SignalType();
  
  public final static DivideByZero divideByZero = new DivideByZero();
  
  private final static Logger LOGGER = Logger.getLogger(UnityTypeValidationUtility.class.getName());
  
  protected ExpressionsType _typeFor(final Expression e) {
    if ((e == null)) {
      return UnityTypeValidationUtility.notValid;
    }
    boolean _matched = false;
    if (e instanceof BoolLiteral) {
      _matched=true;
      return UnityTypeValidationUtility.boolType;
    }
    if (!_matched) {
      if (e instanceof StLiteral) {
        _matched=true;
        return UnityTypeValidationUtility.stringType;
      }
    }
    if (!_matched) {
      if (e instanceof IntLiteral) {
        _matched=true;
        return UnityTypeValidationUtility.intType;
      }
    }
    if (!_matched) {
      if (e instanceof RealLiteral) {
        _matched=true;
        return UnityTypeValidationUtility.reallType;
      }
    }
    return UnityTypeValidationUtility.notValid;
  }
  
  protected ExpressionsType _typeFor(final GT e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _rest = null;
      if (e!=null) {
        _rest=e.getRest();
      }
      boolean _tripleEquals_1 = (_rest == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _rest_1 = null;
    if (e!=null) {
      _rest_1=e.getRest();
    }
    final ExpressionsType righType = this.typeFor(_rest_1);
    if (((Objects.equal(leftType, UnityTypeValidationUtility.intType) && Objects.equal(righType, UnityTypeValidationUtility.reallType)) || (Objects.equal(leftType, UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType)))) {
      return UnityTypeValidationUtility.boolType;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return UnityTypeValidationUtility.boolType;
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected ExpressionsType _typeFor(final LT e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _rest = null;
      if (e!=null) {
        _rest=e.getRest();
      }
      boolean _tripleEquals_1 = (_rest == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _rest_1 = null;
    if (e!=null) {
      _rest_1=e.getRest();
    }
    final ExpressionsType righType = this.typeFor(_rest_1);
    if (((Objects.equal(leftType, UnityTypeValidationUtility.intType) && Objects.equal(righType, UnityTypeValidationUtility.reallType)) || (Objects.equal(leftType, UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType)))) {
      return UnityTypeValidationUtility.boolType;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return UnityTypeValidationUtility.boolType;
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected ExpressionsType _typeFor(final GE e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _rest = null;
      if (e!=null) {
        _rest=e.getRest();
      }
      boolean _tripleEquals_1 = (_rest == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _rest_1 = null;
    if (e!=null) {
      _rest_1=e.getRest();
    }
    final ExpressionsType righType = this.typeFor(_rest_1);
    if (((Objects.equal(leftType, UnityTypeValidationUtility.intType) && Objects.equal(righType, UnityTypeValidationUtility.reallType)) || (Objects.equal(leftType, UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType)))) {
      return UnityTypeValidationUtility.boolType;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return UnityTypeValidationUtility.boolType;
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected ExpressionsType _typeFor(final LE e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _rest = null;
      if (e!=null) {
        _rest=e.getRest();
      }
      boolean _tripleEquals_1 = (_rest == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _rest_1 = null;
    if (e!=null) {
      _rest_1=e.getRest();
    }
    final ExpressionsType righType = this.typeFor(_rest_1);
    if (((Objects.equal(leftType, UnityTypeValidationUtility.intType) && Objects.equal(righType, UnityTypeValidationUtility.reallType)) || (Objects.equal(leftType, UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType)))) {
      return UnityTypeValidationUtility.boolType;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return UnityTypeValidationUtility.boolType;
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected ExpressionsType _typeFor(final EQ e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _rest = null;
      if (e!=null) {
        _rest=e.getRest();
      }
      boolean _tripleEquals_1 = (_rest == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _rest_1 = null;
    if (e!=null) {
      _rest_1=e.getRest();
    }
    final ExpressionsType righType = this.typeFor(_rest_1);
    if (((Objects.equal(leftType, UnityTypeValidationUtility.intType) && Objects.equal(righType, UnityTypeValidationUtility.reallType)) || (Objects.equal(leftType, UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType)))) {
      return UnityTypeValidationUtility.boolType;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return UnityTypeValidationUtility.boolType;
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected ExpressionsType _typeFor(final NE e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _rest = null;
      if (e!=null) {
        _rest=e.getRest();
      }
      boolean _tripleEquals_1 = (_rest == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _rest_1 = null;
    if (e!=null) {
      _rest_1=e.getRest();
    }
    final ExpressionsType righType = this.typeFor(_rest_1);
    if (((Objects.equal(leftType, UnityTypeValidationUtility.intType) && Objects.equal(righType, UnityTypeValidationUtility.reallType)) || (Objects.equal(leftType, UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType)))) {
      return UnityTypeValidationUtility.boolType;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return UnityTypeValidationUtility.boolType;
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected ExpressionsType _typeFor(final NotBooleanExpression e) {
    Expression _exp = null;
    if (e!=null) {
      _exp=e.getExp();
    }
    boolean _tripleEquals = (_exp == null);
    if (_tripleEquals) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _exp_1 = null;
    if (e!=null) {
      _exp_1=e.getExp();
    }
    final ExpressionsType expType = this.typeFor(_exp_1);
    boolean _equals = Objects.equal(expType, UnityTypeValidationUtility.boolType);
    if (_equals) {
      return UnityTypeValidationUtility.boolType;
    } else {
      return UnityTypeValidationUtility.notValid;
    }
  }
  
  protected ExpressionsType _typeFor(final OrExpression e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _right = null;
      if (e!=null) {
        _right=e.getRight();
      }
      boolean _tripleEquals_1 = (_right == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _right_1 = null;
    if (e!=null) {
      _right_1=e.getRight();
    }
    final ExpressionsType righType = this.typeFor(_right_1);
    if ((Objects.equal(leftType, UnityTypeValidationUtility.boolType) && Objects.equal(righType, UnityTypeValidationUtility.boolType))) {
      return UnityTypeValidationUtility.boolType;
    } else {
      return UnityTypeValidationUtility.notValid;
    }
  }
  
  protected ExpressionsType _typeFor(final AndExpression e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _right = null;
      if (e!=null) {
        _right=e.getRight();
      }
      boolean _tripleEquals_1 = (_right == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _right_1 = null;
    if (e!=null) {
      _right_1=e.getRight();
    }
    final ExpressionsType righType = this.typeFor(_right_1);
    if ((Objects.equal(leftType, UnityTypeValidationUtility.boolType) && Objects.equal(righType, UnityTypeValidationUtility.boolType))) {
      return UnityTypeValidationUtility.boolType;
    } else {
      return UnityTypeValidationUtility.notValid;
    }
  }
  
  protected ExpressionsType _typeFor(final Multiplication e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _right = null;
      if (e!=null) {
        _right=e.getRight();
      }
      boolean _tripleEquals_1 = (_right == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _right_1 = null;
    if (e!=null) {
      _right_1=e.getRight();
    }
    final ExpressionsType righType = this.typeFor(_right_1);
    if ((((Objects.equal(leftType, UnityTypeValidationUtility.stringType) || Objects.equal(righType, UnityTypeValidationUtility.stringType)) || Objects.equal(leftType, UnityTypeValidationUtility.boolType)) || Objects.equal(righType, UnityTypeValidationUtility.boolType))) {
      return UnityTypeValidationUtility.notValid;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return leftType;
      } else {
        if ((Objects.equal(leftType, UnityTypeValidationUtility.reallType) || Objects.equal(righType, UnityTypeValidationUtility.reallType))) {
          return UnityTypeValidationUtility.reallType;
        } else {
          return UnityTypeValidationUtility.notValid;
        }
      }
    }
  }
  
  protected ExpressionsType _typeFor(final Divide e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _right = null;
      if (e!=null) {
        _right=e.getRight();
      }
      boolean _tripleEquals_1 = (_right == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _right_1 = null;
    if (e!=null) {
      _right_1=e.getRight();
    }
    final ExpressionsType righType = this.typeFor(_right_1);
    if (((e.getRight() instanceof IntLiteral) && (((IntLiteral) e.getRight()).getInt() == 0))) {
      return UnityTypeValidationUtility.divideByZero;
    } else {
      if (((e.getRight() instanceof RealLiteral) && (((RealLiteral) e.getRight()).getReal() == 0))) {
        return UnityTypeValidationUtility.divideByZero;
      }
    }
    boolean _or_1 = false;
    if ((((Objects.equal(leftType, UnityTypeValidationUtility.stringType) || Objects.equal(righType, UnityTypeValidationUtility.stringType)) || Objects.equal(leftType, UnityTypeValidationUtility.boolType)) || Objects.equal(righType, UnityTypeValidationUtility.boolType))) {
      _or_1 = true;
    } else {
      Expression _right_2 = null;
      if (e!=null) {
        _right_2=e.getRight();
      }
      boolean _equals = Objects.equal(_right_2, Integer.valueOf(0));
      _or_1 = _equals;
    }
    if (_or_1) {
      return UnityTypeValidationUtility.notValid;
    } else {
      boolean _equals_1 = Objects.equal(leftType, righType);
      if (_equals_1) {
        return leftType;
      } else {
        if ((Objects.equal(leftType, UnityTypeValidationUtility.reallType) || Objects.equal(righType, UnityTypeValidationUtility.reallType))) {
          return UnityTypeValidationUtility.reallType;
        } else {
          return UnityTypeValidationUtility.notValid;
        }
      }
    }
  }
  
  protected ExpressionsType _typeFor(final Modulo e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _right = null;
      if (e!=null) {
        _right=e.getRight();
      }
      boolean _tripleEquals_1 = (_right == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _right_1 = null;
    if (e!=null) {
      _right_1=e.getRight();
    }
    final ExpressionsType righType = this.typeFor(_right_1);
    if (((e.getRight() instanceof IntLiteral) && (((IntLiteral) e.getRight()).getInt() == 0))) {
      return UnityTypeValidationUtility.divideByZero;
    } else {
      if (((e.getRight() instanceof RealLiteral) && (((RealLiteral) e.getRight()).getReal() == 0))) {
        return UnityTypeValidationUtility.divideByZero;
      }
    }
    boolean _or_1 = false;
    if ((((Objects.equal(leftType, UnityTypeValidationUtility.stringType) || Objects.equal(righType, UnityTypeValidationUtility.stringType)) || Objects.equal(leftType, UnityTypeValidationUtility.boolType)) || Objects.equal(righType, UnityTypeValidationUtility.boolType))) {
      _or_1 = true;
    } else {
      Expression _right_2 = null;
      if (e!=null) {
        _right_2=e.getRight();
      }
      boolean _equals = Objects.equal(_right_2, Integer.valueOf(0));
      _or_1 = _equals;
    }
    if (_or_1) {
      return UnityTypeValidationUtility.notValid;
    } else {
      boolean _equals_1 = Objects.equal(leftType, righType);
      if (_equals_1) {
        return leftType;
      } else {
        if ((Objects.equal(leftType, UnityTypeValidationUtility.reallType) || Objects.equal(righType, UnityTypeValidationUtility.reallType))) {
          return UnityTypeValidationUtility.reallType;
        } else {
          return UnityTypeValidationUtility.notValid;
        }
      }
    }
  }
  
  protected ExpressionsType _typeFor(final Addition e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _right = null;
      if (e!=null) {
        _right=e.getRight();
      }
      boolean _tripleEquals_1 = (_right == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    ExpressionsType _elvis = null;
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    ExpressionsType _typeFor = this.typeFor(_left_1);
    if (_typeFor != null) {
      _elvis = _typeFor;
    } else {
      _elvis = UnityTypeValidationUtility.notValid;
    }
    final ExpressionsType leftType = _elvis;
    ExpressionsType _elvis_1 = null;
    Expression _right_1 = null;
    if (e!=null) {
      _right_1=e.getRight();
    }
    ExpressionsType _typeFor_1 = this.typeFor(_right_1);
    if (_typeFor_1 != null) {
      _elvis_1 = _typeFor_1;
    } else {
      _elvis_1 = UnityTypeValidationUtility.notValid;
    }
    final ExpressionsType righType = _elvis_1;
    if ((Objects.equal(leftType, UnityTypeValidationUtility.boolType) || Objects.equal(righType, UnityTypeValidationUtility.boolType))) {
      return UnityTypeValidationUtility.notValid;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return leftType;
      } else {
        if (((Objects.equal(leftType, UnityTypeValidationUtility.intType) && Objects.equal(righType, UnityTypeValidationUtility.reallType)) || ((leftType == UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType)))) {
          return UnityTypeValidationUtility.reallType;
        } else {
          if ((Objects.equal(leftType, UnityTypeValidationUtility.stringType) || Objects.equal(righType, UnityTypeValidationUtility.stringType))) {
            return UnityTypeValidationUtility.stringType;
          } else {
            return UnityTypeValidationUtility.notValid;
          }
        }
      }
    }
  }
  
  protected ExpressionsType _typeFor(final Minus e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _right = null;
      if (e!=null) {
        _right=e.getRight();
      }
      boolean _tripleEquals_1 = (_right == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _right_1 = null;
    if (e!=null) {
      _right_1=e.getRight();
    }
    final ExpressionsType righType = this.typeFor(_right_1);
    if ((((Objects.equal(leftType, UnityTypeValidationUtility.boolType) || Objects.equal(righType, UnityTypeValidationUtility.boolType)) || Objects.equal(leftType, UnityTypeValidationUtility.stringType)) || Objects.equal(righType, UnityTypeValidationUtility.stringType))) {
      return UnityTypeValidationUtility.notValid;
    } else {
      boolean _equals = Objects.equal(leftType, righType);
      if (_equals) {
        return leftType;
      } else {
        if ((Objects.equal(leftType, UnityTypeValidationUtility.reallType) || Objects.equal(righType, UnityTypeValidationUtility.reallType))) {
          return UnityTypeValidationUtility.reallType;
        } else {
          return UnityTypeValidationUtility.notValid;
        }
      }
    }
  }
  
  protected ExpressionsType _typeFor(final UnaryExpression e) {
    Expression _exp = null;
    if (e!=null) {
      _exp=e.getExp();
    }
    boolean _tripleEquals = (_exp == null);
    if (_tripleEquals) {
      return null;
    }
    Expression _exp_1 = null;
    if (e!=null) {
      _exp_1=e.getExp();
    }
    final ExpressionsType expressionType = this.typeFor(_exp_1);
    if ((Objects.equal(expressionType, UnityTypeValidationUtility.boolType) || Objects.equal(expressionType, UnityTypeValidationUtility.stringType))) {
      return UnityTypeValidationUtility.notValid;
    } else {
      return expressionType;
    }
  }
  
  protected ExpressionsType _typeFor(final Assign e) {
    boolean _or = false;
    Expression _left = null;
    if (e!=null) {
      _left=e.getLeft();
    }
    boolean _tripleEquals = (_left == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _right = null;
      if (e!=null) {
        _right=e.getRight();
      }
      boolean _tripleEquals_1 = (_right == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Expression _left_1 = null;
    if (e!=null) {
      _left_1=e.getLeft();
    }
    final ExpressionsType leftType = this.typeFor(_left_1);
    Expression _right_1 = null;
    if (e!=null) {
      _right_1=e.getRight();
    }
    final ExpressionsType righType = this.typeFor(_right_1);
    boolean _equals = Objects.equal(leftType, righType);
    if (_equals) {
      return leftType;
    } else {
      if ((Objects.equal(leftType, UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType))) {
        return leftType;
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected ExpressionsType _typeFor(final Config ca) {
    boolean _or = false;
    Attribute _propertyName = null;
    if (ca!=null) {
      _propertyName=ca.getPropertyName();
    }
    boolean _tripleEquals = (_propertyName == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      Expression _propertyValue = null;
      if (ca!=null) {
        _propertyValue=ca.getPropertyValue();
      }
      boolean _tripleEquals_1 = (_propertyValue == null);
      _or = _tripleEquals_1;
    }
    if (_or) {
      return UnityTypeValidationUtility.notValid;
    }
    Attribute _propertyName_1 = null;
    if (ca!=null) {
      _propertyName_1=ca.getPropertyName();
    }
    final ExpressionsType leftType = this.typeFor(_propertyName_1);
    Expression _propertyValue_1 = null;
    if (ca!=null) {
      _propertyValue_1=ca.getPropertyValue();
    }
    final ExpressionsType righType = this.typeFor(_propertyValue_1);
    boolean _equals = Objects.equal(leftType, righType);
    if (_equals) {
      return leftType;
    } else {
      if ((Objects.equal(leftType, UnityTypeValidationUtility.reallType) && Objects.equal(righType, UnityTypeValidationUtility.intType))) {
        return leftType;
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected ExpressionsType _typeFor(final VarType varType) {
    String _name = null;
    if (varType!=null) {
      _name=varType.getName();
    }
    boolean _tripleEquals = (_name == null);
    if (_tripleEquals) {
      return UnityTypeValidationUtility.notValid;
    }
    String _name_1 = null;
    if (varType!=null) {
      _name_1=varType.getName();
    }
    if (_name_1 != null) {
      switch (_name_1) {
        case "bool":
          return UnityTypeValidationUtility.boolType;
        case "int":
          return UnityTypeValidationUtility.intType;
        case "string":
          return UnityTypeValidationUtility.stringType;
        case "real":
          return UnityTypeValidationUtility.reallType;
      }
    }
    return UnityTypeValidationUtility.notValid;
  }
  
  protected ExpressionsType _typeFor(final Attribute a) {
    ExpressionsType _xblockexpression = null;
    {
      VarType _propertyType = null;
      if (a!=null) {
        _propertyType=a.getPropertyType();
      }
      boolean _tripleEquals = (_propertyType == null);
      if (_tripleEquals) {
        return UnityTypeValidationUtility.notValid;
      }
      VarType _propertyType_1 = null;
      if (a!=null) {
        _propertyType_1=a.getPropertyType();
      }
      _xblockexpression = this.typeFor(_propertyType_1);
    }
    return _xblockexpression;
  }
  
  protected ExpressionsType _typeFor(final Identifier e) {
    NotValid _xblockexpression = null;
    {
      Ref _refrence = null;
      if (e!=null) {
        _refrence=e.getRefrence();
      }
      boolean _matched = false;
      if (_refrence instanceof SingleRef) {
        _matched=true;
        Ref _refrence_1 = null;
        if (e!=null) {
          _refrence_1=e.getRefrence();
        }
        return this.typeFor(((SingleRef) _refrence_1));
      }
      if (!_matched) {
        if (_refrence instanceof DotExpression) {
          _matched=true;
          Ref _refrence_1 = e.getRefrence();
          return this.typeFor(((DotExpression) _refrence_1));
        }
      }
      _xblockexpression = UnityTypeValidationUtility.notValid;
    }
    return _xblockexpression;
  }
  
  protected ExpressionsType _typeFor(final DotExpression e) {
    String _name = e.getTail().getName();
    boolean _tripleEquals = (_name == null);
    if (_tripleEquals) {
      return UnityTypeValidationUtility.notValid;
    }
    ExpressionsType _elvis = null;
    Property _tail = null;
    if (e!=null) {
      _tail=e.getTail();
    }
    ExpressionsType _typeFor = null;
    if (_tail!=null) {
      _typeFor=this.typeFor(_tail);
    }
    if (_typeFor != null) {
      _elvis = _typeFor;
    } else {
      _elvis = UnityTypeValidationUtility.notValid;
    }
    ExpressionsType type = _elvis;
    return type;
  }
  
  protected ExpressionsType _typeFor(final Param p) {
    VarType _type = p.getType();
    boolean _tripleEquals = (_type == null);
    if (_tripleEquals) {
      return null;
    }
    return this.typeFor(p.getType());
  }
  
  protected ExpressionsType _typeFor(final SingleRef p) {
    Property _singleRef = p.getSingleRef();
    if ((_singleRef instanceof Attribute)) {
      Property _singleRef_1 = p.getSingleRef();
      final Attribute attr = ((Attribute) _singleRef_1);
      VarType _propertyType = attr.getPropertyType();
      return this.typeFor(((VarType) _propertyType));
    } else {
      Property _singleRef_2 = p.getSingleRef();
      if ((_singleRef_2 instanceof Param)) {
        Property _singleRef_3 = p.getSingleRef();
        return this.typeFor(((Param) _singleRef_3));
      } else {
        return UnityTypeValidationUtility.notValid;
      }
    }
  }
  
  protected Boolean _compareName(final Ref r1, final Ref r2) {
    if (((r1 instanceof SingleRef) && (r2 instanceof SingleRef))) {
      return this.compareName(((SingleRef) r1).getSingleRef(), ((SingleRef) r2).getSingleRef());
    } else {
      if (((r1 instanceof DotExpression) && (r2 instanceof DotExpression))) {
        return this.compareName(((DotExpression) r1), ((DotExpression) r2));
      } else {
        return Boolean.valueOf(false);
      }
    }
  }
  
  protected Boolean _compareName(final DotExpression e1, final DotExpression e2) {
    Boolean _compareName = this.compareName(e1.getHead(), e2.getHead());
    if ((_compareName).booleanValue()) {
      return this.compareName(e1.getTail(), e2.getTail());
    } else {
      return Boolean.valueOf(false);
    }
  }
  
  protected Boolean _compareName(final Component c1, final Component c2) {
    String _name = c1.getName();
    String _name_1 = c2.getName();
    boolean _equals = Objects.equal(_name, _name_1);
    if (_equals) {
      return Boolean.valueOf(true);
    } else {
      return Boolean.valueOf(false);
    }
  }
  
  protected Boolean _compareName(final Attribute a1, final Attribute a2) {
    String _name = a1.getName();
    String _name_1 = a2.getName();
    boolean _equals = Objects.equal(_name, _name_1);
    if (_equals) {
      return Boolean.valueOf(true);
    } else {
      return Boolean.valueOf(false);
    }
  }
  
  public ExpressionsType typeFor(final EObject e) {
    if (e instanceof Addition) {
      return _typeFor((Addition)e);
    } else if (e instanceof AndExpression) {
      return _typeFor((AndExpression)e);
    } else if (e instanceof Assign) {
      return _typeFor((Assign)e);
    } else if (e instanceof Attribute) {
      return _typeFor((Attribute)e);
    } else if (e instanceof Divide) {
      return _typeFor((Divide)e);
    } else if (e instanceof DotExpression) {
      return _typeFor((DotExpression)e);
    } else if (e instanceof EQ) {
      return _typeFor((EQ)e);
    } else if (e instanceof GE) {
      return _typeFor((GE)e);
    } else if (e instanceof GT) {
      return _typeFor((GT)e);
    } else if (e instanceof Identifier) {
      return _typeFor((Identifier)e);
    } else if (e instanceof LE) {
      return _typeFor((LE)e);
    } else if (e instanceof LT) {
      return _typeFor((LT)e);
    } else if (e instanceof Minus) {
      return _typeFor((Minus)e);
    } else if (e instanceof Modulo) {
      return _typeFor((Modulo)e);
    } else if (e instanceof Multiplication) {
      return _typeFor((Multiplication)e);
    } else if (e instanceof NE) {
      return _typeFor((NE)e);
    } else if (e instanceof NotBooleanExpression) {
      return _typeFor((NotBooleanExpression)e);
    } else if (e instanceof OrExpression) {
      return _typeFor((OrExpression)e);
    } else if (e instanceof Param) {
      return _typeFor((Param)e);
    } else if (e instanceof SingleRef) {
      return _typeFor((SingleRef)e);
    } else if (e instanceof UnaryExpression) {
      return _typeFor((UnaryExpression)e);
    } else if (e instanceof Config) {
      return _typeFor((Config)e);
    } else if (e instanceof Expression) {
      return _typeFor((Expression)e);
    } else if (e instanceof VarType) {
      return _typeFor((VarType)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public Boolean compareName(final Object a1, final Object a2) {
    if (a1 instanceof Attribute
         && a2 instanceof Attribute) {
      return _compareName((Attribute)a1, (Attribute)a2);
    } else if (a1 instanceof DotExpression
         && a2 instanceof DotExpression) {
      return _compareName((DotExpression)a1, (DotExpression)a2);
    } else if (a1 instanceof Ref
         && a2 instanceof Ref) {
      return _compareName((Ref)a1, (Ref)a2);
    } else if (a1 instanceof Component
         && a2 instanceof Component) {
      return _compareName((Component)a1, (Component)a2);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a1, a2).toString());
    }
  }
}
