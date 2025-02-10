


import java.util.Scanner;
import java.util.regex.*;

public class Regrex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine()); // Read number of test cases
        
        while (testCases > 0) {
            String pattern = in.nextLine(); // Read regex pattern from input
            
            try {
                Pattern.compile(pattern); // Try compiling the regex
                System.out.println("Valid"); // If successful, print "Valid"
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid"); // If an exception occurs, print "Invalid"
            }
            
            testCases--; // Decrement the test case count
        }
        in.close(); // Close scanner to prevent resource leaks
    }
}
