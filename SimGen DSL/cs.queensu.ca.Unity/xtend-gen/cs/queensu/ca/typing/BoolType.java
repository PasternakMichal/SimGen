package cs.queensu.ca.typing;

import cs.queensu.ca.typing.ExpressionsType;

@SuppressWarnings("all")
public class BoolType implements ExpressionsType {
  @Override
  public String toString() {
    return "Boolean";
  }
  
  @Override
  public Boolean canBeAdded() {
    return Boolean.valueOf(true);
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
    return Boolean.valueOf(true);
  }
}
