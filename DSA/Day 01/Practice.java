public class Practice {
    public static int removeDuplicates(int[] numbers) {
        int slow = 0;
        for (int fast = 1; fast < numbers.length; fast++) {
            if (numbers[fast] != numbers[slow]) {
                slow++;
                numbers[slow] = numbers[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(arr);
        System.out.println("Unique count: " + result);
    }
}