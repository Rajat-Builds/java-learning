// Question 29 : Calculate Calculate Average Of N Numbers

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for average: ");
        int nums = sc.nextInt();

        if (nums <= 0) {
            System.out.println("Please enter a valid count greater than 0!");
            sc.close();
            return;
        }

        double sum = 0;

        for (int i = 1; i <= nums; i++) {
            System.out.println("Enter number " + i + ": ");
            double number = sc.nextDouble();
            sum += number;
        }

        double average = sum / nums;

        System.out.println("The average of the " + nums + " numbers is: " + average);
    }
}
