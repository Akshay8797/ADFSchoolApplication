package view.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import view.common.AdfUtil;

public class LoginBean {
    private RichInputText usernameInputText;
    private RichInputText passwordInputText;

    public LoginBean() {
    }

    public void setUsernameInputText(RichInputText usernameInputText) {
        this.usernameInputText = usernameInputText;
    }

    public RichInputText getUsernameInputText() {
        return usernameInputText;
    }

    public void setPasswordInputText(RichInputText passwordInputText) {
        this.passwordInputText = passwordInputText;
    }

    public RichInputText getPasswordInputText() {
        return passwordInputText;
    }

    public String loginAction() {
        String userName = usernameInputText.getValue().toString();
        String password = passwordInputText.getValue().toString();
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection conn = null;
        try {
            String loginCheckQuery =
                "SELECT SCHOOL_PRINCIPAL_NAME FROM SCHOOL_INFORMATION WHERE SCHOOL_PRINCIPAL_USERNAME = '" +
                userName + "' AND SCHOOL_PRINCIPAL_PASWORD = '" + password + "'";
            conn = AdfUtil.getConnection();
            statement = conn.prepareStatement(loginCheckQuery);
            result = statement.executeQuery();
            if (result.next()) {
                AdfUtil.putInSessionScope("userName", userName);
                AdfUtil.putInSessionScope("principalName", result.getString(1));
                return "dashboard";
            }
        } catch (Exception ex) {
            System.out.println("Exception caught on loginAction()");
        }
        AdfUtil.showErrorMessage("Invalid Credentials!");
        return null;
    }

    public String logoutAction() {
        System.out.println("Logging Out =====> Bye");
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
            if(session != null) {
                session.invalidate();
            }
        }
        catch (Exception e) {
            System.out.println("Exception occured in logout!");
        }
        return "index";
    }
}
