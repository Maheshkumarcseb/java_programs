
interface TestInterface
{
    public void square(int a);  
    default void show()
    {
        System.out.println("default method executed");
    }
}
class Default_interface implements TestInterface{
    public void square(int a)  // implementing the method of interface
    {
        System.out.println(a*a);
    }
    public static void main(String[] args) {
        Default_interface d=new Default_interface();
        d.square(4);
        d.show();  
    }
}

