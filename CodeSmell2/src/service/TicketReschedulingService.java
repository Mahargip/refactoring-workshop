package service;

import model.Movie;
import model.Ticket;

public class TicketReschedulingService {
    public void rescheduleTicket(Ticket ticket, Movie newMovie) {
        System.out.println("Memproses penggantian jadwal tiket...");
        printTicketDetails(ticket, newMovie);
        System.out.println("Jadwal berhasil diganti.");
    }

    private void printTicketDetails(Ticket ticket, Movie newMovie) {
        System.out.println("Pelanggan: " + ticket.getCustomer().getName() + ", "
                + ticket.getCustomer().getPhone() + ", " + ticket.getCustomer().getEmail());
        System.out.println("Film: " + ticket.getMovie().getTitle());
        System.out.println("Jadwal lama: " + ticket.getMovie().getDate() + " jam " + ticket.getMovie().getTime());
        System.out.println("Jadwal baru: " + newMovie.getDate() + " jam " + newMovie.getTime());
        System.out.println("Kursi: " + ticket.getSeatNumber());
    }
}
