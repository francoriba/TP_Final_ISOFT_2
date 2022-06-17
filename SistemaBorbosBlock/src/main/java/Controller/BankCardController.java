package Controller;

import Entity.TipoRegistro;
import Model.BankCardModel;
import View.InicioView;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankCardController implements Controller, ActionListener {

    private BankCardModel model;
    private InicioView view;

    public BankCardController(BankCardModel model, InicioView view) {
        this.model = model;
        this.view = view;
        view.addBankCardListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modelTable = model.getModeloTabla();
        view.setModelTable(modelTable);
        view.setTipoVigente(TipoRegistro.PAYMENT);
    }
}
