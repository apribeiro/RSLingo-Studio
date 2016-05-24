package rslingo.rslil.generator;

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
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.Stakeholder;

@SuppressWarnings("all")
public class RSLIL2JsonGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".json");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<PackageProject> _filter = Iterators.<PackageProject>filter(_allContents, PackageProject.class);
    final Function1<PackageProject, CharSequence> _function = (PackageProject it) -> {
      return this.compile(it);
    };
    Iterator<CharSequence> _map = IteratorExtensions.<PackageProject, CharSequence>map(_filter, _function);
    String _join = IteratorExtensions.join(_map, " ");
    fsa.generateFile(_plus, _join);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence compile(final PackageProject packageProject) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"name\": \"");
    Project _project = packageProject.getProject();
    String _name = _project.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"description\": \"");
    Project _project_1 = packageProject.getProject();
    String _description = _project_1.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<GlossaryTerm> _glossaryTerms = packageProject.getGlossaryTerms();
      boolean _isEmpty = _glossaryTerms.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Glossary\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        {
          EList<GlossaryTerm> _glossaryTerms_1 = packageProject.getGlossaryTerms();
          boolean _hasElements = false;
          for(final GlossaryTerm g : _glossaryTerms_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t    ");
            }
            CharSequence _compile = this.compile(g);
            _builder.append(_compile, "\t    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    {
      EList<Stakeholder> _stakeholders = packageProject.getStakeholders();
      boolean _isEmpty_1 = _stakeholders.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Stakeholders\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        {
          EList<Stakeholder> _stakeholders_1 = packageProject.getStakeholders();
          boolean _hasElements_1 = false;
          for(final Stakeholder s : _stakeholders_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t    ");
            }
            CharSequence _compile_1 = this.compile(s);
            _builder.append(_compile_1, "\t    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    {
      EList<Goal> _goals = packageProject.getGoals();
      boolean _isEmpty_2 = _goals.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Goals\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        {
          EList<Goal> _goals_1 = packageProject.getGoals();
          boolean _hasElements_2 = false;
          for(final Goal g_1 : _goals_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t    ");
            }
            CharSequence _compile_2 = this.compile(g_1);
            _builder.append(_compile_2, "\t    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    {
      EList<PackageSystem> _packageSystems = packageProject.getPackageSystems();
      boolean _isEmpty_3 = _packageSystems.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Systems\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        {
          EList<PackageSystem> _packageSystems_1 = packageProject.getPackageSystems();
          boolean _hasElements_3 = false;
          for(final PackageSystem s_1 : _packageSystems_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "\t    ");
            }
            CharSequence _compile_3 = this.compile(s_1);
            _builder.append(_compile_3, "\t    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final GlossaryTerm g) {
    StringConcatenation _builder = new StringConcatenation();
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
  
  public CharSequence compile(final PackageSystem g) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
