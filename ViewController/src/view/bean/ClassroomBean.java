package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.AdfUtil;

public class ClassroomBean {
    public ClassroomBean() {
    }

    public void deleteClassroomDialogListner(DialogEvent dialogEvent) {
        AdfUtil.executeOperation("Delete");
        AdfUtil.executeOperation("Commit");
        AdfUtil.showSuccessfulMessage("Classroom Deleted Successfully!");
    }
}
