// Question 19 : Curved Surface Area Of Cylinder

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height of the Curved Surface Area Of Cylinder: ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();

        double surfacearea = 2 * Math.PI * radius * height;
        System.out.println("Curved Surface Area Of Cylinder is: " + surfacearea);
        sc.close();
    }
}
