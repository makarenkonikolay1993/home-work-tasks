package com.hillel.lecture_12;

public class FahrenheitToCelsius implements IConverter {
    @Override
    public double convert(double value) throws ConverterCalculationException {
        if (value <= -459.67) {
            throw new ConverterCalculationException("Temperature is absolute zero");
        } else {
            return ((value - 32) * 5 / 9);
        }
    }
}
