public class Main4 {
    public static void main(String[] args) {
        String testInput = "Hello Java";

        StringOperation toUppercase = s -> s.toUpperCase();
        StringOperation reverseString = s -> new StringBuilder(s).reverse().toString();

        System.out.println("UpperCase: " + toUppercase.operate(testInput));
        System.out.println("Reversed: " + reverseString.operate(testInput));

    }
}
