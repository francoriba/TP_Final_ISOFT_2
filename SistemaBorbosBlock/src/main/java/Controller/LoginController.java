package Controller;

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
        }
    }

}
