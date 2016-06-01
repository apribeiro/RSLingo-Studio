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
import rslingo.rslil.rSLIL.Constraint;
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
import rslingo.rslil.rSLIL.RefEntity;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefTermType;
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.Scenario;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.Step;
import rslingo.rslil.rSLIL.TermType;
import rslingo.rslil.rSLIL.UseCase;

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
    _builder.append("\"ID\": \"");
    Project _project = packageProject.getProject();
    String _name = _project.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Name\": \"");
    Project _project_1 = packageProject.getProject();
    String _nameAlias = _project_1.getNameAlias();
    _builder.append(_nameAlias, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    Project _project_2 = packageProject.getProject();
    String _description = _project_2.getDescription();
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
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final GlossaryTerm g) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method synset is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method synset is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method termRelation is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method termRelation is undefined for the type RSLIL2JsonGenerator"
      + "\n!= cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved");
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
    return _builder;
  }
  
  public CharSequence compile(final /* TermRelation */Object t) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\nrefTerm cannot be resolved"
      + "\nrefTerm cannot be resolved"
      + "\nrefTerm cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nrefTerm cannot be resolved"
      + "\nrefs cannot be resolved");
  }
  
  public CharSequence compile(final Stakeholder s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = s.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": \"");
    String _type = s.getType();
    _builder.append(_type, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Category\": \"");
    String _category = s.getCategory();
    _builder.append(_category, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      Stakeholder _partOf = s.getPartOf();
      boolean _notEquals = (!Objects.equal(_partOf, null));
      if (_notEquals) {
        _builder.append("\"Part Of\": \"");
        Stakeholder _partOf_1 = s.getPartOf();
        String _name_1 = _partOf_1.getName();
        _builder.append(_name_1, "\t\t\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Goal g) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method dependsOn is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method dependsOn is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method composedBy is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method composedBy is undefined for the type RSLIL2JsonGenerator"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved");
  }
  
  public CharSequence compile(final /* DependsOnGoal */Object d) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\nrefGoal cannot be resolved"
      + "\nrefGoal cannot be resolved"
      + "\nname cannot be resolved"
      + "\nrefGoal cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nrefGoal cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compile(final /* ComposedBy */Object c) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\nrefGoal cannot be resolved"
      + "\nrefGoal cannot be resolved"
      + "\nname cannot be resolved"
      + "\nrefGoal cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nrefGoal cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compile(final PackageSystem p) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method project is undefined for the type RSLIL2JsonGenerator"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = e.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = e.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = e.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _type = e.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        _builder.append("\"Type\": \"");
        String _type_1 = e.getType();
        _builder.append(_type_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Attributes\": [");
    {
      EList<Attribute> _attributes = e.getAttributes();
      boolean _hasElements = false;
      for(final Attribute a : _attributes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t\t\t");
        }
        CharSequence _compile = this.compile(a);
        _builder.append(_compile, "\t\t\t");
      }
    }
    _builder.append("],");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      PrimaryKey _primaryKey = e.getPrimaryKey();
      boolean _notEquals_1 = (!Objects.equal(_primaryKey, null));
      if (_notEquals_1) {
        _builder.append("\"Primary Key\": \"");
        PrimaryKey _primaryKey_1 = e.getPrimaryKey();
        CharSequence _compile_1 = this.compile(_primaryKey_1);
        _builder.append(_compile_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<ForeignKey> _foreignKeys = e.getForeignKeys();
      boolean _isEmpty = _foreignKeys.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Foreign Keys\": [");
        {
          EList<ForeignKey> _foreignKeys_1 = e.getForeignKeys();
          boolean _hasElements_1 = false;
          for(final ForeignKey f : _foreignKeys_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",\n", "\t\t\t");
            }
            CharSequence _compile_2 = this.compile(f);
            _builder.append(_compile_2, "\t\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<Check> _checks = e.getChecks();
      boolean _isEmpty_1 = _checks.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Checks\": [");
        {
          EList<Check> _checks_1 = e.getChecks();
          boolean _hasElements_2 = false;
          for(final Check c : _checks_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",\n", "\t\t\t");
            }
            CharSequence _compile_3 = this.compile(c);
            _builder.append(_compile_3, "\t\t\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = a.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = a.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = a.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": \"");
    String _type = a.getType();
    _builder.append(_type, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      int _size = a.getSize();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\"Size\": \"");
        int _size_1 = a.getSize();
        _builder.append(_size_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      Multiplicity _multiplicity = a.getMultiplicity();
      boolean _notEquals = (!Objects.equal(_multiplicity, null));
      if (_notEquals) {
        _builder.append("\"Multiplicity\": \"");
        Multiplicity _multiplicity_1 = a.getMultiplicity();
        String _value = _multiplicity_1.getValue();
        String _replaceAll = _value.replaceAll("\"", "");
        _builder.append(_replaceAll, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _defaultValue = a.getDefaultValue();
      boolean _notEquals_1 = (!Objects.equal(_defaultValue, null));
      if (_notEquals_1) {
        _builder.append("\"Default Value\": \"");
        String _defaultValue_1 = a.getDefaultValue();
        _builder.append(_defaultValue_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _notNull = a.getNotNull();
      boolean _notEquals_2 = (!Objects.equal(_notNull, null));
      if (_notEquals_2) {
        _builder.append("\"Not Null\": \"true\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _unique = a.getUnique();
      boolean _notEquals_3 = (!Objects.equal(_unique, null));
      if (_notEquals_3) {
        _builder.append("\"Unique\": \"true\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
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
    return _builder;
  }
  
  public CharSequence compile(final ForeignKey f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"Value\": \"");
    Entity _entity = f.getEntity();
    String _name = _entity.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("(");
    RefAttribute _refTo = f.getRefTo();
    Attribute _refAttr = _refTo.getRefAttr();
    String _name_1 = _refAttr.getName();
    _builder.append(_name_1, "\t\t\t");
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
              _builder.appendImmediate(",", "\t\t\t");
            }
            String _name_2 = r.getName();
            _builder.append(_name_2, "\t\t\t");
          }
        }
      }
    }
    _builder.append(")\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Multiplicity\": \"");
    Multiplicity _multiplicity = f.getMultiplicity();
    String _value = _multiplicity.getValue();
    String _replaceAll = _value.replaceAll("\"", "");
    _builder.append(_replaceAll, "\t\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Check c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": ");
    String _name = c.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Expression\": \"");
    String _checkExpression = c.getCheckExpression();
    _builder.append(_checkExpression, "\t\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Actor a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = a.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = a.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = a.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": \"");
    String _type = a.getType();
    _builder.append(_type, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      Stakeholder _stakeholder = a.getStakeholder();
      boolean _notEquals = (!Objects.equal(_stakeholder, null));
      if (_notEquals) {
        _builder.append("\"Stakeholder\": \"");
        Stakeholder _stakeholder_1 = a.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      Actor _actor = a.getActor();
      boolean _notEquals_1 = (!Objects.equal(_actor, null));
      if (_notEquals_1) {
        _builder.append("\"Specialized From\": \"");
        Actor _actor_1 = a.getActor();
        String _name_2 = _actor_1.getName();
        _builder.append(_name_2, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final UseCase u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = u.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = u.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = u.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": \"");
    String _type = u.getType();
    _builder.append(_type, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      RefEntity _entities = u.getEntities();
      boolean _notEquals = (!Objects.equal(_entities, null));
      if (_notEquals) {
        _builder.append("\"Entities\": \"");
        RefEntity _entities_1 = u.getEntities();
        CharSequence _compile = this.compile(_entities_1);
        _builder.append(_compile, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Priority\": \"");
    Priority _priority = u.getPriority();
    String _value = _priority.getValue();
    _builder.append(_value, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<RefGoal> _goals = u.getGoals();
      boolean _isEmpty = _goals.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Goals\": \"");
        {
          EList<RefGoal> _goals_1 = u.getGoals();
          boolean _hasElements = false;
          for(final RefGoal g : _goals_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t\t");
            }
            CharSequence _compile_1 = this.compile(g);
            _builder.append(_compile_1, "\t\t\t");
          }
        }
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<RefFR> _frs = u.getFrs();
      boolean _isEmpty_1 = _frs.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Functional Requirements\": \"");
        {
          EList<RefFR> _frs_1 = u.getFrs();
          boolean _hasElements_1 = false;
          for(final RefFR f : _frs_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t\t");
            }
            CharSequence _compile_2 = this.compile(f);
            _builder.append(_compile_2, "\t\t\t");
          }
        }
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Actor Initiates\": \"");
    Actor _actorInitiates = u.getActorInitiates();
    String _name_1 = _actorInitiates.getName();
    _builder.append(_name_1, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      RefActor _actors = u.getActors();
      boolean _notEquals_1 = (!Objects.equal(_actors, null));
      if (_notEquals_1) {
        _builder.append("\"Actor Participates\": \"");
        RefActor _actors_1 = u.getActors();
        CharSequence _compile_3 = this.compile(_actors_1);
        _builder.append(_compile_3, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _preConditions = u.getPreConditions();
      boolean _notEquals_2 = (!Objects.equal(_preConditions, null));
      if (_notEquals_2) {
        _builder.append("\"Pre-Conditions\": \"");
        String _preConditions_1 = u.getPreConditions();
        _builder.append(_preConditions_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _postConditions = u.getPostConditions();
      boolean _notEquals_3 = (!Objects.equal(_postConditions, null));
      if (_notEquals_3) {
        _builder.append("\"Post-Conditions\": \"");
        String _postConditions_1 = u.getPostConditions();
        _builder.append(_postConditions_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<RefUC> _includes = u.getIncludes();
      boolean _isEmpty_2 = _includes.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Include\": \"");
        {
          EList<RefUC> _includes_1 = u.getIncludes();
          boolean _hasElements_2 = false;
          for(final RefUC i : _includes_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t\t\t");
            }
            CharSequence _compile_4 = this.compile(i);
            _builder.append(_compile_4, "\t\t\t");
          }
        }
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      UseCase _extends = u.getExtends();
      boolean _notEquals_4 = (!Objects.equal(_extends, null));
      if (_notEquals_4) {
        _builder.append("\"Extend\": \"");
        UseCase _extends_1 = u.getExtends();
        String _name_2 = _extends_1.getName();
        _builder.append(_name_2, "\t\t\t");
        _builder.append(" on ");
        ExtensionPoint _extPoint = u.getExtPoint();
        String _name_3 = _extPoint.getName();
        _builder.append(_name_3, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<Scenario> _scenarios = u.getScenarios();
      boolean _isEmpty_3 = _scenarios.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Scenarios\": [");
        {
          EList<Scenario> _scenarios_1 = u.getScenarios();
          boolean _hasElements_3 = false;
          for(final Scenario s : _scenarios_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",\n", "\t\t\t");
            }
            CharSequence _compile_5 = this.compile(s);
            _builder.append(_compile_5, "\t\t\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
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
    return _builder;
  }
  
  public CharSequence compile(final Scenario s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = s.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Execution Mode\": \"");
    String _mode = s.getMode();
    _builder.append(_mode, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<Step> _steps = s.getSteps();
      boolean _isEmpty = _steps.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Steps\": [");
        {
          EList<Step> _steps_1 = s.getSteps();
          boolean _hasElements = false;
          for(final Step st : _steps_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t\t");
            }
            CharSequence _compile = this.compile(st);
            _builder.append(_compile, "\t\t\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Step s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = s.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": \"");
    String _type = s.getType();
    _builder.append(_type, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      Actor _actor = s.getActor();
      boolean _notEquals = (!Objects.equal(_actor, null));
      if (_notEquals) {
        _builder.append("\"Actor\": \"");
        Actor _actor_1 = s.getActor();
        String _name_1 = _actor_1.getName();
        _builder.append(_name_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _preConditions = s.getPreConditions();
      boolean _notEquals_1 = (!Objects.equal(_preConditions, null));
      if (_notEquals_1) {
        _builder.append("\"Pre-Conditions\": \"");
        String _preConditions_1 = s.getPreConditions();
        _builder.append(_preConditions_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _postConditions = s.getPostConditions();
      boolean _notEquals_2 = (!Objects.equal(_postConditions, null));
      if (_notEquals_2) {
        _builder.append("\"Post-Conditions\": \"");
        String _postConditions_1 = s.getPostConditions();
        _builder.append(_postConditions_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      Step _next = s.getNext();
      boolean _notEquals_3 = (!Objects.equal(_next, null));
      if (_notEquals_3) {
        _builder.append("\"Next Step\": \"");
        Step _next_1 = s.getNext();
        String _name_2 = _next_1.getName();
        _builder.append(_name_2, "\t\t\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final FR f) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method depends is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method depends is undefined for the type RSLIL2JsonGenerator"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved");
  }
  
  public CharSequence compile(final /* DependsOnFR */Object d) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\nrefFR cannot be resolved"
      + "\nrefFR cannot be resolved"
      + "\nname cannot be resolved"
      + "\nrefFR cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nrefFR cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compile(final QR q) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method depends is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method depends is undefined for the type RSLIL2JsonGenerator"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved");
  }
  
  public CharSequence compile(final /* DependsOnQR */Object d) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\nrefQR cannot be resolved"
      + "\nrefQR cannot be resolved"
      + "\nname cannot be resolved"
      + "\nrefQR cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nrefQR cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public CharSequence compile(final Constraint c) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method depends is undefined for the type RSLIL2JsonGenerator"
      + "\nThe method depends is undefined for the type RSLIL2JsonGenerator"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncompile cannot be resolved");
  }
  
  public CharSequence compile(final /* DependsOnConstraint */Object d) {
    throw new Error("Unresolved compilation problems:"
      + "\ntype cannot be resolved"
      + "\nrefConst cannot be resolved"
      + "\nrefConst cannot be resolved"
      + "\nname cannot be resolved"
      + "\nrefConst cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nrefConst cannot be resolved"
      + "\nrefs cannot be resolved"
      + "\nname cannot be resolved");
  }
}
