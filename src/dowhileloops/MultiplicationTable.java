package dowhileloops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number for multiplication table: ");
            num = sc.nextInt();

            System.out.println("Multiplication Table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.print("Do you want to enter another number? (1=Yes, 0=No): ");
        } while (sc.nextInt() == 1);

        System.out.println("Program ended.");
        sc.close();
    }
}
