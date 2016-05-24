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
import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.Check;
import rslingo.rslil.rSLIL.ComposedBy;
import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.DependsOnConstraint;
import rslingo.rslil.rSLIL.DependsOnFR;
import rslingo.rslil.rSLIL.DependsOnGoal;
import rslingo.rslil.rSLIL.DependsOnQR;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.EntityType;
import rslingo.rslil.rSLIL.ExtensionPoint;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.ForeignKey;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.Multiplicity;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.PrimaryKey;
import rslingo.rslil.rSLIL.Priority;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RefActor;
import rslingo.rslil.rSLIL.RefAttribute;
import rslingo.rslil.rSLIL.RefConstraint;
import rslingo.rslil.rSLIL.RefEntity;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefQR;
import rslingo.rslil.rSLIL.RefTerm;
import rslingo.rslil.rSLIL.RefTermType;
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.Scenario;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.Step;
import rslingo.rslil.rSLIL.TermRelation;
import rslingo.rslil.rSLIL.TermType;
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
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PackageSystem p) {
    StringConcatenation _builder = new StringConcatenation();
    rslingo.rslil.rSLIL.System _system = p.getSystem();
    CharSequence _compile = this.compile(_system);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
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
            CharSequence _compile_1 = this.compile(e);
            _builder.append(_compile_1, "");
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
            CharSequence _compile_2 = this.compile(a);
            _builder.append(_compile_2, "");
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
            CharSequence _compile_3 = this.compile(u);
            _builder.append(_compile_3, "");
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
            CharSequence _compile_4 = this.compile(f);
            _builder.append(_compile_4, "");
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
            CharSequence _compile_5 = this.compile(n);
            _builder.append(_compile_5, "");
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
            CharSequence _compile_6 = this.compile(c);
            _builder.append(_compile_6, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final rslingo.rslil.rSLIL.System s) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = s.getDescription();
    _builder.append(_description, "");
    _builder.newLineIfNotEmpty();
    {
      rslingo.rslil.rSLIL.System _partOf = s.getPartOf();
      boolean _notEquals = (!Objects.equal(_partOf, null));
      if (_notEquals) {
        _builder.append("Part Of: ");
        rslingo.rslil.rSLIL.System _partOf_1 = s.getPartOf();
        String _name_1 = _partOf_1.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final GlossaryTerm g) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = g.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = g.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    RefTermType _type = g.getType();
    CharSequence _compile = this.compile(_type);
    _builder.append(_compile, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = g.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      String _acronym = g.getAcronym();
      boolean _notEquals = (!Objects.equal(_acronym, null));
      if (_notEquals) {
        _builder.append("Acronym: ");
        String _acronym_1 = g.getAcronym();
        _builder.append(_acronym_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _pos = g.getPos();
      boolean _notEquals_1 = (!Objects.equal(_pos, null));
      if (_notEquals_1) {
        _builder.append("POS: ");
        String _pos_1 = g.getPos();
        _builder.append(_pos_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _synset = g.getSynset();
      boolean _notEquals_2 = (!Objects.equal(_synset, null));
      if (_notEquals_2) {
        _builder.append("Synset: ");
        String _synset_1 = g.getSynset();
        _builder.append(_synset_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<TermRelation> _termRelation = g.getTermRelation();
      boolean _isEmpty = _termRelation.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Term Relations: ");
        {
          EList<TermRelation> _termRelation_1 = g.getTermRelation();
          boolean _hasElements = false;
          for(final TermRelation t : _termRelation_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile_1 = this.compile(t);
            _builder.append(_compile_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final RefTermType r) {
    StringConcatenation _builder = new StringConcatenation();
    TermType _refType = r.getRefType();
    String _type = _refType.getType();
    _builder.append(_type, "");
    {
      EList<TermType> _refs = r.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          EList<TermType> _refs_1 = r.getRefs();
          boolean _hasElements = false;
          for(final TermType t : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _type_1 = t.getType();
            _builder.append(_type_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final TermRelation t) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = t.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    RefTerm _refTerm = t.getRefTerm();
    String _refTerm_1 = _refTerm.getRefTerm();
    _builder.append(_refTerm_1, "");
    {
      RefTerm _refTerm_2 = t.getRefTerm();
      EList<String> _refs = _refTerm_2.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          RefTerm _refTerm_3 = t.getRefTerm();
          EList<String> _refs_1 = _refTerm_3.getRefs();
          boolean _hasElements = false;
          for(final String r : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append(r, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Stakeholder s) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = s.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = s.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    String _category = s.getCategory();
    _builder.append(_category, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      Stakeholder _partOf = s.getPartOf();
      boolean _notEquals = (!Objects.equal(_partOf, null));
      if (_notEquals) {
        _builder.append("Part Of: ");
        Stakeholder _partOf_1 = s.getPartOf();
        String _name_1 = _partOf_1.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Goal g) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = g.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = g.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    String _description = g.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      Stakeholder _stakeholder = g.getStakeholder();
      boolean _notEquals = (!Objects.equal(_stakeholder, null));
      if (_notEquals) {
        _builder.append("Stakeholder: ");
        Stakeholder _stakeholder_1 = g.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    Priority _priority = g.getPriority();
    _builder.append(_priority, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<DependsOnGoal> _dependsOn = g.getDependsOn();
      boolean _isEmpty = _dependsOn.isEmpty();
      if (_isEmpty) {
        _builder.append("Depends On: ");
        {
          EList<DependsOnGoal> _dependsOn_1 = g.getDependsOn();
          boolean _hasElements = false;
          for(final DependsOnGoal d : _dependsOn_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile = this.compile(d);
            _builder.append(_compile, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<ComposedBy> _composedBy = g.getComposedBy();
      boolean _isEmpty_1 = _composedBy.isEmpty();
      if (_isEmpty_1) {
        _builder.append("Composed By: ");
        {
          EList<ComposedBy> _composedBy_1 = g.getComposedBy();
          boolean _hasElements_1 = false;
          for(final ComposedBy c : _composedBy_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile_1 = this.compile(c);
            _builder.append(_compile_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final DependsOnGoal d) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = d.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    RefGoal _refGoal = d.getRefGoal();
    Goal _refGoal_1 = _refGoal.getRefGoal();
    String _name = _refGoal_1.getName();
    _builder.append(_name, "");
    {
      RefGoal _refGoal_2 = d.getRefGoal();
      EList<Goal> _refs = _refGoal_2.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          RefGoal _refGoal_3 = d.getRefGoal();
          EList<Goal> _refs_1 = _refGoal_3.getRefs();
          boolean _hasElements = false;
          for(final Goal r : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = r.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final ComposedBy c) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = c.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    RefGoal _refGoal = c.getRefGoal();
    Goal _refGoal_1 = _refGoal.getRefGoal();
    _builder.append(_refGoal_1, "");
    {
      RefGoal _refGoal_2 = c.getRefGoal();
      EList<Goal> _refs = _refGoal_2.getRefs();
      boolean _hasElements = false;
      for(final Goal r : _refs) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _name = r.getName();
        _builder.append(_name, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = e.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = e.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = e.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("Attributes: ");
    {
      EList<Attribute> _attributes = e.getAttributes();
      boolean _hasElements = false;
      for(final Attribute a : _attributes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",\n", "");
        }
        CharSequence _compile = this.compile(a);
        _builder.append(_compile, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PrimaryKey _primaryKey = e.getPrimaryKey();
      boolean _notEquals = (!Objects.equal(_primaryKey, null));
      if (_notEquals) {
        _builder.append("Primary Key: ");
        PrimaryKey _primaryKey_1 = e.getPrimaryKey();
        CharSequence _compile_1 = this.compile(_primaryKey_1);
        _builder.append(_compile_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<ForeignKey> _foreignKeys = e.getForeignKeys();
      boolean _isEmpty = _foreignKeys.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Foreign Keys: ");
        {
          EList<ForeignKey> _foreignKeys_1 = e.getForeignKeys();
          boolean _hasElements_1 = false;
          for(final ForeignKey f : _foreignKeys_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile_2 = this.compile(f);
            _builder.append(_compile_2, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Check> _checks = e.getChecks();
      boolean _isEmpty_1 = _checks.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Checks: ");
        {
          EList<Check> _checks_1 = e.getChecks();
          boolean _hasElements_2 = false;
          for(final Check c : _checks_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile_3 = this.compile(c);
            _builder.append(_compile_3, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = a.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = a.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = a.getDescription();
    _builder.append(_description, "");
    _builder.newLineIfNotEmpty();
    {
      int _size = a.getSize();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("Size: ");
        int _size_1 = a.getSize();
        _builder.append(_size_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Multiplicity _multiplicity = a.getMultiplicity();
      boolean _notEquals = (!Objects.equal(_multiplicity, null));
      if (_notEquals) {
        _builder.append("Multiplicity: ");
        Multiplicity _multiplicity_1 = a.getMultiplicity();
        _builder.append(_multiplicity_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _defaultValue = a.getDefaultValue();
      boolean _notEquals_1 = (!Objects.equal(_defaultValue, null));
      if (_notEquals_1) {
        _builder.append("Default Value: ");
        String _defaultValue_1 = a.getDefaultValue();
        _builder.append(_defaultValue_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _notNull = a.getNotNull();
      boolean _notEquals_2 = (!Objects.equal(_notNull, null));
      if (_notEquals_2) {
        _builder.append("NotNull");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _unique = a.getUnique();
      boolean _notEquals_3 = (!Objects.equal(_unique, null));
      if (_notEquals_3) {
        _builder.append("Unique");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PrimaryKey p) {
    StringConcatenation _builder = new StringConcatenation();
    RefAttribute _refTo = p.getRefTo();
    Attribute _refAttr = _refTo.getRefAttr();
    String _name = _refAttr.getName();
    _builder.append(_name, "");
    {
      RefAttribute _refTo_1 = p.getRefTo();
      EList<Attribute> _refs = _refTo_1.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          RefAttribute _refTo_2 = p.getRefTo();
          EList<Attribute> _refs_1 = _refTo_2.getRefs();
          boolean _hasElements = false;
          for(final Attribute r : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = r.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final ForeignKey f) {
    StringConcatenation _builder = new StringConcatenation();
    Entity _entity = f.getEntity();
    String _name = _entity.getName();
    _builder.append(_name, "");
    _builder.append("(");
    RefAttribute _refTo = f.getRefTo();
    Attribute _refAttr = _refTo.getRefAttr();
    String _name_1 = _refAttr.getName();
    _builder.append(_name_1, "");
    {
      RefAttribute _refTo_1 = f.getRefTo();
      EList<Attribute> _refs = _refTo_1.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          RefAttribute _refTo_2 = f.getRefTo();
          EList<Attribute> _refs_1 = _refTo_2.getRefs();
          boolean _hasElements = false;
          for(final Attribute r : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_2 = r.getName();
            _builder.append(_name_2, "");
          }
        }
      }
    }
    _builder.append(") ");
    Multiplicity _multiplicity = f.getMultiplicity();
    String _value = _multiplicity.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Check c) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = c.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _checkExpression = c.getCheckExpression();
    _builder.append(_checkExpression, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Actor a) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = a.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = a.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = a.getDescription();
    _builder.append(_description, "");
    _builder.newLineIfNotEmpty();
    {
      Stakeholder _stakeholder = a.getStakeholder();
      boolean _notEquals = (!Objects.equal(_stakeholder, null));
      if (_notEquals) {
        _builder.append("Stakeholder: ");
        Stakeholder _stakeholder_1 = a.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Actor _actor = a.getActor();
      boolean _notEquals_1 = (!Objects.equal(_actor, null));
      if (_notEquals_1) {
        _builder.append("Specialized From: ");
        Actor _actor_1 = a.getActor();
        String _name_2 = _actor_1.getName();
        _builder.append(_name_2, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final UseCase u) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = u.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = u.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = u.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = u.getDescription();
    _builder.append(_description, "");
    _builder.newLineIfNotEmpty();
    {
      RefEntity _entities = u.getEntities();
      boolean _notEquals = (!Objects.equal(_entities, null));
      if (_notEquals) {
        _builder.append("Entities: ");
        RefEntity _entities_1 = u.getEntities();
        CharSequence _compile = this.compile(_entities_1);
        _builder.append(_compile, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("Priority: ");
    Priority _priority = u.getPriority();
    _builder.append(_priority, "");
    _builder.newLineIfNotEmpty();
    {
      EList<ExtensionPoint> _extensionPoints = u.getExtensionPoints();
      boolean _isEmpty = _extensionPoints.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Extension Points: ");
        {
          EList<ExtensionPoint> _extensionPoints_1 = u.getExtensionPoints();
          boolean _hasElements = false;
          for(final ExtensionPoint e : _extensionPoints_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _name_1 = e.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefGoal> _goals = u.getGoals();
      boolean _isEmpty_1 = _goals.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Goals: ");
        {
          EList<RefGoal> _goals_1 = u.getGoals();
          boolean _hasElements_1 = false;
          for(final RefGoal g : _goals_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compile_1 = this.compile(g);
            _builder.append(_compile_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefFR> _frs = u.getFrs();
      boolean _isEmpty_2 = _frs.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Functional Requirements: ");
        {
          EList<RefFR> _frs_1 = u.getFrs();
          boolean _hasElements_2 = false;
          for(final RefFR f : _frs_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compile_2 = this.compile(f);
            _builder.append(_compile_2, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("Actor Initiates: ");
    Actor _actorInitiates = u.getActorInitiates();
    String _name_2 = _actorInitiates.getName();
    _builder.append(_name_2, "");
    _builder.newLineIfNotEmpty();
    {
      RefActor _actors = u.getActors();
      boolean _notEquals_1 = (!Objects.equal(_actors, null));
      if (_notEquals_1) {
        _builder.append("Actor Participates: ");
        RefActor _actors_1 = u.getActors();
        CharSequence _compile_3 = this.compile(_actors_1);
        _builder.append(_compile_3, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _preConditions = u.getPreConditions();
      boolean _notEquals_2 = (!Objects.equal(_preConditions, null));
      if (_notEquals_2) {
        String _preConditions_1 = u.getPreConditions();
        _builder.append(_preConditions_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _postConditions = u.getPostConditions();
      boolean _notEquals_3 = (!Objects.equal(_postConditions, null));
      if (_notEquals_3) {
        String _postConditions_1 = u.getPostConditions();
        _builder.append(_postConditions_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefUC> _includes = u.getIncludes();
      boolean _isEmpty_3 = _includes.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("Include: ");
        {
          EList<RefUC> _includes_1 = u.getIncludes();
          boolean _hasElements_3 = false;
          for(final RefUC i : _includes_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compile_4 = this.compile(i);
            _builder.append(_compile_4, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      UseCase _extends = u.getExtends();
      boolean _notEquals_4 = (!Objects.equal(_extends, null));
      if (_notEquals_4) {
        _builder.append("Extend ");
        UseCase _extends_1 = u.getExtends();
        String _name_3 = _extends_1.getName();
        _builder.append(_name_3, "");
        _builder.append(" on ");
        ExtensionPoint _extPoint = u.getExtPoint();
        String _name_4 = _extPoint.getName();
        _builder.append(_name_4, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Scenario> _scenarios = u.getScenarios();
      boolean _isEmpty_4 = _scenarios.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        _builder.append("Scenarios: ");
        {
          EList<Scenario> _scenarios_1 = u.getScenarios();
          boolean _hasElements_4 = false;
          for(final Scenario s : _scenarios_1) {
            if (!_hasElements_4) {
              _hasElements_4 = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile_5 = this.compile(s);
            _builder.append(_compile_5, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final RefEntity r) {
    StringConcatenation _builder = new StringConcatenation();
    Entity _refEntity = r.getRefEntity();
    String _name = _refEntity.getName();
    _builder.append(_name, "");
    _builder.append(" as ");
    EntityType _type = r.getType();
    String _type_1 = _type.getType();
    _builder.append(_type_1, "");
    {
      EList<Entity> _refs = r.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          EList<Entity> _refs_1 = r.getRefs();
          boolean _hasElements = false;
          for(final Entity e : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = e.getName();
            _builder.append(_name_1, "");
            _builder.append(" as ");
            EList<EntityType> _refType = r.getRefType();
            EList<Entity> _refs_2 = r.getRefs();
            int _indexOf = _refs_2.indexOf(e);
            EntityType _get = _refType.get(_indexOf);
            String _type_2 = _get.getType();
            _builder.append(_type_2, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final RefGoal r) {
    StringConcatenation _builder = new StringConcatenation();
    Goal _refGoal = r.getRefGoal();
    String _name = _refGoal.getName();
    _builder.append(_name, "");
    {
      EList<Goal> _refs = r.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          EList<Goal> _refs_1 = r.getRefs();
          boolean _hasElements = false;
          for(final Goal g : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = g.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final RefFR r) {
    StringConcatenation _builder = new StringConcatenation();
    FR _refFR = r.getRefFR();
    String _name = _refFR.getName();
    _builder.append(_name, "");
    {
      EList<FR> _refs = r.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          EList<FR> _refs_1 = r.getRefs();
          boolean _hasElements = false;
          for(final FR f : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = f.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final RefActor r) {
    StringConcatenation _builder = new StringConcatenation();
    Actor _refActor = r.getRefActor();
    String _name = _refActor.getName();
    _builder.append(_name, "");
    {
      EList<Actor> _refs = r.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          EList<Actor> _refs_1 = r.getRefs();
          boolean _hasElements = false;
          for(final Actor a : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = a.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final RefUC r) {
    StringConcatenation _builder = new StringConcatenation();
    UseCase _refUC = r.getRefUC();
    String _name = _refUC.getName();
    _builder.append(_name, "");
    {
      EList<UseCase> _refs = r.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          EList<UseCase> _refs_1 = r.getRefs();
          boolean _hasElements = false;
          for(final UseCase u : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = u.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Scenario s) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = s.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = s.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("Execution Mode: ");
    String _mode = s.getMode();
    _builder.append(_mode, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<Step> _steps = s.getSteps();
      boolean _isEmpty = _steps.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Steps: ");
        {
          EList<Step> _steps_1 = s.getSteps();
          boolean _hasElements = false;
          for(final Step st : _steps_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile = this.compile(st);
            _builder.append(_compile, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Step s) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = s.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = s.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      Actor _actor = s.getActor();
      boolean _notEquals = (!Objects.equal(_actor, null));
      if (_notEquals) {
        _builder.append("Actor: ");
        Actor _actor_1 = s.getActor();
        String _name_1 = _actor_1.getName();
        _builder.append(_name_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _preConditions = s.getPreConditions();
      boolean _notEquals_1 = (!Objects.equal(_preConditions, null));
      if (_notEquals_1) {
        _builder.append("Pre-Conditions: ");
        String _preConditions_1 = s.getPreConditions();
        _builder.append(_preConditions_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _postConditions = s.getPostConditions();
      boolean _notEquals_2 = (!Objects.equal(_postConditions, null));
      if (_notEquals_2) {
        _builder.append("Post-Conditions: ");
        String _postConditions_1 = s.getPostConditions();
        _builder.append(_postConditions_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Step _next = s.getNext();
      boolean _notEquals_3 = (!Objects.equal(_next, null));
      if (_notEquals_3) {
        _builder.append("Next Step: ");
        Step _next_1 = s.getNext();
        String _name_2 = _next_1.getName();
        _builder.append(_name_2, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final FR f) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = f.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = f.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = f.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = f.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      Stakeholder _stakeholder = f.getStakeholder();
      boolean _notEquals = (!Objects.equal(_stakeholder, null));
      if (_notEquals) {
        _builder.append("Stakeholder: ");
        Stakeholder _stakeholder_1 = f.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("Priority: ");
    Priority _priority = f.getPriority();
    _builder.append(_priority, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<DependsOnFR> _depends = f.getDepends();
      boolean _isEmpty = _depends.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Depends On: ");
        {
          EList<DependsOnFR> _depends_1 = f.getDepends();
          boolean _hasElements = false;
          for(final DependsOnFR d : _depends_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile = this.compile(d);
            _builder.append(_compile, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      FR _partOf = f.getPartOf();
      boolean _notEquals_1 = (!Objects.equal(_partOf, null));
      if (_notEquals_1) {
        _builder.append("Part Of: ");
        FR _partOf_1 = f.getPartOf();
        String _name_2 = _partOf_1.getName();
        _builder.append(_name_2, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final DependsOnFR d) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = d.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    RefFR _refFR = d.getRefFR();
    FR _refFR_1 = _refFR.getRefFR();
    String _name = _refFR_1.getName();
    _builder.append(_name, "");
    {
      RefFR _refFR_2 = d.getRefFR();
      EList<FR> _refs = _refFR_2.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          RefFR _refFR_3 = d.getRefFR();
          EList<FR> _refs_1 = _refFR_3.getRefs();
          boolean _hasElements = false;
          for(final FR f : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = f.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final QR q) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = q.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = q.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = q.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = q.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      String _subType = q.getSubType();
      boolean _notEquals = (!Objects.equal(_subType, null));
      if (_notEquals) {
        _builder.append("Sub-Type: ");
        String _subType_1 = q.getSubType();
        _builder.append(_subType_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("Metric: ");
    String _metric = q.getMetric();
    _builder.append(_metric, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Value: ");
    int _value = q.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    {
      Stakeholder _stakeholder = q.getStakeholder();
      boolean _notEquals_1 = (!Objects.equal(_stakeholder, null));
      if (_notEquals_1) {
        _builder.append("Stakeholder: ");
        Stakeholder _stakeholder_1 = q.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("Priority: ");
    Priority _priority = q.getPriority();
    _builder.append(_priority, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<DependsOnQR> _depends = q.getDepends();
      boolean _isEmpty = _depends.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Depends On: ");
        {
          EList<DependsOnQR> _depends_1 = q.getDepends();
          boolean _hasElements = false;
          for(final DependsOnQR d : _depends_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile = this.compile(d);
            _builder.append(_compile, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      QR _partOf = q.getPartOf();
      boolean _notEquals_2 = (!Objects.equal(_partOf, null));
      if (_notEquals_2) {
        _builder.append("Part Of: ");
        QR _partOf_1 = q.getPartOf();
        String _name_2 = _partOf_1.getName();
        _builder.append(_name_2, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final DependsOnQR d) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = d.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    RefQR _refQR = d.getRefQR();
    QR _refQR_1 = _refQR.getRefQR();
    String _name = _refQR_1.getName();
    _builder.append(_name, "");
    {
      RefQR _refQR_2 = d.getRefQR();
      EList<QR> _refs = _refQR_2.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          RefQR _refQR_3 = d.getRefQR();
          EList<QR> _refs_1 = _refQR_3.getRefs();
          boolean _hasElements = false;
          for(final QR q : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = q.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Constraint c) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = c.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _nameAlias = c.getNameAlias();
    _builder.append(_nameAlias, "");
    _builder.append(" (");
    String _type = c.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = c.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      Stakeholder _stakeholder = c.getStakeholder();
      boolean _notEquals = (!Objects.equal(_stakeholder, null));
      if (_notEquals) {
        _builder.append("Stakeholder: ");
        Stakeholder _stakeholder_1 = c.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("Priority: ");
    Priority _priority = c.getPriority();
    _builder.append(_priority, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<DependsOnConstraint> _depends = c.getDepends();
      boolean _isEmpty = _depends.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Depends On: ");
        {
          EList<DependsOnConstraint> _depends_1 = c.getDepends();
          boolean _hasElements = false;
          for(final DependsOnConstraint d : _depends_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "");
            }
            CharSequence _compile = this.compile(d);
            _builder.append(_compile, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Constraint _partOf = c.getPartOf();
      boolean _notEquals_1 = (!Objects.equal(_partOf, null));
      if (_notEquals_1) {
        _builder.append("Part Of: ");
        Constraint _partOf_1 = c.getPartOf();
        String _name_2 = _partOf_1.getName();
        _builder.append(_name_2, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final DependsOnConstraint d) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = d.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    RefConstraint _refConst = d.getRefConst();
    Constraint _refConst_1 = _refConst.getRefConst();
    String _name = _refConst_1.getName();
    _builder.append(_name, "");
    {
      RefConstraint _refConst_2 = d.getRefConst();
      EList<Constraint> _refs = _refConst_2.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          RefConstraint _refConst_3 = d.getRefConst();
          EList<Constraint> _refs_1 = _refConst_3.getRefs();
          boolean _hasElements = false;
          for(final Constraint q : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _name_1 = q.getName();
            _builder.append(_name_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
