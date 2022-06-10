package Repository;

import Entity.KeyEntity;

import java.util.List;

public class KeyRepository implements Repository<KeyEntity>{
    @Override
    public boolean save(KeyEntity keyEntity) {
        return false;
    }

    @Override
    public List<KeyEntity> findAll() {
        return null;
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
