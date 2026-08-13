
public class LeetCode1281 {
    public static int LeetCode1281(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        int testInput = 234;
        int result = LeetCode1281(testInput);

        System.out.println("Result: " + result);
    }

}
