package Interfaz;

import Entity.Tipo;
import Interfaces.Observer;

import javax.swing.*;

public class ButtonInterfaz extends JButton implements Observer {

    private Tipo tipo;

    @Override
    public void update() {

    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
