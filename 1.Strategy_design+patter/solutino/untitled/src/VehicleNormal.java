import Strategy.StrategyNormal;

public class VehicleNormal extends  Vehicle{

    VehicleNormal(){
        super(new StrategyNormal());
    }
}
