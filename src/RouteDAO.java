import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RouteDAO {
    public List<Route> getAllRoutes() throws SQLException {
        List<Route> routes = new ArrayList<>();
        String sql = "SELECT * FROM Route";
        try (Connection connection = db_Connection.connect();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                routes.add(new Route(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("length"),
                        rs.getDouble("weightRestriction")
                ));
            }
        }
        return routes;
    }
}
