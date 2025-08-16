package model;

import constants.ParkingSpotConstants;

public class CompactParkingSpotImpl extends ParkingSpot{

    public CompactParkingSpotImpl(int floorNo, Location location, String parkingSpotId) {
        super(floorNo, location,  ParkingSpotConstants.COMPACT_COST_PER_HR, parkingSpotId);
    }

}
