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

    public double calculate14Formula(double x) {
        double result =(Math.sqrt(3d*Math.sin(x)-Math.sin(Math.toRadians(3*x)))+Math.cbrt(Math.exp(1.3*x)+Math.exp(-1.3*x)))*1d/Math.abs(x+5d/2d);
//        TODO implement formula 14
        return result;
    }

    public double calculate15Formula(double x) {
        double result = (Math.abs(x*Math.log(x)-4)*Math.sqrt(x))*1d/Math.pow(Math.exp(4*x-1), 1d/5d);
//        TODO implement formula 15
        return result;
    }

    public double calculate16Formula(double x) {
        double result = Math.cbrt(Math.exp(2*x)*Math.sqrt(x)-((x+1d/3d)/x))*Math.abs(Math.cos(Math.toRadians(2.5*x)));
//        TODO implement formula 16
        return result;
    }

    public double calculate17Formula(double x) {
        double result = (Math.pow(x,3)/3)-(Math.exp(x)*Math.log(Math.abs(Math.pow(1.3,3)+Math.pow(x,3))))+4d/3d;
//        TODO implement formula 17
        return result;
    }

    public double calculate18Formula(double x) {
        double result = (Math.abs(7.2-10*x)/Math.cbrt(Math.pow(x,2)+Math.exp(x)))*Math.atan((4*(x/3))/Math.sqrt(Math.pow(1.1,3)+Math.pow(x,2)));
//        TODO implement formula 18
        return result;
    }

    public double calculate19Formula(double x) {
        double result = Math.acos(Math.tan(Math.toRadians(5*x/Math.PI))+(Math.pow(x,3.2)/28));
//        TODO implement formula 19
        return result;
    }

    public double calculate20Formula(double x) {
        /*
        натуральный логарифм в квадрате - Math.E в квадрате  https://socratic.org/questions/is-lnx-2-equivalent-to-ln-2-x     https://www.quora.com/Can-we-write-ln-2-x-as-2-ln-x
         */

        double result = (Math.cbrt(Math.pow(Math.exp(x), 2)) + Math.tan(Math.cos(Math.toRadians(Math.PI*x))))*Math.abs(Math.log(x/10.5+1d/3d));
//        TODO implement formula 20
        return result;
    }

    public double calculate21Formula(double x) {
        double result = (Math.pow(Math.log(x), 1d/4d)+Math.acos(Math.toRadians(x+3d)))*(1d/Math.abs(x+2d*Math.pow(x,2d)));
//        TODO implement formula 21
        return result;
    }

    public double calculate22Formula(double x) {
        double result = Math.asin(Math.toRadians(Math.log(x)/(Math.pow(x,2)+5*x+1)))-(Math.pow(x,3.2)/28);
//        TODO implement formula 22
        return result;
    }

    public double calculate23Formula(double x) {
        double result = Math.acos(Math.tan(Math.toRadians(5*x/Math.PI)))+(Math.pow(x,5.7)/23);
//        TODO implement formula 23
        return result;
    }

    public double calculate24Formula(double x) {
        double result = Math.atan(Math.toRadians(Math.abs(8.3-21*Math.pow(x,2)-0.8*x)/Math.cbrt(2.5+(1d/Math.pow(x,2)))));
//        TODO implement formula 24
        return result;
    }

    public double calculate25Formula(double x) {
        double result = Math.pow(Math.log(Math.acos(Math.toRadians(Math.abs(Math.pow(x,3.4)+2.5*Math.pow(x,1.2)-0.7)/Math.cbrt(Math.exp(2.5*x))))),1d/4d);
//        TODO implement formula 25
        return result;
    }

    public double calculate26Formula(double x) {
        double result = Math.log(Math.abs(Math.sin(Math.toRadians(x))))+2*Math.pow(Math.E,x)+2*Math.cos(Math.toRadians(Math.abs(x)))+2;
//        TODO implement formula 26
        return result;
    }
}