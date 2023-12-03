package newJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyDetalis {

	public static void main(String[] args) {
		
		try {
			//Create a FileWriter and specify the file name
			FileWriter fileWriter = new FileWriter("C:\\Users\\jay.p3\\Desktop\\Bank.txt");
			
			//Create a scanner to get user input
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter text(type 'exit' to finish and save):- ");
			
			while(true) {
				String input = scanner.nextLine();
				
				if(input.equalsIgnoreCase("exit")) {
					break;
				}
				
				//write the user input to the file
				
				fileWriter.write(input+"\n");
			}
			
			//close the FileWriter to save the file 
			fileWriter.close();
			scanner.close();
			
			System.out.println("Text Saved to 'C:\\Users\\jay.p3\\Desktop\\Bank.txt'");
			
			
		}
		catch (IOException e) {
			System.out.println("An error occured :- "+ e.getMessage());
		}
	}

}
