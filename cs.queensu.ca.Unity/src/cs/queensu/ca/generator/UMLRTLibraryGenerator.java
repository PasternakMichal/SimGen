package cs.queensu.ca.generator;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.papyrusrt.codegen.cpp.profile.RTCppProperties.RTCppPropertiesPackage;
import org.eclipse.papyrusrt.umlrt.profile.UMLRealTime.UMLRealTimePackage;
import org.eclipse.papyrusrt.umlrt.profile.statemachine.UMLRTStateMachines.UMLRTStateMachinesPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.internal.resource.UMLResourceImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;



public class UMLRTLibraryGenerator {
	
	private UMLResource umlResource;
	private Resource unityResource;
	private IFileSystemAccess2 fsa;
	private IGeneratorContext context;
	private String   umlModelPath;
	private Model umlRTModel;
	
	
	/// make it runnable for test purpose, remove it later

	public UMLRTLibraryGenerator(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		super();
		this.setUnityResource(resource);
		this.setFsa(fsa);
		this.setContext(context);
		//this.generateModelLibrary();
		//this.intUMLModel("/UnityGateway/model.uml");
	}

	public UMLRTLibraryGenerator() {
		// TODO Auto-generated constructor stub
	}

	public void  generateModelLibrary(){
		this.intUMLModel("../cs.queensu.ca.UnityUMLRTGateWay/UnityGateway/model.uml");
		//this.intUMLModel("/UnityGateway/model.uml");
		this.loadUMLModel();
		createClass("test");
		createUMLRTCapsule("testCapsule111");
	}
	public void intUMLModel(String umlModelPath){
		this.setUmlModelPath(umlModelPath);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		resourceSet.getPackageRegistry().put(Ecore2XMLPackage.eNS_URI,Ecore2XMLPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(UMLRealTimePackage.eNS_URI, UMLRealTimePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(RTCppPropertiesPackage.eNS_URI, RTCppPropertiesPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(UMLRTStateMachinesPackage.eNS_URI, UMLRTStateMachinesPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(Ecore2XMLPackage.eNS_URI,Ecore2XMLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl());
		Map<URI,URI> uriMap = resourceSet.getURIConverter().getURIMap();
		
		
		//org.eclipse.uml2.uml.util.UMLUtil.init(resourceSet);
		org.eclipse.uml2.uml.resources.util.UMLResourcesUtil.init(resourceSet);
		uriMap.put(URI.createURI("pathmap://UML_RT_PROFILE/UMLRealTimeSM-addendum.profile.uml"),
				URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/UMLRealTimeSM-addendum.profile.uml/"));
		uriMap.put(URI.createURI("pathmap://UMLRT_CPP/RTCppProperties.profile.uml"),
				URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/RTCppProperties.profile.uml/"));
		uriMap.put(URI.createURI("pathmap://UML_RT_PROFILE/uml-rt.profile.uml"),
				URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/uml-rt.profile.uml/"));
		uriMap.put(URI.createURI("pathmap://UMLRTRTSLIB/UMLRT-RTS.uml"),
				URI.createURI("file:../cs.queensu.ca.Unity/UMLRT-Profiles/UMLRT-RTS.uml/")); 
		this.umlResource = (UMLResource) resourceSet.createResource(URI.createURI(this.getUmlModelPath()));
	}

	public boolean loadUMLModel(){
	        try {
	        	this.umlResource.load(null);
	        	//EcoreUtil.resolveAll(umlResource);
	        	//this.setUmlRTModel((Model) this.umlResource.getContents().get(0));
	        	this.setUmlRTModel( (Model) EcoreUtil.getObjectByType(umlResource.getContents(), UMLPackage.Literals.MODEL));
	            return true;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return false;
	        }	
		
	}
	
	public void saveUMLModel(){
        try {
        	umlResource.save(null); // no save options needed
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
	}
/// create capsule
/// create package
    protected  org.eclipse.uml2.uml.Package createPackage(org.eclipse.uml2.uml.Package owner, String name) {
        org.eclipse.uml2.uml.Package package_ =owner.createNestedPackage(name);
        return package_;
    }
    protected  org.eclipse.uml2.uml.Package createPackage( String name) {
        org.eclipse.uml2.uml.Package package_ =this.getUmlRTModel().createNestedPackage(name);
        return package_;
    }
/// create protocol
/// create port
/// create top capsule
	public  org.eclipse.uml2.uml.Class createUMLRTCapsule(String name){
		org.eclipse.uml2.uml.Class class_=this.createClass(name);
		if (applyStreotype(class_, "Capsule")<=0){
			System.err.println("Capsule Stereotype is not aplied");
		}
		return class_;
	}
/// apply profiles to UMLRTModel
	public void applyUMLRTProfile(){
		Profile profile=UMLFactory.eINSTANCE.createProfile();
		// do it later, for now we get the model which have applied profiles
		//profile.
	}
	
/// add messages to protocols
/// create connection
/// remove message from protocols
/// remove 
/// create class
	public  org.eclipse.uml2.uml.Class createClass(String name){
		org.eclipse.uml2.uml.Class class_=this.getUmlRTModel().createOwnedClass(name, false);
		return class_;
		
	}
	public  org.eclipse.uml2.uml.Class createClass(org.eclipse.uml2.uml.Package owner, String name){
		org.eclipse.uml2.uml.Class class_=owner.createOwnedClass(name, false);
		return class_;	
	}
/// apply stereotype
	public int applyStreotype(org.eclipse.uml2.uml.Element umlModelElement,String stereotypeName){
		int result=0;
		for (Profile profile:this.getUmlRTModel().getAllAppliedProfiles()){
			EPackage ep=profile.getDefinition();
			System.out.println(profile.getLabel());
		}
		//umlModelElement.getApplicableStereotypes();
		for (org.eclipse.uml2.uml.Stereotype stereoType: umlModelElement.getApplicableStereotypes()){
			System.out.println(stereoType.getName());
			if (stereoType.getName().equals(stereotypeName)){
				umlModelElement.applyStereotype(stereoType);
				result++;
			}
		}
		return result;
	}
	
	public String getUmlModelPath() {
		return umlModelPath;
	}

	public void setUmlModelPath(String umlModelPath) {
		this.umlModelPath = umlModelPath;
	}

	public Model getUmlRTModel() {
		return umlRTModel;
	}

	public void setUmlRTModel(Model umlRTModel) {
		this.umlRTModel = umlRTModel;
	}

	public Resource getUnityResource() {
		return unityResource;
	}

	public void setUnityResource(Resource unityResource) {
		this.unityResource = unityResource;
	}

	public IFileSystemAccess2 getFsa() {
		return fsa;
	}

	public void setFsa(IFileSystemAccess2 fsa) {
		this.fsa = fsa;
	}

	public IGeneratorContext getContext() {
		return context;
	}

	public void setContext(IGeneratorContext context) {
		this.context = context;
	}
	

	
	


}
