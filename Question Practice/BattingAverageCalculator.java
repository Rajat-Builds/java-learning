// Question 9 : Calculate Batting Average

import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Runs Score By Batter: ");
        int runs = sc.nextInt();

        System.out.println("Enter who many time batter dismissed: ");
        int dismissal = sc.nextInt();

        if (dismissal == 0) {
            System.out.println("Batting average is: Not Applicable (Batter never got out)");

        } else {
            double average = (double) runs / dismissal;

            System.out.println("Batting Average is: " + average);

        }

        sc.close();
    }
}
