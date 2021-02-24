package p1Test;

import org.junit.*;
import parcial1.filaB.p1.Ej1UtilsNumeros;

public class PrimosTest{

    private Ej1UtilsNumeros ej1UtilsNumeros;

    @BeforeClass
    public static void beforeClass(){
        System.out.println(" ***** BEFORE CLASS");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println(" ****** AFTER CLASS");
    }

    @Before
    public void before() {
        ej1UtilsNumeros = new Ej1UtilsNumeros();
    }

    @After
    public void after(){
        System.out.println(" ----> AFTER METHOD");
    }

    @Test
    public void verify_prime_1(){
        Assert.assertEquals("ERROR! ", true, ej1UtilsNumeros.esPrimo(17));
    }

    @Test
    public void verify_prime_2(){
        Assert.assertEquals("ERROR! ", true, ej1UtilsNumeros.esPrimo(2));
    }

    @Test
    public void verify_prime_3(){
        Assert.assertEquals("ERROR! ", false, ej1UtilsNumeros.esPrimo(4));
    }
}
