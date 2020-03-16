package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] fibonacciArray = new int[number];
        fibonacciArray[0]=0;
        fibonacciArray[1]=1;

        for(int i = 2; i < fibonacciArray.length; i++){
            fibonacciArray[i]=fibonacciArray[i-1]+fibonacciArray[i-2];
        }

        return fibonacciArray;
    }

}
