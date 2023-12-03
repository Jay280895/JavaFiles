package newJava;

import java.util.Scanner;

public class GGAA
{
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row of matrix : ");
        int row = scanner.nextInt();
        System.out.println("Enter the column of matrix : ");
        int col = scanner.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col]; // Second matrix

        // Taking Input for the first matrix
        System.out.println("Enter the values of Matrix A");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Taking Input for the second matrix
        System.out.println("Enter the values of Matrix B");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Matrix addition
        int sum[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix A:");
        printMatrix(a);

        System.out.println("Matrix B:");
        printMatrix(b);

        System.out.println("Matrix A + Matrix B:");
        printMatrix(sum);
    }

    // Helper method to print a matrix
    public static void printMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
