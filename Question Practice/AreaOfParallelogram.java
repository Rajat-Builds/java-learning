// Question 05 : Area Of Parallelogram 

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base & Height Of the Parallelogram: ");

        double area = sc.nextDouble() * sc.nextDouble();

        System.out.println("Area of Parallelogram is: " + area);

        sc.close();
    }
}
