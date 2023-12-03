package newJava;

import java.util.Scanner;

public class Return {
	public static String Name(String a, String b) {
		return a+""+b;
	}
	public static void main(String [] args) {
		System.out.println("Enter Your Full Name :- ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.next();
		String b = scanner.nextLine();
		String fullName = Name(a, b);
		System.err.println(fullName);
		System.out.println(fullName);
	}
}
