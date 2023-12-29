class Test{
    int a,b;
    Test(int i,int j)
    {
        a=i;
        b=j;
    }
    void method(Test o)
    {
        o.a*=2;
        o.b/=2;
    }
}
public class call_by_reference {
   public static void main(String[] args) {
    Test ob=new Test(10,20);
    System.out.println("before call: "+ob.a+" "+ob.b);
    ob.method(ob);
    System.out.println("after call: "+ob.a+" "+ob.b);
   } 
}
