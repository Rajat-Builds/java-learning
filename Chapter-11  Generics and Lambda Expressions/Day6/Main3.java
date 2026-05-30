public class Main3 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a+b;
        MathOperation sub = (a, b) -> a-b;
        MathOperation mult = (a, b) -> a*b;
        System.out.println(add.operate(10, 10));
        System.out.println(sub.operate(10, 10));
        System.out.println(mult.operate(10, 10));
    }
}
