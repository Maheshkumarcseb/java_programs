class Test{
    int a;
    public int b;
    private int c;
    void setc(int i){
        c=i;
    }
    int getc()
    {
        return c;
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Test ob=new Test();
        ob.a=10;
        ob.b=20;
        ob.setc(200);
        System.out.println("a,b and c :"+ob.a+" "+ob.b+" "+ob.getc());
    }
}
