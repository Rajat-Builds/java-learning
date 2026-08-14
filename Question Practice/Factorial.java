// Question 27 : Factorial Program In Java

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factonial is not defined for negative numbers!");
        } else {
            BigInteger factorial = BigInteger.ONE;

            for (int i = 1; i <= num; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
        sc.close();
    }
}
