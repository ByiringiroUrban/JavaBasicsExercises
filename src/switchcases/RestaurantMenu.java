
package switchcases;
import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Burger - $5");
        System.out.println("2. Pizza - $8");
        System.out.println("3. Sandwich - $4");
        System.out.println("4. Coffee - $3");
        System.out.println("5. Juice - $2");
        System.out.print("Enter item code: ");
        int code = sc.nextInt();

        switch (code) {
            case 1 -> System.out.println("Burger selected. Price: $5");
            case 2 -> System.out.println("Pizza selected. Price: $8");
            case 3 -> System.out.println("Sandwich selected. Price: $4");
            case 4 -> System.out.println("Coffee selected. Price: $3");
            case 5 -> System.out.println("Juice selected. Price: $2");
            default -> System.out.println("Invalid item code!");
        }

        sc.close();
    }
}
