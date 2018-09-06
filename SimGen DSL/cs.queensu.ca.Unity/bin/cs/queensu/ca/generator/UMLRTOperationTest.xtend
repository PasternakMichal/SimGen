package cs.queensu.ca.generator

class UMLRTOperationTest {
	def static void main(String[] args) {
		// TODO Auto-generated method stub
		System::out.println("testing UMLRTModel Operation in java")
		var UMLRTLibraryGenerator umlRTUtil = new UMLRTLibraryGenerator()
		umlRTUtil.generateModelLibrary()
		umlRTUtil.saveUMLModel()
		umlRTUtil.createClass("test")
		umlRTUtil.createUMLRTCapsule("testCapsule111")
	}
}
