import java.util.Scanner;

public class video5 {

    public static void main(String[] args) {
        // User Input //
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);

    }
}