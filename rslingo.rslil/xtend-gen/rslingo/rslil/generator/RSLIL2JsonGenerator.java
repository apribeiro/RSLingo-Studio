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
import rslingo.rslil.rSLIL.ComposedBy;
import rslingo.rslil.rSLIL.DependsOnGoal;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.Priority;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefTerm;
import rslingo.rslil.rSLIL.RefTermType;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.TermRelation;
import rslingo.rslil.rSLIL.TermType;

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
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = g.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = g.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = g.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": \"");
    RefTermType _type = g.getType();
    CharSequence _compile = this.compile(_type);
    _builder.append(_compile, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _acronym = g.getAcronym();
      boolean _notEquals = (!Objects.equal(_acronym, null));
      if (_notEquals) {
        _builder.append("\"Acronym\": \"");
        String _acronym_1 = g.getAcronym();
        _builder.append(_acronym_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _pos = g.getPos();
      boolean _notEquals_1 = (!Objects.equal(_pos, null));
      if (_notEquals_1) {
        _builder.append("\"POS\": \"");
        String _pos_1 = g.getPos();
        _builder.append(_pos_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      String _synset = g.getSynset();
      boolean _notEquals_2 = (!Objects.equal(_synset, null));
      if (_notEquals_2) {
        _builder.append("\"Synset\": \"");
        String _synset_1 = g.getSynset();
        _builder.append(_synset_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<TermRelation> _termRelation = g.getTermRelation();
      boolean _isEmpty = _termRelation.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Term Relations\": [");
        {
          EList<TermRelation> _termRelation_1 = g.getTermRelation();
          boolean _hasElements = false;
          for(final TermRelation t : _termRelation_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "\t\t\t");
            }
            CharSequence _compile_1 = this.compile(t);
            _builder.append(_compile_1, "\t\t\t");
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
    _builder.append(" ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": ");
    String _type = t.getType();
    _builder.append(_type, "\t\t\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Value\": \"");
    RefTerm _refTerm = t.getRefTerm();
    String _refTerm_1 = _refTerm.getRefTerm();
    _builder.append(_refTerm_1, "\t\t\t");
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
              _builder.appendImmediate(",", "\t\t\t");
            }
            _builder.append(r, "\t\t\t");
          }
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"ID\": \"");
    String _name = g.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = g.getNameAlias();
    _builder.append(_nameAlias, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Description\": \"");
    String _description = g.getDescription();
    _builder.append(_description, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      Stakeholder _stakeholder = g.getStakeholder();
      boolean _notEquals = (!Objects.equal(_stakeholder, null));
      if (_notEquals) {
        _builder.append("\"Acronym\": \"");
        Stakeholder _stakeholder_1 = g.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "\t\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Priority\": \"");
    Priority _priority = g.getPriority();
    String _value = _priority.getValue();
    _builder.append(_value, "\t\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<DependsOnGoal> _dependsOn = g.getDependsOn();
      boolean _isEmpty = _dependsOn.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Depends On\": [");
        {
          EList<DependsOnGoal> _dependsOn_1 = g.getDependsOn();
          boolean _hasElements = false;
          for(final DependsOnGoal d : _dependsOn_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",\n", "\t\t\t");
            }
            CharSequence _compile = this.compile(d);
            _builder.append(_compile, "\t\t\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      EList<ComposedBy> _composedBy = g.getComposedBy();
      boolean _isEmpty_1 = _composedBy.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Composed By\": [");
        {
          EList<ComposedBy> _composedBy_1 = g.getComposedBy();
          boolean _hasElements_1 = false;
          for(final ComposedBy c : _composedBy_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",\n", "\t\t\t");
            }
            CharSequence _compile_1 = this.compile(c);
            _builder.append(_compile_1, "\t\t\t");
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
  
  public CharSequence compile(final DependsOnGoal d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": ");
    String _type = d.getType();
    _builder.append(_type, "\t\t\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Value\": \"");
    RefGoal _refGoal = d.getRefGoal();
    Goal _refGoal_1 = _refGoal.getRefGoal();
    String _name = _refGoal_1.getName();
    _builder.append(_name, "\t\t\t");
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
              _builder.appendImmediate(",", "\t\t\t");
            }
            String _name_1 = r.getName();
            _builder.append(_name_1, "\t\t\t");
          }
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final ComposedBy c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"Type\": ");
    String _type = c.getType();
    _builder.append(_type, "\t\t\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\"Value\": \"");
    RefGoal _refGoal = c.getRefGoal();
    Goal _refGoal_1 = _refGoal.getRefGoal();
    String _name = _refGoal_1.getName();
    _builder.append(_name, "\t\t\t");
    {
      RefGoal _refGoal_2 = c.getRefGoal();
      EList<Goal> _refs = _refGoal_2.getRefs();
      boolean _isEmpty = _refs.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",");
        {
          RefGoal _refGoal_3 = c.getRefGoal();
          EList<Goal> _refs_1 = _refGoal_3.getRefs();
          boolean _hasElements = false;
          for(final Goal r : _refs_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t\t");
            }
            String _name_1 = r.getName();
            _builder.append(_name_1, "\t\t\t");
          }
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final PackageSystem g) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
