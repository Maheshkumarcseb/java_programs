import java.util.Scanner;
/*  write a program in java using class concept to print a order 
input 1: chicken pizza
o/p- chicken pizza ready
input 2: cheese pizza and toppings
o/p- chicken pizza with toppings is ready
// input=chicken pizza,cheese pizza,toppings;
//  class pizza
// switch(choice)
// {
//     case 1: 

//     case 2:

// }
*/

class PrintMessage
{
    private void printSecreatMessage()
    {
        System.out.println("inside SecreatMeathod");
        printSecond();
        
    }
    public void printFirst()
    {
        System.out.println("inside printFirst method");
        printSecond();
        printSecreatMessage();
    }
     public void printSecond()
    {
        System.out.println("inside printSecond method");

    }
    public static void printThird()
    {
        System.out.println("inside printThird method");
        
    }

    
}
public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {64, 34, 25, 12, 22, 11, 90};
        PrintMessage printMessageobj =new PrintMessage();
        printMessageobj.printFirst();
    
        // static method of a class can be accessed/call/reference by class name
        
        PrintMessage.printThird();
        //not recommended way to access static method
        printMessageobj.printThird();
        System.out.println("Original array: ");
        printArray(array);
        // static method can call/reference only other static method
        bubbleSort(array);

        System.out.println("\nSorted array: ");
        printArray(array);
    }


    // Function to perform Bubble Sort
     static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}