package View;


import Model.ApacheGenerator;
import View.passGenerator;
import java.time.Duration;
import java.time.Instant;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passGeneratorTest {

    //Test case ID: CPNF 003
    @Test
    public void generarPass(){


        ApacheGenerator apache = new ApacheGenerator(5);
        assertNotNull(apache.generator());
    }

    //Test case ID: CPNF 007
    @Test
    public   void GenerarPasswordEnMenosDe200ms(){

        /*Comienzo a  medir el  tiempo*/
        long start = System.currentTimeMillis();

        /*Genero  la contrasena*/
        ApacheGenerator apache = new ApacheGenerator(5);
        apache.generator();

        /*Calculo el tiempo que   tardo*/
        long end = System.currentTimeMillis();
        long  time = end-start;

        /*Reviso que  haya tardado menos de 200ms*/
        assertTrue(time<200);
    }


}