package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.AdfUtil;

public class StudentToClassBean {
    public StudentToClassBean() {
    }

    public void deleteStudentClassDialogListner(DialogEvent dialogEvent) {
        AdfUtil.executeOperation("Delete");
        AdfUtil.executeOperation("Commit");
        AdfUtil.showSuccessfulMessage("Student's Class Deleted Successfully");
    }

    public String saveStudentClassDialogListner() {
        AdfUtil.showSuccessfulMessage("Data Saved Successfully!");
        return null;
    }
}
