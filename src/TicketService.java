import java.sql.SQLException;
import java.util.List;

public class TicketService {
    private VehicleDAO vehicleDAO = new VehicleDAO();
    private RouteDAO routeDAO = new RouteDAO();
    private TicketDAO ticketDAO = new TicketDAO();

    public void checkVehiclesOnRoutes() throws SQLException {
        List<Vehicle> vehicles = vehicleDAO.getAllVehicles();
        List<Route> routes = routeDAO.getAllRoutes();

        for (Vehicle vehicle : vehicles) {
            for (Route route : routes) {
                if (vehicle.getWeight() > route.getWeightRestriction()) {
                    Ticket ticket = new Ticket(0, vehicle, route, "Exceeded weight limit on " + route.getName());
                    ticketDAO.addTicket(ticket);
                }
            }
        }
    }
}  