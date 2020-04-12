package com.hillel.lecture_12;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ConverterFactoryTest {

    SpeedFactory speedFactory = new SpeedFactory();
    TemperatureFactory temperatureFactory = new TemperatureFactory();
    DistanceFactory distanceFactory = new DistanceFactory();
    WeightFactory weightFactory = new WeightFactory();

//    IConverter speedMiToKm = new SpeedFactory().create(EnumSpeed.SpeedMiToKm);
//    IConverter speedKmToMi = new SpeedFactory().create(EnumSpeed.SpeedKmToMi);
//
//    IConverter miToKm = new DistanceFactory().create(EnumDistance.MilesToKm);
//    IConverter kmToMi = new DistanceFactory().create(EnumDistance.KmToMiles);
//
//    IConverter poundsToKg = new WeightFactory().create(EnumWeight.PoundsToKilograms);
//    IConverter kgToPounds = new WeightFactory().create(EnumWeight.KilogramsToPounds);
//
//    IConverter celsToFahrenheit = new TemperatureFactory().create(EnumTemperature.CelsiusToFahrenheit);
//    IConverter celsToKelv = new TemperatureFactory().create(EnumTemperature.CelsiusToKelvin);
//    IConverter fahrenheitToCels = new TemperatureFactory().create(EnumTemperature.FahrenheitToCelsius);

    @Test
            (
            expectedExceptions = ConverterCalculationException.class,
            expectedExceptionsMessageRegExp = "Value is less than 0"
            )
    public void SpeedConverterKmToMilesFail() throws ConverterCalculationException, ConverterException {
        IConverter speedKmToMi = speedFactory.create(EnumSpeed.SpeedKmToMi);
        System.out.println(speedKmToMi.convert(-1));
    }

    @Test
            (
                    expectedExceptions = ConverterCalculationException.class,
                    expectedExceptionsMessageRegExp = "Value is less than 0"
            )
    public void SpeedConverterMilesToKmFail() throws ConverterCalculationException, ConverterException {
        IConverter speedMilesToKm = speedFactory.create(EnumSpeed.SpeedMiToKm);
        System.out.println(speedMilesToKm.convert(-1));
    }

    @Test
            (
            expectedExceptions = ConverterException.class,
            expectedExceptionsMessageRegExp = "Error type"
            )
    public void ConverterFail() throws Exception {
        IConverter test = new TemperatureFactory().create(EnumTemperature.TEST);
    }

    @Test
            (
                    expectedExceptions = ConverterCalculationException.class,
                    expectedExceptionsMessageRegExp = "Temperature is absolute zero"
            )
    public void TemperatureConverterFail() throws ConverterException, ConverterCalculationException {
        IConverter celsiusToFahrenheit = new TemperatureFactory().create(EnumTemperature.CelsiusToFahrenheit);
        celsiusToFahrenheit.convert(-280);
    }
}
