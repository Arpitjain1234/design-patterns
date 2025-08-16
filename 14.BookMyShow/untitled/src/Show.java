import java.util.Date;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Date startTime;
    Date endTime;
    List<Theatre> theatreList;

    public Show(int showId, Movie movie, Date startTime, Date endTime, List<Theatre> theatreList) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.theatreList = theatreList;
    }

    public boolean isInTimeRange(Date from, Date to) {
        return !(startTime.after(to) || endTime.before(from));
    }

    @Override
    public String toString() {
        return movie + " @ " + startTime + " to " + endTime;
    }
}
