public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5, 10, 15));

        Animal a1 = new Animal();
        a1.makeSound(); // printed "Some animal sound..." — used Animal's version // 

        Dog d1 = new Dog();
        d1.makeSound(); //  printed "Woof!" — used Dog's own version, ignoring Animal's // 
    }
}
