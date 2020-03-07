package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        //result=maximminim.maximum(c, maximminim.maximum(a,b)); //Использовал самописный метод вместо Math.max()
        if (a == b && a == c){
        } else if (a > b && a > c){
            result = a;
        } else if (b > a && b > c){
            result = b;
        } else{
            result = c;
        }
        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a == b && a == c) {
        } else if (a > b && a < c){
            result = a;
        } else if (b > a && b < c){
            result = b;
        } else{
            result = c;
        }
        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        //result=maximminim.minimum(c, maximminim.minimum(a,b)); //Использовал самописный метод вместо Math.min()

        if (a == b && a == c){
        } else if (a < b && a < c){
            result = a;
        } else if (b < a && b < c){
            result = b;
        } else{
            result = c;
        }
        return result;
    }


}

class maximminim {
    public static int maximum(int a, int b) {
        int result = 0;
        if (a == b) {
        } else if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

    public static int minimum(int a, int b) {
        int result = 0;
        if (a == b) {
        } else if (a < b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }
}
