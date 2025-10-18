package systems;
import java.util.Scanner;

public class Marks {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static int[] marks = new int[3];
    static int total;
    static double average;
    static char grade;
    static String status;

    public static void enterMarks() {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark. Try again.");
                i--;
            }
        }
    }

    public static void calculateTotal() {
        total = marks[0] + marks[1] + marks[2];
        average = total / 3.0;
    }

    public static void calculateGrade() {
        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';
    }

    public static void checkPass() {
        for (int m : marks) {
            if (m < 50) { status = "Fail"; return; }
        }
        status = "Pass";
    }

    public static void displayReport() {
        System.out.println("\n----- REPORT -----");
        System.out.println("Name: " + name);
        for (int i = 0; i < 3; i++)
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        enterMarks();
        calculateTotal();
        calculateGrade();
        checkPass();
        displayReport();
    }
}
