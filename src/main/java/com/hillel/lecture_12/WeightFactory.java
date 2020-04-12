package com.hillel.lecture_12;

public class WeightFactory {
    public IConverter create (EnumWeight type) throws ConverterException {
        IConverter result = null;
        switch (type) {
            case KilogramsToPounds: result =  new KilogramsToPounds(); break;
            case PoundsToKilograms: result = new PoundsToKilograms(); break;
            default : throw new ConverterException("Error type");
        }
        return result;
    }
}
