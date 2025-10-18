package methods;

public class IsEven {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(10)); // true
        System.out.println(isEven(7));  // false
    }
}
