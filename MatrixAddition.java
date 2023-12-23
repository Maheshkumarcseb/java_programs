import java.util.Scanner;


public class MatrixAddition {
    public static void main(String[] args) {
        if (args.length != 1) {
             System.out.println("please provide a single integer");
            return;
        }
        int N = Integer.parseInt(args[0]);
        if (N <= 0) {
            System.out.println("N must be a positive number.");
        }
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];

        System.out.println("enter value for matrix 1");

        readMatrixValues(matrix1, scanner);

        System.out.println("enter the value for matrix 2");
        readMatrixValues(matrix2, scanner);

        System.out.println("matrix 1:");
        printMatrix(matrix1);

        System.out.println("matrix 2:");
        printMatrix(matrix2);

        int[][] result = addMatrices(matrix1, matrix2);
        System.out.println("sum of two matrices");

        printMatrix(result);

        scanner.close();
    }

    public static void readMatrixValues(int[][] matrix, Scanner scanner) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("enter the value for rows" + (i + 1) + "columns" + (j + 1) + ":");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int N = matrix1.length;
        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
