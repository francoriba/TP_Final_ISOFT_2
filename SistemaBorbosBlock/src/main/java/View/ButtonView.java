package View;

import Entity.Tipo;
import Interfaces.Observer;
import Interfaces.Subject;

import javax.swing.*;
import java.util.List;

public class ButtonView extends JButton implements Subject{

    private Observer observer; //tabla
    private Tipo tipo;

    public ButtonView(Observer observer, Tipo tipo){
        atach(observer);
        this.tipo = tipo;
    }

    @Override
    public void atach(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver(Tipo tipo) {
        observer.update(tipo);
    }
}
