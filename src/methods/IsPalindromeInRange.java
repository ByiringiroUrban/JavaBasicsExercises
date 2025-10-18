package methods;

public class IsPalindromeInRange {
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static int isPalindromeInRange(int start, int end, boolean printList) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                count++;
                if (printList) System.out.print(i + " ");
            }
        }
        if (printList) System.out.println();
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Palindrome count: " + isPalindromeInRange(100, 150, true));
    }
}
