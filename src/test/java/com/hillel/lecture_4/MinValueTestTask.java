package com.hillel.lecture_4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая находит минимальное значение в массиве
 */
public class MinValueTestTask {

    private MinValueChecker minValueChecker = new MinValueChecker();

    @Test
    public void checkMinValueTest() {
        int[] data = { 1, -5, 10, 45, -34, 0, 0, 24, 2 };
        int expectedResult = -34;

        assertEquals(minValueChecker.getValue(data), expectedResult) ;
    }

    @Test
    public void checkMinValueTest2() {
        int[] data = { 1234, 5234, 234, 24689, 24, 2789, 0, 78, 6295 };
        int expectedResult = 0;

        assertEquals(minValueChecker.getValue(data), expectedResult) ;
    }

}
