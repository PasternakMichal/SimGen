package cs.queensu.ca.scoping;

import cs.queensu.ca.scoping.AbstractUnityScopeProvider;
import cs.queensu.ca.unity.DotExpression;
import cs.queensu.ca.unity.MetaObject;
import cs.queensu.ca.unity.OverrideAction;
import cs.queensu.ca.unity.SingleRef;
import cs.queensu.ca.unity.UnityObject;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class UnityScopeProvider extends AbstractUnityScopeProvider {
  private final static Logger logger = Logger.getLogger(UnityScopeProvider.class.getName());
  
  public int containerLevel(final EObject o, final Class<?> ownerType) {
    int i = 1;
    EObject tempObject = o.eContainer();
    while ((tempObject != null)) {
      {
        boolean _isInstance = ownerType.isInstance(tempObject);
        if (_isInstance) {
          return i;
        }
        tempObject = tempObject.eContainer();
        i = (i + 1);
      }
    }
    return 0;
  }
  
  public EObject containerOfType(final EObject o, final Class<?> ownerType) {
    int i = 1;
    EObject tempObject = o.eContainer();
    while ((tempObject != null)) {
      {
        boolean _isInstance = ownerType.isInstance(tempObject);
        if (_isInstance) {
          return tempObject;
        }
        tempObject = tempObject.eContainer();
        i = (i + 1);
      }
    }
    return null;
  }
  
  protected IScope _extractScop(final DotExpression exp, final EReference ref) {
    return null;
  }
  
  protected IScope _extractScop(final UnityObject com, final EReference ref) {
    return null;
  }
  
  protected IScope _extractScop(final SingleRef p, final EReference ref) {
    return null;
  }
  
  /**
   * def dispatch IScope extractScop(Signal sig,EReference ref){
   * var scop=IScope::NULLSCOPE
   * scop=Scopes::scopeFor(sig.payload.params)
   * }
   * ////
   * def dispatch IScope extractScop(Sensor sen,EReference ref){
   * var scop=IScope::NULLSCOPE
   * scop=Scopes::scopeFor(sen.signals)
   * }
   * /////
   */
  protected IScope _extractScop(final OverrideAction overrideAct, final EReference ref) {
    IScope scop = IScope.NULLSCOPE;
    EObject _containerOfType = this.containerOfType(overrideAct, UnityObject.class);
    UnityObject parentObj = ((UnityObject) _containerOfType);
    if ((parentObj != null)) {
      MetaObject _type = parentObj.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        scop = Scopes.scopeFor(parentObj.getType().getActions());
      }
    }
    return scop;
  }
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      IScope parentScope = IScope.NULLSCOPE;
      boolean _matched = false;
      if (context instanceof OverrideAction) {
        _matched=true;
        return this.extractScop(((OverrideAction) context), reference);
      }
      super.getScope(context, reference);
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  public IScope extractScop(final EObject exp, final EReference ref) {
    if (exp instanceof DotExpression) {
      return _extractScop((DotExpression)exp, ref);
    } else if (exp instanceof SingleRef) {
      return _extractScop((SingleRef)exp, ref);
    } else if (exp instanceof OverrideAction) {
      return _extractScop((OverrideAction)exp, ref);
    } else if (exp instanceof UnityObject) {
      return _extractScop((UnityObject)exp, ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp, ref).toString());
    }
  }
}
