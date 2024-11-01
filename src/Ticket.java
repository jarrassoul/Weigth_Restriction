import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private Vehicle vehicle;
    private Route route;
    private LocalDateTime dateTime;
    private String violationDetails;

    public Ticket(int id, Vehicle vehicle, Route route, String violationDetails) {
        this.id = id;
        this.vehicle = vehicle;
        this.route = route;
        this.dateTime = LocalDateTime.now();
        this.violationDetails = violationDetails;
    }
    // Getters and Setters

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Route getRoute() {
        return route;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getViolationDetails() {
        return violationDetails;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setViolationDetails(String violationDetails) {
        this.violationDetails = violationDetails;
    }
}
