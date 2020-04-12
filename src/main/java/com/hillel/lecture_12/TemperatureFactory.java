package com.hillel.lecture_12;

public class TemperatureFactory {
    public IConverter create (EnumTemperature type) throws ConverterException {
        IConverter result = null;
        switch (type) {
            case CelsiusToFahrenheit: result =  new CelsiusToFahrenheit(); break;
            case CelsiusToKelvin: result = new CelsiusToKelvin(); break;
            case FahrenheitToCelsius: result = new FahrenheitToCelsius(); break;
            default : throw new ConverterException("Error type");
        }
        return result;
    }
}
