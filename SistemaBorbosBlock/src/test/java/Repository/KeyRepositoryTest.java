package Repository;

import Entity.KeyEntity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KeyRepositoryTest {

    //Test case ID: CPF 004
    @Test
    public void GuardarKey(){
        KeyEntity key = new KeyEntity(0,"path","key1234567","mykey");
        KeyRepository repository = new KeyRepository();
        assertTrue(repository.save(key));
    }

    //Test case ID: CPF 005
    @Test
    public void visualizarKey(){
        KeyEntity key0 = new KeyEntity(0,"path","key1234567","mykey");
        KeyRepository keyrepository = new KeyRepository();
        keyrepository.save(key0);
        KeyEntity key1 = new KeyEntity(0,"path","key1234567","mykey");
        keyrepository.save(key1);


        ArrayList<KeyEntity> testList = new ArrayList<>();
        testList.add(key0);
        testList.add(key1);


        assertArrayEquals(keyrepository.findAll().toArray(),testList.toArray());



    }
}