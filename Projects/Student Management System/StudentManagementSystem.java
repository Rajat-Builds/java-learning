import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter name: ");
                String name = sc.nextLine();

                System.out.println("Enter age: ");
                int age = sc.nextInt();

                System.out.println("Enter marks: ");
                double marks = sc.nextDouble();
                sc.nextLine();

                Student s = new Student(name, age, marks);
                students.add(s);
                System.out.println("Student added successfully!");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No student found");
                } else {
                    for (Student student : students) {
                        student.displayInfo();
                    }
                }

            } else if (choice == 3) {
                System.out.println("Enter name to search: ");
                String searchName = sc.nextLine();
                boolean found = false;
                for (Student student : students) {
                    if (student.getName().equals(searchName)) {
                        student.displayInfo();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Student not found");
                }

            } else if (choice == 4) {
                System.out.println("Enter name to remove: ");
                String searchName = sc.nextLine();
                boolean found = false;
                for (Student student : students) {
                    if (student.getName().equals(searchName)) {
                        students.remove(student);
                        found = true;
                        System.out.println("Student removed successfully");
                    }
                }

                if (!found) {
                    System.out.println("Student not found");
                }
            } else if (choice == 5) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
