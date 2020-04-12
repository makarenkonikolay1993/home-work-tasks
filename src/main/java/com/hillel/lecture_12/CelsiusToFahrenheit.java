package com.hillel.lecture_12;

public class CelsiusToFahrenheit implements IConverter {
    @Override
    public double convert(double value) throws ConverterCalculationException {
        if (value <= -273.15) {
            throw new ConverterCalculationException("Temperature is absolute zero");
        } else {
            return ((value * 9 / 5) + 32);
        }
    }
}
