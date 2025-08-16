import java.util.*;

public class ElevatorController {


    PriorityQueue<Integer> minPQ ;
    PriorityQueue<Integer> maxPQ ;
    List<Integer> pendingJobs = new ArrayList<>();

    ElevatorCar elevatorCar ;

    ElevatorController(ElevatorCar car){
        this.elevatorCar = car;
        this.minPQ = new PriorityQueue<>();
        this.maxPQ = new PriorityQueue<>(Collections.reverseOrder());


    }
    void acceptExternalRequest(Directions direction, Floor requestFromFloor){

        if(elevatorCar.currentFloor.floor<requestFromFloor.floor && direction==Directions.UP){
            minPQ.add(requestFromFloor.floor);
        }
        else if(elevatorCar.currentFloor.floor>requestFromFloor.floor && direction==Directions.UP){
            pendingJobs.add(requestFromFloor.floor);
        }
        else if(elevatorCar.currentFloor.floor<requestFromFloor.floor && direction==Directions.DOWN){
            pendingJobs.add(requestFromFloor.floor);
        }
        else if(elevatorCar.currentFloor.floor>requestFromFloor.floor && direction==Directions.DOWN){
            maxPQ.add(requestFromFloor.floor);
        }


    }
    void moveElevator(){

        while (true){
            if(elevatorCar.direction==Directions.UP ){
                while (!minPQ.isEmpty()) {
                    int val = minPQ.poll();
                    System.out.println("On floor :" + val);
                }
                // add all the pending jobs to maxPq
                elevatorCar.direction = Directions.DOWN;
            }
            else if (elevatorCar.direction == Directions.DOWN) {
                while (!maxPQ.isEmpty()) {
                    int val = maxPQ.poll();
                    System.out.println("On floor :" + val);
                }
                // add all the jobs to minPQ

            }
        }
    }
}
