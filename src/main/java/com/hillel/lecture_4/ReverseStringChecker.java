package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        char[] reverse = value.toCharArray();

        for(int i = 0 ; i < reverse.length/2; i++){
            char temp = reverse[i];
            reverse[i] = reverse[reverse.length-i-1];
            reverse[reverse.length-i-1]=temp;
        }



        return String.valueOf(reverse);
    }

}
