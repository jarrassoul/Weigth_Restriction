import java.sql.*;

public class TicketDAO {
    public void addTicket(Ticket ticket) throws SQLException {
        String sql = "INSERT INTO Ticket (vehicle_id, route_id, violation_details, owner_name, owner_address) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = db_Connection.connect();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, ticket.getVehicle().getId());
            pstmt.setInt(2, ticket.getRoute().getId());
            pstmt.setString(3, ticket.getViolationDetails());
            pstmt.setString(4, ticket.getVehicle().getOwnerName());
            pstmt.setString(5, ticket.getVehicle().getOwnerAddress());
            pstmt.executeUpdate();
        }
    }
}
