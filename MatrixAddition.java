import java.util.Scanner;    // for making object of the class
public class MatrixAddition {    
    public static void main(String[] args) {    //main method
        if (args.length != 1) {       //checking the length of the string.
             System.out.println("please provide a single integer");
            return;
        }
        int N = Integer.parseInt(args[0]);   // converting string datatype to integer datatype using parseInt().
        if (N <= 0) {   
            System.out.println("N must be a positive number.");
        }
        Scanner scanner = new Scanner(System.in);   //declaring scanner object for the class. 
        int[][] matrix1 = new int[N][N];    
        int[][] matrix2 = new int[N][N];
        System.out.println("enter value for matrix 1");
        readMatrixValues(matrix1, scanner);   //calling read method for matrix 1.
        System.out.println("enter the value for matrix 2");
        readMatrixValues(matrix2, scanner);   // //calling read method for matrix 2.
        System.out.println("matrix 1:");
        printMatrix(matrix1);  //printing the value of matrix1.
        System.out.println("matrix 2:");
        printMatrix(matrix2);   //printing the value of matrix2.
        int[][] result = addMatrices(matrix1, matrix2);
        System.out.println("sum of two matrices");
        printMatrix(result);   //calling the printMatrix method.
        scanner.close();    // closing the scanner class.
    }

    public static void readMatrixValues(int[][] matrix, Scanner scanner) {
        int N = matrix.length;    //storing the matrix length into a variable N.
        for (int i = 0; i < N; i++) {   // this loop for rows
            for (int j = 0; j < N; j++) {    // this loop for columns
                System.out.println("enter the value for rows" + (i + 1) + "columns" + (j + 1) + ":");
                matrix[i][j] = scanner.nextInt();   // taking the element of matrix from user
            }
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int N = matrix1.length;   //storing the matrix length into a variable N.
        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];   //adding both the matrix
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {   // method for printing the addition of two matrix.
        int N = matrix.length;    //storing the matrix length into a variable N.
        for (int i = 0; i < N; i++) {     // this loop for rows
            for (int j = 0; j < N; j++) {   // this loop for columns
                System.out.println(matrix[i][j] + " ");  
            }
            System.out.println(); // printing a new line
        }
    }
}
