import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raj" , "Peehu" , "Krishna" , "Ram" , "Rajat" , "Peehu");

        List<String> result = names.stream()
        .filter(n -> n.length() > 4)
        .map(s -> s.toUpperCase())
        .collect(Collectors.toList());

        System.out.println(result);
    }
}
