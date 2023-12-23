import java.util.Scanner;
public class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;
    public Stack(int size)
    {
        maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return top==maxSize-1;
    }
    public void push(int item)
    {
        if(isFull())
        {
            System.out.println("stack is full.cannot pop");
            
        }
        else{
            stackArray[++top]=item;
            System.out.println(item+"pushed onto the stack");
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty cannot pop");
            return -1;
        }
        else{
            int poppedItem=stackArray[top--];
            System.out.println(poppedItem+"popped from the stack");
            return poppedItem;
        }
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty cannot peek");
            return -1;
        }
        else{
            return stackArray[top];
        }
    }
    public int size()
    {
        return top+1;
    }
    public void display()
    {
        if(isEmpty){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("stack(top to bottom):");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stackArray[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the maximum size of stack: ");
        int maxsize=scanner.nextInt();
        Stack stack=new Stack(maxSize);
        while(true)
        {
         System.out.println("\n stack operation");   
         System.out.println("1.push");
         System.out.println("2.pop");
         System.out.println("3.peek");
         System.out.println("4.dispaly");
         System.out.println("5 quit");
         System.out.println("enter your choice(1-5)");
         int choice=scanner.nextInt();

         switch(choice)

         {
            case 1:
            System.out.println("enter value to push into the stack");
            int value=scanner.nextInt();
            stack.push(value);
            break;
            case 2:
            stack.pop();
            break;
            case 3:
            int peekValue=stack.peek();
            if(peekValue!=-1)
            {
                System.out.println("top of the stack:"+peekValue);
                break;

            }
            case 4:
            stack.display();
            break;
            case 5:
            scanner.close();
            System.exit(0);
            default:
            System.out.println("invalid choice.please enter a valid option(1-5)");
         }
        }
    }