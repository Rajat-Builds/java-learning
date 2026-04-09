public class question4 {
    public static void main(String[] args) {
        
        System.out.println("Multiplication table of 10 in reverse:");
        int n = 10;
        for (int i = 10; i >= 1; i--) {
            int result = n * i;
            System.out.println(n + "x" + i + "=" + result);
        }
    }
}
