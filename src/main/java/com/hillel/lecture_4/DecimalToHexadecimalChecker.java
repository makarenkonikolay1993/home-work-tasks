package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";

        String digits = "0123456789ABCDEF";

        while (value > 0){
            int digit = value%16;
            result=digits.charAt(digit)+result;
            value/=16;
        }
        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        int result = 0;

        String digits = "0123456789ABCDEF";

        value = value.toUpperCase();

        for (int i = 0; i < value.length(); i++){
            char c = value.charAt(i);
            int d = digits.indexOf(c);
            result = 16*result+d;
        }

        return result;
    }
}
