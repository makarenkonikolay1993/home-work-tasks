package com.hillel.lecture_12;

public class SpeedFactory {
    public IConverter create (EnumSpeed type) throws ConverterException {
        IConverter result = null;
        switch (type) {
            case SpeedMiToKm: result =  new SpeedMiToKm(); break;
            case SpeedKmToMi: result = new SpeedKmToMi(); break;
            default : throw new ConverterException("Error type");
        }
        return result;
    }
}
