package newJava;

import java.util.Scanner;

public class DimensionArrayMulti
{
	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int row,col;
		System.out.print("Enter the Number of Row in Matrix First : ");
		row = scanner.nextInt();
		System.out.print("Enter the Number of column matrix First : ");
		col = scanner.nextInt();
		
		int a[][]=new int [row][col];
		
		
		
		//Taking Input First Matrix
		
		System.out.println("\nEnter the values of Matrix A :- ");
		for(int i=0;i<row; i++)
		{
			System.out.println("Enter the values of Row "+(i+1)+" in Matrix A :- ");
			for(int j=0;j<col;j++) 
			{
				a[i][j]=scanner.nextInt();
			}
		}
		
		//Print First Matrix Method   
	    System.out.println("First Matrix is :- ");  
		for(int i=0;i<row; i++)
		{
			for(int j=0;j<col;j++) 
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		
		
		//Taking Input Second Matrix
		System.out.print("Enter the Numbers of Row in Matrix Second : ");
		int row2 = scanner.nextInt();
		System.out.print("Enter the Numbers of column in Matrix Second : ");
		int col2 = scanner.nextInt();
		int b[][]=new int [row2][col2];

		 System.out.println("\nEnter the values of Matrix B :- ");
	     for (int i = 0; i < row2; i++)
	     {
	    	 System.out.println("Enter the values of Row "+(i+1)+" in Matrix B:- ");
	    	 for (int j = 0; j < col2; j++)
	    	 {
	    		 b[i][j] = scanner.nextInt();
	    	 }
	     }
		
		//Print Second Matrix Method 
		
		System.out.println("\nSecond Matrix is :- ");
		for(int i=0;i<row2; i++)
		{
			for(int j=0;j<col2;j++) 
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		
		
		
		//Print Both Matrix addition
        int sum[][] = new int[row][col];
        if (row == row2 || col == col2)
        {

            System.out.println("\nFirst Matrix + Second Matrix :- ");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    sum[i][j] = a[i][j] + b[i][j];
                    
                    System.out.print((sum[i][j])+"\t");
                }
                System.out.println("\n");
            }
        }
        else
        {
        	System.out.println("Addition of Both Matrix Is Not Possible Because First Martix & Second Matrix Rows and Coloums Are not equal...!");
        }
        
        
        
        
        
     // Print Both Matrix Multiplication
        int multi[][] = new int[row][col2];
        if (row == col2)
        {
            System.out.println("\nFirst Matrix * Second Matrix :- ");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col2; j++)
                {
                    multi[i][j] = 0;
                    for (int k = 0; k < col; k++)
                    {
                        multi[i][j] = multi[i][j] + (a[i][k] * b[k][j]);
                    }
                    System.out.print(multi[i][j] + "\t");
                }
                System.out.println("\n");
            }
        } 
        else
        {
            System.out.println("Multiplication is not possible because the number of columns in the first matrix does not match the number of rows in the second matrix....!");
        }


	}

}
