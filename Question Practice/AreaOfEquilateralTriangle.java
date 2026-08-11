// Question 07 : Area Of Equilateral Triangle 

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side lenght of the equilateral traingle: ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * (side * side);

        System.out.println("Area of the Equilateral Triangle is: " + area);

        sc.close();
    }
}
