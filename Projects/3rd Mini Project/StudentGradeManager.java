import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];
        int[] marks = new int[5];

        System.out.println("Enter name and marks of 5 students: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            name[i] = sc.nextLine();
            System.out.println("Enter marks of student " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            if (marks[i] >= 90) {
                System.out.println(name[i] + " - Grade: A");
            } else if (marks[i] >= 75 && marks[i] <= 89) {
                System.out.println(name[i] + " - Grade: B");
            } else if (marks[i] >= 60 && marks[i] <= 74) {
                System.out.println(name[i] + " - Grade: C");
            } else if (marks[i] >= 40 && marks[i] <= 59) {
                System.out.println(name[i] + " - Grade: D");
            } else {
                System.out.println(name[i] + " - Grade: F - Failed");
            }
        }

        int highestIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (marks[i] > marks[highestIndex]) {
                highestIndex = i;
            }
        }
        System.out.println("Highest scorer: " + name[highestIndex] + " with " + marks[highestIndex] + " marks");

        sc.close();
    }
}