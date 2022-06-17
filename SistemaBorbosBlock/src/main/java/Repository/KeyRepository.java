package Repository;

import Entity.KeyEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class KeyRepository implements Repository<KeyEntity>{
    @Override
    public boolean save(KeyEntity keyEntity) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(keyEntity);
            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
        }finally {
            HibernateUtil.closeSession();
        }
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
