// Question 14 : Volume Of Cone

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius and Height Of the Circular Cone:");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();

        double volume = Math.PI * (radius * radius) * height / 3;
        System.out.println("Volume of the circular cone is: " + volume);
        sc.close();
    }
}
