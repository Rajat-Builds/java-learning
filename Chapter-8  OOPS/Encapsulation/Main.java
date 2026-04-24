public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rajat");
        s1.setAge(20);
        s1.setGrade("A");
        System.out.println(s1.getName() + " | " + s1.getAge() + " | " + s1.getGrade());

        s1.setName("");
        s1.setAge(-200);
        s1.setGrade("Z");

    }
}
