// Question 26 : Addition Of Two Numbers 

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum of 2 numbers is: " + sum);
        sc.close();
    }
}
