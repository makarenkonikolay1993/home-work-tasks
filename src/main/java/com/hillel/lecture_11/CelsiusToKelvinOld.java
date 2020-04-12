package com.hillel.lecture_11;

public class CelsiusToKelvinOld implements Converter{
    @Override
    public double convert(double value) {
        return value+273.16;
    }
}
