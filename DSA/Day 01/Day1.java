public class Day1 {
    public static void main(String[] args) {
        int[] numbers = { 12, 45, 3, 89, 7, 23 };

        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}
