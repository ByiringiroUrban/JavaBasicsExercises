package systems;
import java.util.Scanner;

public class Cafeteria {
    static Scanner sc = new Scanner(System.in);
    static String itemName;
    static int quantity;
    static double unitPrice, total, paid, balance;

    public static void selectItem() {
        System.out.print("Enter food item: ");
        itemName = sc.nextLine();

        System.out.print("Enter price per item: ");
        unitPrice = sc.nextDouble();
        if (unitPrice <= 0) {
            System.out.println("Invalid price. Try again.");
            sc.nextLine(); // clear buffer
            selectItem();
        }
    }

    public static void quantity() {
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        if (quantity <= 0) {
            System.out.println("Invalid quantity. Try again.");
            quantity();
        }
    }

    public static void calculateBill() {
        total = unitPrice * quantity;
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
        System.out.println("\n----- CAFETERIA RECEIPT -----");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total: " + total);
        System.out.println("Paid: " + paid);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        selectItem();
        quantity();
        calculateBill();
        payment();
        displayReceipt();
    }
}
