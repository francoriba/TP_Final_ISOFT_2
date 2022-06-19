package View;

import Entity.TipoRegistro;
import Interfaces.Observer;
import Interfaces.Subject;

import javax.swing.*;

public class ButtonView extends JButton implements Subject{

    private Observer observer; //tabla
    private TipoRegistro tipoRegistro;

    public ButtonView(Observer observer, TipoRegistro tipoRegistro){
        atach(observer);
        this.tipoRegistro = tipoRegistro;
    }

    @Override
    public void atach(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver(TipoRegistro tipoRegistro) {
        observer.update(tipoRegistro);
    }
}
