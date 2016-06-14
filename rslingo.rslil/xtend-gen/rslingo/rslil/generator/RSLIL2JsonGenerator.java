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
import rslingo.rslil.rSLIL.ActualSchedule;
import rslingo.rslil.rSLIL.Attribute;
import rslingo.rslil.rSLIL.Check;
import rslingo.rslil.rSLIL.Constraint;
import rslingo.rslil.rSLIL.Date;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.EntityType;
import rslingo.rslil.rSLIL.ExtensionPoint;
import rslingo.rslil.rSLIL.FR;
import rslingo.rslil.rSLIL.ForeignKey;
import rslingo.rslil.rSLIL.GlossaryTerm;
import rslingo.rslil.rSLIL.Goal;
import rslingo.rslil.rSLIL.GoalRelation;
import rslingo.rslil.rSLIL.Month;
import rslingo.rslil.rSLIL.Multiplicity;
import rslingo.rslil.rSLIL.Organizations;
import rslingo.rslil.rSLIL.PackageGlossary;
import rslingo.rslil.rSLIL.PackageGoal;
import rslingo.rslil.rSLIL.PackageProject;
import rslingo.rslil.rSLIL.PackageStakeholder;
import rslingo.rslil.rSLIL.PackageSystem;
import rslingo.rslil.rSLIL.PlannedSchedule;
import rslingo.rslil.rSLIL.PrimaryKey;
import rslingo.rslil.rSLIL.Priority;
import rslingo.rslil.rSLIL.Project;
import rslingo.rslil.rSLIL.ProjectProgress;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RefActor;
import rslingo.rslil.rSLIL.RefAttribute;
import rslingo.rslil.rSLIL.RefEntity;
import rslingo.rslil.rSLIL.RefFR;
import rslingo.rslil.rSLIL.RefGoal;
import rslingo.rslil.rSLIL.RefTermType;
import rslingo.rslil.rSLIL.RefUC;
import rslingo.rslil.rSLIL.Requirement;
import rslingo.rslil.rSLIL.RequirementRelation;
import rslingo.rslil.rSLIL.Scenario;
import rslingo.rslil.rSLIL.Stakeholder;
import rslingo.rslil.rSLIL.Step;
import rslingo.rslil.rSLIL.SystemRelation;
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
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    Project _project = packageProject.getProject();
    String _name = _project.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    Project _project_1 = packageProject.getProject();
    String _nameAlias = _project_1.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Application Domain\": \"");
    Project _project_2 = packageProject.getProject();
    String _domain = _project_2.getDomain();
    _builder.append(_domain, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    Project _project_3 = packageProject.getProject();
    String _type = _project_3.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    {
      Project _project_4 = packageProject.getProject();
      PlannedSchedule _planned = _project_4.getPlanned();
      boolean _notEquals = (!Objects.equal(_planned, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("\"Planned Schedule\": {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"Start\": \"");
        Project _project_5 = packageProject.getProject();
        PlannedSchedule _planned_1 = _project_5.getPlanned();
        Date _start = _planned_1.getStart();
        int _day = _start.getDay();
        _builder.append(_day, "\t\t");
        _builder.append("-");
        Project _project_6 = packageProject.getProject();
        PlannedSchedule _planned_2 = _project_6.getPlanned();
        Date _start_1 = _planned_2.getStart();
        Month _month = _start_1.getMonth();
        String _name_1 = _month.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append("-");
        Project _project_7 = packageProject.getProject();
        PlannedSchedule _planned_3 = _project_7.getPlanned();
        Date _start_2 = _planned_3.getStart();
        int _year = _start_2.getYear();
        _builder.append(_year, "\t\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"End\": \"");
        Project _project_8 = packageProject.getProject();
        PlannedSchedule _planned_4 = _project_8.getPlanned();
        Date _end = _planned_4.getEnd();
        int _day_1 = _end.getDay();
        _builder.append(_day_1, "\t\t");
        _builder.append("-");
        Project _project_9 = packageProject.getProject();
        PlannedSchedule _planned_5 = _project_9.getPlanned();
        Date _end_1 = _planned_5.getEnd();
        Month _month_1 = _end_1.getMonth();
        String _name_2 = _month_1.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("-");
        Project _project_10 = packageProject.getProject();
        PlannedSchedule _planned_6 = _project_10.getPlanned();
        Date _end_2 = _planned_6.getEnd();
        int _year_1 = _end_2.getYear();
        _builder.append(_year_1, "\t\t");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("},");
        _builder.newLine();
      }
    }
    {
      Project _project_11 = packageProject.getProject();
      ActualSchedule _actual = _project_11.getActual();
      boolean _notEquals_1 = (!Objects.equal(_actual, null));
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("\"Actual Schedule\": {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"Start\": \"");
        Project _project_12 = packageProject.getProject();
        ActualSchedule _actual_1 = _project_12.getActual();
        Date _start_3 = _actual_1.getStart();
        int _day_2 = _start_3.getDay();
        _builder.append(_day_2, "\t\t");
        _builder.append("-");
        Project _project_13 = packageProject.getProject();
        ActualSchedule _actual_2 = _project_13.getActual();
        Date _start_4 = _actual_2.getStart();
        Month _month_2 = _start_4.getMonth();
        String _name_3 = _month_2.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append("-");
        Project _project_14 = packageProject.getProject();
        ActualSchedule _actual_3 = _project_14.getActual();
        Date _start_5 = _actual_3.getStart();
        int _year_2 = _start_5.getYear();
        _builder.append(_year_2, "\t\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        {
          Project _project_15 = packageProject.getProject();
          ActualSchedule _actual_4 = _project_15.getActual();
          Date _end_3 = _actual_4.getEnd();
          boolean _notEquals_2 = (!Objects.equal(_end_3, null));
          if (_notEquals_2) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"End\": \"");
            Project _project_16 = packageProject.getProject();
            ActualSchedule _actual_5 = _project_16.getActual();
            Date _end_4 = _actual_5.getEnd();
            int _day_3 = _end_4.getDay();
            _builder.append(_day_3, "\t\t");
            _builder.append("-");
            Project _project_17 = packageProject.getProject();
            ActualSchedule _actual_6 = _project_17.getActual();
            Date _end_5 = _actual_6.getEnd();
            Month _month_3 = _end_5.getMonth();
            String _name_4 = _month_3.getName();
            _builder.append(_name_4, "\t\t");
            _builder.append("-");
            Project _project_18 = packageProject.getProject();
            ActualSchedule _actual_7 = _project_18.getActual();
            Date _end_6 = _actual_7.getEnd();
            int _year_3 = _end_6.getYear();
            _builder.append(_year_3, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("},");
        _builder.newLine();
      }
    }
    {
      Project _project_19 = packageProject.getProject();
      Organizations _organizations = _project_19.getOrganizations();
      boolean _notEquals_3 = (!Objects.equal(_organizations, null));
      if (_notEquals_3) {
        _builder.append("\t");
        _builder.append("\"Organizations\": {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"Customer\": \"");
        Project _project_20 = packageProject.getProject();
        Organizations _organizations_1 = _project_20.getOrganizations();
        String _customer = _organizations_1.getCustomer();
        _builder.append(_customer, "\t\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"Supplier\": \"");
        Project _project_21 = packageProject.getProject();
        Organizations _organizations_2 = _project_21.getOrganizations();
        String _supplier = _organizations_2.getSupplier();
        _builder.append(_supplier, "\t\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"Partners\": \"");
        Project _project_22 = packageProject.getProject();
        Organizations _organizations_3 = _project_22.getOrganizations();
        String _partners = _organizations_3.getPartners();
        _builder.append(_partners, "\t\t");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("},");
        _builder.newLine();
      }
    }
    {
      Project _project_23 = packageProject.getProject();
      ProjectProgress _progress = _project_23.getProgress();
      boolean _notEquals_4 = (!Objects.equal(_progress, null));
      if (_notEquals_4) {
        _builder.append("\t");
        _builder.append("\"Project Progress\": \"");
        Project _project_24 = packageProject.getProject();
        ProjectProgress _progress_1 = _project_24.getProgress();
        String _value = _progress_1.getValue();
        _builder.append(_value, "\t");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("\"Summary\": \"");
    Project _project_25 = packageProject.getProject();
    String _summary = _project_25.getSummary();
    _builder.append(_summary, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Description\": \"");
    Project _project_26 = packageProject.getProject();
    String _description = _project_26.getDescription();
    _builder.append(_description, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<PackageGlossary> _packageGlossaries = packageProject.getPackageGlossaries();
      boolean _isEmpty = _packageGlossaries.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Glossary\": [");
        _builder.newLineIfNotEmpty();
        {
          EList<PackageGlossary> _packageGlossaries_1 = packageProject.getPackageGlossaries();
          for(final PackageGlossary pg : _packageGlossaries_1) {
            _builder.append("\t");
            {
              EList<GlossaryTerm> _glossaryTerms = pg.getGlossaryTerms();
              boolean _hasElements = false;
              for(final GlossaryTerm g : _glossaryTerms) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "\t");
                }
                CharSequence _compile = this.compile(g);
                _builder.append(_compile, "\t");
              }
            }
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<PackageStakeholder> _packageStakeholders = packageProject.getPackageStakeholders();
      boolean _isEmpty_1 = _packageStakeholders.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Stakeholders\": [");
        _builder.newLineIfNotEmpty();
        {
          EList<PackageStakeholder> _packageStakeholders_1 = packageProject.getPackageStakeholders();
          for(final PackageStakeholder ps : _packageStakeholders_1) {
            _builder.append("\t");
            {
              EList<Stakeholder> _stakeholders = ps.getStakeholders();
              boolean _hasElements_1 = false;
              for(final Stakeholder s : _stakeholders) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder.appendImmediate(", ", "\t");
                }
                CharSequence _compile_1 = this.compile(s);
                _builder.append(_compile_1, "\t");
              }
            }
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<PackageGoal> _packageGoals = packageProject.getPackageGoals();
      boolean _isEmpty_2 = _packageGoals.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Goals\": [");
        _builder.newLineIfNotEmpty();
        {
          EList<PackageGoal> _packageGoals_1 = packageProject.getPackageGoals();
          for(final PackageGoal pg_1 : _packageGoals_1) {
            _builder.append("\t");
            {
              EList<Goal> _goals = pg_1.getGoals();
              boolean _hasElements_2 = false;
              for(final Goal g_1 : _goals) {
                if (!_hasElements_2) {
                  _hasElements_2 = true;
                } else {
                  _builder.appendImmediate(", ", "\t");
                }
                CharSequence _compile_2 = this.compile(g_1);
                _builder.append(_compile_2, "\t");
              }
            }
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<GoalRelation> _goalRelations = packageProject.getGoalRelations();
      boolean _isEmpty_3 = _goalRelations.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Goal Relations\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<GoalRelation> _goalRelations_1 = packageProject.getGoalRelations();
          boolean _hasElements_3 = false;
          for(final GoalRelation g_2 : _goalRelations_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            CharSequence _compile_3 = this.compile(g_2);
            _builder.append(_compile_3, "\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<PackageSystem> _packageSystems = packageProject.getPackageSystems();
      boolean _isEmpty_4 = _packageSystems.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        _builder.append("\"Systems\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<PackageSystem> _packageSystems_1 = packageProject.getPackageSystems();
          boolean _hasElements_4 = false;
          for(final PackageSystem s_1 : _packageSystems_1) {
            if (!_hasElements_4) {
              _hasElements_4 = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            CharSequence _compile_4 = this.compile(s_1);
            _builder.append(_compile_4, "\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<SystemRelation> _systemRelations = packageProject.getSystemRelations();
      boolean _isEmpty_5 = _systemRelations.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        _builder.append("\"System Relations\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<SystemRelation> _systemRelations_1 = packageProject.getSystemRelations();
          boolean _hasElements_5 = false;
          for(final SystemRelation s_2 : _systemRelations_1) {
            if (!_hasElements_5) {
              _hasElements_5 = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            CharSequence _compile_5 = this.compile(s_2);
            _builder.append(_compile_5, "\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final GlossaryTerm g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = g.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = g.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = g.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = g.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    RefTermType _type = g.getType();
    CharSequence _compile = this.compile(_type);
    _builder.append(_compile, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _acronym = g.getAcronym();
      boolean _notEquals_1 = (!Objects.equal(_acronym, null));
      if (_notEquals_1) {
        _builder.append("\"Acronym\": \"");
        String _acronym_1 = g.getAcronym();
        _builder.append(_acronym_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _pos = g.getPos();
      boolean _notEquals_2 = (!Objects.equal(_pos, null));
      if (_notEquals_2) {
        _builder.append("\"POS\": \"");
        String _pos_1 = g.getPos();
        _builder.append(_pos_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _synonym = g.getSynonym();
      boolean _notEquals_3 = (!Objects.equal(_synonym, null));
      if (_notEquals_3) {
        _builder.append("\"Synonym\": \"");
        String _synonym_1 = g.getSynonym();
        _builder.append(_synonym_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _hypernym = g.getHypernym();
      boolean _notEquals_4 = (!Objects.equal(_hypernym, null));
      if (_notEquals_4) {
        _builder.append("\"Hypernym\": \"");
        String _hypernym_1 = g.getHypernym();
        _builder.append(_hypernym_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
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
    return _builder;
  }
  
  public CharSequence compile(final Stakeholder s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = s.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = s.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = s.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Category\": \"");
    String _category = s.getCategory();
    _builder.append(_category, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Stakeholder _isA = s.getIsA();
      boolean _notEquals_1 = (!Objects.equal(_isA, null));
      if (_notEquals_1) {
        _builder.append("\"Is A\": \"");
        Stakeholder _isA_1 = s.getIsA();
        String _name_1 = _isA_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Stakeholder _partOf = s.getPartOf();
      boolean _notEquals_2 = (!Objects.equal(_partOf, null));
      if (_notEquals_2) {
        _builder.append("Part Of: ");
        Stakeholder _partOf_1 = s.getPartOf();
        String _name_2 = _partOf_1.getName();
        _builder.append(_name_2, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final Goal g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = g.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = g.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = g.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = g.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Stakeholder\": \"");
    Stakeholder _stakeholder = g.getStakeholder();
    String _name_1 = _stakeholder.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Priority\": \"");
    Priority _priority = g.getPriority();
    String _value = _priority.getValue();
    _builder.append(_value, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      ProjectProgress _progress = g.getProgress();
      boolean _notEquals_1 = (!Objects.equal(_progress, null));
      if (_notEquals_1) {
        _builder.append("\"Project Progress\": \"");
        ProjectProgress _progress_1 = g.getProgress();
        String _value_1 = _progress_1.getValue();
        _builder.append(_value_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Goal _partOfAnd = g.getPartOfAnd();
      boolean _notEquals_2 = (!Objects.equal(_partOfAnd, null));
      if (_notEquals_2) {
        _builder.append("\"Part Of (And)\": \"");
        Goal _partOfAnd_1 = g.getPartOfAnd();
        String _name_2 = _partOfAnd_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Goal _partOfOr = g.getPartOfOr();
      boolean _notEquals_3 = (!Objects.equal(_partOfOr, null));
      if (_notEquals_3) {
        _builder.append("\"Part Of (Or)\": \"");
        Goal _partOfOr_1 = g.getPartOfOr();
        String _name_3 = _partOfOr_1.getName();
        _builder.append(_name_3, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final GoalRelation g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = g.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Source\": \"");
    Goal _source = g.getSource();
    String _name_1 = _source.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Target\": \"");
    Goal _target = g.getTarget();
    String _name_2 = _target.getName();
    _builder.append(_name_2, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = g.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = g.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = g.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final PackageSystem p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    rslingo.rslil.rSLIL.System _system = p.getSystem();
    String _name = _system.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    rslingo.rslil.rSLIL.System _system_1 = p.getSystem();
    String _nameAlias = _system_1.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      rslingo.rslil.rSLIL.System _system_2 = p.getSystem();
      String _description = _system_2.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        rslingo.rslil.rSLIL.System _system_3 = p.getSystem();
        String _description_1 = _system_3.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    rslingo.rslil.rSLIL.System _system_4 = p.getSystem();
    String _type = _system_4.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Scope\": \"");
    rslingo.rslil.rSLIL.System _system_5 = p.getSystem();
    String _scope = _system_5.getScope();
    _builder.append(_scope, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      rslingo.rslil.rSLIL.System _system_6 = p.getSystem();
      rslingo.rslil.rSLIL.System _partOf = _system_6.getPartOf();
      boolean _notEquals_1 = (!Objects.equal(_partOf, null));
      if (_notEquals_1) {
        _builder.append("\"Part Of\": \"");
        rslingo.rslil.rSLIL.System _system_7 = p.getSystem();
        rslingo.rslil.rSLIL.System _partOf_1 = _system_7.getPartOf();
        String _name_1 = _partOf_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Entity> _entities = p.getEntities();
      boolean _isEmpty = _entities.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Entities\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Entity> _entities_1 = p.getEntities();
          boolean _hasElements = false;
          for(final Entity e : _entities_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "    ");
            }
            CharSequence _compile = this.compile(e);
            _builder.append(_compile, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Actor> _actors = p.getActors();
      boolean _isEmpty_1 = _actors.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Actors\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Actor> _actors_1 = p.getActors();
          boolean _hasElements_1 = false;
          for(final Actor a : _actors_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(", ", "    ");
            }
            CharSequence _compile_1 = this.compile(a);
            _builder.append(_compile_1, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<UseCase> _useCases = p.getUseCases();
      boolean _isEmpty_2 = _useCases.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Use Cases\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<UseCase> _useCases_1 = p.getUseCases();
          boolean _hasElements_2 = false;
          for(final UseCase u : _useCases_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(", ", "    ");
            }
            CharSequence _compile_2 = this.compile(u);
            _builder.append(_compile_2, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<FR> _frs = p.getFrs();
      boolean _isEmpty_3 = _frs.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Functional Requirements\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<FR> _frs_1 = p.getFrs();
          boolean _hasElements_3 = false;
          for(final FR f : _frs_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(", ", "    ");
            }
            CharSequence _compile_3 = this.compile(f);
            _builder.append(_compile_3, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<QR> _qrs = p.getQrs();
      boolean _isEmpty_4 = _qrs.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        _builder.append("\"Quality Requirements\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<QR> _qrs_1 = p.getQrs();
          boolean _hasElements_4 = false;
          for(final QR q : _qrs_1) {
            if (!_hasElements_4) {
              _hasElements_4 = true;
            } else {
              _builder.appendImmediate(", ", "    ");
            }
            CharSequence _compile_4 = this.compile(q);
            _builder.append(_compile_4, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Constraint> _constraints = p.getConstraints();
      boolean _isEmpty_5 = _constraints.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        _builder.append("\"Constraints\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Constraint> _constraints_1 = p.getConstraints();
          boolean _hasElements_5 = false;
          for(final Constraint c : _constraints_1) {
            if (!_hasElements_5) {
              _hasElements_5 = true;
            } else {
              _builder.appendImmediate(", ", "    ");
            }
            CharSequence _compile_5 = this.compile(c);
            _builder.append(_compile_5, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<RequirementRelation> _requirementRelations = p.getRequirementRelations();
      boolean _isEmpty_6 = _requirementRelations.isEmpty();
      boolean _not_6 = (!_isEmpty_6);
      if (_not_6) {
        _builder.append("\"Requirement Relations\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<RequirementRelation> _requirementRelations_1 = p.getRequirementRelations();
          boolean _hasElements_6 = false;
          for(final RequirementRelation r : _requirementRelations_1) {
            if (!_hasElements_6) {
              _hasElements_6 = true;
            } else {
              _builder.appendImmediate(", ", "    ");
            }
            CharSequence _compile_6 = this.compile(r);
            _builder.append(_compile_6, "    ");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final SystemRelation s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Source\": \"");
    rslingo.rslil.rSLIL.System _source = s.getSource();
    String _name_1 = _source.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Target\": \"");
    rslingo.rslil.rSLIL.System _target = s.getTarget();
    String _name_2 = _target.getName();
    _builder.append(_name_2, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Category\": \"");
    String _category = s.getCategory();
    _builder.append(_category, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = s.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = s.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = s.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = e.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = e.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = e.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = e.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _type = e.getType();
      boolean _notEquals_1 = (!Objects.equal(_type, null));
      if (_notEquals_1) {
        _builder.append("\"Type\": \"");
        String _type_1 = e.getType();
        _builder.append(_type_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Attributes\": [");
    {
      EList<Attribute> _attributes = e.getAttributes();
      boolean _hasElements = false;
      for(final Attribute a : _attributes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        CharSequence _compile = this.compile(a);
        _builder.append(_compile, "\t");
      }
    }
    _builder.append("],");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PrimaryKey _primaryKey = e.getPrimaryKey();
      boolean _notEquals_2 = (!Objects.equal(_primaryKey, null));
      if (_notEquals_2) {
        _builder.append("\"Primary Key\": \"(");
        PrimaryKey _primaryKey_1 = e.getPrimaryKey();
        CharSequence _compile_1 = this.compile(_primaryKey_1);
        _builder.append(_compile_1, "\t");
        _builder.append(")\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
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
              _builder.appendImmediate(",\n", "\t");
            }
            CharSequence _compile_2 = this.compile(f);
            _builder.append(_compile_2, "\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
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
              _builder.appendImmediate(",\n", "\t");
            }
            CharSequence _compile_3 = this.compile(c);
            _builder.append(_compile_3, "\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = a.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = a.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = a.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = a.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = a.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      int _size = a.getSize();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\"Size\": \"");
        int _size_1 = a.getSize();
        _builder.append(_size_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Multiplicity _multiplicity = a.getMultiplicity();
      boolean _notEquals_1 = (!Objects.equal(_multiplicity, null));
      if (_notEquals_1) {
        _builder.append("\"Multiplicity\": \"");
        Multiplicity _multiplicity_1 = a.getMultiplicity();
        String _value = _multiplicity_1.getValue();
        String _replaceAll = _value.replaceAll("\"", "");
        _builder.append(_replaceAll, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _defaultValue = a.getDefaultValue();
      boolean _notEquals_2 = (!Objects.equal(_defaultValue, null));
      if (_notEquals_2) {
        _builder.append("\"Default Value\": \"");
        String _defaultValue_1 = a.getDefaultValue();
        _builder.append(_defaultValue_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Not Null\": \"");
    String _notNull = a.getNotNull();
    boolean _notEquals_3 = (!Objects.equal(_notNull, null));
    _builder.append(_notEquals_3, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Unique\": \"");
    String _unique = a.getUnique();
    boolean _notEquals_4 = (!Objects.equal(_unique, null));
    _builder.append(_notEquals_4, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
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
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"Value\": \"");
    Entity _entity = f.getEntity();
    String _name = _entity.getName();
    _builder.append(_name, "\t");
    _builder.append("(");
    RefAttribute _refTo = f.getRefTo();
    Attribute _refAttr = _refTo.getRefAttr();
    String _name_1 = _refAttr.getName();
    _builder.append(_name_1, "\t");
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
              _builder.appendImmediate(",", "\t");
            }
            String _name_2 = r.getName();
            _builder.append(_name_2, "\t");
          }
        }
      }
    }
    _builder.append(")\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Multiplicity\": \"");
    Multiplicity _multiplicity = f.getMultiplicity();
    String _value = _multiplicity.getValue();
    String _replaceAll = _value.replaceAll("\"", "");
    _builder.append(_replaceAll, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final Check c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": ");
    String _name = c.getName();
    _builder.append(_name, "\t");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Expression\": \"");
    String _checkExpression = c.getCheckExpression();
    _builder.append(_checkExpression, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final Actor a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = a.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = a.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = a.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = a.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = a.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Stakeholder _stakeholder = a.getStakeholder();
      boolean _notEquals_1 = (!Objects.equal(_stakeholder, null));
      if (_notEquals_1) {
        _builder.append("\"Stakeholder\": \"");
        Stakeholder _stakeholder_1 = a.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Actor _actor = a.getActor();
      boolean _notEquals_2 = (!Objects.equal(_actor, null));
      if (_notEquals_2) {
        _builder.append("\"Is A\": \"");
        Actor _actor_1 = a.getActor();
        String _name_2 = _actor_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final UseCase u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = u.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = u.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Description\": \"");
    String _description = u.getDescription();
    _builder.append(_description, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = u.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      RefEntity _entities = u.getEntities();
      boolean _notEquals = (!Objects.equal(_entities, null));
      if (_notEquals) {
        _builder.append("\"Entities\": \"");
        RefEntity _entities_1 = u.getEntities();
        CharSequence _compile = this.compile(_entities_1);
        _builder.append(_compile, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Priority\": \"");
    Priority _priority = u.getPriority();
    String _value = _priority.getValue();
    _builder.append(_value, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
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
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compile_1 = this.compile(g);
            _builder.append(_compile_1, "\t");
          }
        }
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
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
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compile_2 = this.compile(f);
            _builder.append(_compile_2, "\t");
          }
        }
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Actor Initiates\": \"");
    Actor _actorInitiates = u.getActorInitiates();
    String _name_1 = _actorInitiates.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      RefActor _actors = u.getActors();
      boolean _notEquals_1 = (!Objects.equal(_actors, null));
      if (_notEquals_1) {
        _builder.append("\"Actor Participates\": \"");
        RefActor _actors_1 = u.getActors();
        CharSequence _compile_3 = this.compile(_actors_1);
        _builder.append(_compile_3, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _preConditions = u.getPreConditions();
      boolean _notEquals_2 = (!Objects.equal(_preConditions, null));
      if (_notEquals_2) {
        _builder.append("\"Pre-Conditions\": \"");
        String _preConditions_1 = u.getPreConditions();
        _builder.append(_preConditions_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _postConditions = u.getPostConditions();
      boolean _notEquals_3 = (!Objects.equal(_postConditions, null));
      if (_notEquals_3) {
        _builder.append("\"Post-Conditions\": \"");
        String _postConditions_1 = u.getPostConditions();
        _builder.append(_postConditions_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
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
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compile_4 = this.compile(i);
            _builder.append(_compile_4, "\t");
          }
        }
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      UseCase _extends = u.getExtends();
      boolean _notEquals_4 = (!Objects.equal(_extends, null));
      if (_notEquals_4) {
        _builder.append("\"Extend\": \"");
        UseCase _extends_1 = u.getExtends();
        String _name_2 = _extends_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" on ");
        ExtensionPoint _extPoint = u.getExtPoint();
        String _name_3 = _extPoint.getName();
        _builder.append(_name_3, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
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
              _builder.appendImmediate(",\n", "\t");
            }
            CharSequence _compile_5 = this.compile(s);
            _builder.append(_compile_5, "\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
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
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Description\": \"");
    String _description = s.getDescription();
    _builder.append(_description, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Execution Mode\": \"");
    String _mode = s.getMode();
    _builder.append(_mode, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
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
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compile = this.compile(st);
            _builder.append(_compile, "\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final Step s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = s.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Description\": \"");
    String _description = s.getDescription();
    _builder.append(_description, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = s.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Actor _actor = s.getActor();
      boolean _notEquals = (!Objects.equal(_actor, null));
      if (_notEquals) {
        _builder.append("\"Actor\": \"");
        Actor _actor_1 = s.getActor();
        String _name_1 = _actor_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _preConditions = s.getPreConditions();
      boolean _notEquals_1 = (!Objects.equal(_preConditions, null));
      if (_notEquals_1) {
        _builder.append("\"Pre-Conditions\": \"");
        String _preConditions_1 = s.getPreConditions();
        _builder.append(_preConditions_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _postConditions = s.getPostConditions();
      boolean _notEquals_2 = (!Objects.equal(_postConditions, null));
      if (_notEquals_2) {
        _builder.append("\"Post-Conditions\": \"");
        String _postConditions_1 = s.getPostConditions();
        _builder.append(_postConditions_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Step _next = s.getNext();
      boolean _notEquals_3 = (!Objects.equal(_next, null));
      if (_notEquals_3) {
        _builder.append("\"Next Step\": \"");
        Step _next_1 = s.getNext();
        String _name_2 = _next_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final FR f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = f.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = f.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = f.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = f.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = f.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Stakeholder _stakeholder = f.getStakeholder();
      boolean _notEquals_1 = (!Objects.equal(_stakeholder, null));
      if (_notEquals_1) {
        _builder.append("\"Stakeholder\": \"");
        Stakeholder _stakeholder_1 = f.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Priority\": \"");
    Priority _priority = f.getPriority();
    String _value = _priority.getValue();
    _builder.append(_value, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      FR _partOf = f.getPartOf();
      boolean _notEquals_2 = (!Objects.equal(_partOf, null));
      if (_notEquals_2) {
        _builder.append("\"Part Of\": \"");
        FR _partOf_1 = f.getPartOf();
        String _name_2 = _partOf_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      ProjectProgress _progress = f.getProgress();
      boolean _notEquals_3 = (!Objects.equal(_progress, null));
      if (_notEquals_3) {
        _builder.append("\"Progress\": \"");
        ProjectProgress _progress_1 = f.getProgress();
        String _value_1 = _progress_1.getValue();
        _builder.append(_value_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final QR q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = q.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = q.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = q.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = q.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = q.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _subType = q.getSubType();
      boolean _notEquals_1 = (!Objects.equal(_subType, null));
      if (_notEquals_1) {
        _builder.append("\"Sub-Type\": \"");
        String _subType_1 = q.getSubType();
        _builder.append(_subType_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Metric\": \"");
    String _metric = q.getMetric();
    _builder.append(_metric, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Value\": \"");
    int _value = q.getValue();
    _builder.append(_value, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Stakeholder _stakeholder = q.getStakeholder();
      boolean _notEquals_2 = (!Objects.equal(_stakeholder, null));
      if (_notEquals_2) {
        _builder.append("\"Stakeholder\": \"");
        Stakeholder _stakeholder_1 = q.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Priority\": \"");
    Priority _priority = q.getPriority();
    String _value_1 = _priority.getValue();
    _builder.append(_value_1, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      QR _partOf = q.getPartOf();
      boolean _notEquals_3 = (!Objects.equal(_partOf, null));
      if (_notEquals_3) {
        _builder.append("\"Part Of\": \"");
        QR _partOf_1 = q.getPartOf();
        String _name_2 = _partOf_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      ProjectProgress _progress = q.getProgress();
      boolean _notEquals_4 = (!Objects.equal(_progress, null));
      if (_notEquals_4) {
        _builder.append("\"Progress\": \"");
        ProjectProgress _progress_1 = q.getProgress();
        String _value_2 = _progress_1.getValue();
        _builder.append(_value_2, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final Constraint c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = c.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Name\": \"");
    String _nameAlias = c.getNameAlias();
    _builder.append(_nameAlias, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = c.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = c.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = c.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Stakeholder _stakeholder = c.getStakeholder();
      boolean _notEquals_1 = (!Objects.equal(_stakeholder, null));
      if (_notEquals_1) {
        _builder.append("\"Stakeholder\": \"");
        Stakeholder _stakeholder_1 = c.getStakeholder();
        String _name_1 = _stakeholder_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Priority\": \"");
    Priority _priority = c.getPriority();
    String _value = _priority.getValue();
    _builder.append(_value, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Constraint _partOf = c.getPartOf();
      boolean _notEquals_2 = (!Objects.equal(_partOf, null));
      if (_notEquals_2) {
        _builder.append("\"Part Of\": \"");
        Constraint _partOf_1 = c.getPartOf();
        String _name_2 = _partOf_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      ProjectProgress _progress = c.getProgress();
      boolean _notEquals_3 = (!Objects.equal(_progress, null));
      if (_notEquals_3) {
        _builder.append("\"Progress\": \"");
        ProjectProgress _progress_1 = c.getProgress();
        String _value_1 = _progress_1.getValue();
        _builder.append(_value_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence compile(final RequirementRelation r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"ID\": \"");
    String _name = r.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Source\": \"");
    Requirement _source = r.getSource();
    String _name_1 = _source.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Target\": \"");
    Requirement _target = r.getTarget();
    String _name_2 = _target.getName();
    _builder.append(_name_2, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"Type\": \"");
    String _type = r.getType();
    _builder.append(_type, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _description = r.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        _builder.append("\"Description\": \"");
        String _description_1 = r.getDescription();
        _builder.append(_description_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
}
