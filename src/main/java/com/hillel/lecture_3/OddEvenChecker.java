package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {

    @Step
    public String checkNumber(int number) {

//        TODO implements result
        String result = "";

        result = (number%2==0)? "Even Number" : "Odd Number";

//        if(number%2 ==0){
//            result="Even Number";
//        } else{
//            result="Odd Number";
//        }

        return result;
    }
}
