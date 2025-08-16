import java.util.Date;

public class Reservation {
    int id;
    User user;
    Vehicle vehicle;
    String pickUpLocation;
    String dropLocation;
    Date dateFrom;
    Date dateTill;
    Long fromTimeStamp;
    Long toTimeStamp;


    void createReserve(User user, Vehicle vehicle){// and also time fields
        this.vehicle = vehicle;
        this.user = user;
        //geneate id here

    }


}
