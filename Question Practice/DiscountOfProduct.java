// Question 30 : Calculate Discount Of Product

import java.util.Scanner;
public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Product Discount Calculator ===");

        System.out.println("Enter the original price of the product: ");
        double originalPrice = sc.nextDouble();

        System.out.println("Enter the discount percentage (e.g., 15 for 15%): ");
        double discountPercentage = sc.nextDouble();

        if (originalPrice < 0 || discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Error: Invalid inputs. Price cannot be negative, and discount must between 0 to 100.");
        } else {
            double discountAmount = originalPrice * (discountPercentage / 100);
            double finalPrice = originalPrice - discountAmount;

            System.out.println("\n--- Receipt ---");
            System.out.printf("Original Price:  $%.2f%n", originalPrice);
            System.out.printf("Discount Applied:  %.1f%%%n", discountPercentage);
            System.out.printf("Amount Saved:      $%.2f%n", discountAmount);
            System.out.printf("Final Price:       $%.2f%n", finalPrice);
        }
        sc.close();
    }
}
