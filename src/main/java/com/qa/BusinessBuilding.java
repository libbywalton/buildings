package com.qa;

import java.util.Arrays;

public class BusinessBuilding extends Building implements IsProfitable {

    //PRIVATE ATTRIBUTES
    private String businessName;
    private Employee[] employees;
    private Sector sector;
    private double revenue;
    private double losses;
    private BusinessStatus businessStatus;

    //CONSTRUCTORS
    public BusinessBuilding(String address, BuildingStatus status, String owner, double value, String businessName, Sector sector, BusinessStatus businessStatus) {
        super(address, status, owner, value);
        this.businessName = businessName;
        this.sector = sector;
        this.businessStatus = businessStatus;
    }

    public BusinessBuilding(String address, BuildingStatus status, String owner, double value, String businessName) {
        this(address, status, owner, value, businessName, Sector.OTHER, BusinessStatus.UNKNOWN);
    }

    //OVERRIDE
    @Override
    public String toString() {
        return super.toString() + "\nBusinessBuilding" +
                "businessName='" + businessName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", sector=" + sector +
                ", revenue=" + revenue +
                ", losses=" + losses +
                ", businessStatus=" + businessStatus;
    }

    //GETTERS AND SETTERS
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getLosses() {
        return losses;
    }

    public void setLosses(double losses) {
        this.losses = losses;
    }

    public BusinessStatus getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(BusinessStatus businessStatus) {
        this.businessStatus = businessStatus;
    }

    @Override
    public double calculateProfit() {
        return revenue - losses;
    }
}
