package newJava;

import java.util.Scanner;

public class Lift
{
    @SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args)
    {
        int n;
        System.out.println("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] Number = new int[5][];
        
        for (int i = 0; i < Number.length; i++)
        {
            Number[i] = new int[10];
        }
        
        for (int i = 0; i < Number.length; i++)
        {
            for (int j = 0; j < Number[i].length; j++)  // Fixed the loop variable from 'i' to 'j'
            {
                Number[i][j] = i * j;            
            }
        }
        
        // For Printing
        for (int i = 0; i < Number.length; i++)
        {
            Number[i] = new int[i + 1];  // This line seems unnecessary; consider removing it.
        }
        
        for (int i = 0; i < Number.length; i++)
        {
            for (int j = 0; j < Number[i].length; j++)  // Fixed the loop variable from 'i' to 'j'
            {
                System.out.print(Number[i][j]);
            }
            System.out.println();  // Added a new line after each row
        }
    }
}
