package Model;

import Entity.PasswordEntity;
import Repository.PasswordRepository;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class PasswordModel {

    public DefaultTableModel getModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("URL");
        modelo.addColumn("PASSWORD");
        modelo.addColumn("USER");

        PasswordRepository repository = new PasswordRepository();
        List<PasswordEntity> passwordEntities = repository.findAll();

        for (PasswordEntity p : passwordEntities){
            Object [] objects = new Object[4];
            objects[0] = p.getId();
            objects[1] = p.getUrl();
            objects[2] = p.getPassword();
            objects[3] = p.getUser();
            modelo.addRow(objects);
        }

        return modelo;
    }
}
