public class Day2 {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] arg) {
        boolean result = isPalindrome("madam");
        System.out.println("madam is palindrome: " + result);

        boolean result2 = isPalindrome("hello");
        System.out.println("hello is palindrome: " + result2);
    }

}
