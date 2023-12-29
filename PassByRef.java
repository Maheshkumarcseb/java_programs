import java.util.Scanner;

class value {
    int a, b;

    void swap(int &m, int &n)
    {
        a=m;
        b=n;
        int temp=a;
        a=b;
        b=temp;
    }
}

public class PassByRef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        Value obj= new Value();
        System.out.println("value of a and b before swapping:"+a+" "+b);
        obj.swap(a,b);
        System.out.println("value of a and b before swapping:"+obj.a+" "+obj.b);
    }
    
}
