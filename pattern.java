public class pattern {
    public static void main(String[] args) {   //main method of class
        three:          //labelled break
        for(int i=0;i<5;i++)  // outer loop
        {
            for(int j=0;j<5;j++)  // inner loop
            {
                if(i==3)       // condition for labelled break
                 break three;     // it will come out of both loop
               System.out.print("*");
            }
           System.out.println(); 
        }
        
    }
}
