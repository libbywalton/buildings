package com.qa;

public class House extends Accommodation{
    public House(String address) {
        super(address);
    }

    public House(String address, BuildingStatus status) {
        super(address, status);
    }

    public House(String address, BuildingStatus status, String owner, double value) {
        super(address, status, owner, value);
    }

    @Override
    public String parkingBehaviour(String vehicle) {
        return "You have parked your " + vehicle + " on the drive way.";
    }
}
