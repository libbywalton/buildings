package com.qa;

public abstract class Accommodation extends Building {
    // Attributes
    private int currentOccupants;
    private int bedroomNo;

    public Accommodation(String address) {
        super(address);
    }

    public Accommodation(String address, BuildingStatus status) {
        super(address, status);
    }

    public Accommodation(String address, BuildingStatus status, String owner, double value) {
        super(address, status, owner, value);
    }

    public abstract String parkingBehaviour(String vehicle) throws NoParkingException;
}
