package newJava;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence:- ");
		String input = sc.nextLine();
		
		String[] words = input.split(" ");
		
		StringBuilder reverseSentence = new StringBuilder();
		
		for(int i = words.length-1; i>=0; i--) {
			reverseSentence.append(words[i]).append(" ");
		}
		
		System.out.println("Reverse Sentence :- "+ reverseSentence.toString().trim());
	}

}
