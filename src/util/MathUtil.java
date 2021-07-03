package util;

public class MathUtil {

    // max common divisor
    public static int mcd(int a, int b) {
        if (b == 0) return a;
        return mcd(b, a % b);
    }
}
