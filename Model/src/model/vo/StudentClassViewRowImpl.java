package model.vo;

import java.math.BigDecimal;

import model.common.ModelUtil;

import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 10 00:48:51 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StudentClassViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_STUDENTCLASS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        StudentFk,
        ClassroomFk,
        TGradeNumber;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int STUDENTFK = AttributesEnum.StudentFk.index();
    public static final int CLASSROOMFK = AttributesEnum.ClassroomFk.index();
    public static final int TGRADENUMBER = AttributesEnum.TGradeNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public StudentClassViewRowImpl() {
    }

    /**
     * Gets StudentClass entity object.
     * @return the StudentClass
     */
    public EntityImpl getStudentClass() {
        return (EntityImpl) getEntity(ENTITY_STUDENTCLASS);
    }

    /**
     * Gets the attribute value for STUDENT_FK using the alias name StudentFk.
     * @return the STUDENT_FK
     */
    public BigDecimal getStudentFk() {
        return (BigDecimal) getAttributeInternal(STUDENTFK);
    }

    /**
     * Sets <code>value</code> as attribute value for STUDENT_FK using the alias name StudentFk.
     * @param value value to set the STUDENT_FK
     */
    public void setStudentFk(BigDecimal value) {
        setAttributeInternal(STUDENTFK, value);
    }

    /**
     * Gets the attribute value for CLASSROOM_FK using the alias name ClassroomFk.
     * @return the CLASSROOM_FK
     */
    public BigDecimal getClassroomFk() {
        return (BigDecimal) getAttributeInternal(CLASSROOMFK);
    }

    /**
     * Sets <code>value</code> as attribute value for CLASSROOM_FK using the alias name ClassroomFk.
     * @param value value to set the CLASSROOM_FK
     */
    public void setClassroomFk(BigDecimal value) {
        setAttributeInternal(CLASSROOMFK, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TGradeNumber.
     * @return the TGradeNumber
     */
    public String getTGradeNumber() {
        String getStudentClass = "SELECT GRADE_NUMBER FROM CLASSROOMS WHERE ROOM_NUMBER = " +getClassroomFk();
        return ModelUtil.getSqlDescription(getStudentClass, getDBTransaction());
    }
}

