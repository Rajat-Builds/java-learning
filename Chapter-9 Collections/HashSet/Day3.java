import java.util.HashSet;

public class Day3 {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Noida");
        city.add("Jaipur");
        city.add("Lucknow");
        city.add("Noida");

        for (String c : city) {
            System.out.println(c);
        }

        System.out.println("Total cities: " + city.size());

        System.out.println(city.contains("Delhi"));
    }
}
