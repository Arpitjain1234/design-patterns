package ParkingSpotManager;

import model.ParkingSpot;

public class LargeVehicleParkingManager implements ParkingSpotManager{
    public ParkingSpot findNearestSpot(){
        System.out.println("Finding nearest spot in LargeVehicleParkingManager");
        return  new ParkingSpot();
    }
    public void releaseParkingSpot(){
        System.out.println("release this paring spot in LargeVehicleParkingManager");
    }
    public ParkingSpot addParkingSpot(){
        System.out.println("add a parking spot in LargeVehicleParkingManager");
        return new ParkingSpot();
    };
    public void removeParkingSpot(){
        System.out.println("Removing a parking spotin LargeVehicleParkingManager");
    }
}
