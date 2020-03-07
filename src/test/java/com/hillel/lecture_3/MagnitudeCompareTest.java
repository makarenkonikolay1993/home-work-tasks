package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу которая будет сравнивать величину (magnitude) двух чисел. Например,
 * если одно число = 3, а второе число = -9, программа должна выдать, что число -9 имеет
 * большую величину.
 */

public class MagnitudeCompareTest {

    private MagnitudeChecker magnitudeChecker = new MagnitudeChecker();

    @Test
    public void positiveGreatestMagnitudeTest() {
        double a = 58.44;
        double b = 58.45;

        assertEquals(magnitudeChecker.getGreatestNumberByMagnitude(a, b), "The number 58.45 has the greatest magnitude!");
    }

    @Test
    public void greatestMagnitudeTest() {
        double a = 3.5;
        double b = -9.1;

        assertEquals(magnitudeChecker.getGreatestNumberByMagnitude(a, b), "The number -9.1 has the greatest magnitude!");
    }

    @Test
    public void negativeGreatestMagnitudeTest() {
        double a = -8.57;
        double b = -10.1;

        assertEquals(magnitudeChecker.getGreatestNumberByMagnitude(a, b), "The number -10.1 has the greatest magnitude!");
    }

    @Test
    public void equalsMagnitudeTest() {
        double a = 3.5;
        double b = -3.5;

        assertEquals(magnitudeChecker.getGreatestNumberByMagnitude(a, b), "The number 3.5 and -3.5 are equals by magnitude!");
    }

}
