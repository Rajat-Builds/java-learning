import java.util.HashMap;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("Rajat", "9818767315");
        phonebook.put("Peehu", "8700096772");
        phonebook.put("Krishna", "6518752234");
        phonebook.put("Radha", "8462335791");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        if (phonebook.containsKey(name)) {
            System.out.println(phonebook.get(name));
        } else {
            System.out.println("Contact not found");
        }

        for (String key : phonebook.keySet()) {
            System.out.println(key);
        }

        for (String key : phonebook.keySet()) {
            System.out.println(key + " : " + phonebook.get(key));
        }

        sc.close();
    }

}
