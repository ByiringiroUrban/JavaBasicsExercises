package systems;
import java.util.Scanner;

public class Transport {
    static Scanner sc = new Scanner(System.in);
    static String startPoint, destination;
    static int seats;
    static double seatPrice, total, paid, balance;

    public static void selectRoute() {
        System.out.print("Enter Starting Point: ");
        startPoint = sc.nextLine();
        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        if ((startPoint.equalsIgnoreCase("Kigali") && destination.equalsIgnoreCase("Butare")) ||
            (startPoint.equalsIgnoreCase("Butare") && destination.equalsIgnoreCase("Kigali"))) {
            seatPrice = 2000;
        } else if ((startPoint.equalsIgnoreCase("Kigali") && destination.equalsIgnoreCase("Rubavu")) ||
                   (startPoint.equalsIgnoreCase("Rubavu") && destination.equalsIgnoreCase("Kigali"))) {
            seatPrice = 3000;
        } else {
            System.out.println("Unknown route. Default price = 2500 RWF");
            seatPrice = 2500;
        }
    }

    public static void chooseSeats() {
        System.out.print("Enter number of seats to book: ");
        seats = sc.nextInt();
        if (seats <= 0) {
            System.out.println("Invalid number of seats. Try again.");
            chooseSeats();
        }
    }

    public static void calculateFare() {
        total = seats * seatPrice;
    }

    public static void payment() {
        System.out.print("Enter amount paid: ");
        paid = sc.nextDouble();
        if (paid < total) {
            System.out.println("Insufficient payment. Try again.");
            payment();
        } else balance = paid - total;
    }

    public static void displayTicket() {
        System.out.println("\n----- TRANSPORT TICKET -----");
        System.out.println("Route: " + startPoint + " → " + destination);
        System.out.println("Seats: " + seats);
        System.out.println("Price per seat: " + seatPrice);
        System.out.println("Total Fare: " + total);
        System.out.println("Paid: " + paid);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        selectRoute();
        chooseSeats();
        calculateFare();
        payment();
        displayTicket();
    }
}
