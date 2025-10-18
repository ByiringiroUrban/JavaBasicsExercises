package systems;
import java.util.Scanner;

public class Library {
    static Scanner sc = new Scanner(System.in);
    static String bookTitle;
    static int daysOverdue;
    static double finePerDay = 500;
    static double fine, discount, totalPayable, paid, balance;

    public static void enterBookDetails() {
        System.out.print("Enter book title: ");
        bookTitle = sc.nextLine();
        System.out.print("Enter days overdue: ");
        daysOverdue = sc.nextInt();
        if (daysOverdue < 0) {
            System.out.println("Invalid input. Days overdue cannot be negative.");
            enterBookDetails();
        }
    }

    public static void calculateFine() {
        fine = daysOverdue * finePerDay;
        totalPayable = fine;
    }

    public static void applyDiscount() {
        if (fine > 5000) {
            discount = fine * 0.10;
            totalPayable = fine - discount;
        } else discount = 0;
    }

    public static void payment() {
        System.out.print("Enter amount paid: ");
        paid = sc.nextDouble();
        if (paid < totalPayable) {
            System.out.println("Insufficient payment. Try again.");
            payment();
        } else balance = paid - totalPayable;
    }

    public static void displayReceipt() {
        System.out.println("\n----- LIBRARY FINE RECEIPT -----");
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine: " + fine);
        System.out.println("Discount: " + discount);
        System.out.println("Total Payable: " + totalPayable);
        System.out.println("Amount Paid: " + paid);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        enterBookDetails();
        calculateFine();
        applyDiscount();
        payment();
        displayReceipt();
    }
}
