package ParkingSpotManager;

import model.ParkingSpot;

public class ThreeWheelerParkingManager implements ParkingSpotManager{
    public ParkingSpot findNearestSpot(){
        System.out.println("Finding nearest spot in ThreeWheelerParkingManager");
        return  new ParkingSpot();
    }
    public void releaseParkingSpot(){
        System.out.println("release this paring spot in ThreeWheelerParkingManager");
    }
    public ParkingSpot addParkingSpot(){
        System.out.println("add a parking spot in ThreeWheelerParkingManager");
        return new ParkingSpot();
    };
    public void removeParkingSpot(){
        System.out.println("Removing a parking spotin ThreeWheelerParkingManager");
    }
}
