package com.qa;

public class Apartment extends Accommodation{
    public Apartment(String address) {
        super(address);
    }

    @Override
    public String parkingBehaviour(String vehicle) {
        return "You have parked your " + vehicle + " in the underground parking.";
    }
}
