// Question 03 : Area Of Rectangle 

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lenght & Width of the Rectangle: ");

        double area = (sc.nextDouble() * sc.nextDouble());

        System.out.println("Area of Rectangle: " + area);

        sc.close();
    }
}
