package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.AdfUtil;

public class ClassToTeacherBean {
    public ClassToTeacherBean() {
    }

    public void deleteTeacherClassesDialogListner(DialogEvent dialogEvent) {
        AdfUtil.executeOperation("Delete");
        AdfUtil.executeOperation("Commit");
        AdfUtil.showSuccessfulMessage("Teacher's Class Deleted Successfully!");
    }

    public String saveTeacherClassesDialogListner() {
        AdfUtil.showSuccessfulMessage("Data Saved Successfully!");
        return null;
    }
}
