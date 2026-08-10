// Question 02 : Area Of Triangle 

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base & Height of the triangle: ");

        double area = (sc.nextDouble() * sc.nextDouble()) / 2;
        System.out.println("Area of a triangle is: " + area);

        sc.close();
    }
}