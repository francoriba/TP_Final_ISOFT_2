package Repository;

import Entity.BankCardEntity;

import java.util.List;

public class BankCardRepository implements Repository<BankCardEntity>{
    @Override
    public boolean save(BankCardEntity bankCardEntity) {
        return false;
    }

    @Override
    public List<BankCardEntity> findAll() {
        return null;
    }

    @Override
    public BankCardEntity findbyID(int id) {
        return null;
    }

    @Override
    public boolean update(BankCardEntity bankCardEntity) {
        return false;
    }
}
