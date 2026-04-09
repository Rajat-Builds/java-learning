public class video26 {
    public static void main(String[] args) {
        // Classroom of 500 Students- you have to store marks of these 500 students .
        // You have 2 options:
        // 1. Create 500 variables
        // 2. Use Arrays (recommended)

        // There are three main ways to create an arrays in Java .

        /*
         * // 1. Declaration + Memory Allocation !
         * 
         * int[] marks = new int[5];
         * marks[0] = 100;
         * marks[1] = 60;
         * marks[2] = 70;
         * marks[3] = 90;
         * marks[4] = 86;
         * System.out.println(marks[4]);
         * 
         */

        // 2. Declaration
        // Memory Allocaiton ( Both should be in different line.)

        // 3. Declaration, memory allocation and initialization together .
        int[] marks = { 100, 70, 80, 71, 98 };
        System.out.println(marks[1]);

    }
}
