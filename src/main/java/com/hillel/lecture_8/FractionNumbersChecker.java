package com.hillel.lecture_8;

import io.qameta.allure.Step;

public class FractionNumbersChecker {

    private double first;
    private double second;
    private double result;
    private String error;
    private char operation;


    public FractionNumbersChecker(double first, double second, char operation){
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setFirst(double first){
        this.first=first;
    }

    public void setSecond(double second){
        this.second=second;
    }

    public void getError(){
        System.out.println(error);
    }

    public void getResult(){
        System.out.println(result);
    }

    public void MathOperations(){


        if (this.operation == '/'){
            if (first == 0){
                error = "Divide zero";
            } else if (second == 0){
                error = "Divide by zero";
            } else {
                result = first/second;
            }

        } else if (operation == '+'){
            result = first+second;

        } else if (operation == '*'){
            if (first == 0 || second == 0){
                error = "Multiply by zero";
            } else {
                result = first*second;
            }
        } else if (operation == '-'){
            result = first-second;
        } else {
            error = "Error math operation";
        }


    }

    public String toString(){
        if (error == null){
            return String.format("Result of math operation \"%s\" with %s and %s is %s", operation, first, second, result);
        } else {
            return error;
        }
    }



}
