public class Day8 {
    public static int calculateFact(int n ){
if (n <= 1) {
    return 1;
} 
return n*calculateFact(n-1);
    }

    public static void main(String[] args) {
        int result = calculateFact(5);
        System.out.println(result);
    }
}
