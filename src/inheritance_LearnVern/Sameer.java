package inheritance_LearnVern;

import java.util.Scanner;

public class Sameer {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int sum; System.out.println("Enter Your Number :- "); sum = sc.nextInt();
		 * System.out.println(sum);
		 */
		System.out.println("Enter Sameer Age : ");
		int Sameerage = sc.nextInt();
		System.out.println("Enter Zaid Age : ");
		int Zaidage = sc.nextInt();
		Class<? extends Scanner> Sameer = sc.getClass();

		// System.out.println("Enter Sameer's Age : ");
		// int Sameerage = sc.nextInt();
		// System.out.println("Enter Zaid's Age : ");
		// int ZaidAge = sc.nextInt();

		if (Zaidage >= Sameerage) {
			System.out.println("Zaid is Elder");
		} else {
			System.out.println("Output is false");

		}

	}

}
