import java.io.*;
import java.util.*;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scan.nextLine();
        scan.close();
        
        // Split string using regex to handle multiple delimiters
        String[] tokens = s.trim().split("[ !,?._'@]+");
        
        // Check if the input string is empty after trimming
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
