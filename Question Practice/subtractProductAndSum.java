// Question 23 : LeetCode 1281: Subtract the Product and Sum of Digits of Integer

public class subtractProductAndSum {
    public static int subtractProductAndSum(int n) {
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
        int result = subtractProductAndSum(testInput);

        System.out.println("Result: " + result);
    }

}
