package com.hillel.lecture_14;

/**
 * Created by alpa on 12/9/19
 */
public class Address {

    private String city;
    private String street;

    @Override
    public String toString() {
        return "city\":" + "\"" + city + "\"" +
                ",\"street\":" + "\"" + street + "\"" +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
