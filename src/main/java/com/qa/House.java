package com.qa;

public class House extends Accommodation implements IsProfitable {
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

    @Override
    public double calculateProfit() {
        // Magic Calculations Of Mortgage Installments
        double magicCalc = 925;
        return this.getRentalRate() - magicCalc;
    }
}
