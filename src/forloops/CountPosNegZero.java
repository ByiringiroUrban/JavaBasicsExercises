package forloops;
import java.util.Scanner;

public class CountPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeroes: " + zero);

        sc.close();
    }
}
