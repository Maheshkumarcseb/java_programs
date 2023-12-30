/* 
public class var_args {

    static int add(int ...arr){   // here no argument is necessary,if we will not pass any argument result will be 0.
        int result = 0;    // result is initialised to zero.
        for (int a : arr){     // for each loop
            result = result + a;
        }
        return result;
}

public static void main(String[] args){
    System.out.println(add(1,2));
    System.out.println(add(2,3,4));
   System.out.println(add(7,8));
}
}
*/

/* 
public class var_args {

    static int add( int x, int ...arr){   //here atleast one parameter is required
        int result = x;               // result is initialised to x
        for (int a : arr){         // for-each loop
            result = result + a;
        }
        return result;
}

public static void main(String[] args){
    System.out.println(add(3));
    System.out.println(add(1,2));
    System.out.println(add(2,3,4));
   System.out.println(add(7,8));
}
}

*/

// import java.util.Scanner;

// public class var_args {

//     static int add(int ...arr){   //here atleast one parameter is required
//         int result = 0;               // result is initialised to x
//         for (int a : arr){         // for-each loop
//             result = result + a;
//         }
//         return result;
// }

// public static void main(String[] args){
//     int i;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the no of element");
//     int n=sc.nextInt();
//     int[] array = new int[10];  
//     for( i=0;i<n;i++)
//     {
//         System.out.print("Enter number " + (i + 1) + ": ");
//             array[i] = sc.nextInt();
//     }
    
//     int sum=add(array);
//     // System.out.println(add(array[n]));
//     System.out.println(add(3));
//     System.out.println(add(1,2));
//     System.out.println(add(2,3,4));
//    System.out.println(add(7,8));
// }
// }


import java.util.Scanner;

public class var_args{

    // Varargs method to calculate the sum of numbers
    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Read n numbers from the user
        int[] userNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        // Calculate and display the sum using varargs method
        int sum = calculateSum(userNumbers);
        System.out.println("Sum of entered numbers: " + sum);

        scanner.close();
    }
}
