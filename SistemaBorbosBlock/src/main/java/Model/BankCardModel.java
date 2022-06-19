package Model;

import Entity.BankCardEntity;
import Repository.BankCardRepository;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class BankCardModel {
    public DefaultTableModel getModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("ENTIDAD");
        modelo.addColumn("NUMBER");
        modelo.addColumn("SEC. NUMB");
        modelo.addColumn("EXP. DATE");

        BankCardRepository bankCardRepository = new BankCardRepository();
        List<BankCardEntity> cards = bankCardRepository.findAll();

        for (BankCardEntity b : cards){
            Object [] objects = new Object[5];
            objects[0] = b.getId();
            objects[1] = b.getEntidad();
            objects[2] = b.getNumber();
            objects[3] = b.getSecNumber();
            objects[4] = b.getExpirationDate();
            modelo.addRow(objects);
        }
        return modelo;
    }
}
