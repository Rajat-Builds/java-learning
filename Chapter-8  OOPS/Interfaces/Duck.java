public class Duck implements Flyable, Swimmable {
    String name;
    
    public Duck (String name){
        this.name = name;
    }

    @Override
    public void fly(){
        System.out.println(name + " is flying!");
    }

    @Override
    public void swim(){
        System.out.println(name + " is swimming!");
    }
}
