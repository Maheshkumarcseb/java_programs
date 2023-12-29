class StaticDemo{
    static int a=2;
    static int b=2;
    static void callme()
    {
        System.out.println("inside static method: "+a);
    }
}
public class StaticByName {
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("inside main: "+StaticDemo.b);
    }
}
