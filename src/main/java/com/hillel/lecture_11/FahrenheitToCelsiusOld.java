package com.hillel.lecture_11;

public class FahrenheitToCelsiusOld implements Converter{
    @Override
    public double convert(double value) {
        return ( (value-32) *5/9 );
    }
}
