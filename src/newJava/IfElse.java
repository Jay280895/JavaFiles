package newJava;

import java.util.Scanner;

public class IfElse {

	@SuppressWarnings("resource")
	public static void main (String[] args) {
		int num;
		System.out.println("Enter your number :- ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Your Number is Even....");
		}
		else{
			System.out.println("Your Number is Odd....");
		}
		
		System.out.println("Thanks For using this program....!");
	}
}
