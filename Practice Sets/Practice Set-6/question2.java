public class question2 {
    public static void main(String[] args) {
        float[] number = { 5, 10, 15, 20, 25 }; // We , used Array because we have to store multiple values in one
                                                // variable .//
        int target = 10; // This is the value we want to check //
        boolean found = false; // We used boolean to remember the result. //
        for (int i = 0; i < number.length; i++) // Used loop to check every element. //
            if (number[i] == target) { // Used condition to compare each element with target. //
                found = true; // We found the number-> store result . //
                break; // To stop loop //
            }
        if (found) {
            System.out.println("found"); // to decide what to print if found . //

        } else {
            System.out.println("not found"); // to decide what to print if not found . //
        }

    }
}

// Structure of code //

/*

Start
 ↓
found = false
 ↓
Loop through array
 ↓
Check each element
 ↓
Match?
 ├── Yes → found = true → break
 └── No → continue
 ↓
Loop ends
 ↓
Check found
 ├── true → print "found"
 └── false → print "not found"

*/
