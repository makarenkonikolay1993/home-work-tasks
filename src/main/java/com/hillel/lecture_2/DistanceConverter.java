package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    public static final double INCHES_COEF = 39.37;
    public static final double MILES_COEF = 1.609;

    @Step
    public double metersToInches(double meters) {
//        TODO implements result
        double result = meters* INCHES_COEF;
        return result;
    }

    @Step
    public double inchesToMeters(double inches) {
//        TODO implements result
        double result = inches/ INCHES_COEF;
        return result;
    }

    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result
        double result = miles* MILES_COEF;
        return result;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double result = kilometres/ MILES_COEF;
        return result;
    }
}
