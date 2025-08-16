package model;

import constants.ParkingSpotConstants;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BikeParkingSpotImpl extends ParkingSpot{

    public BikeParkingSpotImpl(int floorNo, Location location, String parkingSpotId) {
        availableSpotsMap.put(BikeParkingSpotImpl.class, new PriorityQueue<>(
                Comparator.comparingInt(spot -> getMinDistanceToEntry(spot.location))
        ));
        super(floorNo, location,  ParkingSpotConstants.BIKE_COST_PER_HR,parkingSpotId);
    }

}
