package com.hillel.lecture_12;

public class SpeedKmToMi implements IConverter {
    @Override
    public double convert(double value) {
        return value* 0.6214;
    }
}