package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";

        double storonaKvadrata=Math.sqrt(squareArea);
        double radius = Math.sqrt(circleArea/Math.PI);

        if (storonaKvadrata/2 >= radius){
            result="The circle is in the square";
        } else{
            result="The circle is not in the square";
        }

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";

        double storonaKvadrata=Math.sqrt(squareArea);

        double diagonale = Math.sqrt(Math.pow(storonaKvadrata,2)+Math.pow(storonaKvadrata,2));

        double diametr = 2*Math.sqrt(circleArea/Math.PI);

        result = (diametr >= diagonale) ? "The square is in the circle" : "The square is not in the circle";

//        if (diametr >= diagonale){
//            result="The square is in the circle";
//        } else{
//            result="The square is not in the circle";
//        }

        return result;
    }

}
