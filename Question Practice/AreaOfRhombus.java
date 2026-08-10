// Question 06 : Area Of Rhombus 

import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Diagonal-01 & Diagonal-02: ");

        double area = (sc.nextDouble() * sc.nextDouble()) / 2;


        System.out.println("Area Of Rhombus is: " + area);
        sc.close();
    }
}
