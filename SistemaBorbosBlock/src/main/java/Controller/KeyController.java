package Controller;

import Entity.TipoRegistro;
import Model.KeyModel;
import View.InicioView;

import javax.swing.table.DefaultTableModel;
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
        DefaultTableModel modelTable = model.getModeloTabla();
        view.setModelTable(modelTable);
        view.setTipoVigente(TipoRegistro.KEY);
    }
}
