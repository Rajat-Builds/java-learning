public class Main2 {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello!");
        g.sayHello();
    }
}
