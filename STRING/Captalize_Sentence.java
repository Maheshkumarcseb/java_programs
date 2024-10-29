package STRING;

public class Captalize_Sentence {

    public static String Capitalize(String str, int size)
    {
        StringBuffer sb = new StringBuffer(str);
        for(int i=0; i< size; i++)
        {
            if(i==0|| i== (size-1))
            {
                sb.setCharAt(i, Character.toUpperCase((char)(int) str.charAt(i)));
            }
            else if(str.charAt(i) ==' ')
            {
                sb.setCharAt(i-1, Character.toUpperCase((char)(int) str.charAt(i-1)));
                sb.setCharAt(i+1, Character.toUpperCase((char)(int) str.charAt(i+1)));
            }
        }
         return sb.toString();
    }
    public static void main(String[] args) {
        String str="java Is besT language For coding";
        int size=str.length();
        System.out.println("String after capitalizing first and last letter of each word of the string:");
        System.out.println(Capitalize(str,size));
    }
}






// public class Captalize_Sentence {
//     public static String Capitalize(String str, int size) {
//       StringBuffer sb = new StringBuffer(str);
//       for (int i = 0; i < size; i++) {
//         if (i == 0 || i == (size - 1) && (int) str.charAt(i) >= 97) //Converting first
//         and last index character to uppercase
//         {
//           sb.setCharAt(i, (char)((int) str.charAt(i) - 32));
//         } else if (str.charAt(i) == ' ') // Converting characters present before and
//         after space to uppercase
//         {
//           if (((int) str.charAt(i - 1) - 32) >= 65) // Already not an uppercase letter
//             sb.setCharAt(i - 1, (char)((int) str.charAt(i - 1) - 32));
  
//           if (((int) str.charAt(i + 1) - 32) >= 65) // Already not an uppercase letter
//             sb.setCharAt(i + 1, (char)((int) str.charAt(i + 1) - 32));
//         }
//       }
  
//       return sb.toString();
//     }
//     public static void main(String args[]) {
//       String str = "java Is besT language For coding";
//       int size = str.length();
  
//       System.out.println("String after capitalizing the first and last letter of each 
//       word of the string: ");
//       System.out.println(Capitalize(str, size));
//     }
//   }
  
