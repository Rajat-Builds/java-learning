import java.util.ArrayList;

public class Day1 {
    public static void main(String[] args) {
        ArrayList<Student> names = new ArrayList<>();
        names.add(new Student("Krishna", 20, 99));
        names.add(new Student("Radha", 19, 99));
        names.add(new Student("Balram", 22, 99));

        for (Student student : names) {
            student.printCard();
        }
    }
}
