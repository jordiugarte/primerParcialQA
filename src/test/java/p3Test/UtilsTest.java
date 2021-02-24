package p3Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import parcial1.filaB.p3.Ej3Utils;

public class UtilsTest {

    private Ej3Utils ej3Utils;

    @Before
    public void before() {
        ej3Utils = new Ej3Utils();
    }

    @Test(expected = Exception.class)
    public void verify_ci_empty_exception() throws Exception {
        boolean actualResult = ej3Utils.isCorrectCI("");
        Assert.assertEquals("ERROR! ", new Exception("ci no puede ser vacia"), actualResult);
    }

    @Test(expected = Exception.class)
    public void verify_ci_cero_exception() throws Exception {
        boolean actualResult = ej3Utils.isCorrectCI("0");
        Assert.assertEquals("ERROR! ", new Exception("ci no puede ser 0"), actualResult);
    }

    @Test(timeout = 2000)
    public void verify_ci_timeout() throws Exception {
        boolean actualResult = ej3Utils.isCorrectCI("5962971");
        Assert.assertEquals("ERROR! ", true, actualResult);
    }
}
