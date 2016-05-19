package rslingo.rslil.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import rslingo.rslil.rSLIL.Actor;
import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Model;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RefSystem;
import rslingo.rslil.rSLIL.RefTermType;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.UseCase;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RSLIL2TextGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".txt");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
    final Function1<Model, CharSequence> _function = (Model it) -> {
      return this.compile(it);
    };
    Iterator<CharSequence> _map = IteratorExtensions.<Model, CharSequence>map(_filter, _function);
    String _join = IteratorExtensions.join(_map, " ");
    fsa.generateFile(_plus, _join);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence compile(final Model model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method project is undefined for the type RSLIL2TextGenerator"
      + "\nThe method systems is undefined for the type RSLIL2TextGenerator"
      + "\nThe method systems is undefined for the type RSLIL2TextGenerator"
      + "\nThe method glossaryTerms is undefined for the type RSLIL2TextGenerator"
      + "\nThe method glossaryTerms is undefined for the type RSLIL2TextGenerator"
      + "\nThe method stakeholders is undefined for the type RSLIL2TextGenerator"
      + "\nThe method stakeholders is undefined for the type RSLIL2TextGenerator"
      + "\nThe method goals is undefined for the type RSLIL2TextGenerator"
      + "\nThe method goals is undefined for the type RSLIL2TextGenerator"
      + "\nThe method entities is undefined for the type RSLIL2TextGenerator"
      + "\nThe method entities is undefined for the type RSLIL2TextGenerator"
      + "\nThe method actors is undefined for the type RSLIL2TextGenerator"
      + "\nThe method actors is undefined for the type RSLIL2TextGenerator"
      + "\nThe method useCases is undefined for the type RSLIL2TextGenerator"
      + "\nThe method useCases is undefined for the type RSLIL2TextGenerator"
      + "\nThe method frs is undefined for the type RSLIL2TextGenerator"
      + "\nThe method frs is undefined for the type RSLIL2TextGenerator"
      + "\nThe method qrs is undefined for the type RSLIL2TextGenerator"
      + "\nThe method qrs is undefined for the type RSLIL2TextGenerator"
      + "\nThe method constraints is undefined for the type RSLIL2TextGenerator"
      + "\nThe method constraints is undefined for the type RSLIL2TextGenerator"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved");
  }
  
  public CharSequence compile(final Project p) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = p.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = p.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    String _description = p.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      RefSystem _refSystem = p.getRefSystem();
      boolean _notEquals = (!Objects.equal(_refSystem, null));
      if (_notEquals) {
        _builder.append("HasSystems: ");
        RefSystem _refSystem_1 = p.getRefSystem();
        rslingo.rslil.rSLIL.System _refSystem_2 = _refSystem_1.getRefSystem();
        CharSequence _compileRefSystem = this.compileRefSystem(_refSystem_2);
        _builder.append(_compileRefSystem, "\t");
        {
          RefSystem _refSystem_3 = p.getRefSystem();
          EList<rslingo.rslil.rSLIL.System> _refs = _refSystem_3.getRefs();
          for(final rslingo.rslil.rSLIL.System part : _refs) {
            _builder.append(", ");
            CharSequence _compileRefSystem_1 = this.compileRefSystem(part);
            _builder.append(_compileRefSystem_1, "\t");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final rslingo.rslil.rSLIL.System s) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final GlossaryTerm g) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = g.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = g.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append("(");
    RefTermType _type = g.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _acronym = g.getAcronym();
    _builder.append(_acronym, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    String _description = g.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    String _pos = g.getPos();
    _builder.append(_pos, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    String _synset = g.getSynset();
    _builder.append(_synset, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    String _description_1 = g.getDescription();
    _builder.append(_description_1, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//Term Relation");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Stakeholder s) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final Goal g) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final Actor a) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final UseCase u) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final FR f) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final QR q) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final Constraint c) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compileRefSystem(final rslingo.rslil.rSLIL.System s) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = s.getName();
    _builder.append(_name, "");
    return _builder;
  }
}
