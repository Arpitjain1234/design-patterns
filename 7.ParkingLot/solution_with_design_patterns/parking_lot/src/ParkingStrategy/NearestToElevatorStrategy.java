package ParkingStrategy;

import enums.VehicleType;
import model.Entrance;
import model.ParkingSpot;

public class NearestToElevatorStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findNearestSpot(VehicleType vehicleType, Entrance entrance){
        System.out.println("Finding the nearest spot to the elevator");
        return new ParkingSpot();
    }
}
