
package switchcases;
import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0 -> System.out.println("Even");
            case 1, -1 -> System.out.println("Odd");
        }

        sc.close();
    }
}
