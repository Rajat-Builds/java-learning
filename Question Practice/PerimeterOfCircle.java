// Question 08 : Perimeter Of Circle

import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");

        double radius = sc.nextDouble() ;

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circumference of circle is: " + perimeter);
        sc.close();
    }
}
