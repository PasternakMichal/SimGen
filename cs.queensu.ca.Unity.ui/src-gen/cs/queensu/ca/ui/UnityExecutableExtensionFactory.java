/*
 * generated by Xtext 2.12.0
 */
package cs.queensu.ca.ui;

import com.google.inject.Injector;
import cs.queensu.ca.Unity.ui.internal.UnityActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UnityExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return UnityActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return UnityActivator.getInstance().getInjector(UnityActivator.CS_QUEENSU_CA_UNITY);
	}
	
}
