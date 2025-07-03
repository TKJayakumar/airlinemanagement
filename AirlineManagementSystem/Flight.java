package AirlineManagementSystem;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int totalSeats;
    private int bookedSeats;

    public Flight(String flightNumber, String origin, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public int getAvailableSeats() { return totalSeats - bookedSeats; }

    public boolean bookSeat() {
        if (bookedSeats < totalSeats) {
            bookedSeats++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Flight %s: %s to %s | Available Seats: %d",
                flightNumber, origin, destination, getAvailableSeats());
    }
}

