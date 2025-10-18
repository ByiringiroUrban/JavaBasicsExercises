package dowhileloops;

import java.util.Scanner;

public class StopOnNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number (negative to stop): ");
            num = sc.nextInt();
        } while (num >= 0);

        System.out.println("Program stopped. You entered a negative number.");
        sc.close();
    }
}
