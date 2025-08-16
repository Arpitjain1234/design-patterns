package ParkingSpotManager;

import model.ParkingSpot;

public class FourWheelerParkingManager implements ParkingSpotManager{
    public ParkingSpot findNearestSpot(){
        System.out.println("Finding nearest spot in FourWheelerParkingManager");
        return  new ParkingSpot();
    }
    public void releaseParkingSpot(){
        System.out.println("release this paring spot in FourWheelerParkingManager");
    }
    public ParkingSpot addParkingSpot(){
        System.out.println("add a parking spot in FourWheelerParkingManager");
        return new ParkingSpot();
    };
    public void removeParkingSpot(){
        System.out.println("Removing a parking spotin FourWheelerParkingManager");
    }
}
