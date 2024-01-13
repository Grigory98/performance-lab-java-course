package Task1;

import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class DirectorRepositoryImpl implements DirectorRepository {
    private final Connection connection;

    @Override
    public Director get(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Test.directors where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int userId = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                Date birthDate = rs.getDate(4);
                String country = rs.getString(5);
                return new Director(userId, firstName, lastName, birthDate, country);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Director> get(List<String> genres) {
        final StringBuilder query = new StringBuilder("SELECT * FROM Test.directors t1 INNER JOIN Test.movies t2 ON t1.id = t2.director WHERE genre = '"+genres.get(0)+"' ");
        for(int i = 1; i < genres.size(); i++) {
            query.append("OR genre = '"+genres.get(i)+"'");
        }
        try {
            List<Director> directors = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query.toString());
            while (rs.next()) {
                directors.add(new Director(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getString(5)
                ));
            }
            return directors;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(Director director) {
        try {
            String query = "INSERT INTO Test.directors (id, first_name, last_name, birth_date, country) values(?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, director.id);
            ps.setString(2, director.firstName);
            ps.setString(3, director.lastName);
            ps.setDate(4, new java.sql.Date(director.birthDate.getTime()));
            ps.setString(5, director.country);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Director director) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Test.directors where id = ?");
            ps.setInt(1, director.id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public DirectorRepositoryImpl(Connection connection) {
        this.connection = connection;
    }
}
