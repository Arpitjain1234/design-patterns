package ParkingSpotManager;

import enums.VehicleType;

public class ParkingSpotManagerFactory {

    ParkingSpotManager getParkingManager(VehicleType vehicleType){
        switch (vehicleType){
            case TWO_WHEELER:
                return new TwoWheelerParkingManager();
            case THREE_WHEELER:
                return new ThreeWheelerParkingManager();
            case FOUR_WHEELER:
                return new FourWheelerParkingManager();
            case LARGE_VEHICLE:
                return new LargeVehicleParkingManager();
        }
        return  null;
    }
}
