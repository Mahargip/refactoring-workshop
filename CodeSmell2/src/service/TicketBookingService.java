package service;

import model.Ticket;

public class TicketBookingService {
    public void bookTicket(Ticket ticket) {
        System.out.println("Memproses pemesanan tiket...");
        printTicketDetails(ticket);
        System.out.println("Pesanan selesai.");
    }

    private void printTicketDetails(Ticket ticket) {
        System.out.println("Pelanggan: " + ticket.getCustomer().getName() + ", "
                + ticket.getCustomer().getPhone() + ", " + ticket.getCustomer().getEmail());
        System.out.println("Film: " + ticket.getMovie().getTitle() + " pada "
                + ticket.getMovie().getDate() + " jam " + ticket.getMovie().getTime());
        System.out.println("Kursi: " + ticket.getSeatNumber());
    }
}
