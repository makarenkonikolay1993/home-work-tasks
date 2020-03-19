package com.hillel.lecture_6;

import io.qameta.allure.Step;

import java.util.regex.Pattern;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;

        String[] strings = code.split(" ");

        //AX 6 BYU 56 UX 6 CV 6 bNT 7 NM
        if (Pattern.compile("[A-Z]{2}[0-9]{1}[A-Z]{3}[0-9]{2}[A-Z]{2}[0-9]{1}[A-Z]{2}[0-9]{1}[A-Z]{3}[0-9]{1}[A-Z]{2}$").matcher(strings[0]).find()
                && Pattern.compile("[0-9]+").matcher(strings[1]).find()){

            String s = code.replaceAll("[a-zA-Z]", "");
            strings = s.split(" ");

            int number = Integer.parseInt(strings[0]);
            int valid = Integer.parseInt(strings[1]);
            int result = 1;

            while(number>0){
                result*=number%100;
                number/=100;
            }

            if (result==valid){
                isValid=true;
            }
        }
        return isValid;
    }
}
