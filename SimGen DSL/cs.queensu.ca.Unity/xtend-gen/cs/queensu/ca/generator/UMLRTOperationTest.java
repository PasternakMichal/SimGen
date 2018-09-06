package cs.queensu.ca.generator;

import cs.queensu.ca.generator.UMLRTLibraryGenerator;

@SuppressWarnings("all")
public class UMLRTOperationTest {
  public static void main(final String[] args) {
    System.out.println("testing UMLRTModel Operation in java");
    UMLRTLibraryGenerator umlRTUtil = new UMLRTLibraryGenerator();
    umlRTUtil.generateModelLibrary();
    umlRTUtil.saveUMLModel();
    umlRTUtil.createClass("test");
    umlRTUtil.createUMLRTCapsule("testCapsule111");
  }
}
