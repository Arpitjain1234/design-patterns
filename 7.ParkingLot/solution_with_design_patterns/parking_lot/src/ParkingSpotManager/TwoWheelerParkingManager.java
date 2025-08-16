package ParkingSpotManager;

import model.ParkingSpot;

public class TwoWheelerParkingManager implements ParkingSpotManager{
    public ParkingSpot findNearestSpot(){
        System.out.println("Finding nearest spot in TwoWheelerParkingManager");
        return  new ParkingSpot();
    }
    public void releaseParkingSpot(){
        System.out.println("release this paring spot in TwoWheelerParkingManager");
    }
    public ParkingSpot addParkingSpot(){
        System.out.println("add a parking spot in TwoWheelerParkingManager");
        return new ParkingSpot();
    };
    public void removeParkingSpot(){
        System.out.println("Removing a parking spotin TwoWheelerParkingManager");
    }
}
