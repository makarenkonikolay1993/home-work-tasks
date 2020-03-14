package com.hillel.lecture_4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая выводит реверсивную строку (использовать массив символов - char string[])
 */
public class ReverseStringTestTask {


    private ReverseStringChecker reverseStringChecker = new ReverseStringChecker();

    @Test(dataProvider = "stringProvider")
    public void palindromeTest(String word, String expectedResult) {
        assertEquals(reverseStringChecker.getReversString(word), expectedResult); ;
    }


    @DataProvider(name = "stringProvider")
    public static Object[][] stringProvider() {
        return new Object[][] {
                { "1234567", "7654321"},
                { "string", "gnirts"},
                { "boolean", "naeloob"},
                { "double", "elbuod"},
                { "object", "tcejbo"},
        };
    }
}
