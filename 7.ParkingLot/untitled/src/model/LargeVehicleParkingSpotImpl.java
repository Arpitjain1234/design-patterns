
package model;

import constants.ParkingSpotConstants;

public class LargeVehicleParkingSpotImpl extends ParkingSpot{

    public LargeVehicleParkingSpotImpl(int floorNo, Location location, String parkingSpotId) {
        super(floorNo, location,  ParkingSpotConstants.LARGE_VEHICLE_COST_PER_HR, parkingSpotId);
    }

}
