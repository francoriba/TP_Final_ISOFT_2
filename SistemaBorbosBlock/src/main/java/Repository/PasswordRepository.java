package Repository;

import Conexion.Conexion;
import Entity.PasswordEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PasswordRepository implements Repository<PasswordEntity>{

    @Override
    public boolean save(PasswordEntity passwordEntity) {
        Connection conn = Conexion.conectar();
        try{
            PreparedStatement ps = conn.prepareStatement("INSERT INTO password VALUES(?, ?, ? ?)");
            //ps.setString(1, "0");
            ps.setString(1, passwordEntity.getUrl());
            ps.setString(2, passwordEntity.getPassword());
            ps.setString(3, passwordEntity.getUser());
            ps.execute();
            conn.close();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List<PasswordEntity> findAll() {
        return null;
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
