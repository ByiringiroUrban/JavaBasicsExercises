package ifstatements;
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if (marks >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        sc.close();
    }
}
