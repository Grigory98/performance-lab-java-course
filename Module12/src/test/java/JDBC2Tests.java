import Task1.Director;
import Task1.DirectorRepositoryImpl;
import Task2.Movie;
import Task2.MovieRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBC2Tests {

    Connection connection;
    final String connectionDB = "jdbc:mysql://localhost:3306/test";
    final String userDB = "root";
    final String passwordDB = "11111";
    final String driver = "com.mysql.cj.jdbc.Driver";

    void connect() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(
                    connectionDB,
                    userDB,
                    passwordDB
            );
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Проверка получения фильма")
    void checkGetMovie() {
        connect();
        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl(connection);
        Movie movie = new Movie(10, "Test", "Comedy", new Date("13/02/2222"), 5);
        movieRepository.save(movie);
        try {
            movie = movieRepository.get(movie.id);
            Assertions.assertNotNull(movie, "Фильм не получен");
        } finally {
            //Очистка данных
            movieRepository.delete(movie);
        }
    }

    @Test
    @DisplayName("Проверка добавления фильма в БД")
    void checkAddMovie() {
        connect();
        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl(connection);
        Movie movie = new Movie(20, "Gluhar", "Detective", new Date("13/02/2001"), 5);
        try {
            Assertions.assertNull(movieRepository.get(20), "Фильм не добавлен в БД.");
            movieRepository.save(movie);
            movie = movieRepository.get(20);
            Assertions.assertNotNull(movie, "Фильм добавлен в БД.");
        } finally {
            //Очистка данных
            movieRepository.delete(movie);
        }
    }

    @Test
    @DisplayName("Поиск жанров по указанному режиссеру")
    void checkGenresByDirector() {
        connect();
        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl(connection);
        DirectorRepositoryImpl directorRepository = new DirectorRepositoryImpl(connection);

        Director director = new Director(99, "Мадс", "Миккельсен", new Date("22/11/1965"), "США");
        Movie movie1 = new Movie(100, "Druk", "Comedy", new Date("12/11/2020"), director.id);
        Movie movie2 = new Movie(101, "Ganibal", "Horror", new Date("12/11/2013"), director.id);
        try {
            directorRepository.save(director);
            movieRepository.save(movie1);
            movieRepository.save(movie2);

            List<Movie> movies = movieRepository.get(director);
            Assertions.assertEquals(2, movies.size(), "Количество фильмов совпадает");
        } finally {
            //Очистка данных
            movieRepository.delete(movie1);
            movieRepository.delete(movie2);
            directorRepository.delete(director);
        }
    }

    @Test
    @DisplayName("Поиск режиссеров по указанным жанрам")
    void checkDirectorsByGenres() {
        connect();
        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl(connection);
        DirectorRepositoryImpl directorRepository = new DirectorRepositoryImpl(connection);

        Director director1 = new Director(99, "Мадс", "Миккельсен", new Date("22/11/1965"), "США");
        Director director2 = new Director(100, "Джонни", "Сильверхенд", new Date("22/11/2000"), "США");
        Movie movie1 = new Movie(100, "Druk", "Comedy", new Date("12/11/2020"), director1.id);
        Movie movie2 = new Movie(101, "CyberPunk", "Action", new Date("12/11/2013"), director2.id);

        try {
            directorRepository.save(director1);
            directorRepository.save(director2);
            movieRepository.save(movie1);
            movieRepository.save(movie2);
            List<String> genres = new ArrayList<>();
            genres.add("Comedy");
            genres.add("Action");

            Assertions.assertEquals(2, directorRepository.get(genres).size(), "Количество режиссеров совпадает");
        } finally {
            //Очистка данных
            directorRepository.delete(director1);
            directorRepository.delete(director2);
            movieRepository.delete(movie1);
            movieRepository.delete(movie2);
        }
    }
}
