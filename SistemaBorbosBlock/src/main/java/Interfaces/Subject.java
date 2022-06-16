package Interfaces;

import Entity.Tipo;

//Los botones
public interface Subject {
    public void atach(Observer o);
    public void notifyObserver(Tipo tipo);
}
