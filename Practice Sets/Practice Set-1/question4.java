import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;
        System.out.println(kilometers +"kilometers =" + miles + "miles");
        sc.close();
    }
}