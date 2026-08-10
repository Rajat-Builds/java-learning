// Question 04 : Area Of Isosceles Triangle 

import java.util.Scanner;

public class AreaOfIsoscelesTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base & Height of the Isoceles Triangle: ");

        double area = (sc.nextDouble() * sc.nextDouble()) / 2;

        System.out.println("Area of Isosceles Triangle is: " + area);

        sc.close();
    }
}
