package com.hillel.lecture_9;

public class CellPhone extends Phone {
    private String maker;
    private String model;

    public CellPhone(String provider, String type, String os, String phoneNumber) {
        super(provider, type, os, phoneNumber);
    }

    public void charging(){
        System.out.println("This cell phone is charging");
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInfo(){
        return String.format("Provider is: %s, type of phone is: %s, OS is: %s, Phone Number is: %s, maker is: %s, model is: %s"
                , this.getProvider(), this.getType(), this.getOs(), this.getPhoneNumber(), this.maker, this.model);
    }

    @Override
    public String call(Phone phoneTwo){
        return String.format("Call from %s to %s is in progress  on the street", this.toString(), phoneTwo.toString());
    }

    public String call(){
        String[] errors = {"Phone is broken", "Line is busy", "No network", "You have no money"};
        int reason = (int) (Math.random() * 3);

        return String.format("You can't do call because: %s" , errors[reason]);
    }
}
