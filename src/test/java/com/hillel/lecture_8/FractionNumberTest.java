package com.hillel.lecture_8;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FractionNumberTest {


    @Test
    public void FractionNumbersPlus() {

        FractionNumbersChecker f1 = new FractionNumbersChecker(2,4);
        FractionNumbersChecker f2 = new FractionNumbersChecker(1,4);
        FractionNumbersChecker expectedResult = new FractionNumbersChecker(3,4);
        FractionNumbersChecker f3 = f2.plus(f1);




        assertEquals(f3, expectedResult);
    }

    @Test
    public void FractionNumbersMinus() {
        FractionNumbersChecker f1 = new FractionNumbersChecker(2,4);
        FractionNumbersChecker f2 = new FractionNumbersChecker(1,4);
        FractionNumbersChecker expectedResult = new FractionNumbersChecker(-1,4);
        FractionNumbersChecker f3 = f2.minus(f1);


        assertEquals(f3, expectedResult);
    }

    @Test
    public void FractionNumbersDivide() {
        FractionNumbersChecker f1 = new FractionNumbersChecker(2,4);
        FractionNumbersChecker f2 = new FractionNumbersChecker(1,4);
        FractionNumbersChecker expectedResult = new FractionNumbersChecker(1,2);
        FractionNumbersChecker f3 = f2.divide(f1);


        assertEquals(f3, expectedResult);
    }

    @Test
    public void FractionNumbersMultiply() {
        FractionNumbersChecker f1 = new FractionNumbersChecker(2,4);
        FractionNumbersChecker f2 = new FractionNumbersChecker(1,4);
        FractionNumbersChecker expectedResult = new FractionNumbersChecker(1,8);
        FractionNumbersChecker f3 = f2.multiply(f1);


        assertEquals(f3, expectedResult);
    }

}
