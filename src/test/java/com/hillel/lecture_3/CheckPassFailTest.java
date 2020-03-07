package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 *  Написать программу с названием “CheckPassFail”, которая выводит PASS если переменная
 *  “mark” типа int больше или равно 50 или вывести “FAIL” в противном случае.
 *  Программа всегда должна перед выходом печатать “DONE”
 */

public class CheckPassFailTest {

    private PassFailChecker passFailChecker = new PassFailChecker();

    @Test
    public void checkFailTest() {
        int mark = 5;

        assertEquals(passFailChecker.checkNumber(mark), "FAIL");
    }

    @Test
    public void checkPassTest() {
        int mark = 70;

        assertEquals(passFailChecker.checkNumber(mark), "PASS");
    }

    @Test
    public void checkPassBoundaryTest() {
        int mark = 50;

        assertEquals(passFailChecker.checkNumber(mark), "PASS");
    }
}
