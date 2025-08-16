package model;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public abstract  class ParkingSpot {
    int floorNo;
    Location location;
    String parkingSpotId;
    boolean isOccupied;
    double costPerHour;


    public ParkingSpot(int floorNo,Location location,double costPerHour, String parkingSpotId){
        this.floorNo = floorNo;
        this.location = location;
        this.parkingSpotId = parkingSpotId;
        this.isOccupied = false;
        this.costPerHour = costPerHour;


    }




}
