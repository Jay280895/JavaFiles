package newJava;

import java.util.Scanner;

public class JjjJ {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Text :- ");
		String Text = sc.nextLine(); 
		
		String [] sentence = Text.split(" ");
		
		System.out.print("\n");
		System.out.print("Your Text is In Arrays :- ");
		
		for(String words : sentence) {
			System.out.print(words + " ");
		}
		System.out.println("\n");
		
		
		System.out.print("Enter Your Words of Sentence if you Find That index Location :- ");
		String FindWords = sc.nextLine();
		
		int index = -1;
		
		for(int i=0; i<sentence.length; i++) {
			if (sentence[i].equals(FindWords)) {
				index = i;
				break;
			}
		}
		System.out.print("\n");
		if (index != -1)
		{
			System.out.println("The Word of ('"+FindWords+"') is Position of Array in Index is :- "+index);
		}
		else 
		{
			System.out.println("The Word of ('"+FindWords+"') is Not to be Found!");
		}
	}
} 