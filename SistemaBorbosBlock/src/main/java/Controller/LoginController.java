package Controller;

import Model.InicioModel;
import View.InicioView;
import View.LoginView;
import Model.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    private LoginModel model;
    private LoginView view;

    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;
        view.addLoginListener(new LoginListener());
    }

    class LoginListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String user = view.getUser();
            String password = view.getPassword();
            if(!model.iniciarSession(user, password)){
                view.showBadAcces();
            }else {
                view.dispose();
                InicioModel inicioModel = new InicioModel();
                InicioView inicioView = new InicioView();
                new InicioController(inicioView, inicioModel);
            }
        }
    }
}
