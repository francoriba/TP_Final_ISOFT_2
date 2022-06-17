package Repository;

import Conexion.Conexion;
import Entity.KeyEntity;
import Entity.PasswordEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KeyRepository implements Repository<KeyEntity>{
    @Override
    public boolean save(KeyEntity keyEntity) {
        Connection conn = Conexion.conectar();
        try{
            String query = "INSERT INTO key VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "0");
            ps.setString(2, keyEntity.getPath());
            ps.setString(3, keyEntity.getKey());
            ps.executeUpdate();
            conn.close();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<KeyEntity> findAll() {
        Connection cnn = Conexion.conectar();
        ArrayList<KeyEntity> keys = new ArrayList<>();
        try{
            String sql = "SELECT * FROM key_table";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String path = rs.getString(2);
                String key = rs.getString(3);
                KeyEntity keyEntity = new KeyEntity(id, path, key);
                keys.add(keyEntity);
            }
            cnn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return keys;
    }

    @Override
    public KeyEntity findbyID(int id) {
        return null;
    }

    @Override
    public boolean update(KeyEntity keyEntity) {
        return false;
    }
}
