package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double result = 1.1*Math.exp(-x)+Math.abs(Math.cos(Math.sqrt(Math.PI*x)))-3d/8d;
//        TODO implement formula 9
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double result = 1d/3d*Math.sqrt(Math.abs(Math.sin(x)))*Math.cbrt(Math.exp(0.12*x));
//        TODO implement formula 10
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = 2*Math.PI*x-Math.abs(Math.sin(Math.sqrt(10.5*x)))*(1/((Math.cbrt(Math.pow(x,2d))+(1d/7d))));
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = Math.log(Math.sqrt(Math.abs(2d-x))+1.2)*1/(2+Math.exp(-x))+Math.cbrt(2d/x);
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = (Math.pow(Math.exp(-2d+x), 1d/5d))*(1d/Math.sqrt(Math.pow(x,2)+Math.pow(x,4)+Math.log(Math.abs(x-3.14))));
//        TODO implement formula 13
        return result;
    }
}
