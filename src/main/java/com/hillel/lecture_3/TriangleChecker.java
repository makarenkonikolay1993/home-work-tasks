package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class TriangleChecker {

    @Step
    public String isTriangleIsosceles(int a, int b, int c) {

//        TODO implements result
        String result = "";

//        result = (a == b && a !=c) ? "Isosceles triangle!"
//                : (a == c && a != b) ? "Isosceles triangle!"
//                : (b == c && b != a) ? "Isosceles triangle!"
//                : "No isosceles triangle!";

//        result = ( (a == b && a !=c) || (a == c && a != b) || (b == c && b != a))
//                ? "Isosceles triangle!" : "No isosceles triangle!";

        if ( (a == b && a !=c) || (a == c && a != b) || (b == c && b != a) ){
            result="Isosceles triangle!";
        } else {
            result="No isosceles triangle!";
        }

        return result;
    }
}
