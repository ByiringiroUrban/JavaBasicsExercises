package methods;

public class CountArmstrongNumbers {
    public static boolean isArmstrong(int num, int power) {
        int temp = num, sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, power);
            temp /= 10;
        }
        return sum == num;
    }

    public static int countArmstrongNumbers(int start, int end, boolean showNumbers, int power) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i, power)) {
                count++;
                if (showNumbers) System.out.print(i + " ");
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong count: " + countArmstrongNumbers(100, 999, true, 3));
    }
}
