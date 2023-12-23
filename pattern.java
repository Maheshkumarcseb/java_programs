public class pattern {
    public static void main(String[] args) {
        three:
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==3)
                 break three;
               System.out.print("*");
            }
           System.out.println();
        }
        
    }
}
