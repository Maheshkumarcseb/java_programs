
//using final keyword with instance variable of class.
public class Final {
    final int x=10;
    void test()
    {
        // x=100;   //we cannot change the value of x because it is declared as final and it is treated as constant
        System.out.println("value of x is"+x);
         
    }
    public static void main(String[] args) {
        Final ob=new Final();
        ob.test();
    }
}


