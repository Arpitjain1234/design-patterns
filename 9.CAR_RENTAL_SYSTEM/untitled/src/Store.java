import java.util.List;

public class Store {
    String storeId;
    Location location;
    StoreInventoryManager inventoryManager;
    List<Reservation>reservations;

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }
    void addVehicle(Vehicle vehicle){
        inventoryManager.vehicles.add(vehicle);
    }
    void removeVehicle(Vehicle vehicle){
        inventoryManager.vehicles.remove(vehicle);

    }




}
