package com.hillel.lecture_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Проверить, принадлежит ли число введенное с клавиатуры, интервалу (-5;3).
 */

public class BelongsToIntervalTest {

    private BelongsToIntervalChecker belongsToIntervalChecker = new BelongsToIntervalChecker();

    @Test(dataProvider = "numbersProvider")
    public void checkNumberInInterval(int from, int to, int number, String message) {
        assertEquals(belongsToIntervalChecker.checkNumberInInterval(from, to, number), message);
    }

    @DataProvider(name = "numbersProvider")
    public static Object[][] numbersProvider() {
        return new Object[][] {
                { -5, 3, -1, "Number -1 belong to interval [-5;3]"},
                { -5, 3, 3, "Number 3 belong to interval [-5;3]"},
                { -5, 3, 6, "Number 6 not belong to interval [-5;3]" },
                { -5, 3, 4, "Number 4 not belong to interval [-5;3]" }
        };
    }
}
