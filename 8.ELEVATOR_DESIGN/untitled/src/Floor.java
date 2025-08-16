public class Floor {
    int floor;
    ExternalRequestDispatcher externalRequestDispatcher;

    Floor(int floor){
        this.floor = floor;
        externalRequestDispatcher = new ExternalRequestDispatcher();
    }

}
