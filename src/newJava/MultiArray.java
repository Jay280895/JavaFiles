package newJava;

import java.util.Scanner;

public class MultiArray {
	@SuppressWarnings({ "resource", })
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int row,col;
		System.out.print("Enter Your Row No :");
		row = scanner.nextInt();
		
		System.out.print("Enter Your Colum No :");
		col = scanner.nextInt();
		int Number [][] = new int [row][col];

		for(int i=0; i<Number.length; i++)
		{
			Number[i] = new int [i+col];
		}
		
		
		
		for(int i=0; i<Number.length; i++) 
		{
			for(int j=0; j<Number[i].length; j++)
			{
				Number[i][j] = i*j;
			}
		}
		
		
		
		
		for(int i=0; i<Number.length; i++) 
		{
			for(int j=0; j<Number[i].length; j++)
			{
				System.out.print(Number[i][j]+"\t");
			}
			System.out.println("\n");
		}

	}

}
