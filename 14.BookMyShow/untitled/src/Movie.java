import java.util.Objects;

public class Movie {
    int movieId;
    String movieName;

    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return movieId == movie.movieId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId);
    }

    @Override
    public String toString() {
        return movieName;
    }
}
