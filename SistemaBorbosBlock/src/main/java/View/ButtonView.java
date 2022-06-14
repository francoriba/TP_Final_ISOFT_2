package View;

import Entity.Tipo;
import Interfaces.Observer;

import javax.swing.*;

public class ButtonView extends JButton implements Observer {

    private Tipo tipo;

    @Override
    public void update() {

    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
