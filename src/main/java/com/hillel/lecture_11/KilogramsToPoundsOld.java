package com.hillel.lecture_11;

public class KilogramsToPoundsOld implements Converter{
    @Override
    public double convert(double value) {
        return value*2.20462;
    }
}
