// Question 49 : Sum Of N Numbers 

import java.util.Scanner;
public class SumOfNNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements (n): ");
        int n = sc.nextInt();
        double sum = 0;

        for(int i =1; i<=n; i++){
            System.out.println("Enter Number " + i + ": ");
            double currentNumber = sc.nextDouble();

            sum += currentNumber;

        }

        System.out.println("Total sum of the " + n + " number is: " + sum);
        sc.close();
    }
}
