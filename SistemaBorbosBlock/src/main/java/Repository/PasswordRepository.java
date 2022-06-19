package Repository;

import Conexion.Conexion;
import Entity.PasswordEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PasswordRepository implements Repository<PasswordEntity>{

    @Override
    public boolean save(PasswordEntity passwordEntity) {
        Connection conn = Conexion.conectar();
        try{
            String query = "INSERT INTO password VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "0");
            ps.setString(2, passwordEntity.getUrl());
            ps.setString(3, passwordEntity.getPassword());
            ps.setString(4, passwordEntity.getUser());
            ps.executeUpdate();
            conn.close();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List<PasswordEntity> findAll() {
        Connection cnn = Conexion.conectar();
        ArrayList<PasswordEntity> passwords = new ArrayList<>();
        try{
            String sql = "SELECT * FROM password";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String url = rs.getString(2);
                String password = rs.getString(3);
                String user = rs.getString(4);
                PasswordEntity passwordEntity = new PasswordEntity(id, url, user, password);
                passwords.add(passwordEntity);
            }
            cnn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return passwords;
    }

    @Override
    public PasswordEntity findbyID(int id) {
        return null;
    }

    @Override
    public boolean update(PasswordEntity passwordEntity) {
        return false;
    }
}
