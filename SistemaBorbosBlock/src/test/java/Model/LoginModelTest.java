package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Test case ID: CPF 001
class LoginModelTest {
    @Test
    public void LoginCredencialesCorrectas(){
        LoginModel loginModel = new LoginModel();
        assertTrue(loginModel.iniciarSession("root","root"));
    }

    @Test
    //Test case ID: CPA 002
    public  void LoginCredencialesIncorrectas(){
        LoginModel loginModel = new LoginModel();
        assertFalse(loginModel.iniciarSession("root","AAA"));
    }
}