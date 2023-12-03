package newJava;

import java.util.Scanner;

public class TRNGL {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		System.out.println("Enter Your n Numbers:- ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// Half Triangle
		
		for(int i=n; i<=n; i++) {
			for(int j=n; j==i; j++) {
				System.out.print("");
			}
			System.out.println();
			
			for( i=0; i<=n; i++) {
				for(int j=0; j<=n-i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<=i; j++) {
					System.out.print("💕");
				}
				System.out.println();
			}
		}
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print("💕");
			}
			System.out.println();
		}
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("💕");
			}
			System.out.println();
		}
		
		
		
		
		
		
		System.out.println("\n");
		
		
		//Reverse Half Triangle
		
		
		for(int i=n; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("💕");
			}
			System.out.println();
		}
	}

}
