
public class Reverse_word{

    public static void main(String[] args) {
        String name = "my name is mahesh kumar";
        String reversedname = reverseWords(name);
        System.out.println(reversedname);
    }

    public static String reverseWords(String name) {
        String[] words = name.split(" ");
        // System.out.println(words[0]);
        // System.out.println(words[1]);
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {

            // String reversedWord = new StringBuilder(word).reverse().toString();
            
            // System.out.println(reversedWord);   ---> array of reversed word
            reversed.append(new StringBuilder(word).reverse()).append(" ");

            // reversed.append(word).reverse().append(" ");
        }

        // Convert the StringBuilder to a string
        return reversed.toString();
    }
}
