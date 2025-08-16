package factories;

import luxury.Audi;
import luxury.Bmw;
import luxury.Lexus;
import luxury.Toyota;

public class LuxuryVehicle implements Vehicle{

    @Override
    public void name(){
        System.out.println("Luxury Vehicle");
    }
    public LuxuryVehicle getVehiclename(String vehicleName){
        switch (vehicleName){
            case  "bmw":
                return new Bmw();
            case "toyota":
                return new Toyota();
            case "audi":
                return new Audi();
            case "lexus":
                return new Lexus();
        }
        return null;
    }
}
