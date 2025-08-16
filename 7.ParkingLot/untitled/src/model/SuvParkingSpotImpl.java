

package model;

import constants.ParkingSpotConstants;

public class SuvParkingSpotImpl extends ParkingSpot{

    public SuvParkingSpotImpl(int floorNo, Location location, String parkingSpotId) {
        super(floorNo, location,  ParkingSpotConstants.SUV_COST_PER_HR, parkingSpotId);
    }

}
