package Repository;

import Entity.PasswordEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PasswordRepository implements Repository<PasswordEntity>{

    @Override
    public boolean save(PasswordEntity passwordEntity) {
        return false;
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
