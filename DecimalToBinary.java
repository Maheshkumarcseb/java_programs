public class DecimalToBinary {
    public static void main(String[] args) {
        int n=28;
        int[] binary = new int[32];
        int pow =1;
        int i=0;
        while(n>0)
        {
            binary[i]=n%2;
            i++;
            n/=2;
        }
        System.out.println("binary number is:");
        for(int ind=i-1;ind>=0;ind--)
        {
            System.out.print(binary[ind]);
        }
    }
}