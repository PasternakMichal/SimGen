package cs.queensu.ca.typing;

@SuppressWarnings("all")
public interface ExpressionsType {
  @Override
  public abstract String toString();
  
  public abstract Boolean canBeAdded();
  
  public abstract Boolean canBeMul();
  
  public abstract Boolean canBeDevide();
  
  public abstract Boolean canBeCompared();
}
