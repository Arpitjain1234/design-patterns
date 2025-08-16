package model;

import ParkingSpotManager.ParkingSpotManagerFactory;
import ParkingStrategy.ParkingStrategy;

public class Entrance {
    Vehicle vehicle;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingStrategy parkingStrategy;
    Location location;

    public Entrance(Vehicle vehicle, ParkingSpotManagerFactory parkingSpotManagerFactory,
                    ParkingStrategy parkingStrategy, Location location){
        this.vehicle = vehicle;
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
        this.parkingStrategy = parkingStrategy;
        this.location = location;
    }
    



}
