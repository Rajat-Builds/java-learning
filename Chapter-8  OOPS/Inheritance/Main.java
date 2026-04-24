public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rajat", 20, "A");
        System.out.println(s1.name + " | " + s1.age + " | " + s1.grade);

        Student p1 = new Student("Amit", 25, "B");
        System.out.println(p1.name + " | " + p1.age);
    }
}
