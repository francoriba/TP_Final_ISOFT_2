package View;


import Model.ApacheGenerator;
import View.passGenerator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passGeneratorTest {

    //Test case ID: CPNF 003
    @Test
    public void generarPass(){

        ApacheGenerator apache = new ApacheGenerator(5);
        assertNotNull(apache.generator());
    }
}