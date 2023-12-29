class Factorial{
    int fact(int n){
        if(n==0)
        return 1;
        return n*fact(n-1);
    }
}
public class FactDemo {
    public static void main(String[] args) {
        Factorial f =new Factorial();
        System.out.println("factorial of 3 is:"+f.fact(3));
        System.out.println("factorial of 5 is:"+f.fact(5));
    }
}
