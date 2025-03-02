import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_DP {

    static long fibRec(int n, long[] memo) {
        // Base case
        if (n <= 1) {
            return n;
        }
        // To check if output already exists
        if (memo[n] != -1) {
            return memo[n];
        }
        // Calculate and save output for future use
        memo[n] = fibRec(n - 1, memo) + fibRec(n - 2, memo);
        return memo[n];
    }

    static long fib(int n) {
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);
        return fibRec(n, memo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number is: " + fib(n));
        sc.close();
    }
}
