package whileloops;

import java.util.Scanner;

public class StopWhenZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
            if (num == 0) break;
        }
        System.out.println("Program stopped.");
        sc.close();
    }
}
