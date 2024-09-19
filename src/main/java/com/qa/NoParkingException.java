package com.qa;

public class NoParkingException extends RuntimeException {
    public NoParkingException(int parkingCapacity) {
        super("No Parking Available, all " + parkingCapacity + " places are full.");
    }

    public NoParkingException(int parkingCapacity, String alternativeParkingLocation) {
        super("No Parking Available, all " + parkingCapacity + " places are full. Alternative parking: " + alternativeParkingLocation);
    }

    public NoParkingException(String alternativeParkingLocation) {
        super("No Parking Available. Alternative parking: " + alternativeParkingLocation);
    }
}
