package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.AdfUtil;

public class TeacherClassesBean {
    public TeacherClassesBean() {
    }

    public void deleteTeacherClassesDialogListner(DialogEvent dialogEvent) {
        AdfUtil.executeOperation("Delete");
        AdfUtil.executeOperation("Commit");
        AdfUtil.showSuccessfulMessage("Teacher Class Deleted Successfully!");
    }
}
