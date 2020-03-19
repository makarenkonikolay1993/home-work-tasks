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
        String partOne = strings[0];
        String partTwo = strings[1];
        Pattern patternPartOne = Pattern.compile("[A-Z]{2}[\\d]{1}[A-Z]{3}[\\d]{2}[A-Z]{2}[\\d]{1}[A-Z]{2}[\\d]{1}[A-Z]{3}[\\d]{1}[A-Z]{2}$");
        Pattern patternPartTwo = Pattern.compile("[\\d]+");

        if ( patternPartOne.matcher(partOne).find() && patternPartTwo.matcher(partTwo).find() ){

            String s = code.replaceAll("[A-Z]", "");
            strings = s.split(" ");

            int number = Integer.parseInt(strings[0]);
            int valid = Integer.parseInt(strings[1]);
            int result = 1;

            while(number > 0){
                result *= number % 100;
                number /= 100;
            }

            if (result == valid){
                isValid = true;
            }
        }
        return isValid;
    }
}
