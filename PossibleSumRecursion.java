// the time complexity using brute force is exponentially
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

// public class PossibleSumRecursion {
//     public static boolean sumPossible(int amount, List<Integer> numbers) {
//         if (amount == 0)
//             return true;
//         if (amount < 0)
//             return false;
//         for (int num : numbers) {
//             int subAmount = amount - num;
//             if (sumPossible(subAmount, numbers))
//                 return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter target amount: ");
//         int amount = sc.nextInt();

//         System.out.print("Enter number of elements in the list: ");
//         int n = sc.nextInt();

//         List<Integer> numList = new ArrayList<>();
//         System.out.println("Enter the elements: ");
//         for (int i = 0; i < n; i++) {
//             numList.add(sc.nextInt());
//         }

//         System.out.println("Is sum possible? " + sumPossible(amount, numList));
        
//         sc.close();
//     }
// }


public class PossibleSumRecursion {

    public static boolean sumPossible(int amount, List<Integer> numbers)
    {
        return sumPossible(amount, numbers, new HashMap<>());
    }
    public static boolean sumPossible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        if (amount == 0)
            return true;
        if (amount < 0)
            return false;

        if(memo.containsKey(amount))
            return memo.get(amount);

        for (int num : numbers) {
            int subAmount = amount - num;
            if (sumPossible(subAmount, numbers))
                return true;
        }
        memo.put(amount, false);
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter target amount: ");
        int amount = sc.nextInt();

        System.out.print("Enter number of elements in the list: ");
        int n = sc.nextInt();

        List<Integer> numList = new ArrayList<>();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numList.add(sc.nextInt());
        }

        System.out.println("Is sum possible? " + sumPossible(amount, numList));
        
        sc.close();
    }
}
