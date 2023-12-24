import java.util.Scanner;  for using Scanner class

public class Stack {
    private int[] stackArray;
    private int top;
    private static int maxSize;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {   // method for checking is the stack is empty.
        return top == -1;
    }

    public boolean isFull() {   // method for checking is the stack is full.
        return top == maxSize - 1;
    }

    public void push(int item) {   // method for pushing the element into stack.
        if (isFull()) {
            System.out.println("stack is full.cannot pop");

        } else {
            stackArray[++top] = item;  // incrementing the top and storing the item into stack.
            System.out.println(item + "pushed onto the stack");
        }
    }

    public int pop() {    // method for taking out element from stack.
        if (isEmpty()) {
            System.out.println("stack is empty cannot pop");
            return -1;
        } else {
            int poppedItem = stackArray[top--];  //decrementing the stack and storing the top element into poppedItem.
            System.out.println(poppedItem + "popped from the stack");
            return poppedItem;   // returning the poppedItem.
        }
    }

    public int peek() {  // method for displaying the top element of stack.
        if (isEmpty()) {
            System.out.println("stack is empty cannot peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public int size() {
        return top + 1;
    }

    public void display() {  //method for displaying the element of stack.
        if(isEmpty()) 
        {
            System.out.println("stack is empty");
        } else {
            System.out.println("stack(top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {    // main method of the class.
        Scanner scanner = new Scanner(System.in);  //creating the scanner object.
        System.out.print("Enter the maximum size of stack: ");
        int maxsize = scanner.nextInt();  //  asking to user for integer input.
        Stack stack = new Stack(maxSize);   // creating a stack object for Stack datatype.
        while (true) {
            System.out.println("\n stack operation");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.dispaly");
            System.out.println("5 quit");
            System.out.println("enter your choice(1-5)");
            int choice = scanner.nextInt();

            switch (choice)  // it will select one of the case based on the choice

            {
                case 1:
                    System.out.println("enter value to push into the stack");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;  // it terminate the program.
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int peekValue = stack.peek();
                    if (peekValue != -1) {
                        System.out.println("top of the stack:" + peekValue);
                        break;

                    }
                case 4:
                    stack.display();
                    break;
                case 5:
                    scanner.close();  // closing the scanner class.
                    System.exit(0);
                default:
                    System.out.println("invalid choice.please enter a valid option(1-5)");  // if none of the above case will execute then default case will execute automatically.
            }
        }
    }
}
