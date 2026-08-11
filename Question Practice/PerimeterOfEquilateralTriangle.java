// Question 09 : Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of the euilateral triangle: ");

        double side = sc.nextDouble();

        double perimeter = 3 * side;

        System.out.println("Perimeter of the equilateral traiangle is: " + perimeter);
        sc.close();
    }
}
