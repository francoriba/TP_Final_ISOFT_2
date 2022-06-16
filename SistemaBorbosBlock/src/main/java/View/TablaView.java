package View;

import Entity.Tipo;
import Interfaces.Observer;
import Interfaces.Subject;

import javax.swing.*;
import java.util.List;

public class TablaView extends JTable implements Observer{
    private static TablaView tableUnica;
    private List<Subject> subjects;

    private TablaView(List<Subject> subjects){
        this.subjects = subjects;
    }

    /**
     * Suplanta al constructor, solo se puede instanciar una vez la tabla.
     * @param subject
     * @return
     */
    public static TablaView getInstanciaUnica(List<Subject> subjects){
        if(TablaView.tableUnica == null)
            TablaView.tableUnica = new TablaView(subjects);
        return TablaView.tableUnica;
    }

    @Override
    public void update(Tipo tipo) {
        switch(tipo) {
            case KEY:
                // code block
                break;
            case PAYMENT:
                System.out.println("Anda bien el observer"+tipo);
                // code block
                break;
            case PASSWORD:
                break;
            default:
                // code block
        }
    }

}
