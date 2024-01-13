import Task1.Director;
import Task1.DirectorRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.Date;

public class JDBC1Tests {
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
    @DisplayName("Добавление нового режиссера")
    void checkAddNewDirector() {
        connect();
        Director director = new Director(5, "Райан", "Гослинг", new Date("12/11/1980"), "США");
        DirectorRepositoryImpl directorRepository = new DirectorRepositoryImpl(connection);
        try {
            directorRepository.save(director);
            director = directorRepository.get(director.id);
            Assertions.assertNotNull(director, "Пользователь добавлен в БД.");
        } finally {
            //Очистка данных
            directorRepository.delete(director);
        }
    }

    @Test
    @DisplayName("Получение режиссера")
    void checkGetUsers() {
        connect();
        Director director = new Director(5, "Райан", "Гослинг", new Date("12/11/1980"), "США");
        DirectorRepositoryImpl directorRepository = new DirectorRepositoryImpl(connection);
        directorRepository.save(director);
        try {
            director = directorRepository.get(director.id); // Пользователь есть в БД.
            Assertions.assertNotNull(director, "Пользователь не должен быть null");
        } finally {
            //Очистка данных
            directorRepository.delete(director);
        }

    }
}
