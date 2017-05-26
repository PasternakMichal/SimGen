package cs.queensu.ca.scoping;

import cs.queensu.ca.scoping.AbstractUnityScopeProvider;
import cs.queensu.ca.unity.CompositeRef;
import cs.queensu.ca.unity.ConfigAssignment;
import cs.queensu.ca.unity.DotExpression;
import cs.queensu.ca.unity.Instance;
import cs.queensu.ca.unity.MetaObject;
import cs.queensu.ca.unity.OverrideAction;
import cs.queensu.ca.unity.Param;
import cs.queensu.ca.unity.Property;
import cs.queensu.ca.unity.SingleRef;
import cs.queensu.ca.unity.UnityObject;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
  
  /**
   * var scop=IScope::NULLSCOPE
   * if(com.actionBodies!==null){
   * actionBodies: (com.actionBodies as actionBodies).extractScop(ref)
   * }
   * else if(com. ){
   * Actuator: (com.type as Actuator).extractScop(ref)
   * }
   * else if (com. ){
   * }
   * else{
   * scop
   * }
   */
  protected IScope _extractScop(final SingleRef sr, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      _xblockexpression = InputOutput.<IScope>println(scop);
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final DotExpression exp, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      CompositeRef _head = exp.getHead();
      if ((_head instanceof SingleRef)) {
        CompositeRef singleRef = exp.getHead();
        Property _singleRef = ((SingleRef) singleRef).getSingleRef();
        boolean _matched = false;
        if (_singleRef instanceof Property) {
          _matched=true;
          scop = this.extractScop(((Property) singleRef), ref);
        }
      } else {
        CompositeRef _head_1 = exp.getHead();
        if ((_head_1 instanceof DotExpression)) {
        }
      }
      _xblockexpression = super.getScope(exp, ref);
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final Property pro, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      IScope _switchResult = null;
      boolean _matched = false;
      if (pro instanceof Instance) {
        _matched=true;
        _switchResult = scop = this.extractScop(((Instance) pro), ref);
      }
      if (!_matched) {
        if (pro instanceof Param) {
          _matched=true;
          _switchResult = scop = this.extractScop(((Param) pro), ref);
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final Instance ins, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      scop = Scopes.scopeFor(ins.getInstanceType().getProperties());
      _xblockexpression = scop = Scopes.scopeFor(ins.getInstanceType().getType().getProperties());
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final Param param, final EReference ref) {
    return null;
  }
  
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
  
  protected IScope _extractScop(final ConfigAssignment configAssig, final EReference ref) {
    IScope scop = IScope.NULLSCOPE;
    EObject _containerOfType = this.containerOfType(configAssig, UnityObject.class);
    UnityObject parentObj = ((UnityObject) _containerOfType);
    if ((parentObj != null)) {
      MetaObject _type = parentObj.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        scop = Scopes.scopeFor(parentObj.getType().getProperties());
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
      if (!_matched) {
        if (context instanceof ConfigAssignment) {
          _matched=true;
          return this.extractScop(((ConfigAssignment) context), reference);
        }
      }
      if (!_matched) {
        if (context instanceof SingleRef) {
          _matched=true;
          return this.extractScop(((SingleRef) context), reference);
        }
      }
      if (!_matched) {
        if (context instanceof DotExpression) {
          _matched=true;
          return this.extractScop(((DotExpression) context), reference);
        }
      }
      super.getScope(context, reference);
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  public IScope extractScop(final EObject exp, final EReference ref) {
    if (exp instanceof DotExpression) {
      return _extractScop((DotExpression)exp, ref);
    } else if (exp instanceof Instance) {
      return _extractScop((Instance)exp, ref);
    } else if (exp instanceof Param) {
      return _extractScop((Param)exp, ref);
    } else if (exp instanceof SingleRef) {
      return _extractScop((SingleRef)exp, ref);
    } else if (exp instanceof ConfigAssignment) {
      return _extractScop((ConfigAssignment)exp, ref);
    } else if (exp instanceof OverrideAction) {
      return _extractScop((OverrideAction)exp, ref);
    } else if (exp instanceof Property) {
      return _extractScop((Property)exp, ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp, ref).toString());
    }
  }
}
