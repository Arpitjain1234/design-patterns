import java.util.Objects;

public class VehicleFactory {

    Vehicle getVehicleFromFactory(String vehicleType){
        if(Objects.equals(vehicleType, "Bike")){
            return new Bike();
        }
        if(vehicleType == "Car"){
            return new Car();
        }
        return new NullVehicle();
    }
}
