import java.util.*;

public class MovieCityController {
    private final Map<City, List<Movie>> cityMovieList = new HashMap<>();
    private final Set<Movie> allMoviesList = new HashSet<>();

    public void addMovieToCity(City city, Movie movie) {
        cityMovieList.computeIfAbsent(city, k -> new ArrayList<>()).add(movie);
        allMoviesList.add(movie);
    }

    public void removeMovieFromCity(Movie movie, City city) {
        if (cityMovieList.containsKey(city)) {
            List<Movie> movies = cityMovieList.get(city);
            movies.remove(movie);
            if (movies.isEmpty()) {
                cityMovieList.remove(city);
            }
        }
    }

    public void printAllMoviesInCity(City city) {
        System.out.println("Movies in " + city + ": " + cityMovieList.getOrDefault(city, new ArrayList<>()));
    }
}
