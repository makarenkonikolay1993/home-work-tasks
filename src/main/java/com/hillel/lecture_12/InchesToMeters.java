package com.hillel.lecture_12;

public class InchesToMeters implements IConverter {
    @Override
    public double convert(double value) {
        return value/39.37;
    }
}
