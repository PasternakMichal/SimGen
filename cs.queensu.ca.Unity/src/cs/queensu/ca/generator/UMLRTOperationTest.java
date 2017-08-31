package cs.queensu.ca.generator;


public class UMLRTOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("testing UMLRTModel Operation in java");
		UMLRTLibraryGenerator umlRTUtil=new UMLRTLibraryGenerator();
		umlRTUtil.generateModelLibrary();
		umlRTUtil.saveUMLModel();
		umlRTUtil.createClass("test");
		umlRTUtil.createUMLRTCapsule("testCapsule111");
			


	}

}
