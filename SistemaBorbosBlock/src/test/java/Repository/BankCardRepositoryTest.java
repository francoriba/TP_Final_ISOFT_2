/*
package Repository;

import Entity.BankCardEntity;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class BankCardRepositoryTest {
    @Test
    //Test case ID: CPF 006
    public  void GuardarRegistroPagoOnline(){
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
        */
/*Creo una entidad de prueba*//*

        BankCardEntity bankCardEntity = new BankCardEntity(
                "Banco Nacion",
                "7123589548",
                "316",
                "05/27" );


        */
/*Creo el repositorio y le guardo la entity de prueba*//*

        BankCardRepository  bankCardRepository  = new BankCardRepository();
        bankCardRepository.save(bankCardEntity);

        ArrayList<BankCardEntity> testList = new ArrayList<BankCardEntity>();
        testList.add(bankCardEntity);
        
        */
/*Busco en la base de  datos con   findAll que me devuelve todas las entidades que  tengo
        , la que tenga el  mismo numero de tarjeta que  la de mi testList.get(0), es  a  la que  le
        hago el assserTrue para ver que tengan efectivamente  el mismo numero de tarjeta, con lo cual
         verifico que me esta  trayendo  correctamente  las tarjetas*//*


        int numEntidadPrueba=0;
        ArrayList<BankCardEntity> entities = (ArrayList<BankCardEntity>) bankCardRepository.findAll();
        for (int i = 0; i < entities.size(); i++) {
            if( entities.get(i).getNumber() == testList.get(0).getNumber() ){
               numEntidadPrueba=i;
               break;
            }
        }
        System.out.println(bankCardRepository.findAll().get(numEntidadPrueba).getNumber());
        System.out.println(testList.get(0).getNumber());

        assertTrue(bankCardRepository.
                   findAll().
                   get(numEntidadPrueba).getNumber().
                   equals( testList.get(0).getNumber()) );
    }
}*/
