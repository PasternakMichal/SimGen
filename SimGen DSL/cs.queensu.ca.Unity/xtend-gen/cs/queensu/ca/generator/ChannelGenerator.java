package cs.queensu.ca.generator;

import com.google.common.collect.Iterables;
import cs.queensu.ca.unity.Channel;
import cs.queensu.ca.unity.ENV;
import cs.queensu.ca.unity.Instance;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ChannelGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    InputOutput.<String>println("Checking config file2...");
    this.generateChannelCode(resource, fsa, context);
  }
  
  public void generateChannelCode(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<ENV> _filter = Iterables.<ENV>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), ENV.class);
    for (final ENV a : _filter) {
      EList<Channel> _channels = a.getChannels();
      for (final Channel c : _channels) {
        String _name = c.getName();
        String _plus = (("Simulator/" + "ChannelController") + _name);
        String _plus_1 = (_plus + ".cs");
        fsa.generateFile(_plus_1, this.channelcontroller(c));
      }
    }
  }
  
  public CharSequence channelcontroller(final Channel c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using System.Collections;");
    _builder.newLine();
    _builder.append("using System.Collections.Generic;");
    _builder.newLine();
    _builder.append("using UnityEngine;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ChannelController");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(" : MonoBehaviour {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Network externalComm;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public string myName = \"");
    String _name_1 = c.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void Start () {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("externalComm = new Network(");
    int _portnumber = c.getPort().getPortnumber();
    _builder.append(_portnumber, "\t\t");
    _builder.append(",myName,20); // port, net ID, Container size");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("externalComm.StartNetwork();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Update is called once per frame");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void Update () {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (externalComm.isContainerEmpty () == false) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("route(externalComm.getMessage());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// take out the important information from the message");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void route(string S){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (S != null || S.Equals(\"\")== false) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("string name = S.Substring (0, S.IndexOf (\',\'));");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("S = cut (S);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("// send the message on to the designated recipient inout");
    _builder.newLine();
    {
      EList<Instance> _boundInstances = c.getBoundInstances();
      for(final Instance q : _boundInstances) {
        _builder.append("if (name == \"");
        String _name_2 = q.getName();
        _builder.append(_name_2);
        _builder.append("\") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_3 = q.getName();
        _builder.append(_name_3, "\t");
        _builder.append("Script ");
        String _name_4 = q.getName();
        _builder.append(_name_4, "\t");
        _builder.append(" = GetComponentInChildren<");
        String _name_5 = q.getName();
        _builder.append(_name_5, "\t");
        _builder.append("Script> ();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("// send the action name, return the reply that is generated");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("string reply = ");
        String _name_6 = q.getName();
        _builder.append(_name_6, "\t");
        _builder.append(".translate (S);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("// if inout, then do this if in only don\'t ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if (reply.Equals(\"\") == false || reply != null)");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("externalComm.SendMessage(\"");
        String _name_7 = q.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append(",\"+reply+\";\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public string cut(string message){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return message.Substring(message.IndexOf(\',\')+1);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
