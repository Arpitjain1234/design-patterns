package model;

import enums.VehicleType;

public class ParkingSpot {
    VehicleType vehicleType;
    Location location;

    public ParkingSpot(VehicleType vehicleType, Location location){
        this.vehicleType = vehicleType;
        this.location = location;
    }
}
