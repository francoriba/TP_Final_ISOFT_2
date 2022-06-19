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
}