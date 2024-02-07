import java.util.*;

public class OneD_array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        
        int a[] = new int[n]; //Define array of size n
        
        System.out.println("Enter " + n + " values:");
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt(); // Store input values in the array
        }
        
        System.out.println("Entered values:");
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]); // Print each element of the array
        }
        
        scan.close();
    }
}
