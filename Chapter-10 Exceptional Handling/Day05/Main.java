public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        try {
            student.setMarks(150);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            student.setMarks(85);
            System.out.println("Marks set: " + student.getMarks());
        } catch (InvalidMarksException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
