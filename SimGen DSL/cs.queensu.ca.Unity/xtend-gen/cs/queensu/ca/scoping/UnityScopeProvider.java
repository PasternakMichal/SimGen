package cs.queensu.ca.scoping;

import com.google.common.base.Objects;
import cs.queensu.ca.scoping.AbstractUnityScopeProvider;
import cs.queensu.ca.unity.Action;
import cs.queensu.ca.unity.Attribute;
import cs.queensu.ca.unity.Config;
import cs.queensu.ca.unity.ConfigAssignment;
import cs.queensu.ca.unity.DotExpression;
import cs.queensu.ca.unity.ENV;
import cs.queensu.ca.unity.Expression;
import cs.queensu.ca.unity.Identifier;
import cs.queensu.ca.unity.Init;
import cs.queensu.ca.unity.Instance;
import cs.queensu.ca.unity.MetaObject;
import cs.queensu.ca.unity.OverrideAction;
import cs.queensu.ca.unity.Param;
import cs.queensu.ca.unity.Payload;
import cs.queensu.ca.unity.Property;
import cs.queensu.ca.unity.Ref;
import cs.queensu.ca.unity.SingleRef;
import cs.queensu.ca.unity.UnityObject;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
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
  
  protected IScope _extractScop(final SingleRef sr, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      scop = super.getScope(sr.eContainer(), ref);
      EObject _containerOfType = this.containerOfType(sr, Action.class);
      boolean _tripleNotEquals = (_containerOfType != null);
      if (_tripleNotEquals) {
        EObject _containerOfType_1 = this.containerOfType(sr, Action.class);
        Action action = ((Action) _containerOfType_1);
        Payload _payload = action.getPayload();
        boolean _notEquals = (!Objects.equal(((Payload) _payload), null));
        if (_notEquals) {
          Payload _payload_1 = action.getPayload();
          scop = Scopes.scopeFor(((Payload) _payload_1).getParams(), scop);
        }
        Payload _returnPayload = action.getReturnPayload();
        boolean _notEquals_1 = (!Objects.equal(((Payload) _returnPayload), null));
        if (_notEquals_1) {
          Payload _returnPayload_1 = action.getReturnPayload();
          scop = Scopes.scopeFor(((Payload) _returnPayload_1).getParams(), scop);
        }
      }
      EObject _containerOfType_2 = this.containerOfType(sr, MetaObject.class);
      boolean _tripleNotEquals_1 = (_containerOfType_2 != null);
      if (_tripleNotEquals_1) {
        EObject _containerOfType_3 = this.containerOfType(sr, MetaObject.class);
        MetaObject metaObj = ((MetaObject) _containerOfType_3);
        scop = Scopes.scopeFor(metaObj.getProperties(), scop);
      }
      EObject _containerOfType_4 = this.containerOfType(sr, UnityObject.class);
      boolean _tripleNotEquals_2 = (_containerOfType_4 != null);
      if (_tripleNotEquals_2) {
        EObject _containerOfType_5 = this.containerOfType(sr, UnityObject.class);
        MetaObject uniObj = ((UnityObject) _containerOfType_5).getType();
        EList<Attribute> _properties = uniObj.getProperties();
        boolean _tripleNotEquals_3 = (_properties != null);
        if (_tripleNotEquals_3) {
          scop = Scopes.scopeFor(uniObj.getProperties(), scop);
        }
      }
      if (((this.containerOfType(sr, Config.class) != null) && (this.containerOfType(sr, UnityObject.class) != null))) {
        MetaObject _elvis = null;
        EObject _containerOfType_6 = this.containerOfType(sr, UnityObject.class);
        MetaObject _type = ((UnityObject) _containerOfType_6).getType();
        if (_type != null) {
          _elvis = _type;
        } else {
          _elvis = null;
        }
        MetaObject metaObj_1 = _elvis;
        UnityObject _elvis_1 = null;
        EObject _containerOfType_7 = this.containerOfType(sr, UnityObject.class);
        if (((UnityObject) _containerOfType_7) != null) {
          _elvis_1 = ((UnityObject) _containerOfType_7);
        } else {
          _elvis_1 = null;
        }
        UnityObject unityObj = _elvis_1;
        scop = Scopes.scopeFor(metaObj_1.getProperties(), scop);
        scop = Scopes.scopeFor(unityObj.getProperties(), scop);
      }
      if (((this.containerOfType(sr, OverrideAction.class) != null) && (this.containerOfType(sr, UnityObject.class) != null))) {
        MetaObject _elvis_2 = null;
        EObject _containerOfType_8 = this.containerOfType(sr, UnityObject.class);
        MetaObject _type_1 = ((UnityObject) _containerOfType_8).getType();
        if (_type_1 != null) {
          _elvis_2 = _type_1;
        } else {
          _elvis_2 = null;
        }
        MetaObject metaObj_2 = _elvis_2;
        scop = Scopes.scopeFor(metaObj_2.getProperties(), scop);
        EObject _containerOfType_9 = this.containerOfType(sr, OverrideAction.class);
        Action refAction = ((OverrideAction) _containerOfType_9).getActionName();
        scop = Scopes.scopeFor(refAction.getPayload().getParams(), scop);
        scop = Scopes.scopeFor(refAction.getReturnPayload().getParams(), scop);
      }
      InputOutput.<IScope>println(scop);
      _xblockexpression = scop;
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final DotExpression exp, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      IScope _xifexpression = null;
      Ref _head = exp.getHead();
      if ((_head instanceof SingleRef)) {
        IScope _xblockexpression_1 = null;
        {
          Ref _head_1 = exp.getHead();
          SingleRef head = ((SingleRef) _head_1);
          IScope _switchResult = null;
          Property _singleRef = head.getSingleRef();
          boolean _matched = false;
          if (_singleRef instanceof Instance) {
            _matched=true;
            Property _singleRef_1 = head.getSingleRef();
            _switchResult = scop = this.extractScop(((Instance) _singleRef_1), ref);
          }
          if (!_matched) {
            if (_singleRef instanceof Property) {
              _matched=true;
              Property _singleRef_1 = head.getSingleRef();
              _switchResult = scop = this.extractScop(((Property) _singleRef_1), ref);
            }
          }
          if (!_matched) {
            return scop;
          }
          _xblockexpression_1 = _switchResult;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        Ref _head_1 = exp.getHead();
        if ((_head_1 instanceof DotExpression)) {
          return scop;
        }
      }
      _xblockexpression = _xifexpression;
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
      if (!_matched) {
        if (pro instanceof Attribute) {
          _matched=true;
          _switchResult = scop = this.extractScop(((Attribute) pro), ref);
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final Attribute att, final EReference ref) {
    return null;
  }
  
  protected IScope _extractScop(final Instance ins, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      scop = Scopes.scopeFor(ins.getInstanceType().getType().getProperties());
      _xblockexpression = scop = Scopes.scopeFor(ins.getInstanceType().getProperties(), scop);
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final Param param, final EReference ref) {
    return null;
  }
  
  protected IScope _extractScop(final OverrideAction overrideAct, final EReference ref) {
    int _compareTo = ref.getName().compareTo("actionName");
    boolean _equals = (_compareTo == 0);
    if (_equals) {
      EObject _eContainer = overrideAct.eContainer();
      MetaObject _type = null;
      if (((UnityObject) _eContainer)!=null) {
        _type=((UnityObject) _eContainer).getType();
      }
      return Scopes.scopeFor(_type.getActions());
    }
    IScope scop = IScope.NULLSCOPE;
    EObject _containerOfType = this.containerOfType(overrideAct, UnityObject.class);
    UnityObject parentObj = ((UnityObject) _containerOfType);
    if ((parentObj != null)) {
      MetaObject _type_1 = parentObj.getType();
      boolean _tripleNotEquals = (_type_1 != null);
      if (_tripleNotEquals) {
        scop = Scopes.scopeFor(overrideAct.getActionName().getPayload().getParams(), scop);
      }
      scop = Scopes.scopeFor(overrideAct.getActionName().getReturnPayload().getParams(), scop);
      scop = Scopes.scopeFor(parentObj.getType().getProperties(), scop);
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
  
  protected IScope _extractScop(final Config configAssig, final EReference ref) {
    IScope scop = IScope.NULLSCOPE;
    EObject _containerOfType = this.containerOfType(configAssig, UnityObject.class);
    UnityObject parentObj = ((UnityObject) _containerOfType);
    if ((parentObj != null)) {
      MetaObject _type = parentObj.getType();
      boolean _tripleNotEquals = (_type != null);
      if (_tripleNotEquals) {
        scop = Scopes.scopeFor(parentObj.getType().getProperties());
        scop = Scopes.scopeFor(parentObj.getProperties(), scop);
      }
    }
    return scop;
  }
  
  protected IScope _extractScop(final Expression exp, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      EObject _containerOfType = this.containerOfType(exp, Action.class);
      boolean _tripleNotEquals = (_containerOfType != null);
      if (_tripleNotEquals) {
        EObject _containerOfType_1 = this.containerOfType(exp, Action.class);
        Action action = ((Action) _containerOfType_1);
        Payload _payload = action.getPayload();
        scop = Scopes.scopeFor(((Payload) _payload).getParams(), scop);
        Payload _returnPayload = action.getReturnPayload();
        scop = Scopes.scopeFor(((Payload) _returnPayload).getParams(), scop);
      }
      EObject _containerOfType_2 = this.containerOfType(exp, MetaObject.class);
      boolean _tripleNotEquals_1 = (_containerOfType_2 != null);
      if (_tripleNotEquals_1) {
        EObject _containerOfType_3 = this.containerOfType(exp, MetaObject.class);
        MetaObject metaObj = ((MetaObject) _containerOfType_3);
        scop = Scopes.scopeFor(metaObj.getProperties(), scop);
      }
      if (((this.containerOfType(exp, Config.class) != null) && (this.containerOfType(exp, UnityObject.class) != null))) {
        MetaObject _elvis = null;
        EObject _containerOfType_4 = this.containerOfType(exp, UnityObject.class);
        MetaObject _type = ((UnityObject) _containerOfType_4).getType();
        if (_type != null) {
          _elvis = _type;
        } else {
          _elvis = null;
        }
        MetaObject metaObj_1 = _elvis;
        scop = Scopes.scopeFor(metaObj_1.getProperties(), scop);
      }
      if (((this.containerOfType(exp, OverrideAction.class) != null) && (this.containerOfType(exp, UnityObject.class) != null))) {
        MetaObject _elvis_1 = null;
        EObject _containerOfType_5 = this.containerOfType(exp, UnityObject.class);
        MetaObject _type_1 = ((UnityObject) _containerOfType_5).getType();
        if (_type_1 != null) {
          _elvis_1 = _type_1;
        } else {
          _elvis_1 = null;
        }
        MetaObject metaObj_2 = _elvis_1;
        scop = Scopes.scopeFor(metaObj_2.getProperties(), scop);
        EObject _containerOfType_6 = this.containerOfType(exp, OverrideAction.class);
        Action refAction = ((OverrideAction) _containerOfType_6).getActionName();
        scop = Scopes.scopeFor(refAction.getPayload().getParams(), scop);
        scop = Scopes.scopeFor(refAction.getReturnPayload().getParams(), scop);
      }
      if (((this.containerOfType(exp, Attribute.class) != null) && (this.containerOfType(exp, UnityObject.class) != null))) {
        MetaObject _elvis_2 = null;
        EObject _containerOfType_7 = this.containerOfType(exp, UnityObject.class);
        MetaObject _type_2 = ((UnityObject) _containerOfType_7).getType();
        if (_type_2 != null) {
          _elvis_2 = _type_2;
        } else {
          _elvis_2 = null;
        }
        MetaObject metaObj_3 = _elvis_2;
        scop = Scopes.scopeFor(metaObj_3.getProperties(), scop);
      }
      if (((this.containerOfType(exp, Init.class) != null) && (this.containerOfType(exp, ENV.class) != null))) {
        scop = super.getScope(exp, ref);
      }
      InputOutput.<IScope>println(scop);
      _xblockexpression = scop;
    }
    return _xblockexpression;
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
        if (context instanceof Identifier) {
          _matched=true;
          Ref _refrence = ((Identifier)context).getRefrence();
          if ((_refrence instanceof SingleRef)) {
            Ref _refrence_1 = ((Identifier)context).getRefrence();
            return this.extractScop(((SingleRef) _refrence_1), reference);
          }
        }
      }
      if (!_matched) {
        if (context instanceof ConfigAssignment) {
          _matched=true;
          return this.extractScop(((ConfigAssignment) context), reference);
        }
      }
      if (!_matched) {
        if (context instanceof Config) {
          _matched=true;
          return this.extractScop(((Config) context), reference);
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
      if (!_matched) {
        if (context instanceof Expression) {
          _matched=true;
          return this.extractScop(((Expression) context), reference);
        }
      }
      if (!_matched) {
        super.getScope(context, reference);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  public IScope extractScop(final EObject att, final EReference ref) {
    if (att instanceof Attribute) {
      return _extractScop((Attribute)att, ref);
    } else if (att instanceof DotExpression) {
      return _extractScop((DotExpression)att, ref);
    } else if (att instanceof Param) {
      return _extractScop((Param)att, ref);
    } else if (att instanceof SingleRef) {
      return _extractScop((SingleRef)att, ref);
    } else if (att instanceof Config) {
      return _extractScop((Config)att, ref);
    } else if (att instanceof ConfigAssignment) {
      return _extractScop((ConfigAssignment)att, ref);
    } else if (att instanceof Expression) {
      return _extractScop((Expression)att, ref);
    } else if (att instanceof Instance) {
      return _extractScop((Instance)att, ref);
    } else if (att instanceof OverrideAction) {
      return _extractScop((OverrideAction)att, ref);
    } else if (att instanceof Property) {
      return _extractScop((Property)att, ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(att, ref).toString());
    }
  }
}
