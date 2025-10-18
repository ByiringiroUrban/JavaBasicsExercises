package forloops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int rev = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Reversed number: " + rev);
        sc.close();
    }
}
