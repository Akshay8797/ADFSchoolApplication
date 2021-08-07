package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.AdfUtil;

public class StudentBean {
    public StudentBean() {
    }

    public void deleteStudentDialogListner(DialogEvent dialogEvent) {
        AdfUtil.executeOperation("Delete");
        AdfUtil.executeOperation("Commit");
        AdfUtil.showSuccessfulMessage("Student Deleted Successfully!");
    }
}
