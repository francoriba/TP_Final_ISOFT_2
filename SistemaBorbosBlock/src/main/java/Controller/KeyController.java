package Controller;

import Model.KeyModel;
import View.InicioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyController implements Controller, ActionListener {

    private KeyModel model;
    private InicioView view;

    public KeyController(KeyModel model, InicioView view) {
        this.model = model;
        this.view = view;
        view.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click en key");
    }
}
