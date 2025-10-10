package Modul1;

public class ImproveT4 {

    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static double findMin(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static String findMin(String a, String b, String c) {
        String min = a;
        if (b.compareTo(min) < 0) min = b;
        if (c.compareTo(min) < 0) min = c;
        return min;
    }

    public static void main(String[] args) {

        System.out.println("Min(1,2,3) = " + findMin(1,2,3)); // 1
        System.out.println("Min(-1,-2,-3) = " + findMin(-1,-2,-3)); // -3
        System.out.println("Min(0,0,1) = " + findMin(0,0,1)); // 0

        System.out.println("Min(2.5, 1.7, 3.2) = " + findMin(2.5,1.7,3.2)); // 1.7

        System.out.println("Min(\"apel\",\"jeruk\",\"banana\") = " + findMin("apel","jeruk","banana")); // apel
    }
}
