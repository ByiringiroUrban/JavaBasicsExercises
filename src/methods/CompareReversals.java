package methods;

public class CompareReversals {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static int compareReversals(int a, int b, boolean display) {
        int revA = reverse(a);
        int revB = reverse(b);

        if (display)
            System.out.println("Reversed A: " + revA + ", Reversed B: " + revB);

        return Math.max(revA, revB);
    }

    public static void main(String[] args) {
        System.out.println("Larger reversed: " + compareReversals(123, 456, true));
    }
}
