package ifstatements;
import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp < 10)
            System.out.println("Cold");
        else if (temp <= 25)
            System.out.println("Warm");
        else
            System.out.println("Hot");

        sc.close();
    }
}
