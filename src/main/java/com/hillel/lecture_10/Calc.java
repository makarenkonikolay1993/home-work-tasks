package com.hillel.lecture_10;

public abstract class Calc {
    /**
     * Обычный калькулятор.
     * Класс является абстрактным.
     * Создать экземпляр класса мы не можем, но можем произвести Upcasting до обычного калькулятора
     */

    public double plus(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }

    public double minus(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }

    public double divide(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }
}