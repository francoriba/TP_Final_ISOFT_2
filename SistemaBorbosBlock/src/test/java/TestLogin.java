import Controller.LoginController;
import Model.LoginModel;
import View.LoginView;
import org.junit.Assert;
import org.junit.Test;

public class TestLogin {

    @Test
    /**
     * Descripción: El usuario intenta logearse con credenciales válidas
     * Función a testear: Login con datos correctos
     * Preparaciones previas: Abrir el programa
     * Ejecución del test (pasos):  Rellenar campo de usuario y contraseña con datos correctos
     * Resultado esperado: Acceso a la vista general
     */
    public void shouldInitCorrectly() {
        LoginModel loginModel = new LoginModel();
        Assert.assertTrue(loginModel.iniciarSession("root", "root"));
    }
}
