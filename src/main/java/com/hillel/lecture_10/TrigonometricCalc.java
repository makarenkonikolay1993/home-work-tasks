package com.hillel.lecture_10;

public class TrigonometricCalc extends Calc {

    /**
     * Наследует обычный калькулятор и расширяет его функционал.
     * Не делал арк тригонометрические функции.
     * Этот калькулятор работает для тригонометрических функций
     */

    public double cosinusInRadians(double Radians){
        return Math.cos(Radians);
    }

    public double sinusInRadians(double Radians){
        return Math.sin(Radians);
    }

    public double tangensInRadians(double Radians){
        return Math.tan(Radians);
    }

    public double cotangensInRadians(double Radians){
        return cosinusInRadians(Radians)/sinusInRadians(Radians);
    }

    public double cosinusInDegrees(double Degrees){
        return Math.cos(Math.toRadians(Degrees));
    }

    public double sinusInDegrees(double Degrees){
        return Math.sin(Math.toRadians(Degrees));
    }

    public double tangensInDegrees(double Degrees){
        return Math.tan(Math.toRadians(Degrees));
    }

    public double cotangensInDegrees(double Degrees){
        return cosinusInDegrees(Degrees)/sinusInDegrees(Degrees);
    }
}