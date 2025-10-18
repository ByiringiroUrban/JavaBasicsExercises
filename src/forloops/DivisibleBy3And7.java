package forloops;

public class DivisibleBy3And7 {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 100 divisible by both 3 and 7:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
