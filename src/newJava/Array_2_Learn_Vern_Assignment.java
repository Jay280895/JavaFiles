package newJava;

import java.util.Scanner;

public class Array_2_Learn_Vern_Assignment
{
	@SuppressWarnings("static-access")
	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int row,col,i;
		System.out.print("Enter Row Numbers :");
		row =sc.nextInt();
		
		System.out.print("Enter Coloum Numbers :");
		col = sc.nextInt();
		int[][] matrix = new int[row][col];
		for(i=0; i<row; i++)
		{
			System.out.println("Enter the values of Row "+(i+1)+" in Matrix :- ");
			for(int j=0;j<col;j++) 
			{
				matrix[i][j]=sc.nextInt();
			}

		}
		System.out.println("The Matrix is :");
		for(i=0;i<row; i++)
		{
			for(int j=0;j<col;j++) 
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		for (i = 0; i < row; i++)
		{
            int minimum = matrix[i][0]; // Initialize minimum with the first element in the current row
            for (int j = 1; j < col; j++)
            {
                if (matrix[i][j] < minimum)
                {
                    minimum = matrix[i][j];
                }
            }
            
            System.out.println("The Minimum Number in Row no " + (i + 1) + " is: " + minimum);
        }
		
		
		//Call Class Array_Learn_Vern_Assignment 
		Array_Learn_Vern_Assignment OddAndEven = new Array_Learn_Vern_Assignment();
		OddAndEven.main(args);
	}

}
