public class video27 {
    public static void main(String[] args) {
        // int[] marks = { 98, 45, 79, 99, 80 };
        float[] marks = { 98, 45, 79, 99.9f, 80 };
        String[] students = { "Peehu", "Rajat" };
        System.out.println(marks.length);

        System.out.println(students[0]);

        // Displaying the Array (Naive/Normal way)
        System.out.println("Printing using naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop way)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // quik quiz
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length - 1; i > 0; i--) {
            System.out.println(marks[i]);
        }

    }
}
