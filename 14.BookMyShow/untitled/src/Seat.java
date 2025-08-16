public class Seat {
    int seatNumber;
    SeatType seatType;
    int seatPrice;
    boolean isAvailable = true;

    public Seat(int seatNumber, SeatType seatType, int seatPrice) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatPrice = seatPrice;
    }

    @Override
    public String toString() {
        return seatType + " #" + seatNumber + " - ₹" + seatPrice;
    }
}
