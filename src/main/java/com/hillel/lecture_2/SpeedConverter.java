package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {

    public static final double KM_MI_COEF = 0.6214;


    @Step
    public double speedKmToMi(double speedKm) {
//        TODO implements result
        double result = speedKm* KM_MI_COEF;
        return result;
    }

    @Step
    public double speedMiToKm(double speedMi) {
//        TODO implements result
        double result = speedMi/ KM_MI_COEF;
        return result;
    }

}
