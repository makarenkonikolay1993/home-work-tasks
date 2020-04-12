package com.hillel.lecture_12;

public class CelsiusToKelvin implements IConverter {
    private final double KELVIN_COEF = 273.16;
    @Override
    public double convert(double value) throws ConverterCalculationException {
        if (value <= -273.15) {
            throw new ConverterCalculationException("Temperature is absolute zero");
        } else {
            return value + KELVIN_COEF;
        }
    }
}
