package Repository;

import Conexion.Conexion;
import Entity.BankCardEntity;
import Entity.PasswordEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankCardRepository implements Repository<BankCardEntity>{
    @Override
    public boolean save(BankCardEntity bankCardEntity) {
        Connection conn = Conexion.conectar();
        try{
            String query = "INSERT INTO password VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "0");
            ps.setString(2, bankCardEntity.getOwner());
            ps.setString(3, bankCardEntity.getNumber());
            ps.setString(4, bankCardEntity.getExpirationDate());
            ps.executeUpdate();
            conn.close();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<BankCardEntity> findAll() {
        Connection cnn = Conexion.conectar();
        ArrayList<BankCardEntity> bankCards = new ArrayList<>();
        try{
            String sql = "SELECT * FROM banckCard";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String owner = rs.getString(2);
                String number = rs.getString(3);
                String secNumber = rs.getString(4);
                String dateExp  = rs.getString(5);
                BankCardEntity card = new BankCardEntity(owner, number, secNumber, dateExp);
                bankCards.add(card);
            }
            cnn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return bankCards;    }

    @Override
    public BankCardEntity findbyID(int id) {
        return null;
    }

    @Override
    public boolean update(BankCardEntity bankCardEntity) {
        return false;
    }
}
