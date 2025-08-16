package model;

public class ParkingTicket {
    ParkingSpot parkingSpot;
    double totalCost;
    ParkingTicketStatusEnum statusEnum;

    public  ParkingTicket(ParkingSpot parkingSpot,double hour, ParkingTicketStatusEnum statusEnum){
        this.parkingSpot = parkingSpot;
        this.totalCost = parkingSpot.costPerHour*hour;
        this.statusEnum = statusEnum;
    }


}
