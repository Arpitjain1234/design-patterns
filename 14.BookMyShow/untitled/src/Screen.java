import java.util.List;

public class Screen {
    int screenId;
    String screenName;
    List<Seat> availableSeats;

    public Screen(int screenId, String screenName, List<Seat> seats) {
        this.screenId = screenId;
        this.screenName = screenName;
        this.availableSeats = seats;
    }

    public void bookAvailableSeat(Seat seat) {
        if (availableSeats.contains(seat) && seat.isAvailable) {
            seat.isAvailable = false;
            System.out.println("Seat booked: " + seat);
        } else {
            System.out.println("Seat unavailable: " + seat);
        }
    }
}
