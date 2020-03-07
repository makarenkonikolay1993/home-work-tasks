package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Даны три различных числа. Определить, какое из них (первое, второе или третье)
 * самое большое
 * самое маленькое
 * является средним
 */

public class MaxMinAverageTest {

    private MaxMinAverageChecker maxMinAverageChecker = new MaxMinAverageChecker();

    @Test
    public void checkMaxNumber() {
        int a = 0;
        int b = 5;
        int c = 10;

        assertEquals(maxMinAverageChecker.getMaxNumber(a, b, c), c);
    }

    @Test
    public void checkAverageNumber() {
        int a = 0;
        int b = 5;
        int c = 10;

        assertEquals(maxMinAverageChecker.getAverageNumber(a, b, c), b);
    }

    @Test
    public void checkMinNumber() {
        int a = 0;
        int b = 5;
        int c = 10;

        assertEquals(maxMinAverageChecker.getMinNumber(a, b, c), a);
    }

    @Test
    public void checkThanAllNumberShouldNotBeEquals() {
        int a = 9;
        int b = 9;
        int c = 9;

        assertEquals(maxMinAverageChecker.getMaxNumber(a, b, c), 0);
        assertEquals(maxMinAverageChecker.getAverageNumber(a, b, c), 0);
        assertEquals(maxMinAverageChecker.getMinNumber(a, b, c), 0);
    }

}
