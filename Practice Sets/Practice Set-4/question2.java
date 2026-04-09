import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        // question-2

        float m1, m2, m3;
        System.out.println("Enter your marks in Maths");
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextFloat();

        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextFloat();

        System.out.println("Enter your marks in Physics");
        m3 = sc.nextFloat();

        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations, you are promoted!");
        }

        else {
            System.out.println("Sorry, you are not promoted!");
        }

        sc.close();

    }
}
