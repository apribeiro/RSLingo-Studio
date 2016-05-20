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
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageSystem;
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
    _builder.append("Project");
    _builder.newLine();
    _builder.append("----------------------------------------");
    _builder.newLine();
    Project _project = packageProject.getProject();
    CharSequence _compile = this.compile(_project);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    {
      EList<GlossaryTerm> _glossaryTerms = packageProject.getGlossaryTerms();
      boolean _isEmpty = _glossaryTerms.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("#Glossary");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<GlossaryTerm> _glossaryTerms_1 = packageProject.getGlossaryTerms();
          for(final GlossaryTerm g : _glossaryTerms_1) {
            CharSequence _compile_1 = this.compile(g);
            _builder.append(_compile_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Stakeholder> _stakeholders = packageProject.getStakeholders();
      boolean _isEmpty_1 = _stakeholders.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.newLine();
        _builder.append("#Stakeholders");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Stakeholder> _stakeholders_1 = packageProject.getStakeholders();
          for(final Stakeholder s : _stakeholders_1) {
            CharSequence _compile_2 = this.compile(s);
            _builder.append(_compile_2, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Goal> _goals = packageProject.getGoals();
      boolean _isEmpty_2 = _goals.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.newLine();
        _builder.append("#Goals");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Goal> _goals_1 = packageProject.getGoals();
          for(final Goal g_1 : _goals_1) {
            CharSequence _compile_3 = this.compile(g_1);
            _builder.append(_compile_3, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<PackageSystem> _packageSystems = packageProject.getPackageSystems();
      boolean _isEmpty_3 = _packageSystems.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.newLine();
        _builder.append("#Systems");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<PackageSystem> _packageSystems_1 = packageProject.getPackageSystems();
          for(final PackageSystem s_1 : _packageSystems_1) {
            CharSequence _compile_4 = this.compile(s_1);
            _builder.append(_compile_4, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
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
  
  public CharSequence compile(final PackageSystem p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Entity> _entities = p.getEntities();
      boolean _isEmpty = _entities.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("#Entities");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Entity> _entities_1 = p.getEntities();
          for(final Entity e : _entities_1) {
            CharSequence _compile = this.compile(e);
            _builder.append(_compile, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Actor> _actors = p.getActors();
      boolean _isEmpty_1 = _actors.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.newLine();
        _builder.append("#Actors");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Actor> _actors_1 = p.getActors();
          for(final Actor a : _actors_1) {
            CharSequence _compile_1 = this.compile(a);
            _builder.append(_compile_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<UseCase> _useCases = p.getUseCases();
      boolean _isEmpty_2 = _useCases.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.newLine();
        _builder.append("#Use Cases");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<UseCase> _useCases_1 = p.getUseCases();
          for(final UseCase u : _useCases_1) {
            CharSequence _compile_2 = this.compile(u);
            _builder.append(_compile_2, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<FR> _frs = p.getFrs();
      boolean _isEmpty_3 = _frs.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.newLine();
        _builder.append("#Functional Requirements");
        _builder.newLine();
        _builder.append("--------------------------");
        _builder.newLine();
        {
          EList<FR> _frs_1 = p.getFrs();
          for(final FR f : _frs_1) {
            CharSequence _compile_3 = this.compile(f);
            _builder.append(_compile_3, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<QR> _qrs = p.getQrs();
      boolean _isEmpty_4 = _qrs.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        _builder.newLine();
        _builder.append("#Quality Requirements");
        _builder.newLine();
        _builder.append("-----------------------------");
        _builder.newLine();
        {
          EList<QR> _qrs_1 = p.getQrs();
          for(final QR n : _qrs_1) {
            CharSequence _compile_4 = this.compile(n);
            _builder.append(_compile_4, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Constraint> _constraints = p.getConstraints();
      boolean _isEmpty_5 = _constraints.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        _builder.newLine();
        _builder.append("#Constraints");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Constraint> _constraints_1 = p.getConstraints();
          for(final Constraint c : _constraints_1) {
            CharSequence _compile_5 = this.compile(c);
            _builder.append(_compile_5, "");
          }
        }
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
