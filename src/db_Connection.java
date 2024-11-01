import java.sql.*;
import java.time.LocalDateTime;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_Connection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/weigth_restric_db?user=root&password=Cs5@11464.";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
            return null;
        }
    }
}
