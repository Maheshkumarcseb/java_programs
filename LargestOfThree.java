
import java.util.Scanner;  // for using nextInt()
public class LargestOfThree {   // method of the class
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);   // creating a object named scanner
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();  // taking integer input from user with the help of scanner object
        int num2 = scanner.nextInt();  // taking integer input from user with the help of scanner object
        int num3 = scanner.nextInt();  // taking integer input from user with the help of scanner object 

        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3); // finding the greatest of three number using ternary operator.

        System.out.println("The largest number is: " + largest);  //printing the largest number

        scanner.close(); //closing the scanner class
}
}
