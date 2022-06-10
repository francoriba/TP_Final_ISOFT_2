package Controller;

import Interfaz.LoginInterfaz;
import Model.LoginModel;

public class LoginController {

    private LoginModel loginModel;

    public LoginController() {
        loginModel = new LoginModel();
    }

    public void login(LoginInterfaz loginInterfaz, String user, String password) {
        loginModel.iniciarSession(loginInterfaz, user, password);
    }
}
