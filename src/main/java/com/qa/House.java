package com.qa;

public class House extends Accommodation implements IsProfitable {
    private int parkingCapacity = 0;
    private int parkedVehicleCount = 0;

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
    public String parkingBehaviour(String vehicle) throws NoParkingException{
        if (parkingCapacity - parkedVehicleCount > 0){
            parkedVehicleCount += 1;
            return "You have parked your " + vehicle + " on the drive way.";
        } else {
            throw new NoParkingException(parkingCapacity, "Tesco Nearby");
        }
    }

    @Override
    public double calculateProfit() {
        // Magic Calculations Of Mortgage Installments
        double magicCalc = 925;
        return this.getRentalRate() - magicCalc;
    }

    public int getParkingCapacity() {
        return parkingCapacity;
    }

    public void setParkingCapacity(int parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }
}
