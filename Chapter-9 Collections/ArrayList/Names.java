import java.util.ArrayList;

public class Names {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rajat");
        names.add("Peehu");
        names.add("Krishna");
        names.add("Radha");
        names.add("Narsimha");

        names.remove("Krishna");

        System.out.println(names.contains("Rajat"));

        System.out.println(names.get(0));

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
        System.out.println("Total names: " + names.size());
    }

}