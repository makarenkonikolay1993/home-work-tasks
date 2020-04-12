package com.hillel.lecture_12;

public class PoundsToKilograms implements IConverter {
    private final double POUNDS_COEF = 2.20462;
    @Override
    public double convert(double value) throws ConverterCalculationException {
        if (value <= 0) {
            throw new ConverterCalculationException("Value is less than 0");
        } else {
            return value / POUNDS_COEF;
        }
    }
}
