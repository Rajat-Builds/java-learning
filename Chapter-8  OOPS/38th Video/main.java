public class main {
    public static void main(String[] args) {

        // Concept of objects and classes //
        // Student s1 = new Student();
        /*
         * 1) new Student() — Java went to Student.java blueprint and built an actual
         * student in memory.
         * 
         * 2) s1 — this is just a name of student so that we can refer to it.
         * 
         * 3) Think of s1 as a remote control that points to that student sitting in
         * memory.
         */

        // s1.name = "Rajat";
        // s1.age = 20;
        // s1.grade = "A";
        /* The dot . means "go inside this object and access this thing. */
        // System.out.println(s1.name + " got grade " + s1.grade);

        // Student s2 = new Student();
        // s2.name = "Peehu";
        // s2.age = 19;
        // s2.grade = "A";

        // System.out.println(s2.name + " got grade " + s2.grade);

        Student s2 = new Student("Rajat", 20, "A");

        System.out.println(s2.name + " Got " + s2.grade + " And his age is " + s2.age);

    }
}
