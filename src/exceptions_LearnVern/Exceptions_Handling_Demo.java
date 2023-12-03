package exceptions_LearnVern;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// System.out.println("Enter No of n : ");

		Exceptions_Handling_Demo ed = new Exceptions_Handling_Demo();
		ed.printEHD();
		System.out.println("The Exceptions_Handling_Demo class code is Done..... ");
	}
}

public class Exceptions_Handling_Demo extends Main {

	public static void main(String[] args) {
		System.out.println("Enter No of n : ");

		Exceptions_Handling_Demo ed = new Exceptions_Handling_Demo();
		ed.printEHD();
		System.out.println("The Exceptions_Handling_Demo class code is Done..... ");
	}

	Scanner sc = new Scanner(System.in);
	static {
		System.out.print("Enter No of n : ");
	}
	int n = sc.nextInt();
	int a[] = new int[n];

	public Exceptions_Handling_Demo() {

		for (int i = 0; i < n; i++) {
			a[i] = (i + 1) * 2;
		}
	}

	public void printEHD() {
		for (int i = 0; i <= n; i++) { // Here an Exception error on i=0,i<=n the correct is i=0,i<n OR/YA i=1,i<=n
			System.out.println("No." + i + " : " + a[i]); // Exception error Show in this line but reason is in the For
															// loop
		}
	}
}
