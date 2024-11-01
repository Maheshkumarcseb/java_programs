public class DecimalToOctal {
    public static int Decimaltooctal(int Decimal)
    {
        int i=0;
        int octal=0;
        while(Decimal!=0)
        {
            int rem=Decimal %8;
            octal +=rem*Math.pow(10,i);
            i++;
            Decimal/=8;
        }
        return octal;
    }
    public static void main(String[] args) {
        int Decimal =136;
        System.out.println("the octal conversion of the given decimal number is "+Decimaltooctal(Decimal));
    }
}
