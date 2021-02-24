package p6Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import p1Test.PrimosTest;
import p2Test.DegreesTest;
import p3Test.UtilsTest;
import p4Test.LoginTest;
import p5Test.CambioMonedaTest;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(
        {
                PrimosTest.class,
                DegreesTest.class,
                UtilsTest.class,
                LoginTest.class,
                CambioMonedaTest.class
        }

)
public class TestSuite {
}