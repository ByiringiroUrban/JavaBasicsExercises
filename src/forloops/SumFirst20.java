package forloops;

public class SumFirst20 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        System.out.println("Sum of first 20 natural numbers: " + sum);
    }
}
