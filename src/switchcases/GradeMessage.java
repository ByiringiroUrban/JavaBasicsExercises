package switchcases;
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A–F): ");
        char grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A' -> System.out.println("Excellent!");
            case 'B' -> System.out.println("Very Good!");
            case 'C' -> System.out.println("Good");
            case 'D' -> System.out.println("Needs Improvement");
            case 'E' -> System.out.println("Poor");
            case 'F' -> System.out.println("Fail");
            default -> System.out.println("Invalid grade!");
        }

        sc.close();
    }
}
