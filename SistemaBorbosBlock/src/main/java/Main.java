import Controller.LoginController;
import Entity.KeyEntity;
import Entity.PasswordEntity;
import Repository.KeyRepository;
import Repository.PasswordRepository;
import View.LoginView;
import Model.LoginModel;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel();
        LoginController loginController = new LoginController(loginModel, loginView);
    }
//    public static void main(String[] args) {
//        PasswordRepository passwordRepository = new PasswordRepository();
//        PasswordEntity passwordEntity = new PasswordEntity("url", "user", "password");
//        passwordRepository.save(passwordEntity);
//    }
}
