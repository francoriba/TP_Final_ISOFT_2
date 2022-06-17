package Controller;

import Model.PasswordModel;
import View.InicioView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordController implements Controller, ActionListener {

    private InicioView view;
    private PasswordModel model;

    public PasswordController(InicioView view, PasswordModel model) {
        this.view = view;
        this.model = model;
        view.addPasswordListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modelTable = model.getModeloTabla();
        view.setModelTable(modelTable);
    }
}
