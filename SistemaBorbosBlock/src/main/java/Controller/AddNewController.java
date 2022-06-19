package Controller;

import Entity.TipoRegistro;
import View.AddKeyView;
import View.AddPasswordView;
import View.AddPaymentView;
import View.InicioView;

public class AddNewController {
    private InicioView view;
    private TipoRegistro tipoRegistro;

    public AddNewController(InicioView view) {
        this.view = view;
    }

    public TipoRegistro getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public void open(TipoRegistro tipoVigente) {
        switch (tipoVigente){
            case PASSWORD:
                new AddPasswordView();
                break;
            case PAYMENT:
                new AddPaymentView();
                break;
            case KEY:
                new AddKeyView();
                break;
        }
    }
}
