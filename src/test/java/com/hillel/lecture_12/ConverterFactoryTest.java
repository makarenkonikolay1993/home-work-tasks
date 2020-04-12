package com.hillel.lecture_12;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ConverterFactoryTest {
    IConverter speedMiToKm = new SpeedFactory().create(EnumSpeed.SpeedMiToKm);
    IConverter speedKmToMi = new SpeedFactory().create(EnumSpeed.SpeedKmToMi);

    IConverter miToKm = new DistanceFactory().create(EnumDistance.MilesToKm);
    IConverter kmToMi = new DistanceFactory().create(EnumDistance.KmToMiles);

    IConverter poundsToKg = new WeightFactory().create(EnumWeight.PoundsToKilograms);
    IConverter kgToPounds = new WeightFactory().create(EnumWeight.KilogramsToPounds);

    IConverter celsToFahrenheit = new TemperatureFactory().create(EnumTemperature.CelsiusToFahrenheit);
    IConverter celsToKelv = new TemperatureFactory().create(EnumTemperature.CelsiusToKelvin);
    IConverter fahrenheitToCels = new TemperatureFactory().create(EnumTemperature.FahrenheitToCelsius);

    public ConverterFactoryTest() throws ConverterException {
    }


    @Test
    public void SpeedConverterMilesToKm() throws Exception {
        speedMiToKm.convert(-1);
    }

    @Test
    public void ConverterFail() throws Exception {
        assertEquals(new TemperatureFactory().create(EnumTemperature.TEST), new ConverterException("Error type"));
//        test.convert(5);
    }
}
