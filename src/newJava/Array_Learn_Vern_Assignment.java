package newJava;

import java.util.Scanner;

public class Array_Learn_Vern_Assignment {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Numbers of Arraqy  : ");
		int n = scanner.nextInt();
		
		int num[] = new int[n];
		int i;
		for(i=0; i<num.length; i++) {
			System.out.print("Enter your "+(i+1)+" Array Value : ");
			num[i] = scanner.nextInt();
		}
		
		System.out.print("\nYour Array Values Are :- ");
		for(i=0; i<num.length; i++)
		{
			System.out.print(num[i]+"\t");
		}
		
		
		
		System.out.println("\n");
		for(i=0; i<num.length; i++)
		{
			if (num[i] % 2 == 0)
			{
				System.out.println("The Number "+num[i]+" is Even : ");
			}
			else
			{
				System.out.println("The Number "+num[i]+" is Odd : ");
			}

		}
	}

}
