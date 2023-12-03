package newJava;

import java.util.Scanner;

public class WhileLoop 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Number(Num value) :- ");
		Scanner sc = new Scanner(System.in);
		int Num;
		int i = 1;
		Num = sc.nextInt();
		
		
		
//		int sum = 0;
//		while(i <= Num) 
//		{
//			
//			sum = sum + i;
//			i++;
//			System.out.println(sum);
//		}
//		System.out.println("The total Sum of 1 to "+Num+" is :- "+sum);
		
		
		
		
		
		System.out.println("Enter your Range :- ");
		int range = sc.nextInt();
		System.out.println("The Tabel of Number "+Num+" is :- ");
		
		while(i <=range ) {
			int multi = Num*i;
			System.out.println(Num+" * "+(i)+" = "+multi);
			i++;
			
		}
		
		
		
		int j=1;
		while(j<=range) {
			int multi = Num*j;
			System.out.println("Multi :- "+multi);
			j++;
		}
	}

}
