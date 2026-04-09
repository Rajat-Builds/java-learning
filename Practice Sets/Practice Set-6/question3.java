public class question3 {
    public static void main(String[] args) {
        float[] marks = { 55, 68, 93, 75, 62 }; // We created the list of the values using array. //
        float sum = 0; //  we created sum variable to store total marks. //
        for (float m : marks) { // We used for each loop to take each value form array one by one. //
            sum = sum + m; // Adding values .// 

        }
        float avg = sum / marks.length; // We used marks.length to find the total number of elements. //
        System.out.println(avg); // output //
    }
}

/*
array → gives data
loop → goes through data
sum → stores result
length → gives count
average → final calculation  
*/
