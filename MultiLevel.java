class A
{
    public int i;
    public A()
    {
        System.out.println("\n constructor A() is called");
        i=10;
    }
    public void Adisplay()
    {
        System.out.println("\n In class A i="+i);
    }
}
class B extends A
{
    public int j;
    public B()
    {
        System.out.println("\n constructor B() is called");
        j=20;
    }
    public void Bdisplay()
    {
        j=i+1;
        System.out.println("\n In B class j="+j);
    }
}
class C extends B
{
    public int k;
    public C()
    {
        System.out.println(" \n constructor C() is called");
        k=30;
    }
    public void Cdisplay()
    {
        k=i+j;
        System.out.println("\n In c class k="+k);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        System.out.println("\n start of main()");
        C c=new C();
        c.Adisplay();
        c.Bdisplay();
        c.Cdisplay();
        System.out.println("\nend of main()");
    }
    
}
