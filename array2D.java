import java.util.Scanner;


public class array2D {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        System.out.println("enter a matrix of 6x6");
        for (int i = 0; i < 6; i++) {
            java.lang.String[] arrRowItems = scanner.nextLine().split(" "); // spliting the input using split()
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);  // converting string to integer using parseInt function through Integer class
                arr[i][j] = arrItem;
            }
        }
        
        int maxSum = Integer.MIN_VALUE; //initialising the max sum with the minimum value of integer using Integer class
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);  // finding the maximum  value among maxsum and sum.
            }
        }
        System.out.println("largest sum of arrayglasses in this array is");
        System.out.println(maxSum);
        scanner.close();
    }
}
