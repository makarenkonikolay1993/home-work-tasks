package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел
 * большее, а какое меньшее. Программа должна вывести что-то типа “The number x has the
 * greatest value”. Где “x” одно из чисел
 */

public class NumberCompare {

    private NumberCompareChecker numberCompareChecker = new NumberCompareChecker();


    @Test
    public void checkGreatestValuePositiveNumber() {
        int a = 15;
        int b = 27;

        assertEquals(numberCompareChecker.getGreatestNumber(a, b), "Number 27 has greatest value!");
    }

    @Test
    public void checkGreatestValueNegativeNumber() {
        int a = -3;
        int b = -5;

        assertEquals(numberCompareChecker.getGreatestNumber(a, b), "Number -3 has greatest value!");
    }

    @Test
    public void checkEqualsValue() {
        int a = 19;
        int b = 19;

        assertEquals(numberCompareChecker.getGreatestNumber(a, b), "Numbers 19 and 19 are equals!");
    }
}
