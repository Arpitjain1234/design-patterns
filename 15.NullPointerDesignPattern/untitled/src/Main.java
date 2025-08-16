import java.util.Optional;

public class Main {
    public static void main(String[] args){


        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle = vehicleFactory.getVehicleFromFactory("Bike");
        System.out.println("The seating capacity is : "+vehicle.getSeatingCapacity());

        Vehicle vehicle1 = vehicleFactory.getVehicleFromFactory("Car");
        System.out.println("The seating capacity is : "+vehicle1.getSeatingCapacity());

        Vehicle vehicle2 = vehicleFactory.getVehicleFromFactory("");
        System.out.println("The seating capacity is : "+vehicle2.getSeatingCapacity());

    }
}