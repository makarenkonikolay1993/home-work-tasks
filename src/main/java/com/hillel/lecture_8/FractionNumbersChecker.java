package com.hillel.lecture_8;

import io.qameta.allure.Step;

public class FractionNumbersChecker {

    private double first;
    private double second;
    private double result;
    private String error;
//    private char operation;


    public FractionNumbersChecker(double first, double second){
        this.first = first;
        this.second = second;
        //this.operation = operation;
    }

//    public void setOperation(char operation) {
//        this.operation = operation;
//    }

    public void setFirst(double first){
        this.first=first;
    }

    public void setSecond(double second){
        this.second=second;
    }

    public void getError(){
        if (error == null){
            System.out.println("No errors");
        } else {
            System.out.println("Last error is: " + error);
        }
    }

    public void getResult(){
        System.out.println("Last result is: " + result);
    }

    public void minus(){
        result = first-second;
        System.out.println(this.toString());
        error = null;
    }

    public void plus(){
        result = first+second;
        System.out.println(this.toString());
        error = null;
    }

    public void divide(){
        if (first == 0){
            error = "Divide zero";
        } else if (second == 0){
            error = "Divide by zero";
        } else {
            result = first/second;
            System.out.println(this.toString());
            error = null;
        }
    }

    public void multiply(){
        if (first == 0 || second == 0){
            error = "Multiply by zero";
        } else {
            result = first*second;
            System.out.println(this.toString());
            error = null;
        }
    }

    public String toString(){
        if (error == null){
            return String.format("Result of math operation with %s and %s is %s", first, second, result);
        } else {
            return error;
        }
    }



}
