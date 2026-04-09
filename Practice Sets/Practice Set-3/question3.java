public class question3 {
    public static void main(String[] args) {
        // question-3

        String letter = "Dear <|name|>, Thanks a lot !";
        letter = letter.replace("<|name|>", "Rajat");
        System.out.println(letter);
    }
}
