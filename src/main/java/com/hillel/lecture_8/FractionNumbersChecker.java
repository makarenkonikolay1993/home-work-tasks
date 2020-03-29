package com.hillel.lecture_8;

import io.qameta.allure.Step;

import java.util.Objects;

public class FractionNumbersChecker {
    private  int nominator;
    private  int denominator;

    public FractionNumbersChecker(){

    }

    public FractionNumbersChecker(int nominator, int denominator){
        this.nominator = nominator;
        this.denominator = denominator;
        reduce();
        if (this.denominator < 0){
            this.denominator = -this.denominator;
            this.nominator = -this.nominator;
        }
    }

    public int getNumerator() {
        return nominator;
    }

    public void setNumerator(int numerator) {
        this.nominator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int calculateCGD(int nominator, int denominator){
        // Евклидов алгоритм
        int tempNominator=nominator;
        int temp = 0;
        int tempDenominator=denominator;
        while (tempDenominator != 0){
            temp = tempDenominator;
            tempDenominator = tempNominator % tempDenominator;
            tempNominator=temp;
        }

        return temp;
    }

    // приведение дробей к наименьшему общему кратному
    public void reduce(){
        int gcd = calculateCGD(nominator, denominator);
        nominator /= gcd;
        denominator /= gcd;
    }



    // Отображение чисел в виде дроби
    public String toString(){
        if (this.denominator < 0){
            return "-"+this.nominator + "/" + Math.abs(this.denominator);
        }
        return this.nominator + "/" + this.denominator;
    }

    public FractionNumbersChecker plus(FractionNumbersChecker fTwo){
        int firstNum = this.nominator;
        int firstDen = this.denominator;
        int secondNum = fTwo.nominator;
        int secondDen = fTwo.denominator;

        int numer = (firstNum*secondDen)+(secondNum*firstDen);
        int denom = firstDen*secondDen;
        FractionNumbersChecker f3 = new FractionNumbersChecker(numer,denom);
        System.out.println(String.format("Result of Plus %s/%s and %s/%s is: %s", firstNum, firstDen, secondNum, secondDen, f3.toString()));
        return f3;
    }

    public FractionNumbersChecker minus(FractionNumbersChecker fTwo){
        int firstNum = this.nominator;
        int firstDen = this.denominator;
        int secondNum = fTwo.nominator;
        int secondDen = fTwo.denominator;

        int numer = (firstNum*secondDen)-(secondNum*firstDen);
        int denom = firstDen*secondDen;
        FractionNumbersChecker f3 = new FractionNumbersChecker(numer,denom);
        System.out.println(String.format("Result of Minus %s and %s is: %s", this.toString(), fTwo.toString(), f3.toString()));
        return f3;
    }

    public FractionNumbersChecker multiply(FractionNumbersChecker fTwo){

        int firstNum = this.nominator;
        int firstDen = this.denominator;
        int secondNum = fTwo.nominator;
        int secondDen = fTwo.denominator;


        int numer = firstNum*secondNum;
        int denom = firstDen*secondDen;
        FractionNumbersChecker f3 = new FractionNumbersChecker(numer,denom);
        System.out.println(String.format("Result of Multiply %s and %s is: %s", this.toString(), fTwo.toString(), f3.toString()));
        return f3;
    }

    public FractionNumbersChecker divide(FractionNumbersChecker fTwo){

        int firstNum = this.nominator;
        int firstDen = this.denominator;
        int secondNum = fTwo.nominator;
        int secondDen = fTwo.denominator;

        int numer =firstNum*secondDen;
        int denom = firstDen*secondNum;
        FractionNumbersChecker f3 = new FractionNumbersChecker(numer,denom);
        System.out.println(String.format("Result of Divide %s and %s is: %s", this.toString(), fTwo.toString(), f3.toString()));
        return f3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumbersChecker that = (FractionNumbersChecker) o;
        return nominator == that.nominator &&
                denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominator, denominator);
    }
}
