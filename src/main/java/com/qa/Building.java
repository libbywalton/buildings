package com.qa;

public class Building {
    private final String address;
    private double value;
    private String owner;
    private int height;
    private int sqft;
    private BuildingStatus status;
    private boolean rented;
    private double rentalRate;
    private double outstandingMortgage;

    public Building(String address) {
        this(address, BuildingStatus.UNKNOWN, null, 0);
    }

    public Building(String address, BuildingStatus status) {
        this(address, status, null, 0);
    }

    public Building(String address, BuildingStatus status, String owner, double value) {
        this.address = address;
        this.status = status;
        this.owner = owner;
        this.value = value;
    }

    public String getAddress() {
        return address;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = Math.max(0, value);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = Math.max(0, height);
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = Math.max(0, sqft);
    }

    public BuildingStatus getStatus() {
        return status;
    }

    public void setStatus(BuildingStatus status) {
        this.status = status;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = Math.max(0, rentalRate);
    }

    public double getOutstandingMortgage() {
        return outstandingMortgage;
    }

    public void setOutstandingMortgage(double outstandingMortgage) {
        this.outstandingMortgage = Math.max(0, outstandingMortgage);
    }

    public static void revalueProperty(Building building) {
        System.out.println("Evaluating the value of the property");
//        check nearby property rates
//        contact blah blah
//        assume property went up by 10,000
        System.out.println("Property increased by £10k!");
        building.setValue(building.getValue() + 10000);
    }

    @Override
    public String toString() {
        return "Building" +
                "address='" + address + '\'' +
                ", value=" + value +
                ", owner='" + owner + '\'' +
                ", height=" + height +
                ", sqft=" + sqft +
                ", status=" + status +
                ", rented=" + rented +
                ", rentalRate=" + rentalRate +
                ", outstandingMortgage=" + outstandingMortgage;
    }
}
