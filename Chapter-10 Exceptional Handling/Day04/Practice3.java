import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        try {
            int input1 = Integer.parseInt(num1);
            int input2 = Integer.parseInt(num2);
            int result = input1 / input2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot devided by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric integers.");
        } finally {
            System.out.println("Calculation complete");
            sc.close();
        }
    }
}
