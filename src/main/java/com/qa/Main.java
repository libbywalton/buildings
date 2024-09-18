package com.qa;

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
    }
}