// Question 24 : Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop) 

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        while (num != 0) {
            sum = sum + num;
            System.out.println("Enter next number (or 0 to stop): ");
            num = sc.nextInt();
        }
        System.out.println("The total sum of all the numbers is: " + sum);
        sc.close();
    }
}
