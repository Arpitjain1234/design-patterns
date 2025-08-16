import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Movie inception = new Movie(1, "Inception");
        MovieShowController showController = new MovieShowController();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date start1 = sdf.parse("2025-07-26 10:00");
        Date end1 = sdf.parse("2025-07-26 12:30");

        Date start2 = sdf.parse("2025-07-26 15:00");
        Date end2 = sdf.parse("2025-07-26 17:30");

        Show morningShow = new Show(101, inception, start1, end1, new ArrayList<>());
        Show eveningShow = new Show(102, inception, start2, end2, new ArrayList<>());

        showController.addMovieShow(inception, morningShow);
        showController.addMovieShow(inception, eveningShow);

        Date filterFrom = sdf.parse("2025-07-26 09:00");
        Date filterTo = sdf.parse("2025-07-26 16:00");

        List<Show> filteredShows = showController.getShowsForMovieBetween(inception, filterFrom, filterTo);
        System.out.println("Filtered shows:");
        for (Show show : filteredShows) {
            System.out.println(show);
        }
    }
}
