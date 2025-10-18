package methods;

public class AnalyzePrimesInRange {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int analyzePrimesInRange(int start, int end, boolean showSum, boolean showCount) {
        int sum = 0, count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }
        System.out.println();

        if (showSum) System.out.println("Sum = " + sum);
        if (showCount) System.out.println("Count = " + count);

        return count;
    }

    public static void main(String[] args) {
        analyzePrimesInRange(10, 30, true, true);
    }
}
