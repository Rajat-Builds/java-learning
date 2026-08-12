//Question 13 : Perimeter Of Rhombus

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of the rhombus: ");

        double side = sc.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of the rhombus is: " + perimeter);
        sc.close();
    }
}
