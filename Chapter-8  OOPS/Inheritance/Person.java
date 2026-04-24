/* Inheritance — A concept where a child class automatically gets the properties and methods of a parent class using the extends keyword.

extends — The keyword that creates the parent-child relationship between two classes.

super — A keyword used inside the child constructor to call the parent class constructor, so the parent can set up its own variables.

Parent class — The class that holds common properties and methods shared by all child classes. Also called Superclass.

Child class — The class that inherits everything from the parent and can also have its own additional properties and methods. Also called Subclass. */



public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
