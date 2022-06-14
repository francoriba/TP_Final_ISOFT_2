import Controller.LoginController;
import Interfaz.LoginInterfaz;
import com.mysql.cj.log.Log;
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
        LoginController loginController = new LoginController();
        loginController.login(new LoginInterfaz(), "root", "toor");
    }
}
