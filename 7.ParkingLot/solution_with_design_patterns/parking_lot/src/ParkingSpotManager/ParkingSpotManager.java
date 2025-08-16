package ParkingSpotManager;

import model.ParkingSpot;

public interface ParkingSpotManager {
    public ParkingSpot findNearestSpot();
    public void releaseParkingSpot();
    public ParkingSpot addParkingSpot();
    public void removeParkingSpot();
}
