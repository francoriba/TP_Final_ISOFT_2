package Model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginModelTest {

    @Test
    public void shouldPassvalidarIngreso() {
        Assert.assertTrue(LoginModel.validarIngreso("root", "toor"));
    }

    @Test
    public void shouldNotPassvalidarIngreso() {
        Assert.assertFalse(LoginModel.validarIngreso("root", "toor."));
    }

}