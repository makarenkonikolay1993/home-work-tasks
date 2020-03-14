package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] fibo = new int[number];
        fibo[0]=0;
        fibo[1]=1;

        for(int i = 2; i < fibo.length; i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }

        return fibo;
    }

}
