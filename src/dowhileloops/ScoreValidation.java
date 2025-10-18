package dowhileloops;

import java.util.Scanner;

public class ScoreValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        do {
            System.out.print("Enter a score (0–100): ");
            score = sc.nextInt();

            if (score < 0 || score > 100)
                System.out.println("Invalid! Please enter a score between 0 and 100.");
        } while (score < 0 || score > 100);

        System.out.println("Valid score entered: " + score);
        sc.close();
    }
}
