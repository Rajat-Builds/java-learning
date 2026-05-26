public class Practice2 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30; 

        try {
            int result = myArray[0] / (myArray[2] - 30);
            System.out.println("Result of division: " + result);

            int value = myArray[5];
            System.out.println("Value at index 5: " + value);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Error: Attempted to access an index outside the array bounds. ");
        } catch (Exception e) {
            System.out.println("An unexpected error occured: " + e.getMessage());
        }
    }
}
