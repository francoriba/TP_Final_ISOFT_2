package Controller;

import Model.InicioModel;
import View.InicioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioController{

    private InicioView view;
    private InicioModel model;

    public InicioController(InicioView view, InicioModel model) {
        this.view = view;
        this.model = model;
        view.addInicioListener(new InicioListener());
    }

    class InicioListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //Implement controller
        }
    }


}
