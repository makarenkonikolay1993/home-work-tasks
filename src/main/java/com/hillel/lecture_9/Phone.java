package com.hillel.lecture_9;

import java.util.Objects;

public abstract class Phone {
    private String provider;
    private String type;
    private String os;
    private String phoneNumber;

    public Phone(String provider, String type, String os, String phoneNumber){
        this.provider=provider;
        this.type=type;
        this.os=os;
        this.phoneNumber=phoneNumber;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract String getInfo();

    public String call(Phone phoneTwo){
        return String.format("Call from %s to %s is in progress", this.toString(), phoneTwo.toString());
    }

    public String down(Phone phoneTwo){
        return String.format("Call from %s to %s was ended", this.toString(), phoneTwo.toString());
    }

    @Override
    public String toString(){
        return this.phoneNumber + " " + this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return provider.equals(phone.provider) &&
                type.equals(phone.type) &&
                os.equals(phone.os) &&
                phoneNumber.equals(phone.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, type, os, phoneNumber);
    }
}

