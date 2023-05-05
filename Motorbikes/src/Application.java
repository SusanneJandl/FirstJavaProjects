/*
 * Project motorbikes
 * Application, main class
 * Author: Susanne Jandl
 * Last change: 2023-03-21
 */

import java.util.*;

public class Application {

    public static void separatorLine() {
        System.out.println("\n" + "-".repeat(55) + "\n");
    }

    public static void printBike(Bike bike) {
        System.out.printf("Brand: %s | Horse Power: %d | Construction Year: %d | Type: %s | Color: %s\n",
                bike.getBrand(), bike.getHorsePower(), bike.getConstructionYear(), writeType(bike), bike.getColor());
    }

    public static void printBikeList(List<Bike> bikeList) {
        for (Bike bike : bikeList) printBike(bike);
    }

    public static void printSortedBikeList(List<Bike> bikeList, Comparator<Bike> compare, String string) {
        bikeList.sort(compare);
        separatorLine();
        System.out.println("Sorted bike list by " + string);
        printBikeList(bikeList);
    }

    public static String writeType(Bike bike) {
        if (bike.getType().equals(BikeType.street))
            return "Street";
        else if (bike.getType().equals(BikeType.dirt))
            return "Dirt";
        else if (bike.getType().equals(BikeType.chopper))
            return "Chopper";
        else return "SMoto";
    }

    public static void main(String[] args) {

        ArrayList<Bike> bikeList = new ArrayList<>();
        bikeList.add(new Bike("Honda", 50, "red", 1987, BikeType.dirt));
        bikeList.add(new Bike("Yamaha 750 Super Tenere", 70, "blue", 1993, BikeType.dirt));
        bikeList.add(new Bike("Peugeot Speedfight", 4, "black", 2017, BikeType.street));
        bikeList.add(new Bike("Harley Sportster S", 86, "silver", 2015, BikeType.chopper));
        bikeList.add(new Bike("KTM 1290 Duke R", 175, "yellow", 2022, BikeType.smoto));

        System.out.println("Default bike list (not sorted)");
        printBikeList(bikeList);

        separatorLine();
        System.out.println("Sorted bike list by construction year");
        Collections.sort(bikeList);
        printBikeList(bikeList);

        BikeBrandCompare brandCompare = new BikeBrandCompare();
        printSortedBikeList(bikeList, brandCompare, "brand name");

        BikeColorCompare colorCompare = new BikeColorCompare();
        printSortedBikeList(bikeList, colorCompare, "color");

        BikeHorsePowerCompare horsePowerCompare = new BikeHorsePowerCompare();
        printSortedBikeList(bikeList, horsePowerCompare, "horse power");

        BikeTypeCompare typeCompare = new BikeTypeCompare();
        printSortedBikeList(bikeList, typeCompare, "type");
    }
}
