package Controller;

import Model.BankCardModel;
import View.InicioView;

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

    }
}
