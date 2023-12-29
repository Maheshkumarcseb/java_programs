import java.util.Scanner;
class Value{
    int a,b;
    // public Value(int i, int j) {
    //     a=i;
    //     b=j;
    // }
    void swap(int i, int j)
    {
        a=i;
        b=j;
        int temp=a;
        a=b;
        b=temp;
    }   
}
public class PassByValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        Value obValue = new Value();
        System.out.println("value of a and b before swapping:"+a+" "+b);
        obValue.swap(a,b);
        System.out.println("value of a and b after swapping:"+obValue.a+" "+obValue.b);

    }
}
// import java.util.Scanner;

// class Value {
//     int a;
//     int b;

//     void swap(int x, int y) {
//         a = x;
//         b = y;
//         int temp = a;
//         a = b;
//         b = temp;
//     }
// }

// public class PassByValue {
//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);
//         System.out.println("enter the value of a:");
//         int a=obj.nextInt();
//         System.out.println("enter the value of b:");
//         int b=obj.nextInt();
//         Value ob = new Value();
//         // int a = 10;
//         // int b = 20;
//         System.out.println("value before swapping:" + a + " " + b);
//         ob.swap(a, b);
//         System.out.println("value after swapping:" + ob.a + " " + ob.b);
//     }
// }
