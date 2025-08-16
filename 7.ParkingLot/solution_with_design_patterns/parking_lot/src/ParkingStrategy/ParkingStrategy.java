package ParkingStrategy;

import enums.VehicleType;
import model.Entrance;
import model.ParkingSpot;

public interface ParkingStrategy {

    public ParkingSpot findNearestSpot(VehicleType vehicleType, Entrance entrance);

}
