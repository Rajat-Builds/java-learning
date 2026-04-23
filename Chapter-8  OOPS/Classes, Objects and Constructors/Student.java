public class Student {
        String name;
        int age;
        String grade; // This Says, every student will have these 3 things. {So, its a blueprint}

        public Student(String name, int age, String grade) { // It is an constructor , and its an special method that
                                                             // rens automatically when you create an object . And you
                                                             // if assign manually you can forget a field and java won't
                                                             // even know. constructor forces to provide all data at
                                                             // creation time . //
                this.name = name;
                this.age = age;
                this.grade = grade; // this. - it is a keyword that refers to the current object—the specific
                                    // instance of a class that is currently running a method or constructor. //
        }
}
