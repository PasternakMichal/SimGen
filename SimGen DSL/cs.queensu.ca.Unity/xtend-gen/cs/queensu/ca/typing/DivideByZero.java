package cs.queensu.ca.typing;

import cs.queensu.ca.typing.ExpressionsType;

@SuppressWarnings("all")
public class DivideByZero implements ExpressionsType {
  @Override
  public Boolean canBeAdded() {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean canBeMul() {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean canBeDevide() {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean canBeCompared() {
    return Boolean.valueOf(false);
  }
  
  @Override
  public String toString() {
    return "DevideByZero";
  }
}
