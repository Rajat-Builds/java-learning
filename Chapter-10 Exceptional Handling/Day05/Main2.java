public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();
        int[] testAges = {200, -5, 25};

        for(int age : testAges){
            System.out.println("Testing age: "+ age);
            try {
                person.setAge(age);
                System.out.println("Success! Age is set to: " + person.getAge());
            } catch (InvalidAgeException e) {
                System.out.println("Rejected: " + e.getMessage());
            }
        }
    }
}
