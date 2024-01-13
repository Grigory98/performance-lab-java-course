package Task2;

import Task1.Director;

import java.util.List;

public interface MovieRepository {
    Movie get(int id);

    void save(Movie movie);

    void delete(Movie movie);

    List<Movie> get(Director d);
}
