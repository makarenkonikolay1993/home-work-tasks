package com.hillel.lecture_10;

import com.hillel.lecture_9.LandlinePhone;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalcTest {

    private EngineerCalc engineerCalc = new EngineerCalc();
    private TrigonometricCalc trigonometricCalc = new TrigonometricCalc();

    @Test
    public void EngCalcExtends(){
        boolean result=false;


        if (engineerCalc instanceof Calc){
            result=true;
        }

        assertEquals(result, true);
    }


    @Test
    public void TrigCalcExtends(){
        boolean result = false;


        if (trigonometricCalc instanceof Calc){
            result=true;
        }

        assertEquals(result, true);
    }

    @Test
    public void EngPower(){

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


}
