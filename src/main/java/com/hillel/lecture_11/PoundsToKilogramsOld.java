package com.hillel.lecture_11;

public class PoundsToKilogramsOld implements Converter{
    @Override
    public double convert(double value) {
        return value/2.2046;
    }
}
