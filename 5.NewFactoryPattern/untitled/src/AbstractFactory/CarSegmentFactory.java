package AbstractFactory;

import factories.LuxuryVehicle;
import factories.OrdinaryVehicle;
import factories.Vehicle;

public class CarSegmentFactory {

    public Vehicle getVehicle(String vehicleType,String vehicleModel){
        switch (vehicleType){
            case "luxury":
                return new LuxuryVehicle().getVehiclename(vehicleModel);
            case "ordinary" :
                return new OrdinaryVehicle().getVehiclename(vehicleModel);
            default:
                return null;
        }

    }
}
