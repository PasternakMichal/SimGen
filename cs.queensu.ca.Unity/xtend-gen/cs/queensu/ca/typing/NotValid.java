package cs.queensu.ca.typing;

import cs.queensu.ca.typing.ExpressionsType;

@SuppressWarnings("all")
public class NotValid implements ExpressionsType {
  @Override
  public String toString() {
    return "NotValid";
  }
  
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
}
