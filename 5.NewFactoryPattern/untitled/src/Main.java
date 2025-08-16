import AbstractFactory.CarSegmentFactory;
import factories.LuxuryVehicle;
import factories.Vehicle;

public class Main {

    public static void main(String[] args) {
        CarSegmentFactory carSegmentFactory = new CarSegmentFactory();
        Vehicle vehicle = carSegmentFactory.getVehicle("ordinary","tata");


    }
}