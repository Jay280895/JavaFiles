package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class Assignment_OverLoading_Learn_vern {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.print("Enter Your Num 1 a value : ");
		 a = sc.nextInt();
		System.out.print("Enter Your Num 1 b value : ");
		 b = sc.nextInt();
		System.out.print("Enter Your Num 1 c value : ");
		 c = sc.nextInt();
		
		System.out.println("\n");
		int x,y;
		System.out.print("Enter Your Num 2 x value : ");
		x = sc.nextInt();
		System.out.print("Enter Your Num 2 y value : ");
		y = sc.nextInt();
		
		System.out.println("\n");
		float i,j,k;
		System.out.print("Enter Your Num 3 i value : ");
		 i = sc.nextFloat();
		System.out.print("Enter Your Num 3 j value : ");
		 j = sc.nextFloat();
		System.out.print("Enter Your Num 3 k value : ");
		 k = sc.nextFloat();
		 
	
		System.out.println("\n");
		System.out.println("The Sum of Num 1 values :"+add(a, b, c));
		System.out.println("The Sum of Num 2 values :"+add(x,y));
		System.out.println("The Sum of Num 3 values :"+add(i,j,k));
		
		float Eq;
		Eq = add(a, b, c)+add(x, y)+add(i, j, k);
		System.out.println("\n"+"The Total Sum Of Num 1, Num 2 & Num 3 :"+Eq);
		
	}
	static int add(int a, int b, int c)
	{
		int sum = a+b+c;
		return sum;
	}
	static int add(int x, int y)
	{
		int sum = x+y;
		return sum;
	}
	static float add(float i, float j, float k)
	{
		float sum = i+j+k;
		return sum;
	}

}
