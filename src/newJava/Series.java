package newJava;

import java.util.Scanner;

public class Series {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		System.out.println("Enter Your n Number:- ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		//Natural Numbers
		System.out.println("Natural Numbers :-");
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum = sum + i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Total Sum of Natural Numbers := "+sum);
		
		
		
		
		
		//Even Numbers 
		
		System.out.println("\n");
		System.out.println("Even Numbers :-");

		int sumOfEven=0;
		for(int i=1; i<=n; i++) {
			if(i%2 ==0) {
				sumOfEven = sumOfEven + i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Total Sum Of even Numbers := "+sumOfEven);
		
		
		
		
	      //Odd Numbers 
		System.out.println("\n");
		
		System.out.println("Odd Numbers :-");
		int sumOfOdd=0;
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) {
				sumOfOdd = sumOfOdd + i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Total Sum of Odd Numbers := "+sumOfOdd);

	}

}
