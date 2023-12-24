
import java.util.Scanner;   // for using Scanner class.

public class SimpleCalculator {
    public static void main(String[] args) {    // main method of the class.
        Scanner scanner = new Scanner(System.in);   //creating scanner object. 
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();  // taking Double input from user with the help of scanner object.

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();     // taking Double input from user with the help of scanner object.

        System.out.println("Select operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter choice (1, 2, 3, or 4): ");
        int choice = scanner.nextInt();    // asking user for integer input from user and store in choice.

        double result;

        switch (choice) {    //  it will select one of the case, that will match from the choice.
            case 1:
                result = num1 + num2;          //sum of two number.
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;       // difference of two number.
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;    // multiplication of two number.
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:   // if none of the above case will execute,then default case will be execute.
                System.out.println("Invalid choice. Please select a valid operation.");
        }

        scanner.close();   // closing the scanner.
    }
}
