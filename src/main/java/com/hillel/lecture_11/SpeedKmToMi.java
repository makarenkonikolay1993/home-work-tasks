package com.hillel.lecture_11;

public class SpeedKmToMi implements Converter{
    @Override
    public double convert(double value) {
        return value* 0.6214;
    }
}