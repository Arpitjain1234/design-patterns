package model;

public class Vehicle {
    private String licensePlate;
    private ParkingSpot requiredSpotType;

    public Vehicle(String licensePlate, ParkingSpot type) {
        this.licensePlate = licensePlate;
        this.requiredSpotType = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public ParkingSpot getRequiredSpotType() {
        return requiredSpotType;
    }
}
