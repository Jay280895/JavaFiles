package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class Factorial_Recursive_Method
{
	public static void main(String [] Args)
	{
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The Num of n Factorial : ");
		long n = scanner.nextLong();
		System.out.println("The Value of Factorial n : "+factorial(n));
		
		
		System.out.print("Enter The Num of m Factorial : ");
		long m = scanner.nextLong();
		System.out.println("The Value of Factorial m : "+factorial(m));
		
		
		long sum;
		sum = factorial(n)+factorial(m);
		System.out.println("The Sum of Factorial m & n :"+sum);
	}
	
	//With Method 
	public static long factorial(long val)
	{
		if (val == 1)
		{
			return 1;
		}
		else
		{
			long eq = val * factorial(val - 1);
			//System.out.println(eq);
			return eq;
		}
	}
	
	//With For Loop
	public static long factorial(int val)
	{
		long ans = 1;
		for(long i=1; i<=val; i++)
		{
			ans = ans*i;
			//System.out.println(ans);
		}
		return ans;
	}

}
