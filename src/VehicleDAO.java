import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAO {
    public List<Vehicle> getAllVehicles() throws SQLException {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM Vehicle";
        try (Connection connection = db_Connection.connect();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                vehicles.add(new Vehicle(
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getDouble("weight"),
                        rs.getString("license_plate"),
                        rs.getString("owner_name"),
                        rs.getString("owner_address")
                ));
            }
        }
        return vehicles;
    }
}
