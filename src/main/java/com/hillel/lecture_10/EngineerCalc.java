package com.hillel.lecture_10;

public class EngineerCalc extends TrigonometricCalc {

    /**
     * Этот калькулятор наследует все калькуляторы до этого и расширяет их функционал
     */

    public double exponent(double number){
        return Math.exp(number);
    }

    public double logarithm(double number){
        return Math.log(number);
    }

    public double radixRoot(double number){
        return Math.sqrt(number);
    }

    public double percent (double number, double percent){
        return number*percent/100;
    }

    public double power(double number, double pow) {
        double result = number;
        for (int i = 1 ; i < pow; i++){
            result*=number;
        }

        return result;
    }

    public static double factorial (double number){
        double result = 1;
        for (int i = 1; i <=number; i++){
            result=result*i;
        }
        return result;
    }
}
