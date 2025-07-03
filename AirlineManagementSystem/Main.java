package AirlineManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AirlineSystem system = new AirlineSystem();

        while (true) {
            System.out.println("\n✈️ Airline Reservation System");
            System.out.println("1. View Flights");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Booked Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    system.displayFlights();
                    break;
                case 2:
                    system.bookTicket(sc);
                    break;
                case 3:
                    system.showAllTickets();
                    break;
                case 4:
                    System.out.println("👋 Thank you for using Airline Reservation System!");
                    return;
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}

