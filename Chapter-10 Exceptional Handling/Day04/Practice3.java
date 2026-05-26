import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot devided my zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric integers.");
        } finally {
            System.out.println("Calculation complete");
            sc.close();
        }
    }
}
