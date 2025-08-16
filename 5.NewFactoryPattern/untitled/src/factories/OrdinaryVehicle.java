package factories;

import ordinary.Hyundai;
import ordinary.Mahindra;
import ordinary.Suzuki;
import ordinary.Tata;

public class OrdinaryVehicle implements Vehicle{
    @Override
    public void name(){
        System.out.println("Ordinary Vehicle");
    }
    public OrdinaryVehicle getVehiclename(String vehicleName){
        switch (vehicleName){
            case  "suzuki":
                return new Suzuki();
            case "hyundai":
                return new Hyundai();
            case "mahindra":
                return new Mahindra();
            case "tata":
                return new Tata();
        }
        return null;

    }
}
