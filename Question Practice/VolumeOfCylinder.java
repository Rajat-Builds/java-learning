// Question 16 : Volume Of Cylinder

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height of the cylinder: ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of cylinder is: " + volume);
        sc.close();
    }
}
