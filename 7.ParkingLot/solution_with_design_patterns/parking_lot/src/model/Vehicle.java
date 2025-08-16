package model;

import enums.VehicleType;

public class Vehicle {
    VehicleType vehicleType;
    NumberPlate numberPlate;

    public Vehicle(VehicleType vehicleType, NumberPlate numberPlate) {
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;

    }

}
