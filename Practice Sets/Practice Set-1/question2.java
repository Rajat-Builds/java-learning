import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        // question 2 //
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject 1");
        float subject1 = sc.nextFloat();

        System.out.println("Enter marks of subject2");
        float subject2 = sc.nextFloat();

        System.out.println("Enter marks of subject3");
        float subject3 = sc.nextFloat();

        System.out.println("Enter marks of subject4");
        float subject4 = sc.nextFloat();

        System.out.println("Enter marks of subject5");
        float subject5 = sc.nextFloat();

        float cgpa = (subject1 + subject2 + subject3 + subject4 + subject5) / 50;

        System.out.println("Your cgpa is " + cgpa);

        sc.close();

    }
}
