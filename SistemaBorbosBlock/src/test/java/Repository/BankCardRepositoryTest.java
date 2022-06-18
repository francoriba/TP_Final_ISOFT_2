package Repository;

import Entity.BankCardEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BankCardRepositoryTest {
    @Test
    //Test case ID: CPF 006
    public  void GenerarRegistroPagoOnline(){
        BankCardEntity bankCardEntity = new BankCardEntity("Bancor",
                                                           "5123589548",
                                                         "516",
                                                       "06/24" );
        BankCardRepository  bankCardRepository  = new BankCardRepository();
        assertTrue(bankCardRepository.save(bankCardEntity)) ;
    }

    @Test
    //Test case ID: CPF 007
    public void VisualizarGestorPagoOnline(){
        
    }

}