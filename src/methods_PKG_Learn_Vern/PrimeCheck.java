package methods_PKG_Learn_Vern;

import java.util.Scanner;

public class PrimeCheck {
	public static boolean isPrime(int n) {
		
		boolean Type = true;
		for(int i=2; i<(int)n/2; i++) 
		{
			if (n % i == 0)
			{
				Type = false;
			}
		}
		return Type;
	} 
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n =scanner.nextInt();
		if (isPrime(n))
		{
			System.out.println("Number "+n+" is  Prime");
		}
		else
		{
			System.out.println("Number "+n+" is not Prime");
		}
	}

}
