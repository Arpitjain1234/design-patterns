import java.util.*;

public class MovieShowController {
    private final Map<Movie, List<Show>> movieShowMap = new HashMap<>();

    public void addMovieShow(Movie movie, Show show) {
        movieShowMap.computeIfAbsent(movie, k -> new ArrayList<>()).add(show);
    }

    public boolean isMovieShowScheduled(Movie movie) {
        return movieShowMap.containsKey(movie);
    }

    public List<Show> getShowsForMovieBetween(Movie movie, Date from, Date to) {
        List<Show> result = new ArrayList<>();
        List<Show> shows = movieShowMap.getOrDefault(movie, Collections.emptyList());

        for (Show show : shows) {
            if (show.isInTimeRange(from, to)) {
                result.add(show);
            }
        }
        return result;
    }
}
