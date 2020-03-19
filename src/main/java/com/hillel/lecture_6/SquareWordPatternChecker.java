package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = word;

        int size = result.length();

        String temp = result;
        for (int i = 0 ; i < size-1; i++){

            char first = temp.charAt(0);
            temp = temp.substring(1)+first;
            result+=", " + temp;
        }

        return result;
    }


}
