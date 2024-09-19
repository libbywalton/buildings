package com.qa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Building shard = new Building("32 London Bridge St, London SE1 9SG");
        shard.setOutstandingMortgage(1000.0);
        shard.setHeight(310);
        shard.setSqft(1367784);
        shard.setStatus(BuildingStatus.UNDER_MAINTENANCE);

//        System.out.println(shard.getOutstandingMortgage());
//        System.out.println(shard.getHeight());
//        System.out.println(shard.getSqft());
//        System.out.println(shard.getStatus());
        System.out.println(shard);

        Building walkieTalkie = new Building("20 Fenchurch St, London EC3M 8AF", BuildingStatus.OWNED);
        Building batterseaPowerStation = new Building("Circus Rd W, Nine Elms, London SW11 8DD",
                BuildingStatus.FOR_SALE, "Sky", 121235);

        System.out.println(walkieTalkie);

        System.out.println(batterseaPowerStation);
        Building.revalueProperty(batterseaPowerStation);
        System.out.println(batterseaPowerStation);

        Building[] london = {shard, walkieTalkie, batterseaPowerStation};

        for (int i = 0; i < london.length; i++) {
            System.out.println(london[i].getAddress());
        }

        for (Building building : london) {
            System.out.println(building.getStatus());
        }

        String car1 = "Audi ";
        String car2 = "Mercedes ";
        String car3 = "BMW ";

        StringBuilder topBrands = new StringBuilder();
        topBrands.append(car1);
        topBrands.append(car2);
        topBrands.append(car3);
        System.out.println(topBrands);

        BusinessBuilding skyOsterley = new BusinessBuilding("Grant Way, Isleworth TW7 5QD", BuildingStatus.OWNED, "Comcast", 5000000, "Sky");
        skyOsterley.setRevenue(10000);
        skyOsterley.setLosses(10);

        BusinessBuilding skyTower = new BusinessBuilding("Grant Way, Isleworth TW7 5QP", BuildingStatus.OWNED, "Comcast", 5000000, "Sky");
        skyTower.setRevenue(1000);
        skyTower.setLosses(1);

        Building[] buildings = {shard, walkieTalkie, batterseaPowerStation, skyOsterley};

        for (Building building : buildings) {
            System.out.println("------------------------");
            System.out.println(building);
        }

        // Abstract Classes & Methods
        Apartment apartment = new Apartment("19 Alexander Road, SOUTHALL, UB65 2IZ");
        House house = new House("11 Church Lane, COVENTRY, CV29 1IG");
        house.setRentalRate(1500);
        house.setParkingCapacity(2);

        Accommodation[] accommodations = {apartment, house};
        for (Accommodation accom : accommodations){
//            System.out.println(accom.parkingBehaviour("BMW"));
        }

        IsProfitable[] investments = {skyOsterley, skyTower, house};

        for (IsProfitable profit : investments){
            System.out.println(profit.calculateProfit());
        }

        System.out.println("...........................");

        List<String> mycars = new ArrayList<>();
        mycars.add("Audi");
        mycars.add("Mercedes");
        mycars.add("Polestar");
        for (String car : mycars) {
            try {
                System.out.println("Opened Gate.");
                System.out.println(car + ": " + house.parkingBehaviour(car));
            } catch (NoParkingException e) {
                System.out.println(car + ": Can't park here! \n" + e.getMessage());
            } finally {
                System.out.println("Closed Gate.");
            }
        }

    }
}