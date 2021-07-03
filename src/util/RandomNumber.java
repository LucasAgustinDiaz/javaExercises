package util;

public class RandomNumber {
    public static int getNumber() {
        return (int) (System.currentTimeMillis() % (int) (Math.random() * 10e5) + 1);
    }
}
