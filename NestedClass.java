class Outer      // outer class
{
    int outer_x=100;       //instance variable of outer class
    void test()
    {
        Inner inner=new Inner();    // creating object of inner class from outer class
        inner.display();
    }
    class Inner{         // inner class
        void display()
        {
            System.out.println("outer_x = "+outer_x);  //accessing the instance variable of outer class from inner class
        }
    }
}
class NestedClass{
public static void main(String[] args) {
    Outer outer =new Outer();
    outer.test();
}  
}