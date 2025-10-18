package switchcases;
import java.util.Scanner;

public class VowelConsonantSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a vowel.");
            default -> {
                if (Character.isLetter(ch))
                    System.out.println(ch + " is a consonant.");
                else
                    System.out.println("Not a valid letter!");
            }
        }

        sc.close();
    }
}
