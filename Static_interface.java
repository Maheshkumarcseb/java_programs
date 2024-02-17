interface TestInterface
{
    public void square(int a);
    static void show()
    {
        System.out.println("static method executed");
    }
}
class Static_interface implements TestInterface{
    public void square(int a)
    {
        System.out.println(a*a);
    }
    public static void main(String[] args) {
        Static_interface d=new Static_interface();
        d.square(4);  //calling the square function using object 
        TestInterface.show();  // calling static method using the classname
    }
}

