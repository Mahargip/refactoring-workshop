import model.Customer;
import model.Movie;
import model.Ticket;
import service.TicketBookingService;
import service.TicketCancellationService;
import service.TicketReschedulingService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "1234567890", "alice@example.com");

        Movie movie = new Movie("Avatar 2", "2024-12-01", "18:00");
        Ticket ticket = new Ticket(customer, movie, "A12");

        TicketBookingService bookingService = new TicketBookingService();
        bookingService.bookTicket(ticket);

        TicketCancellationService cancellationService = new TicketCancellationService();
        cancellationService.cancelTicket(ticket);

        Movie newMovie = new Movie("Avatar 2", "2024-12-02", "20:00");
        TicketReschedulingService reschedulingService = new TicketReschedulingService();
        reschedulingService.rescheduleTicket(ticket, newMovie);
    }
}
