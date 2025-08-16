public class Vehicle {
    String name;
    String manufacturerName;
    int yearOfManufacture;
    String chassisNo;
    double mileage;
    double costPerHour;
    double costPerDay;
    Boolean isAvailable;
    VehicleType vehicleType;
    String engineCc;
    String numberPlate;

    public Vehicle(String name,String manufacturerName,double mileage,
                   double costPerDay, double costPerHour, Boolean isAvailable,VehicleType vehicleType,
                    String numberPlate){
        this.name = name;
        this.manufacturerName = manufacturerName;
        this.mileage = mileage;
        this.costPerDay = costPerDay;
        this.costPerHour = costPerHour;
        this.isAvailable = isAvailable;
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;

    }

}
