/**
 * generated by Xtext
 */
package rslingo.rslil.validation;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import rslingo.rslil.rSLIL.Entity;
import rslingo.rslil.rSLIL.EntityType;
import rslingo.rslil.rSLIL.QR;
import rslingo.rslil.rSLIL.RSLILPackage;
import rslingo.rslil.rSLIL.RefEntity;
import rslingo.rslil.rSLIL.Step;
import rslingo.rslil.rSLIL.UseCase;
import rslingo.rslil.validation.AbstractRSLILValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class RSLILValidator extends AbstractRSLILValidator {
  @Check
  public void checkUseCaseEntities(final UseCase uc) {
    String _type = uc.getType();
    boolean _equals = _type.equals("Report");
    boolean _not = (!_equals);
    if (_not) {
      RefEntity _entities = uc.getEntities();
      boolean _equals_1 = Objects.equal(_entities, null);
      if (_equals_1) {
        String _type_1 = uc.getType();
        String _plus = ("A Use Case of type \'" + _type_1);
        String _plus_1 = (_plus + "\' should be associated to an Entity with the role Principal.");
        this.error(_plus_1, RSLILPackage.Literals.USE_CASE__ENTITIES);
      } else {
        RefEntity _entities_1 = uc.getEntities();
        EntityType _type_2 = _entities_1.getType();
        String _type_3 = _type_2.getType();
        boolean _equals_2 = _type_3.equals("Principal");
        boolean _not_1 = (!_equals_2);
        if (_not_1) {
          RefEntity _entities_2 = uc.getEntities();
          EList<Entity> _refs = _entities_2.getRefs();
          boolean _isEmpty = _refs.isEmpty();
          if (_isEmpty) {
            String _type_4 = uc.getType();
            String _plus_2 = ("A Use Case of type \'" + _type_4);
            String _plus_3 = (_plus_2 + "\' should be associated to an Entity with the role Principal.");
            this.error(_plus_3, RSLILPackage.Literals.USE_CASE__ENTITIES);
          } else {
            boolean hasPrincipal = false;
            RefEntity _entities_3 = uc.getEntities();
            EList<EntityType> _refType = _entities_3.getRefType();
            for (final EntityType type : _refType) {
              String _type_5 = type.getType();
              boolean _equals_3 = _type_5.equals("Principal");
              if (_equals_3) {
                hasPrincipal = true;
              }
            }
            if ((!hasPrincipal)) {
              String _type_6 = uc.getType();
              String _plus_4 = ("A Use Case of type \'" + _type_6);
              String _plus_5 = (_plus_4 + "\' should be associated to an Entity with the role Principal.");
              this.error(_plus_5, RSLILPackage.Literals.USE_CASE__ENTITIES);
            }
          }
        }
      }
    }
  }
  
  @Check
  public Integer checkStepName(final Step step) {
    int _xifexpression = (int) 0;
    String _name = step.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      int _xblockexpression = (int) 0;
      {
        String _name_1 = step.getName();
        String[] parts = _name_1.split("s");
        int _xifexpression_1 = (int) 0;
        boolean _and = false;
        final String[] _converted_parts = (String[])parts;
        int _size = ((List<String>)Conversions.doWrapArray(_converted_parts)).size();
        boolean _equals = (_size == 2);
        if (!_equals) {
          _and = false;
        } else {
          String _get = parts[0];
          boolean _isEmpty = _get.isEmpty();
          _and = _isEmpty;
        }
        if (_and) {
          int _xtrycatchfinallyexpression = (int) 0;
          try {
            String _get_1 = parts[1];
            _xtrycatchfinallyexpression = Integer.parseInt(_get_1);
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception e = (Exception)_t;
              this.error("The Step name must be in the format \'s<integer>\'.", RSLILPackage.Literals.STEP__NAME);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          _xifexpression_1 = _xtrycatchfinallyexpression;
        } else {
          this.error("The Step name must be in the format \'s<integer>\'.", RSLILPackage.Literals.STEP__NAME);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return Integer.valueOf(_xifexpression);
  }
  
  @Check
  public void checkQRSubType(final QR qr) {
    String _subType = qr.getSubType();
    boolean _notEquals = (!Objects.equal(_subType, null));
    if (_notEquals) {
      String _type = qr.getType();
      boolean _equals = _type.equals("Security");
      if (_equals) {
        boolean _and = false;
        String _subType_1 = qr.getSubType();
        boolean _equals_1 = _subType_1.equals("Security.Privacy");
        boolean _not = (!_equals_1);
        if (!_not) {
          _and = false;
        } else {
          String _subType_2 = qr.getSubType();
          boolean _equals_2 = _subType_2.equals("Security.Integrity");
          boolean _not_1 = (!_equals_2);
          _and = _not_1;
        }
        if (_and) {
          this.error("A QualityRequirement of type \'Security\' can only have the following sub-types: Security.Privacy or Security.Integrity.", RSLILPackage.Literals.QR__SUB_TYPE);
        }
      } else {
        String _type_1 = qr.getType();
        boolean _equals_3 = _type_1.equals("Usability");
        if (_equals_3) {
          boolean _and_1 = false;
          boolean _and_2 = false;
          String _subType_3 = qr.getSubType();
          boolean _equals_4 = _subType_3.equals("Usability.EaseOfUse");
          boolean _not_2 = (!_equals_4);
          if (!_not_2) {
            _and_2 = false;
          } else {
            String _subType_4 = qr.getSubType();
            boolean _equals_5 = _subType_4.equals("Usability.EaseOfLearn");
            boolean _not_3 = (!_equals_5);
            _and_2 = _not_3;
          }
          if (!_and_2) {
            _and_1 = false;
          } else {
            String _subType_5 = qr.getSubType();
            boolean _equals_6 = _subType_5.equals("Usability.Accessibility");
            boolean _not_4 = (!_equals_6);
            _and_1 = _not_4;
          }
          if (_and_1) {
            this.error("A QualityRequirement of type \'Usability\' can only have the following sub-types: Usability.EaseOfUse, Usability.EaseOfLearn or Usability.Accessibility.", RSLILPackage.Literals.QR__SUB_TYPE);
          }
        } else {
          String _type_2 = qr.getType();
          String _plus = ("A QualityRequirement of type \'" + _type_2);
          String _plus_1 = (_plus + "\' cannot have a sub-type.");
          this.error(_plus_1, RSLILPackage.Literals.QR__SUB_TYPE);
        }
      }
    }
  }
}
