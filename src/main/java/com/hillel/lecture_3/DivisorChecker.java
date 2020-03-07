package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    @Step
    public String checkDivisor(int divisor, int number) {
        //        TODO implements result
        String result = "";

        /*
        * Здесь удобнее без тернарных операторов, т.к. пишется большая строка.
         */
        if (divisor%number==0){
            result="The number " + number + " is divisor of the number " + divisor;
        } else{
            result="The number " + number + " is not divisor of the number " + divisor;
        }

        return result;
    }
}
