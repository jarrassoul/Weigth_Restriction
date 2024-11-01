import java.sql.SQLException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();

        try {
            // Run the ticket generation process
            ticketService.checkVehiclesOnRoutes();

            System.out.println("Vehicle check completed. Tickets generated for violations.");
        } catch (SQLException e) {
            System.out.println("An error occurred while processing tickets.");
            e.printStackTrace();
        }

    }
}