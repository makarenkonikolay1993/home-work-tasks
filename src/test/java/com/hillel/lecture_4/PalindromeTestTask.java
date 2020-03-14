package com.hillel.lecture_4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая проверяет является ли строка палиндромом (использовать массив символов - char string[])
 */
public class PalindromeTestTask {

    private PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test(dataProvider = "palindromeProvider")
    public void palindromeTest(String word, boolean expectedResult) {
        assertEquals(palindromeChecker.isPalindrome(word), expectedResult); ;
    }


    @DataProvider(name = "palindromeProvider")
    public static Object[][] palindromeProvider() {
        return new Object[][] {
                { "1256521", true},
                { "burger", false},
                { "civic", true},
                { "trololo", false},
                { "rotator", true},
                { "stats", true},
        };
    }
}
