interface x
{
    int x=10;
    public void display();
}
interface y
{
    int y=20;
    public void add();
}
class A implements x,y   // implementing both interface
{
    public void display()   // defination of method of interface 1
    {
        System.out.println("x= " + x+ " y= "+y);
    }
    public void add()    // defination of method of interface 2
    {
        System.out.println("x+y is: "+(x+y));
    }
    
}
public class MultipleInheritance {
    public static void main(String[] args) {
        // x objx=new A();   // reference of x
        A objx=new A();
        objx.display();
        // x objy=new A();  // reference of y
        A objy=new A();
        objy.add();
    }
    
}
