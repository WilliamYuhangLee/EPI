package notes;

// For exercises of bit manipulation on Page 26
public class BitManipulation {

    // Right propagate the rightmost set bit in x, e.g., turns (01010000) to (01011111)
    public static int propagateRightmostBit(int x) {
        int y = x == 0 ? 0 : x | (x - 1);
        System.out.println(Integer.toBinaryString(y));
        return y;
    }

    // Compute x modulo a power of two, e.g., returns 13 for 77 mod 64
    public static int moduloPowerOfTwo(int x, int power) {
        int y = x & (power - 1);
        System.out.println(Integer.toBinaryString(y));
        return y;
    }

    // Test if x is a power of 2, i.e., evaluates to true for x = 1,2,4,8,...
    public static boolean isPowerOfTwo(int x) {
        return x != 0 && (x & (x - 1)) == 0;
    }
}
