package Model;

import Entity.KeyEntity;
import Entity.PasswordEntity;
import Repository.KeyRepository;
import Repository.PasswordRepository;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class KeyModel {
    public DefaultTableModel getModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("PATH");
        modelo.addColumn("KEY");

        KeyRepository keyRepository = new KeyRepository();
        List<KeyEntity> keys = keyRepository.findAll();

        for (KeyEntity k : keys){
            Object [] objects = new Object[3];
            objects[0] = k.getId();
            objects[1] = k.getPath();
            objects[2] = k.getKey();
            modelo.addRow(objects);
        }

        return modelo;
    }
}
