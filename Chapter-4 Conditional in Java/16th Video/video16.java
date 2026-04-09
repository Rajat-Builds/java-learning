import java.util.Scanner;

public class video16 {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        float age = sc.nextFloat();

        if (age >= 18) {
            System.out.println("Yes! you can drive.");
        }

        else {
            System.out.println("No! you cannot drive.");

        }
        sc.close();
    }
}
