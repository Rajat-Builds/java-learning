/* 
public class question1 {
    public static void main(String[] args) {
        float [] number = new float[5]; // This is an Array , were i created storage for 5 values. //
        number[0]= 5;
        number[1]= 10;
        number[2]= 15;
        number[3]= 20;
        number[4]= 25;
        int  i = 0;
        float sum = 0;
        for(i=0; i<5; i++){ // This is loop, were it started from index 0 goes till index 4 , increase step by step. //
        sum = sum + number[i]; // This is core logic of the question // 
        }
        System.out.println(sum);

    }
} 
    */

// Question given by gpt , by taking input from user. 

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers:");
        Scanner sc = new Scanner(System.in);
        float[] number = new float[5];
        int i = 0;
        float sum = 0;
        for (i = 0; i < 5; i++) {
            number[i] = sc.nextFloat();
        }
        for (i = 0; i < 5; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
