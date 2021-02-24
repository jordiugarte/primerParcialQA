package solucionParcial1.filaA;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parcial1.filaA.p2.Ej2Notas;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class Ejercicio2Test {

    private int value;
    private String expectedResult;

    public Ejercicio2Test(int value ,String expectedResult){
        this.value=value;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]>objects= new ArrayList<>();
        objects.add(new Object[]{-1,"VALOR INCORRECTO"});
        objects.add(new Object[]{0,"REGULAR"});
        objects.add(new Object[]{1,"REGULAR"});
        objects.add(new Object[]{49,"REGULAR"});
        objects.add(new Object[]{50,"REGULAR"});
        objects.add(new Object[]{51,"REGULAR"});
        objects.add(new Object[]{99,"EXCELENTE"});
        objects.add(new Object[]{100,"EXCELENTE"});
        objects.add(new Object[]{70,"REGULAR"});
        objects.add(new Object[]{80,"BUENO"});
        objects.add(new Object[]{90,"MUY BUENO"});

        return objects;
    }


    @Test
    public void verify_suma_all_values(){
        Ej2Notas notas= new Ej2Notas();
        String actualResult=  notas.notasCualitativas(this.value);
        Assert.assertEquals("ERROR ! la suma es incorrecta",this.expectedResult,actualResult);
    }



}
