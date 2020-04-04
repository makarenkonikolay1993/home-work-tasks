package com.hillel.lecture_10;

import com.hillel.lecture_9.LandlinePhone;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalcTest {

    private EngineerCalc engineerCalc = new EngineerCalc();
    private TrigonometricCalc trigonometricCalc = new TrigonometricCalc();

    @Test
    public void engPower(){

        double expectedResult = 4.0;

        assertEquals(engineerCalc.power(2,2), expectedResult);
    }

    @Test
    public void sinusDegrees(){
        assertEquals(engineerCalc.sinusInDegrees(90), 1.0);
    }

    @Test
    public void sinusDegreesTwo(){
        assertEquals(engineerCalc.sinusInDegrees(90), trigonometricCalc.sinusInDegrees(90));
    }

    @Test
    public void cotangens(){
        assertEquals(trigonometricCalc.cotangensInRadians(10),1.54235104535692);
    }

    @Test
    public void plus(){
        assertEquals(trigonometricCalc.plus(5,2), engineerCalc.plus(5,2));
    }

    @Test
    public void minus(){
        assertEquals(trigonometricCalc.minus(5,2), engineerCalc.minus(5,2));
    }

    @Test
    public void multiply(){
        assertEquals(trigonometricCalc.multiply(5,2), engineerCalc.multiply(5,2));
    }

    @Test
    public void divide(){
        assertEquals(trigonometricCalc.divide(5,2), engineerCalc.divide(5,2));
    }

    @Test
    public void factorial(){
        assertEquals(engineerCalc.factorial(5), 120.0);
    }

    @Test
    public void percent(){
        assertEquals(engineerCalc.percent(100,10), 10.0);
    }


}
