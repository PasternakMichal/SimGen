package cs.queensu.ca.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class AutoModelScopeUtility {
  public int ownerLevel(final EObject o, final EClass ownerType) {
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
}
