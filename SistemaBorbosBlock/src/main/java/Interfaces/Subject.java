package Interfaces;

import Entity.TipoRegistro;

//Los botones
public interface Subject {
    public void atach(Observer o);
    public void notifyObserver(TipoRegistro tipoRegistro);
}
