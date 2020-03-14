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
        /**
         * Разложение синуса третьей степени по ссылке:
         * http://www.math24.ru/%D1%81%D1%82%D0%B5%D0%BF%D0%B5%D0%BD%D0%B8-%D1%82%D1%80%D0%B8%D0%B3%D0%BE%D0%BD%D0%BE%D0%BC%D0%B5%D1%82%D1%80%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D1%85-%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%B9.html
         */
        double result =(Math.sqrt(((Math.sin(x/2)-Math.sin((3d*x))/4)))+Math.cbrt(Math.exp(1.3*x)+Math.exp(-1.3*x)))*(1d/Math.abs(x+5d/2d));
//        TODO implement formula 14
        return result;
    }

    public double calculate15Formula(double x) {
        double result = (Math.abs(x*Math.log(x)-4d)*Math.sqrt(x))*(1d/Math.pow(Math.exp(4*x-1), 1d/5d));
//        TODO implement formula 15
        return result;
    }

    public double calculate16Formula(double x) {
        double result = Math.cbrt(Math.exp(2d*x)*Math.sqrt(x)-((x+1d/3d)/x))*Math.abs(Math.cos(2.5*x));
//        TODO implement formula 16
        return result;
    }

    public double calculate17Formula(double x) {
        double result = (Math.pow(x,3)/3d)-(Math.exp(x)*Math.log(Math.abs(Math.pow(1.3,3)+Math.pow(x,3))))+4d/3d;
//        TODO implement formula 17
        return result;
    }

    public double calculate18Formula(double x) {
        /**
         * http://proglang.su/java/numbers-atan
         * https://stackoverflow.com/questions/27538695/java-strange-nan-in-a-double-while-using-math-acos
         */
        double result = (Math.abs(7.2-10*x)/Math.cbrt(Math.pow(x,2)+Math.exp(x)))*Math.atan(Math.tan((4*(x/3))/Math.sqrt(Math.pow(1.1,3)+Math.pow(x,2))));
//        TODO implement formula 18
        return result;
    }

    public double calculate19Formula(double x) {
        double result = Math.acos(Math.cos(Math.tan((5*x)/Math.PI)+(Math.pow(x,3.2)/28d)));
//        TODO implement formula 19
        return result;
    }

    public double calculate20Formula(double x) {
        /**
         * натуральный логарифм в квадрате - Math.E в квадрате  https://socratic.org/questions/is-lnx-2-equivalent-to-ln-2-x     https://www.quora.com/Can-we-write-ln-2-x-as-2-ln-x
         */

        double result = (Math.cbrt(Math.pow(Math.exp(x), 2)) + Math.tan(Math.cos(Math.PI*x)))*Math.abs(Math.log(x/10.5+1d/3d));
//        TODO implement formula 20
        return result;
    }

    public double calculate21Formula(double x) {

        /**
         * http://proglang.su/java/numbers-acos
         * https://stackoverflow.com/questions/27538695/java-strange-nan-in-a-double-while-using-math-acos
         */
        double a = (Math.pow(Math.log(x), 1d/4d)); //Здесь x должен быть всегда позитивным, иначе NaN
        double b = Math.acos(Math.cos(x+3)); // Здесь x+3 - всегда должен быть меньше единицы, иначе NaN
        double c = (1d/Math.abs(x+2d*Math.pow(x,2d)));
        double result =(a+b)*c;
//        TODO implement formula 21
        return result;
    }

    public double calculate22Formula(double x) {
        double result = Math.asin(Math.sin(Math.log(x)/(Math.pow(x,2)+5*x+1)))-(Math.pow(x,3.2)/28d);
//        TODO implement formula 22
        return result;
    }

    public double calculate23Formula(double x) {
        double result = Math.acos(Math.cos(Math.tan(5*x/Math.PI)))+(Math.pow(x,5.7)/23d);
//        TODO implement formula 23
        return result;
    }

    public double calculate24Formula(double x) {
        double result = Math.atan(Math.tan(Math.abs(8.3-21*Math.pow(x,2)-0.8*x)/Math.cbrt(2.5+(1d/Math.pow(x,2)))));
//        TODO implement formula 24
        return result;
    }

    public double calculate25Formula(double x) {
        double result = Math.pow(Math.log(Math.acos(Math.cos((Math.abs(Math.pow(x,3.4)+2.5*Math.pow(x,1.2)-0.7)/Math.cbrt(Math.exp(2.5*x)))))),1d/4d)+1;
//        TODO implement formula 25
        return result;
    }

    public double calculate26Formula(double x) {
        double result = Math.log(Math.abs(Math.sin(x)))+2*Math.pow(Math.E,x)+2*Math.cos(Math.abs(x))+2;
//        TODO implement formula 26
        return result;
    }
}