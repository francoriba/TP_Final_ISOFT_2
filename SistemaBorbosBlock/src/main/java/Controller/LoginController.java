package Controller;

import Model.BankCardModel;
import Model.KeyModel;
import Model.PasswordModel;
import View.InicioView;
import View.LoginView;
import Model.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener{

    private LoginModel model;
    private LoginView view;

    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;
        view.addLoginListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = view.getUser();
        String password = view.getPassword();
        if(!model.iniciarSession(user, password)){
            view.showBadAcces();
        }else {
            view.dispose();
            InicioView inicioView = new InicioView();
            KeyModel keyModel = new KeyModel();
            BankCardModel bankCardModel = new BankCardModel();
            PasswordModel passwordModel = new PasswordModel();
            BankCardController bankCardController = new BankCardController(bankCardModel, inicioView);
            PasswordController passwordController = new PasswordController(inicioView, passwordModel);
            KeyController keyController = new KeyController(keyModel,inicioView);
        }
    }

}
