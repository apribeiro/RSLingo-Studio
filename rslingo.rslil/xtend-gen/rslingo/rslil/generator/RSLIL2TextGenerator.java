package rslingo.rslil.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RSLIL2TextGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\nPolicy cannot be resolved to a type.");
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence compile(final /* Policy */Object policy) {
    throw new Error("Unresolved compilation problems:"
      + "\nmetadata cannot be resolved"
      + "\nname cannot be resolved"
      + "\nenforcement cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nenforcement cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nservice cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nservice cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nrecipient cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nrecipient cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nprivateData cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nprivateData cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\ncollection cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncollection cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\ndisclosure cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ndisclosure cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nretention cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nretention cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nusage cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nusage cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\ninformative cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ninformative cannot be resolved"
      + "\ncompile cannot be resolved");
  }
  
  public CharSequence compile(final /* Enforcement */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nenforcementName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ndescription cannot be resolved");
  }
  
  public CharSequence compile(final /* Service */Object s) {
    throw new Error("Unresolved compilation problems:"
      + "\nserviceName cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nservicePart cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nservicePart cannot be resolved"
      + "\ncompileServicePart cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPDAll cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public CharSequence compile(final /* Recipient */Object r) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nrecipientName cannot be resolved"
      + "\nscope cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nrecipientPart cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nrecipientPart cannot be resolved"
      + "\ncompileRecipientPart cannot be resolved");
  }
  
  public CharSequence compile(final /* PrivateData */Object p) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nattribute cannot be resolved"
      + "\ncompile cannot be resolved");
  }
  
  public CharSequence compile(final /* Attribute */Object a) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compile(final /* Collection */Object c) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nmodality cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefSAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPDAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEAll cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public CharSequence compile(final /* Disclosure */Object d) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nmodality cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nrefRecipient cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefRecipient cannot be resolved"
      + "\nrefRecipient cannot be resolved"
      + "\ncompileRefRecipient cannot be resolved"
      + "\nrefRecipient cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefRecipient cannot be resolved"
      + "\nrefRAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefSAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEAll cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public CharSequence compile(final /* Retention */Object r) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nmodality cannot be resolved"
      + "\nperiod cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefSAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPDAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEAll cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public CharSequence compile(final /* Usage */Object u) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nmodality cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefSAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPDAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEAll cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public CharSequence compile(final /* Informative */Object i) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nmodality cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefService cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefService cannot be resolved"
      + "\nrefSAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPrivateData cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefPrivateData cannot be resolved"
      + "\nrefPDAll cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEnforcement cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\ncompileRefEnforcement cannot be resolved"
      + "\nrefEAll cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public CharSequence compilePeriod(final /* Retention */Object r) {
    throw new Error("Unresolved compilation problems:"
      + "\nperiod cannot be resolved");
  }
  
  public CharSequence compileRefRecipient(final /* Recipient */Object r) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compileRefService(final /* Service */Object s) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compileServicePart(final /* ServicePart */Object s) {
    throw new Error("Unresolved compilation problems:"
      + "\nservicePart cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compileRefPrivateData(final /* PrivateData */Object p) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compileRecipientPart(final /* RecipientPart */Object r) {
    throw new Error("Unresolved compilation problems:"
      + "\nrecipientPart cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compileRefEnforcement(final /* Enforcement */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
}
