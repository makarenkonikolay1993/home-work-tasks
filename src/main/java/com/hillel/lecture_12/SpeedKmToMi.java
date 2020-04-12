package com.hillel.lecture_12;

public class SpeedKmToMi implements IConverter {
    private final double MILES_COEF = 0.6214;

    @Override
    public double convert(double value) throws ConverterCalculationException {
        if (value <= 0) {
            throw new ConverterCalculationException("Value is less than 0");
        } else {
            return value * 0.6214;
        }
    }
}