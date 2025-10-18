package methods;

public class FindLCMofThree {
    public static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static int findLCMofThree(int a, int b, int c, boolean detailed) {
        int gcdAB = findGCD(a, b);
        int lcmAB = (a * b) / gcdAB;
        int gcdABC = findGCD(lcmAB, c);
        int finalLCM = (lcmAB * c) / gcdABC;

        if (detailed) {
            System.out.println("GCD(a,b) = " + gcdAB);
            System.out.println("LCM(a,b) = " + lcmAB);
            System.out.println("Final LCM = " + finalLCM);
        }
        return finalLCM;
    }

    public static void main(String[] args) {
        System.out.println("LCM: " + findLCMofThree(4, 5, 10, true));
    }
}
