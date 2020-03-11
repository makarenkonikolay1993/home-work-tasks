package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";

        double a1 = Math.abs(a);
        double b1 = Math.abs(b);

        if(a1==b1){
            result="The number " + a + " and " + b + " are equals by magnitude!";
        } else if(a1>b1){
            result="The number " + a + " has the greatest magnitude!";
        } else if(a1<b1){
            result="The number " + b + " has the greatest magnitude!";
        }



        return result;
    }
}
