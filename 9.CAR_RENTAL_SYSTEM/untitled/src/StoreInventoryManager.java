import java.util.List;

public class StoreInventoryManager {
    List<Vehicle>vehicles;

    StoreInventoryManager(List<Vehicle>vehicles){
        this.vehicles = vehicles;
    }
    public List<Vehicle> getVehicles() {
        //filtering
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }




}
