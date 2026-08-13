// Question 25 : Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you integer number: ");
        int num = sc.nextInt();

        while (num != 0) {
            if (num > max) {
                max = num;
            }
            System.out.println("Enter your next integer or 0 to stop): ");
            num = sc.nextInt();
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No Valid numbers were entered.");
        } else {
            System.out.println("The largest number is: " + max);
        }

        sc.close();
    }
}
