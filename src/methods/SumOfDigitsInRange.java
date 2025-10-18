package methods;

public class SumOfDigitsInRange {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumOfDigitsInRange(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int total = 0;
        for (int i = start; i <= end; i++) {
            total += sumOfDigits(i);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits from 12 to 15 = " + sumOfDigitsInRange(12, 15));
    }
}
