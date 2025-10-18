package systems;
import java.util.Scanner;

public class Hotel {
    static Scanner sc = new Scanner(System.in);
    static String customerName, roomType;
    static int nights;
    static double rate, total, paid, balance;

    public static void bookRoom() {
        System.out.print("Enter customer name: ");
        customerName = sc.nextLine();
        System.out.print("Enter room type (single, double, suite): ");
        roomType = sc.nextLine().toLowerCase();

        switch (roomType) {
            case "single": rate = 50000; break;
            case "double": rate = 80000; break;
            case "suite": rate = 120000; break;
            default:
                System.out.println("Invalid room type. Try again.");
                bookRoom();
        }
    }

    public static void stayDuration() {
        System.out.print("Enter number of nights: ");
        nights = sc.nextInt();
        if (nights <= 0) {
            System.out.println("Invalid nights. Try again.");
            stayDuration();
        }
    }

    public static void calculateBill() {
        total = rate * nights;
    }

    public static void payment() {
        System.out.print("Enter amount paid: ");
        paid = sc.nextDouble();
        if (paid < total) {
            System.out.println("Insufficient payment. Try again.");
            payment();
        } else balance = paid - total;
    }

    public static void displayReceipt() {
        System.out.println("\n----- RECEIPT -----");
        System.out.println("Customer: " + customerName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Total: " + total);
        System.out.println("Paid: " + paid);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        bookRoom();
        stayDuration();
        calculateBill();
        payment();
        displayReceipt();
    }
}
