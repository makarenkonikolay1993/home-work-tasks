package com.hillel.lecture_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу с названием “PrintDayInWord”, которая печатает “Sunday”, “Monday”,
 * …. “Saturday”, если переменная “day” типа int будет 1, 2, 3, 4 … 7. В противном случае
 * программа должна вывести “Not a valid day”. Решить задачу двумя способами:
 * 1) с использованием if..else if
 * 2) с использованием switch-case
 */

public class PrintDayInWord {

    private DayInWordChecker dayInWordChecker = new DayInWordChecker();

    @Test(dataProvider = "daysProvider")
    public void checkTestInIfElse(int number, String day) {
        assertEquals(dayInWordChecker.getDayIfElse(number), day) ;
    }

    @Test(dataProvider = "daysProvider")
    public void checkInSwitchCase(int number, String day) {
        assertEquals(dayInWordChecker.getDaySwitchCase(number), day) ;
    }

    @DataProvider(name = "daysProvider")
    public static Object[][] daysProvider() {
        return new Object[][] {
                { 1, "Monday" },
                { 2, "Tuesday" },
                { 3, "Wednesday" },
                { 4, "Thursday" },
                { 5, "Friday" },
                { 6, "Saturday" },
                { 7, "Sunday" },
                { 8, "Not a valid day" },
        };
    }

}
