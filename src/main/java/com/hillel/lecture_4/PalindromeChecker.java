package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        char[] arrayChar = value.toCharArray();


//      char[] arrayCharTwo = new char[arrayChar.length];
//        for (int i = 0; i < arrayChar.length; i++) {
//            arrayCharTwo[i] = arrayChar[arrayChar.length - i - 1];
//        }

        boolean isPalindrome=true;

        int size = arrayChar.length;

        for(int i = 0 ; i < size/2; i++){
            if (arrayChar[i] != arrayChar[size-i-1]){
                isPalindrome=false;
                break;
            }
        }

        return isPalindrome;

        //return Arrays.equals(arrayChar, arrayCharTwo);
    }

}
