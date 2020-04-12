package com.hillel.lecture_12;

public class DistanceFactory {

    public IConverter create (EnumDistance type) throws ConverterException {
        IConverter result = null;
        switch (type) {
            case MilesToKm: result =  new MilesToKilometres(); break;
            case KmToMiles: result = new KilometresToMiles(); break;
            default : throw new ConverterException("Error type");
        }
        return result;
    }
}
