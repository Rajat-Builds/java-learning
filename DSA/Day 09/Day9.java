public class Day9 {
    public static void main(String[] args) {
        int[] arr = {7,7,7};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int x : arr) {
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest && x != largest) {
                secondLargest = x;
            }

        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
