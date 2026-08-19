// Question 32 : Calculate Commission Percentage

import java.util.Scanner;

public class CommissionPercentageCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total sales amount: ");
        double sales = sc.nextDouble();

        System.out.println("Enter the commission amount earned: ");
        double commissionAmount = sc.nextDouble();

        if (sales > 0) {
            double commissionPercentage = (commissionAmount / sales) * 100;
            System.out.printf("The Commission Percentage is: %.2f%%\n", commissionPercentage);
        } else {
            System.out.println("Sales must be greater than zero.");
        }
        sc.close();
    }
}
