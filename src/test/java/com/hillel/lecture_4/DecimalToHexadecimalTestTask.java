package com.hillel.lecture_4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая перевод десятичные числа в шестнадцатеричные и наоборот.
 */
public class DecimalToHexadecimalTestTask {

    private DecimalToHexadecimalChecker decimalToHexadecimalChecker = new DecimalToHexadecimalChecker();

    @Test
    public void fromDecimalToHexadecimalTest() {
        String expectedResult = "1E0F3";

        assertEquals(decimalToHexadecimalChecker.fromDecimalToHexadecimal(123123), expectedResult) ;
    }

    @Test
    public void fromHexadecimalToDecimalTest() {
        int expectedResult = 8855064;

        assertEquals(decimalToHexadecimalChecker.fromHexadecimalToDecimal("871E18"), expectedResult) ;
    }
}
