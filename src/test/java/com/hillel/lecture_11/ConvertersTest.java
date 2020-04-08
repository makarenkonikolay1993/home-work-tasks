package com.hillel.lecture_11;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ConvertersTest {
    Converter celsiusToFahrenheit = new CelsiusToFahrenheit();
    Converter celsiusToKelvin = new CelsiusToKelvin();
    Converter fahrenheitToCelsius = new FahrenheitToCelsius();
    Converter inchesToMeters = new InchesToMeters();
    Converter kilogramsToPounds = new KilogramsToPounds();
    Converter metersToInches = new MetersToInches();
    Converter milesToKilometres = new MilesToKilometres();
    Converter kilometresToMiles = new KilometresToMiles();
    Converter poundsToKilograms = new PoundsToKilograms();
    Converter speedKmToMi = new SpeedKmToMi();
    Converter speedMiToKm = new SpeedMiToKm();

    @Test
    public void CelsiusToFahrenheitTest(){
        double expectedResult = 50.0;
        assertEquals(celsiusToFahrenheit.convert(10), expectedResult);
    }

    @Test
    public void celsiusToKelvinTest(){
        double expectedResult = 283.16;
        assertEquals(celsiusToKelvin.convert(10), expectedResult);
    }

    @Test
    public void fahrenheitToCelsiusTest(){
        double expectedResult = 10.0;
        assertEquals(fahrenheitToCelsius.convert(50), expectedResult);
    }

    @Test
    public void inchesToMetersTest(){
        double expectedResult = 1.27000254000508;
        assertEquals(inchesToMeters.convert(50), expectedResult);
    }

    @Test
    public void metersToInchesTest(){
        double expectedResult = 196.85;
        assertEquals(metersToInches.convert(5), expectedResult);
    }

    @Test
    public void kilogramsToPoundsTest(){
        double expectedResult = 22.0462;
        assertEquals(kilogramsToPounds.convert(10), expectedResult);
    }

    @Test
    public void milesToKilometresTest(){
        double expectedResult = 16.09;
        assertEquals(milesToKilometres.convert(10), expectedResult);
    }

    @Test
    public void kilometresToMilesTest(){
        double expectedResult = 6.215040397762586;
        assertEquals(kilometresToMiles.convert(10), expectedResult);
    }

    @Test

    public void poundsToKilogramsTest(){
        double expectedResult = 11.339925610087997;
        assertEquals(poundsToKilograms.convert(25),expectedResult);
    }

    @Test
    public void speedKmToMiTest(){
        double expectedResult = 6.2139999999999995;
        assertEquals(speedKmToMi.convert(10), expectedResult);
    }

    @Test
    public void speedMiToKm(){
        double expectedResult = 16.0926939169617;
        assertEquals(speedMiToKm.convert(10), expectedResult);
    }
}
