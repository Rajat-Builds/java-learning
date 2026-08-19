// Question 31 : Calculate Distance between 2 points

import java.util.Scanner;

public class DistanceBetweenNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x co-ordinate for point 1: ");
        double x1 = sc.nextDouble();

        System.out.println("Enter value of y co-ordinate for point 1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter value of x co-ordinate for point 2: ");
        double x2 = sc.nextDouble();

        System.out.println("Enter value of y co-ordinate for point 2: ");
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        System.out.println("Distance Between Two Points is: " + distance);

        sc.close();

    }

}
