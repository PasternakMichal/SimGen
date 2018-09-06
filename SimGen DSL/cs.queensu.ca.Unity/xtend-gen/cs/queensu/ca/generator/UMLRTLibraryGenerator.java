package cs.queensu.ca.generator;

import java.io.IOException;
import java.util.Map;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.papyrusrt.codegen.cpp.profile.RTCppProperties.RTCppPropertiesPackage;
import org.eclipse.papyrusrt.umlrt.profile.UMLRealTime.UMLRealTimePackage;
import org.eclipse.papyrusrt.umlrt.profile.statemachine.UMLRTStateMachines.UMLRTStateMachinesPackage;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class UMLRTLibraryGenerator {
  private UMLResource umlResource;
  
  private Resource unityResource;
  
  private IFileSystemAccess2 fsa;
  
  private IGeneratorContext context;
  
  private String umlModelPath;
  
  private Model umlRTModel;
  
  public UMLRTLibraryGenerator(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    super();
    this.setUnityResource(resource);
    this.setFsa(fsa);
    this.setContext(context);
  }
  
  public UMLRTLibraryGenerator() {
  }
  
  public void generateModelLibrary() {
    this.intUMLModel("/UnityGateway/model.uml");
    this.loadUMLModel();
    this.createClass("test");
    this.createUMLRTCapsule("testCapsule111");
  }
  
  public void intUMLModel(final String umlModelPath) {
    this.setUmlModelPath(umlModelPath);
    ResourceSet resourceSet = new ResourceSetImpl();
    Map<String, Object> _extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    UMLResourceFactoryImpl _uMLResourceFactoryImpl = new UMLResourceFactoryImpl();
    _extensionToFactoryMap.put("uml", _uMLResourceFactoryImpl);
    Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
    if ((!EMFPlugin.IS_ECLIPSE_RUNNING)) {
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, 
        UMLResource.Factory.INSTANCE);
      resourceSet.getPackageRegistry().put(Ecore2XMLPackage.eNS_URI, Ecore2XMLPackage.eINSTANCE);
      resourceSet.getPackageRegistry().put(UMLRealTimePackage.eNS_URI, UMLRealTimePackage.eINSTANCE);
      resourceSet.getPackageRegistry().put(RTCppPropertiesPackage.eNS_URI, RTCppPropertiesPackage.eINSTANCE);
      resourceSet.getPackageRegistry().put(UMLRTStateMachinesPackage.eNS_URI, UMLRTStateMachinesPackage.eINSTANCE);
      resourceSet.getPackageRegistry().put(Ecore2XMLPackage.eNS_URI, Ecore2XMLPackage.eINSTANCE);
      resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
      resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
      UMLResourcesUtil.init(resourceSet);
      uriMap.put(URI.createURI("pathmap://UML_RT_PROFILE/UMLRealTimeSM-addendum.profile.uml"), 
        URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/UMLRealTimeSM-addendum.profile.uml/"));
      uriMap.put(URI.createURI("pathmap://UMLRT_CPP/RTCppProperties.profile.uml"), 
        URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/RTCppProperties.profile.uml/"));
      uriMap.put(URI.createURI("pathmap://UML_RT_PROFILE/uml-rt.profile.uml"), 
        URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/uml-rt.profile.uml/"));
      uriMap.put(URI.createURI("pathmap://UMLRTRTSLIB/UMLRT-RTS.uml"), 
        URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/UMLRT-RTS.uml/"));
    }
    Resource _createResource = resourceSet.createResource(URI.createURI(this.getUmlModelPath()));
    this.umlResource = ((UMLResource) _createResource);
  }
  
  public boolean loadUMLModel() {
    try {
      this.umlResource.load(null);
      Object _objectByType = EcoreUtil.getObjectByType(this.umlResource.getContents(), UMLPackage.Literals.MODEL);
      this.setUmlRTModel(((Model) _objectByType));
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void saveUMLModel() {
    try {
      this.umlResource.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException ioe = (IOException)_t;
        System.err.println(ioe.getMessage());
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected org.eclipse.uml2.uml.Package createPackage(final org.eclipse.uml2.uml.Package owner, final String name) {
    org.eclipse.uml2.uml.Package package_ = owner.createNestedPackage(name);
    return package_;
  }
  
  protected org.eclipse.uml2.uml.Package createPackage(final String name) {
    org.eclipse.uml2.uml.Package package_ = this.getUmlRTModel().createNestedPackage(name);
    return package_;
  }
  
  public org.eclipse.uml2.uml.Class createUMLRTCapsule(final String name) {
    org.eclipse.uml2.uml.Class class_ = this.createClass(name);
    int _applyStreotype = this.applyStreotype(class_, "Capsule");
    boolean _lessEqualsThan = (_applyStreotype <= 0);
    if (_lessEqualsThan) {
      System.err.println("Capsule Stereotype is not aplied");
    }
    return class_;
  }
  
  public void applyUMLRTProfile() {
    Profile profile = UMLFactory.eINSTANCE.createProfile();
  }
  
  public org.eclipse.uml2.uml.Class createClass(final String name) {
    org.eclipse.uml2.uml.Class class_ = this.getUmlRTModel().createOwnedClass(name, false);
    return class_;
  }
  
  public org.eclipse.uml2.uml.Class createClass(final org.eclipse.uml2.uml.Package owner, final String name) {
    org.eclipse.uml2.uml.Class class_ = owner.createOwnedClass(name, false);
    return class_;
  }
  
  public Port createPortKind(final org.eclipse.uml2.uml.Class owner, final String kind) {
    Port portKind1 = this.createPort(owner, null, null, null, null, null);
    if ((kind == "SAP")) {
      portKind1.setIsService(false);
    } else {
      if ((kind == "SPP")) {
        portKind1.setIsService(true);
      }
    }
    return portKind1;
  }
  
  public Port createPort(final org.eclipse.uml2.uml.Class owner, final String name, final Boolean conj, final Integer lowerValue, final Integer upperValue, final String type) {
    Port port1 = owner.createOwnedPort(name, null);
    this.applyStreotype(port1, "Port1");
    port1.setLower((lowerValue).intValue());
    port1.setUpper((upperValue).intValue());
    port1.setIsConjugated((conj).booleanValue());
    return port1;
  }
  
  public Collaboration createProtocol(final String name) {
    org.eclipse.uml2.uml.Package pm = this.createPackage(name);
    Collaboration protocol1 = this.createCollaboration(pm, name);
    Interface baseInterface = this.createInterface(pm, name);
    Interface conjugateInterface = this.createInterface(pm, name.concat("~"));
    Interface binaryInterface = this.createInterface(pm, name.concat("IO"));
    this.createUsage(pm, protocol1, baseInterface);
    this.createUsage(pm, protocol1, conjugateInterface);
    this.createUsage(pm, protocol1, binaryInterface);
    this.createRealization(protocol1, baseInterface);
    this.createRealization(protocol1, conjugateInterface);
    this.createRealization(protocol1, binaryInterface);
    this.applyStreotype(pm, "Protocol");
    this.createMessage(binaryInterface, "signal1");
    return protocol1;
  }
  
  public InterfaceRealization createRealization(final Collaboration collaboration1, final Interface interface1) {
    InterfaceRealization realization1 = collaboration1.createInterfaceRealization("", interface1);
    return realization1;
  }
  
  public Usage createUsage(final org.eclipse.uml2.uml.Package owner, final Collaboration collaboration, final Interface interface1) {
    Usage usage1 = owner.createUsage(collaboration);
    usage1.createDependency(interface1);
    return usage1;
  }
  
  public Event createEvent(final org.eclipse.uml2.uml.Package owner, final String name) {
    Type _createOwnedType = owner.createOwnedType(name, UMLPackage.Literals.EVENT);
    Event event1 = ((Event) _createOwnedType);
    return event1;
  }
  
  public Operation createMessage(final Interface owner, final String name) {
    Operation operation1 = owner.createOwnedOperation(name, null, null, null);
    return operation1;
  }
  
  public Collaboration createCollaboration(final org.eclipse.uml2.uml.Package owner, final String name) {
    Type _createOwnedType = owner.createOwnedType(name, 
      UMLPackage.Literals.COLLABORATION);
    Collaboration collaboration1 = ((Collaboration) _createOwnedType);
    return collaboration1;
  }
  
  public Interface createInterface(final org.eclipse.uml2.uml.Package owner, final String name) {
    Type _createOwnedType = owner.createOwnedType(name, 
      UMLPackage.Literals.INTERFACE);
    Interface interface1 = ((Interface) _createOwnedType);
    return interface1;
  }
  
  public int applyStreotype(final Element umlModelElement, final String stereotypeName) {
    int result = 0;
    EList<Profile> _allAppliedProfiles = this.getUmlRTModel().getAllAppliedProfiles();
    for (final Profile profile : _allAppliedProfiles) {
      {
        EPackage ep = profile.getDefinition();
        System.out.println(profile.getLabel());
      }
    }
    EList<Stereotype> _applicableStereotypes = umlModelElement.getApplicableStereotypes();
    for (final Stereotype stereoType : _applicableStereotypes) {
      {
        System.out.println(stereoType.getName());
        boolean _equals = stereoType.getName().equals(stereotypeName);
        if (_equals) {
          umlModelElement.applyStereotype(stereoType);
          result++;
        }
      }
    }
    return result;
  }
  
  public String getUmlModelPath() {
    return this.umlModelPath;
  }
  
  public void setUmlModelPath(final String umlModelPath) {
    this.umlModelPath = umlModelPath;
  }
  
  public Model getUmlRTModel() {
    return this.umlRTModel;
  }
  
  public void setUmlRTModel(final Model umlRTModel) {
    this.umlRTModel = umlRTModel;
  }
  
  public Resource getUnityResource() {
    return this.unityResource;
  }
  
  public void setUnityResource(final Resource unityResource) {
    this.unityResource = unityResource;
  }
  
  public IFileSystemAccess2 getFsa() {
    return this.fsa;
  }
  
  public void setFsa(final IFileSystemAccess2 fsa) {
    this.fsa = fsa;
  }
  
  public IGeneratorContext getContext() {
    return this.context;
  }
  
  public void setContext(final IGeneratorContext context) {
    this.context = context;
  }
}
