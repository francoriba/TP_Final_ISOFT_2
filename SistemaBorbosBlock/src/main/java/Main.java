import Controller.LoginController;
import View.LoginView;
import Model.LoginModel;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(loginModel, loginView);
    }
}
