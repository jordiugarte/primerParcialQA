package p5Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import parcial1.filaB.p5.CambioMoneda;
import parcial1.filaB.p5.Util;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Util.class)
public class CambioMonedaTest {

    @Test
    public void verify_change() {
        int quantity = 100;
        String base = "$";
        String destiny = "Bs";
        int change = 7;

        PowerMockito.mockStatic(Util.class);
        Mockito.when(Util.obtenerTipoDeCambio(base, destiny)).thenReturn(change);
        CambioMoneda cambioMoneda = new CambioMoneda();
        String expectedResult = "La cantidad convertida fue : [700] Bs";
        String actualResult = cambioMoneda.saveInNewMoney(quantity, base, destiny);
        Assert.assertEquals("ERROR! ", expectedResult, actualResult);
    }
}
