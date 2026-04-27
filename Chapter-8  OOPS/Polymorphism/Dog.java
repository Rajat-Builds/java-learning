/* Dog extends Animal, so it inherits makeSound(). But Dog doesn't want the default behaviour. It wants to say "Woof!" So it rewrites the method with the same name and same parameters. Now when we call makeSound() on a Dog object, it uses Dog's version, not Animal's. */

public class Dog extends Animal {
    @Override // @Override is a safety label. It tells Java — "I know I'm overriding a parent method on purpose. // 
    public void makeSound() {
        System.out.println("Woof!");
    }
}
