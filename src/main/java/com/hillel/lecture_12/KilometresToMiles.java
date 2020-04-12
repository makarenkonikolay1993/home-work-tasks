package com.hillel.lecture_12;

public class KilometresToMiles implements IConverter {
    private final double MILES_COEF = 1.609;
    @Override
    public double convert(double value) throws ConverterCalculationException {
        if (value <= 0) {
            throw new ConverterCalculationException("Value is less than 0");
        } else {
            return value / MILES_COEF;
        }
    }
}
