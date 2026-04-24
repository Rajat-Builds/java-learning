// Encapsulation means making your variables private and controlling access to them through getters and setters, so that invalid data can never get into your object. // 



public class Student {
    private String name;
    private int age;
    private String grade;

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be between 0 and 100.");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null) { // to check if a String is empty we use - name.isEmpty() and to check null we use - name == null // 
            System.out.println("Invalid name. ");
        } else {
            System.out.println(this.name = name);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setGrade(String grade) {
        if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("E")
                || grade.equals("F")) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. ");
        }
    }

    public String getGrade() {
        return this.grade;
    }

}
