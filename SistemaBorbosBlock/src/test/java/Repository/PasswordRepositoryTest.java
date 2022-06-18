package Repository;

import Entity.PasswordEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Test case ID: CPF 002
class PasswordRepositoryTest {
    @Test
    public void GenerarContrasena(){
        PasswordEntity passwordEntity= new PasswordEntity(
                1,
                "www.twitter.com",
                "Pepe",
                "jkrt1");

        PasswordRepository repository= new PasswordRepository();
        assertTrue( repository.save(passwordEntity));

    }


}