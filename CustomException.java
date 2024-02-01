import java.util.Scanner;
class DivisionByZeroException extends Exception
{
    public DivisionByZeroException(String message)
    {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try{
            int numerator,denominator;
            Scanner scanner= new Scanner(System.in);
            System.out.println("enter the numerator");
            numerator=scanner.nextInt();
            System.out.println("enter denominator");
            denominator=scanner.nextInt();
            scanner.close();

            if(denominator==0)
            {
                throw new DivisionByZeroException("division by zero is not allowed");
            }
            int result=numerator/denominator;
            System.out.println("result of (int)division:"+result);

        }
        catch(DivisionByZeroException e)
        {
            System.out.println("custom exception caught"+e.getMessage());
        }
    catch(ArithmeticException e){
        System.out.println("ArithmeticException caught");
    }
    finally{
        System.out.println("finally block executrd");
    }

    }
    
}
