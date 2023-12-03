package newJava;

import java.util.Scanner;

public class DoWhileLoop 
{
	@SuppressWarnings("resource")
	public static void main(String [] args) 
	{
		System.out.println("Enter Your Number :- ");
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		int i=1;
		
//		System.out.println("Enter Your Range :- ");
//		
//		int Range = sc.nextInt();
//		do 
//		{
//			System.out.println(Num+" * "+i+" = "+Num*i);
//			i++;
//		} 
//		while (i<=Range);
		
		do {
			if ((i*Num) % 2 == 0) 
			{
				System.out.println("This is Even Number...");
				i++;
				break;
			}
			else 
			{
				System.out.println("This is Odd Number...!");
				i++;
			}
			
		} while (i<=Num);
	}
}
