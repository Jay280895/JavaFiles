package newJava;

import java.util.Scanner;

import pkg_AEM_Adobe.Fake;

public class Six {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number as a string: ");
		String input = scanner.nextLine();

		try {
			int number = Integer.parseInt(input);
			System.out.println("Parsed integer: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid integer.");
		}
		Fake f = new Fake();
		String FakeText = f.toString();
		System.out.println("This " + (f) + "is import by Package pkg_AEM_Adobe And class is Fake");
		System.out.println("This " + (FakeText) + "is import by Package pkg_AEM_Adobe And class is Fake");
		System.out.println(f.toString());
		System.out.println(f);

		// main(args);
	}
}
