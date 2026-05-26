import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        String input = sc.nextLine();

        try {
            int num = Integer.parseInt(input);
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered");
        } finally {
            System.out.println("Program finished");
            sc.close();
        }

    }

}
