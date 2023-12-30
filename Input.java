
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer");
        int i = scan.nextInt();  //reading a integer value

        System.out.println("enter a double value");
        double d=scan.nextDouble();  // reading a Double value

         scan.nextLine();     // if we are not using this line then it will read only a white-space and terminates the program.

        System.out.println("enter a string");
        String s=scan.nextLine();  //reading a string from user.

        System.out.println("String: "+s);     
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}