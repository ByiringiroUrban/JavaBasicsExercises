
package switchcases;
import java.util.Scanner;

public class StartProcessStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1–3): ");
        int code = sc.nextInt();

        switch (code) {
            case 1 -> System.out.println("Start");
            case 2 -> System.out.println("Process");
            case 3 -> System.out.println("Stop");
            default -> System.out.println("Invalid input!");
        }

        sc.close();
    }
}
