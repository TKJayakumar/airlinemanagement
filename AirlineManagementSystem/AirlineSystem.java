package AirlineManagementSystem;

import java.util.*;

public class AirlineSystem {
    private List<Flight> flights;
    private List<Ticket> tickets;

    public AirlineSystem() {
        flights = new ArrayList<>();
        tickets = new ArrayList<>();
        addSampleFlights();
    }

    private void addSampleFlights() {
        flights.add(new Flight("AI101", "Delhi", "Mumbai", 5));
        flights.add(new Flight("AI202", "Chennai", "Bangalore", 3));
        flights.add(new Flight("AI303", "Hyderabad", "Kolkata", 2));
    }

    public void displayFlights() {
        System.out.println("\n📋 Available Flights:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public Flight getFlightByNumber(String number) {
        for (Flight f : flights) {
            if (f.getFlightNumber().equalsIgnoreCase(number)) {
                return f;
            }
        }
        return null;
    }

    public void bookTicket(Scanner sc) {
        displayFlights();
        System.out.print("Enter flight number to book: ");
        String fNo = sc.next();
        Flight selectedFlight = getFlightByNumber(fNo);

        if (selectedFlight != null && selectedFlight.getAvailableSeats() > 0) {
            sc.nextLine();  // Clear buffer
            System.out.print("Enter passenger name: ");
            String name = sc.nextLine();
            System.out.print("Enter passenger email: ");
            String email = sc.nextLine();

            if (selectedFlight.bookSeat()) {
                Passenger p = new Passenger(name, email);
                Ticket t = new Ticket(p, selectedFlight);
                tickets.add(t);
                System.out.println("\n✅ Ticket booked successfully!");
                System.out.println(t);
            } else {
                System.out.println("❌ No seats available.");
            }
        } else {
            System.out.println("❌ Flight not found or full.");
        }
    }

    public void showAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            System.out.println("\n🎟️ Booked Tickets:");
            for (Ticket t : tickets) {
                System.out.println(t);
            }
        }
    }
}

