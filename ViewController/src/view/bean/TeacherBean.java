package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.AdfUtil;

public class TeacherBean {
    public TeacherBean() {
    }

    public void deleteTeacherDialogListner(DialogEvent dialogEvent) {
        AdfUtil.executeOperation("Delete");
        AdfUtil.executeOperation("Commit");
        AdfUtil.showSuccessfulMessage("Teacher Deleted Successfully!");
    }

    public String saveTeacherDialogListner() {
        AdfUtil.showSuccessfulMessage("Data Saved Successfully!");
        return null;
    }
}
