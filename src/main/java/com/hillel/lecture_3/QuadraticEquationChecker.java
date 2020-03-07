package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";
        double rootOne = 0;
        double rootTwo = 0;
        double rootOnlyOne = 0;

        double D = Math.pow(b,2)-4*a*c;
        if (a == 0){
            result="The 'a' coefficient should not be zero!";
        } else{
            if (D>0){
                rootOne = (-b+Math.sqrt(D))/(2*a);
                rootTwo = (-b-Math.sqrt(D))/(2*a);
                result="Discriminant: " + D + ", x1: " + rootOne + ", x2: " + rootTwo;
            } else if(D==0){
                rootOnlyOne = -b/(2*a);
                result="Two real, identical roots: [x1 && x2] = " + rootOnlyOne;
            } else{
                result="No roots on the set of real numbers!";
            }
        }


        return result;
    }

}
