public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Java");
        Box<Integer> intBox = new Box<>();
        intBox.setItem(100);

     System.out.println(stringBox.getItem());
     System.out.println(intBox.getItem());
        }
    }

