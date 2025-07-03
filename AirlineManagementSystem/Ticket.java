package AirlineManagementSystem;

public class Ticket {
    private static int idCounter = 1;
    private int ticketId;
    private Passenger passenger;
    private Flight flight;

    public Ticket(Passenger passenger, Flight flight) {
        this.ticketId = idCounter++;
        this.passenger = passenger;
        this.flight = flight;
    }

    public int getTicketId() { return ticketId; }
    public Passenger getPassenger() { return passenger; }
    public Flight getFlight() { return flight; }

    @Override
    public String toString() {
        return String.format("🎫 Ticket #%d\nPassenger: %s\nFlight: %s → %s (%s)\n",
                ticketId, passenger.getName(), flight.getOrigin(), flight.getDestination(), flight.getFlightNumber());
    }
}

