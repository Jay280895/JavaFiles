package newJava;

import java.util.Scanner;
public class PrimeNumber {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		System.out.println("Enter Your Number :- ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = 0, flag=0; m=n/2;
		
		if(n == 0 || n ==1) {
			System.err.println("This is Not a prime number :- "+n);
		}
		else {
			for(int i=2; i<=m; i++) {
				if(n % i == 0) {
					System.out.println("This is not a prime number :- "+n);
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("This a prime Number :- "+n);
			}
		}
		
		
		
		int fla =0;
		
		for(int i=2; i<=m; i++) {
			if(n == 0 || n ==1) {
				System.err.println("This is Not a prime number :- "+n);
			}
			if(n % i == 0) {
				System.out.println("This is not a prime number :- "+n);
				fla=1;
				break;
			}
			if(fla==0){
				System.out.println("This a prime Number :- "+n);
				break;
			}
		}
	}

}
