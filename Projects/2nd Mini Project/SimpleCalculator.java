import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter 2nd Number: ");
        double num2 = sc.nextDouble();

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        } else {
            System.out.println("Error: Invalid operator.");
        }
        sc.close();
    }
}
