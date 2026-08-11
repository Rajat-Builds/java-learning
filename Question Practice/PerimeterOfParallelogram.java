// Question 10 : Perimeter Of Parallelogram

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base and Side of the Parallelogram: ");
        double base = sc.nextDouble();
        double side = sc.nextDouble();

        double perimeter = 2 * (side + base);

        System.out.println("Perimeter of the parallelogram is: " + perimeter);
        sc.close();
    }
}
