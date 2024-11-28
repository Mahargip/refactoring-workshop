package service;

import model.Ticket;

public class TicketCancellationService {
    public void cancelTicket(Ticket ticket) {
        System.out.println("Memproses pembatalan tiket...");
        printTicketDetails(ticket);
        System.out.println("Pesanan dibatalkan.");
    }

    private void printTicketDetails(Ticket ticket) {
        System.out.println("Pelanggan: " + ticket.getCustomer().getName() + ", "
                + ticket.getCustomer().getPhone() + ", " + ticket.getCustomer().getEmail());
        System.out.println("Film: " + ticket.getMovie().getTitle() + " pada "
                + ticket.getMovie().getDate() + " jam " + ticket.getMovie().getTime());
        System.out.println("Kursi: " + ticket.getSeatNumber());
    }
}
