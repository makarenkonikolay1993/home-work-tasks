package com.hillel.lecture_11;

public class KilometresToMiles implements Converter{
    @Override
    public double convert(double value) {
        return value/1.609;
    }
}
