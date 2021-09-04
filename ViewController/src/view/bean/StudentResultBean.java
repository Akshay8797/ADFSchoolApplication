package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.AdfUtil;

public class StudentResultBean {
    public StudentResultBean() {
    }

    public void deleteStudentResultDialogListner(DialogEvent dialogEvent) {
        AdfUtil.executeOperation("Delete");
        AdfUtil.executeOperation("Commit");
        AdfUtil.showSuccessfulMessage("Student's Result Deleted Successfully!");
    }

    public String saveStudentResultDialogListner() {
        AdfUtil.showSuccessfulMessage("Data Saved Successfully!");
        return null;
    }
}
