import Strategy.MovingStrategy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCar {
    InternalRequestDispatcher internalRequestDispatcher;
    Status status;
    List<Button>buttonList;
    Floor currentFloor;
    Directions direction;

    ElevatorCar(){
        internalRequestDispatcher = new InternalRequestDispatcher();
        status = Status.ACTIVE;
        buttonList = new ArrayList<Button>();
    }



}
