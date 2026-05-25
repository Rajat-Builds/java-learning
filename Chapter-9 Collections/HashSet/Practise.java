import java.util.HashSet;

public class Practise {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);

        for (Integer n : numbers) {
            System.out.println(n);
        }

        System.out.println("Total numbers: " + numbers.size());

        System.out.println(numbers.contains(30));
    }
}
