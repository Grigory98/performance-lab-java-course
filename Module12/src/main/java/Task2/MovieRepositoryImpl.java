package Task2;

import Task1.Director;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {
    Connection connection;

    @Override
    public Movie get(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Test.movies WHERE id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Movie(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getInt(5)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void save(Movie movie) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Test.movies values(?, ?, ?, ?, ?)");
            ps.setInt(1, movie.id);
            ps.setString(2, movie.title);
            ps.setString(3, movie.genre);
            ps.setDate(4, new java.sql.Date(movie.release.getTime()));
            ps.setInt(5, movie.director);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(Movie movie) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Test.movies WHERE id = ?");
            ps.setInt(1, movie.id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Movie> get(Director d) {
        List<Movie> movies = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Test.movies where director = ?");
            ps.setInt(1, d.id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                movies.add(new Movie(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getInt(5)
                ));
            }
            return movies;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public MovieRepositoryImpl(Connection connection) {
        this.connection = connection;
    }
}
