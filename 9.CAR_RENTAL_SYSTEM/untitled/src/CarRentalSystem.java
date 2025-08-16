import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarRentalSystem {
    User user = new User("Arpit","Jain",Gender.Male,
            "MP04ZG7041","jainarpit@gmail.cim","930");

    Vehicle vehicle = new Vehicle("330Li","BMW",9.8,
            25000,1500,true, VehicleType.CAR,"MP04ZG7041");

    List<Vehicle> vehicles = Arrays.asList(vehicle);

    StoreInventoryManager storeInventoryManager = new StoreInventoryManager(vehicles);
}
