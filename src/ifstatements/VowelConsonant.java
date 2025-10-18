package ifstatements;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is a vowel.");
        else if (Character.isLetter(ch))
            System.out.println(ch + " is a consonant.");
        else
            System.out.println("Not a valid letter.");

        sc.close();
    }
}
