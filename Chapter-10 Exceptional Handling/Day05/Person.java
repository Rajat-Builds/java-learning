public class Person {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age > 150 || age < 0) {
            throw new InvalidAgeException("Age must be between 0 and 150");
        }
        this.age = age;

    }
}
