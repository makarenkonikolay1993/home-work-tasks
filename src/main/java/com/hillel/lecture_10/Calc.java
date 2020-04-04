package com.hillel.lecture_10;

public abstract class Calc {
    /**
     * Обычный калькулятор.
     * Класс является абстрактным.
     * Создать экземпляр класса мы не можем, но можем произвести Upcasting до обычного калькулятора
     */

    public abstract double plus(double firstNumber, double secondNumber);

    public abstract double minus(double firstNumber, double secondNumber);

    public abstract double multiply(double firstNumber, double secondNumber);

    public abstract double divide(double firstNumber, double secondNumber);
}