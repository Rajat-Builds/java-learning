public class Practice2 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        boolean result1 = isPowerOfTwo(16);
        System.out.println("Test 1: " + result1);

        boolean result2 = isPowerOfTwo(12);
        System.out.println("Test 2: " + result2);

        boolean result3 = isPowerOfTwo(1);
        System.out.println("Test 3: " + result3);
    }
}
