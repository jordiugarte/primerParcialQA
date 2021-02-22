package ejercicio3Test;

import calculadotaPowerMockito.HelperCalculadoraService;
import ejercicio3.Asfi;
import ejercicio3.AsfiUtil;
import ejercicio3.Credito;
import ejercicio3.Credito2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

//@RunWith(value=Parameterized.class)
//Paso 1 para metodos estaticos
@RunWith(PowerMockRunner.class)
//Paso 2 para metodos estaticos
@PrepareForTest(AsfiUtil.class)
public class CreditTest2 {

//    private int ci;
//    private int credit;
//    private boolean expectedMock;
//    private String expectedResult;
//
//    public CreditTest2(int ci, int credit , String expectedResult, boolean expectedMock){
//        this.ci=ci;
//        this.credit = credit;
//        this.expectedResult=expectedResult;
//        this.expectedMock=expectedMock;
//
//
//    }
//
//    @Parameterized.Parameters
//    public static Iterable<Object[]> getData(){
//        List<Object[]> objects= new ArrayList<>();
//        objects.add(new Object[]{989898,0,"Credito Incorrecto",true});
//        objects.add(new Object[]{989898,1    ,"el interes es del 15%",true});
//        objects.add(new Object[]{989898,2    ,"el interes es del 15%",true});
//        objects.add(new Object[]{989898,499  ,"el interes es del 15%",true});
//        objects.add(new Object[]{989898,500  ,"el interes es del 15%",true});
//        objects.add(new Object[]{989898,501  ,"el interes es del 15%",true});
//        objects.add(new Object[]{989898,9999 ,"el interes es del 15%",true});
//        objects.add(new Object[]{989898,10000,"el interes es del 15%",true});
//        objects.add(new Object[]{989898,10001,"el interes es de 13%" ,true});
//        objects.add(new Object[]{989898,10002,"el interes es de 13%" ,true});
//        objects.add(new Object[]{989898,14999,"el interes es de 13%" ,true});
//        objects.add(new Object[]{989898,15000,"el interes es de 13%" ,true});
//        objects.add(new Object[]{989898,15001,"el interes es de 13%" ,true});
//        objects.add(new Object[]{989898,19999,"el interes es de 13%" ,true});
//        objects.add(new Object[]{989898,20000,"el interes es de 13%" ,true});
//        objects.add(new Object[]{989898,20001,"el interes es de 10%" ,true});
//        objects.add(new Object[]{989898,20002,"el interes es de 10%" ,true});
//        objects.add(new Object[]{989898,24999,"el interes es de 10%" ,true});
//        objects.add(new Object[]{989898,25000,"el interes es de 10%" ,true});
//        objects.add(new Object[]{989898,25001,"el interes es de 10%" ,true});
//        objects.add(new Object[]{989898,29999,"el interes es de 10%" ,true});
//        objects.add(new Object[]{989898,30000,"el interes es de 10%" ,true});
//        objects.add(new Object[]{989898,30001,"el interes es de 5%"  ,true});
//        objects.add(new Object[]{100001,1,    "Usuario no esta habilitado para prestamos",false});
//        objects.add(new Object[]{100001,10001,"Usuario no esta habilitado para prestamos",false});
//        objects.add(new Object[]{100001,20001,"Usuario no esta habilitado para prestamos",false});
//        objects.add(new Object[]{100001,30001,"Usuario no esta habilitado para prestamos",false});
//
//        return objects;
//    }

    @Test
    public void verify_calculate_credit(){
        // PASO 3
        PowerMockito.mockStatic(AsfiUtil.class);
        // PASO 4
        Mockito.when(AsfiUtil.isUserEnable(989898)).thenReturn(true);
        Credito2 credito= new Credito2();
        String actualResult= credito.calculateCredito(989898,1);
        Assert.assertEquals("ERROR! ","el interes es del 15%",actualResult);
    }

}
