// Question 28 : Calculate Electricity Bill

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total units consumed: ");
        int units = sc.nextInt();

        double totalBill = 0;

        if (units <= 100) {
            totalBill = units * 1.20;
        } else if (units <= 300) {
            totalBill = (100 * 1.20) + ((units - 100) * 2.00);
        } else {
            totalBill = (100 * 1.20) + (200 * 2.00) + ((units - 300) * 3.00);
        }

        System.out.println("The toatl electricity bill for " + units + " units is: " + totalBill);

        sc.close();
    }
}
