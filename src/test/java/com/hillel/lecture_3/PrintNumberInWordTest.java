package com.hillel.lecture_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”, “TWO”,
 * …, “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9, или любой
 * другой. Решить задачу двумя способами:
 * 1) с использованием if..else if
 * 2) с использованием switch-case
 */

public class PrintNumberInWordTest {

    private NumberInWordChecker numberInWordChecker= new NumberInWordChecker();

    @Test(dataProvider = "numberProvider")
    public void checkTestInIfElse(int number, String stringNumber) {
        assertEquals(numberInWordChecker.getNumberIfElse(number), stringNumber) ;
    }

    @Test(dataProvider = "numberProvider")
    public void checkInSwitchCase(int number, String stringNumber) {
        assertEquals(numberInWordChecker.getNumberSwitchCase(number), stringNumber) ;
    }

    @DataProvider(name = "numberProvider")
    public static Object[][] numberProvider() {
        return new Object[][] {
                { 1, "ONE" },
                { 2, "TWO" },
                { 3, "THREE" },
                { 4, "FOUR" },
                { 5, "FIVE" },
                { 6, "SIX" },
                { 7, "SEVEN" },
                { 8, "EIGHT" },
                { 9, "NINE" },
                { 100, "OTHER" },
        };
    }
}
