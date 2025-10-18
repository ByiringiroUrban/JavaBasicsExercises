
package switchcases;
import java.util.Scanner;

public class RangeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num / 10) {
            case 0 -> System.out.println("Less than 10");
            case 1, 2, 3, 4, 5 -> System.out.println("Between 10 and 50");
            default -> System.out.println("Greater than 50");
        }

        sc.close();
    }
}
