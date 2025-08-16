package model;

import java.util.*;

public class ParkingLot {

    ParkingSpot [][][]parkingLot;
    private List<Location> entryExitPoints = new ArrayList<>();


    private int length;
    private int breadth;
    private int floors;

    private Map<Class<? extends ParkingSpot>, PriorityQueue<ParkingSpot>> availableSpotsMap = new HashMap<>();
    public ParkingLot(int len,int bre,int floor){
        this.length = len;
        this.breadth = bre;
        this.floors = floor;

        parkingLot = new ParkingSpot[floors][breadth][length];

        // populating the parking lot with as simple strategy of equal numbers of spots for each type
        availableSpotsMap.put(BikeParkingSpotImpl.class, new PriorityQueue<>(
                Comparator.comparingInt(spot -> getMinDistanceToEntry(spot.location))
        ));
        availableSpotsMap.put(CompactParkingSpotImpl.class, new PriorityQueue<>(
                Comparator.comparingInt(spot -> getMinDistanceToEntry(spot.location))
        ));
        availableSpotsMap.put(SuvParkingSpotImpl.class, new PriorityQueue<>(
                Comparator.comparingInt(spot -> getMinDistanceToEntry(spot.location))
        ));
        availableSpotsMap.put(LargeVehicleParkingSpotImpl.class, new PriorityQueue<>(
                Comparator.comparingInt(spot -> getMinDistanceToEntry(spot.location))
        ));

        for(int f = 0 ;f < floors; f++){
            for(int i = 0; i< length ; i++){
                for(int j = 0; j < breadth ; j++){
                    String parkingSpotId = "F"+f+"R"+i+"C"+j;
                    Location location = new Location(i,j);
                    if(i<length/4){
                        parkingLot[f][i][j]  = new BikeParkingSpotImpl(f,location,parkingSpotId);
                    }
                    else if(i<length/2){
                        parkingLot[f][i][j] = new CompactParkingSpotImpl(f,location,parkingSpotId);
                    }
                    else if(i<3*length/4){
                        parkingLot[f][i][j]  = new SuvParkingSpotImpl(f,location,parkingSpotId);
                    }
                    else{
                        parkingLot[f][i][j]  = new LargeVehicleParkingSpotImpl(f,location,parkingSpotId);
                    }

                }
            }
        }
        // populate the entry exit points in the lot;

        entryExitPoints.add(new Location(0, 0));
        entryExitPoints.add(new Location(length - 1, breadth - 1));
        entryExitPoints.add(new Location(length - 1, 0));
        entryExitPoints.add(new Location(0, breadth - 1));
    }


    public void assignParkingSpot(Vehicle vehicle){
        if(vehicle == null){
            System.out.println("Invalid vehicle !!");
            return;
        }
        ParkingSpot requiredSpot = vehicle.getRequiredSpotType();
        ParkingSpot nearestSpot = getNearestAvailableSpot(requiredSpot.getClass());


    }

    private ParkingSpot getNearestAvailableSpot(Class<? extends ParkingSpot> requiredSpotClass) {
        PriorityQueue<ParkingSpot> pq = availableSpotsMap.get(requiredSpotClass);

        if (pq == null) {
            System.out.println("No such spot type registered in the system.");
            return null;
        }

        while (!pq.isEmpty()) {
            ParkingSpot candidate = pq.peek();
            if (!candidate.isOccupied) {
                return candidate;
            } else {
                pq.poll();
            }
        }

        return null;
    }
    private int getMinDistanceToEntry(Location loc) {
        int min = Integer.MAX_VALUE;

        for (Location entry : entryExitPoints) {
            int distance = Math.abs(loc.x - entry.x) + Math.abs(loc.y - entry.y);
            min = Math.min(min, distance);
        }

        return min;
    }

    private void releaseSpot(ParkingSpot spot) {
        if (spot == null) {
            System.out.println("Cannot release null spot.");
            return;
        }

        spot.isOccupied  = false;

        PriorityQueue<ParkingSpot> pq = availableSpotsMap.get(spot.getClass());
        if (pq == null) {
            System.out.println("Spot class not recognized in availableSpotsMap.");
            return;
        }

        pq.add(spot); // Add back to available queue
        System.out.println("Spot " + spot.parkingSpotId + " is now available.");
    }












}
