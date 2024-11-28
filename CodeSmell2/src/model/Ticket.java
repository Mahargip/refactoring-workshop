package model;

public class Ticket {
    private Customer customer;
    private Movie movie;
    private String seatNumber;

    public Ticket(Customer customer, Movie movie, String seatNumber) {
        this.customer = customer;
        this.movie = movie;
        this.seatNumber = seatNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}
