package newJava;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		System.out.println("Enter Your Number :- ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		/*System.out.println("Enter the Range of Table:- ");
		int Range = sc.nextInt();
		
		for(int i=1; i<=Range; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		System.out.println("\nIncrement & Decrement Number of :- "+n+"\n");

		System.out.println("Pre Increment  :- "+  (n++)*2);
		System.out.println("Post Increment :- "+  (++n)*2);
		System.out.println("Pre Decrement  :- "+  (--n)*2);
		System.out.println(n);

		System.out.println("Post Decrement :- "+  (n--)*2);
		System.out.println(n)*/
		
		out:
		for(int i = 1; i<=n; i++) {
			System.out.println("Outer "+i);
			
			for(int j=1; j<=n; j++) {
				
				if(j==5)
					
					break out;
					System.out.println("    Inner "+j);
			}
		}
		

	}

}
