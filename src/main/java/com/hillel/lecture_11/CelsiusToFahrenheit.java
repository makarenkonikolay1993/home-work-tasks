package com.hillel.lecture_11;

public class CelsiusToFahrenheit implements Converter{
    @Override
    public double convert(double value) {
        return ( (value*9/5)+32 );
    }
}
