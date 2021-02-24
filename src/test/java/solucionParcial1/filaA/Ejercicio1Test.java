package solucionParcial1.filaA;

import org.junit.*;
import parcial1.filaA.p1.Ej1UtilsNumeros;

public class Ejercicio1Test {

    Ej1UtilsNumeros utilsNumeros;

    @BeforeClass
    public static void beforeClass(){
        System.out.println(" *****BEFORE CLASS");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println(" ****** AFTER CLASS");
    }

    @Before
    public void before(){
        utilsNumeros= new Ej1UtilsNumeros();
        System.out.println(" ----> BEFORE METHOD");
    }
    @After
    public void after(){
        System.out.println(" ----> AFTER METHOD");
    }

    @Test
    public void verify_invertir_numero_impar(){
        int actualResult=utilsNumeros.invertirNumero(987);
        int expectedResult=789;
        Assert.assertEquals("ERROR Numero Invertido",expectedResult,actualResult);
    }

    @Test
    public void verify_invertir_numero_par(){
        int actualResult=utilsNumeros.invertirNumero(842);
        int expectedResult=248;
        Assert.assertEquals("ERROR Numero Invertido",expectedResult,actualResult);
    }

    @Test
    public void verify_invertir_numero_0(){
        int actualResult=utilsNumeros.invertirNumero(0);
        int expectedResult=0;
        Assert.assertEquals("ERROR Numero Invertido",expectedResult,actualResult);
    }


}
